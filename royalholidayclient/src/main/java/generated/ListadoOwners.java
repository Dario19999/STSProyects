
package generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListadoOwners complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListadoOwners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreSocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreCoOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelMembresia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fnacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListadoOwners", propOrder = {
    "ownerId",
    "numeroContrato",
    "nombreSocio",
    "nombreCoOwner",
    "nivelMembresia",
    "saldo",
    "correo",
    "fnacimiento"
})
public class ListadoOwners {

    @XmlElement(name = "OwnerId")
    protected int ownerId;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "NombreSocio")
    protected String nombreSocio;
    @XmlElement(name = "NombreCoOwner")
    protected String nombreCoOwner;
    @XmlElement(name = "NivelMembresia")
    protected String nivelMembresia;
    @XmlElement(name = "Saldo", required = true)
    protected BigDecimal saldo;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "Fnacimiento")
    protected String fnacimiento;

    /**
     * Obtiene el valor de la propiedad ownerId.
     * 
     */
    public int getOwnerId() {
        return ownerId;
    }

    /**
     * Define el valor de la propiedad ownerId.
     * 
     */
    public void setOwnerId(int value) {
        this.ownerId = value;
    }

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
     * Obtiene el valor de la propiedad nombreSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSocio() {
        return nombreSocio;
    }

    /**
     * Define el valor de la propiedad nombreSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSocio(String value) {
        this.nombreSocio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCoOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCoOwner() {
        return nombreCoOwner;
    }

    /**
     * Define el valor de la propiedad nombreCoOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCoOwner(String value) {
        this.nombreCoOwner = value;
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
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad fnacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnacimiento() {
        return fnacimiento;
    }

    /**
     * Define el valor de la propiedad fnacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnacimiento(String value) {
        this.fnacimiento = value;
    }

}
