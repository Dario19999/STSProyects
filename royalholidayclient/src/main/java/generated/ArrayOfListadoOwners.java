
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfListadoOwners complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListadoOwners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListadoOwners" type="{http://tempuri.org/}ListadoOwners" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListadoOwners", propOrder = {
    "listadoOwners"
})
public class ArrayOfListadoOwners {

    @XmlElement(name = "ListadoOwners", nillable = true)
    protected List<ListadoOwners> listadoOwners;

    /**
     * Gets the value of the listadoOwners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadoOwners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListadoOwners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListadoOwners }
     * 
     * 
     */
    public List<ListadoOwners> getListadoOwners() {
        if (listadoOwners == null) {
            listadoOwners = new ArrayList<ListadoOwners>();
        }
        return this.listadoOwners;
    }

}
