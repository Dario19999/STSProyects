
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchOwnerRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchOwnerRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CadenaBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogPeticionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Almacenar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ejecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Live" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOwnerRQ", propOrder = {
    "cadenaBusqueda",
    "tipoContacto",
    "logPeticionID",
    "almacenar",
    "ejecutivo",
    "token",
    "live"
})
public class SearchOwnerRQ {

    @XmlElement(name = "CadenaBusqueda")
    protected String cadenaBusqueda;
    @XmlElement(name = "TipoContacto")
    protected String tipoContacto;
    @XmlElement(name = "LogPeticionID")
    protected int logPeticionID;
    @XmlElement(name = "Almacenar")
    protected int almacenar;
    @XmlElement(name = "Ejecutivo")
    protected String ejecutivo;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "Live")
    protected boolean live;

    /**
     * Obtiene el valor de la propiedad cadenaBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaBusqueda() {
        return cadenaBusqueda;
    }

    /**
     * Define el valor de la propiedad cadenaBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaBusqueda(String value) {
        this.cadenaBusqueda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContacto() {
        return tipoContacto;
    }

    /**
     * Define el valor de la propiedad tipoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContacto(String value) {
        this.tipoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad logPeticionID.
     * 
     */
    public int getLogPeticionID() {
        return logPeticionID;
    }

    /**
     * Define el valor de la propiedad logPeticionID.
     * 
     */
    public void setLogPeticionID(int value) {
        this.logPeticionID = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenar.
     * 
     */
    public int getAlmacenar() {
        return almacenar;
    }

    /**
     * Define el valor de la propiedad almacenar.
     * 
     */
    public void setAlmacenar(int value) {
        this.almacenar = value;
    }

    /**
     * Obtiene el valor de la propiedad ejecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjecutivo() {
        return ejecutivo;
    }

    /**
     * Define el valor de la propiedad ejecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjecutivo(String value) {
        this.ejecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad live.
     * 
     */
    public boolean isLive() {
        return live;
    }

    /**
     * Define el valor de la propiedad live.
     * 
     */
    public void setLive(boolean value) {
        this.live = value;
    }

}
