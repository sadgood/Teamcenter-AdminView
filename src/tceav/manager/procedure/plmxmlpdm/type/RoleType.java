//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.22 at 11:41:15 AM EST 
//


package tceav.manager.procedure.plmxmlpdm.type;

import tceav.manager.procedure.plmxmlpdm.base.AttribOwnerBase;
import org.w3c.dom.Node;
/*
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
*/

/**
 * 
 *       A Role, e.g. "Designer", "Test Engineer", "Chairman", which a Person 
 *       plays in an organisation.
 * 
 *       Attributes:
 * 
 *       (name:         The name of the role, i.e. "Designer". Inherited from DescriptionBase)
 *       
 * 
 * <p>Java class for RoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}AttribOwnerBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "RoleType")
public class RoleType extends AttribOwnerBase {
    
    public RoleType(Node node) {
        super(node);
    }


}
