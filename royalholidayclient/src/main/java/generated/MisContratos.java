
package generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MisContratos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MisContratos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelMembresia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MisContratos", propOrder = {
    "numeroContrato",
    "nivelMembresia",
    "saldo",
    "vigencia",
    "isDefault"
})
public class MisContratos {

    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "NivelMembresia")
    protected String nivelMembresia;
    @XmlElement(name = "Saldo", required = true)
    protected BigDecimal saldo;
    @XmlElement(name = "Vigencia")
    protected String vigencia;
    @XmlElement(name = "IsDefault")
    protected int isDefault;

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelMembresia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelMembresia() {
        return nivelMembresia;
    }

    /**
     * Define el valor de la propiedad nivelMembresia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelMembresia(String value) {
        this.nivelMembresia = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldo(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigencia(String value) {
        this.vigencia = value;
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
