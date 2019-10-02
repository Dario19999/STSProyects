
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMisReservaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMisReservaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MisReservaciones" type="{http://tempuri.org/}MisReservaciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMisReservaciones", propOrder = {
    "misReservaciones"
})
public class ArrayOfMisReservaciones {

    @XmlElement(name = "MisReservaciones", nillable = true)
    protected List<MisReservaciones> misReservaciones;

    /**
     * Gets the value of the misReservaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misReservaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisReservaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MisReservaciones }
     * 
     * 
     */
    public List<MisReservaciones> getMisReservaciones() {
        if (misReservaciones == null) {
            misReservaciones = new ArrayList<MisReservaciones>();
        }
        return this.misReservaciones;
    }

}
