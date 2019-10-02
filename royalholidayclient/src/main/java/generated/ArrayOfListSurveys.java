
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfListSurveys complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListSurveys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListSurveys" type="{http://tempuri.org/}ListSurveys" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListSurveys", propOrder = {
    "listSurveys"
})
public class ArrayOfListSurveys {

    @XmlElement(name = "ListSurveys", nillable = true)
    protected List<ListSurveys> listSurveys;

    /**
     * Gets the value of the listSurveys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSurveys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSurveys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListSurveys }
     * 
     * 
     */
    public List<ListSurveys> getListSurveys() {
        if (listSurveys == null) {
            listSurveys = new ArrayList<ListSurveys>();
        }
        return this.listSurveys;
    }

}
