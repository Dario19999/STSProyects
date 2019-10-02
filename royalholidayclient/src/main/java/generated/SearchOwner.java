
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ObjetoParametro" type="{http://tempuri.org/}SearchOwnerRQ" minOccurs="0"/>
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
    "objetoParametro"
})
@XmlRootElement(name = "searchOwner")
public class SearchOwner {

    @XmlElement(name = "ObjetoParametro")
    protected SearchOwnerRQ objetoParametro;

    /**
     * Obtiene el valor de la propiedad objetoParametro.
     * 
     * @return
     *     possible object is
     *     {@link SearchOwnerRQ }
     *     
     */
    public SearchOwnerRQ getObjetoParametro() {
        return objetoParametro;
    }

    /**
     * Define el valor de la propiedad objetoParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOwnerRQ }
     *     
     */
    public void setObjetoParametro(SearchOwnerRQ value) {
        this.objetoParametro = value;
    }

}
