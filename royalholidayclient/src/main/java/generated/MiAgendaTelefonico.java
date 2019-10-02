
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MiAgendaTelefonico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MiAgendaTelefonico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroTelefonico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo_Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiAgendaTelefonico", propOrder = {
    "numeroTelefonico",
    "tipoTelefono",
    "isDefault"
})
public class MiAgendaTelefonico {

    @XmlElement(name = "NumeroTelefonico")
    protected String numeroTelefonico;
    @XmlElement(name = "Tipo_Telefono")
    protected String tipoTelefono;
    protected int isDefault;

    /**
     * Obtiene el valor de la propiedad numeroTelefonico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    /**
     * Define el valor de la propiedad numeroTelefonico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefonico(String value) {
        this.numeroTelefonico = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTelefono() {
        return tipoTelefono;
    }

    /**
     * Define el valor de la propiedad tipoTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTelefono(String value) {
        this.tipoTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad isDefault.
     * 
     */
    public int getIsDefault() {
        return isDefault;
    }

    /**
     * Define el valor de la propiedad isDefault.
     * 
     */
    public void setIsDefault(int value) {
        this.isDefault = value;
    }

}
