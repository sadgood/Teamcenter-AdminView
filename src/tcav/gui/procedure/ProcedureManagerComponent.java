/*
 * ProcedureManagerComponent.java
 *
 * Created on 20 July 2007, 11:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tcav.gui.procedure;

import tcav.*;
import tcav.gui.*;
import tcav.procedure.*;
import tcav.procedure.plmxmlpdm.base.IdBase;
import tcav.resources.*;
import tcav.utils.*;
import tcav.xml.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.util.ArrayList;
/**
 *
 * @author nzr4dl
 */
public class ProcedureManagerComponent extends JPanel implements TabbedPanel {
    
    private JFrame parentFrame;
    private ProcedureManager pm;
    private JSplitPane splitPane1;
    private ProcedureTreeModel modelProcedure;
    private ActionComponent actionComponent;
    private AttributeComponent attributeComponent;
    private XMLComponent xmlComponent;

    
    /**
     * Creates a new instance of ProcedureManagerComponent
     */
    public ProcedureManagerComponent(JFrame parentFrame, ProcedureManager pm) {
        this.pm = pm;
        this.parentFrame = parentFrame;
        
        ProcessComponent processComponent = new ProcessComponent(parentFrame, pm);
        processComponent.getTree().addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                IdBase procedure = (IdBase)path.getLastPathComponent();
                attributeComponent.updateTree(procedure);
                actionComponent.updateTree(procedure);
                xmlComponent.updateTable(procedure);
            }
        });

        actionComponent = new ActionComponent(parentFrame, pm);
        actionComponent.getTree().addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                IdBase procedure = (IdBase)path.getLastPathComponent();
                attributeComponent.updateTree(procedure);
                xmlComponent.updateTable(procedure);
            }
        });
        
        attributeComponent = new AttributeComponent(parentFrame, pm);
        attributeComponent.getTree().addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                IdBase procedure = (IdBase)path.getLastPathComponent();
                xmlComponent.updateTable(procedure);
            }
        });
        
        xmlComponent = new XMLComponent();


        
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new GridLayout(2,1,GUIutilities.GAP_COMPONENT,GUIutilities.GAP_COMPONENT));
        panelLeft.add(GUIutilities.createPanelMargined(processComponent));
        panelLeft.add(GUIutilities.createPanelMargined(actionComponent));
        
        JPanel panelRight = new JPanel();
        panelRight.setLayout(new BorderLayout());
        panelRight.add("Center",GUIutilities.createPanelMargined(attributeComponent));
        panelRight.add("South", GUIutilities.createPanelMargined(xmlComponent));
        
        splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, panelLeft, panelRight);
        splitPane1.setResizeWeight(1.0);
        splitPane1.setBorder(null);
        splitPane1.setDividerLocation(Settings.getPMSplitLocation());
        splitPane1.setOneTouchExpandable(true);
        ((BasicSplitPaneUI)splitPane1.getUI()).getDivider().addComponentListener(new ComponentAdapter(){
            public void componentMoved(ComponentEvent e){
                Settings.setPMSplitLocation(splitPane1.getDividerLocation());
            }
        });
        
        this.setLayout(new BorderLayout());
        this.add("Center",splitPane1);
        
    }
    
    public boolean isEmptyPanel(){
        return (pm.getWorkflowProcesses().size() == 0);
    }
    
}
