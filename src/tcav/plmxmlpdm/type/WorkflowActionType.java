//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.22 at 11:41:15 AM EST 
//


package tcav.plmxmlpdm.type;

import java.util.ArrayList;
import java.util.List;
import tcav.plmxmlpdm.base.AttribOwnerBase;
import tcav.plmxmlpdm.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
/*
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
*/

/**
 * 
 *       Each WorkflowAction object has one or more action handlers and business rules associated
 *       with it. The action handlers are represented by a list WorkflowHandlers, while the business
 *       rules are represented WorkflowBusinessRules. The WorkflowAction object also has a back pointer
 *       to its parent task template.
 *       
 * 
 * <p>Java class for WorkflowActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}AttribOwnerBase">
 *       &lt;attribute name="actionHandlerRefs" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}uriReferenceListType" />
 *       &lt;attribute name="actionType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentRef" use="required" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}anyURIType" />
 *       &lt;attribute name="ruleRefs" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}uriReferenceListType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "WorkflowActionType")
public class WorkflowActionType extends AttribOwnerBase {

    //@XmlAttribute
    protected final String actionHandlerRefsAttribute = "actionHandlerRefs";
    protected List<String> actionHandlerRefs;
    
    //@XmlAttribute(required = true)
    protected String actionTypeAttribute = "actionType";
    protected String actionType;
    
    //@XmlAttribute(required = true)
    protected final String parentRefAttribute = "parentRef";
    protected String parentRef;
    
    //@XmlAttribute
    protected final String ruleRefsAttribute = "ruleRefs";
    protected List<String> ruleRefs;
    
    public WorkflowActionType(Node node) {
        super(node);
        Node currentNode = node;
        NamedNodeMap attrib = currentNode.getAttributes();
        NodeList nodeList = currentNode.getChildNodes();
        
        TagTools.addToList(attrib, actionHandlerRefsAttribute, getActionHandlerRefs());
        setActionType(TagTools.getStringValue(attrib, actionTypeAttribute));
        setParentRef(TagTools.getStringValue(attrib, parentRefAttribute));
        TagTools.addToList(attrib, ruleRefsAttribute, getRuleRefs());

    }

    /**
     * Gets the value of the actionHandlerRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionHandlerRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionHandlerRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionHandlerRefs() {
        if (actionHandlerRefs == null) {
            actionHandlerRefs = new ArrayList<String>();
        }
        return this.actionHandlerRefs;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRef(String value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the ruleRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRuleRefs() {
        if (ruleRefs == null) {
            ruleRefs = new ArrayList<String>();
        }
        return this.ruleRefs;
    }

}
