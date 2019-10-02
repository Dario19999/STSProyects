
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMiAgendaTelefonico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMiAgendaTelefonico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MiAgendaTelefonico" type="{http://tempuri.org/}MiAgendaTelefonico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMiAgendaTelefonico", propOrder = {
    "miAgendaTelefonico"
})
public class ArrayOfMiAgendaTelefonico {

    @XmlElement(name = "MiAgendaTelefonico", nillable = true)
    protected List<MiAgendaTelefonico> miAgendaTelefonico;

    /**
     * Gets the value of the miAgendaTelefonico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miAgendaTelefonico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiAgendaTelefonico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiAgendaTelefonico }
     * 
     * 
     */
    public List<MiAgendaTelefonico> getMiAgendaTelefonico() {
        if (miAgendaTelefonico == null) {
            miAgendaTelefonico = new ArrayList<MiAgendaTelefonico>();
        }
        return this.miAgendaTelefonico;
    }

}
