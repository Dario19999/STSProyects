
package generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreSocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditosDisponibles" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CompaniaContable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompaniaCobranza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Steward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorPlantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfoAdicional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCuenta", propOrder = {
    "ownerId",
    "nombreSocio",
    "coOwner",
    "direccion",
    "creditosDisponibles",
    "companiaContable",
    "companiaCobranza",
    "centroServicio",
    "steward",
    "colorPlantilla",
    "infoAdicional"
})
public class InfoCuenta {

    @XmlElement(name = "OwnerId")
    protected int ownerId;
    @XmlElement(name = "NombreSocio")
    protected String nombreSocio;
    @XmlElement(name = "CoOwner")
    protected String coOwner;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "CreditosDisponibles", required = true)
    protected BigDecimal creditosDisponibles;
    @XmlElement(name = "CompaniaContable")
    protected String companiaContable;
    @XmlElement(name = "CompaniaCobranza")
    protected String companiaCobranza;
    @XmlElement(name = "CentroServicio")
    protected String centroServicio;
    @XmlElement(name = "Steward")
    protected String steward;
    @XmlElement(name = "ColorPlantilla")
    protected String colorPlantilla;
    @XmlElement(name = "InfoAdicional")
    protected boolean infoAdicional;

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
     * Obtiene el valor de la propiedad coOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoOwner() {
        return coOwner;
    }

    /**
     * Define el valor de la propiedad coOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoOwner(String value) {
        this.coOwner = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad creditosDisponibles.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditosDisponibles() {
        return creditosDisponibles;
    }

    /**
     * Define el valor de la propiedad creditosDisponibles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditosDisponibles(BigDecimal value) {
        this.creditosDisponibles = value;
    }

    /**
     * Obtiene el valor de la propiedad companiaContable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompaniaContable() {
        return companiaContable;
    }

    /**
     * Define el valor de la propiedad companiaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompaniaContable(String value) {
        this.companiaContable = value;
    }

    /**
     * Obtiene el valor de la propiedad companiaCobranza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompaniaCobranza() {
        return companiaCobranza;
    }

    /**
     * Define el valor de la propiedad companiaCobranza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompaniaCobranza(String value) {
        this.companiaCobranza = value;
    }

    /**
     * Obtiene el valor de la propiedad centroServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroServicio() {
        return centroServicio;
    }

    /**
     * Define el valor de la propiedad centroServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroServicio(String value) {
        this.centroServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad steward.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteward() {
        return steward;
    }

    /**
     * Define el valor de la propiedad steward.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteward(String value) {
        this.steward = value;
    }

    /**
     * Obtiene el valor de la propiedad colorPlantilla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPlantilla() {
        return colorPlantilla;
    }

    /**
     * Define el valor de la propiedad colorPlantilla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPlantilla(String value) {
        this.colorPlantilla = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicional.
     * 
     */
    public boolean isInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Define el valor de la propiedad infoAdicional.
     * 
     */
    public void setInfoAdicional(boolean value) {
        this.infoAdicional = value;
    }

}
