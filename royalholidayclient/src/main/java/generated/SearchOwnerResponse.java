
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchOwnerResult" type="{http://tempuri.org/}SearchOwnerRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchOwnerResult"
})
@XmlRootElement(name = "searchOwnerResponse")
public class SearchOwnerResponse {

    protected SearchOwnerRS searchOwnerResult;

    /**
     * Obtiene el valor de la propiedad searchOwnerResult.
     * 
     * @return
     *     possible object is
     *     {@link SearchOwnerRS }
     *     
     */
    public SearchOwnerRS getSearchOwnerResult() {
        return searchOwnerResult;
    }

    /**
     * Define el valor de la propiedad searchOwnerResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOwnerRS }
     *     
     */
    public void setSearchOwnerResult(SearchOwnerRS value) {
        this.searchOwnerResult = value;
    }

}
