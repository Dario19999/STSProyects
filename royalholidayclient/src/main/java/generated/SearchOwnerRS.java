
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchOwnerRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SearchOwnerRS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}Response">
 *       &lt;sequence>
 *         &lt;element name="ParametroBuscar" type="{http://tempuri.org/}SearchOwnerRQ" minOccurs="0"/>
 *         &lt;element name="InfoCuenta" type="{http://tempuri.org/}ArrayOfInfoCuenta" minOccurs="0"/>
 *         &lt;element name="Reservaciones" type="{http://tempuri.org/}ArrayOfMisReservaciones" minOccurs="0"/>
 *         &lt;element name="ListadoTelefonos" type="{http://tempuri.org/}ArrayOfMiAgendaTelefonico" minOccurs="0"/>
 *         &lt;element name="ListadoCorreos" type="{http://tempuri.org/}ArrayOfMisCorreos" minOccurs="0"/>
 *         &lt;element name="ListarOwners" type="{http://tempuri.org/}ArrayOfListadoOwners" minOccurs="0"/>
 *         &lt;element name="ListadoContratos" type="{http://tempuri.org/}ArrayOfMisContratos" minOccurs="0"/>
 *         &lt;element name="Semaforos" type="{http://tempuri.org/}ArrayOfSemaforos" minOccurs="0"/>
 *         &lt;element name="Surveys" type="{http://tempuri.org/}ArrayOfListSurveys" minOccurs="0"/>
 *         &lt;element name="InfoAdicional" type="{http://tempuri.org/}ArrayOfInformacionAdicional" minOccurs="0"/>
 *         &lt;element name="Urls" type="{http://tempuri.org/}ArrayOfUrls" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOwnerRS", propOrder = {
    "parametroBuscar",
    "infoCuenta",
    "reservaciones",
    "listadoTelefonos",
    "listadoCorreos",
    "listarOwners",
    "listadoContratos",
    "semaforos",
    "surveys",
    "infoAdicional",
    "urls"
})
public class SearchOwnerRS
    extends Response
{

    @XmlElement(name = "ParametroBuscar")
    protected SearchOwnerRQ parametroBuscar;
    @XmlElement(name = "InfoCuenta")
    protected ArrayOfInfoCuenta infoCuenta;
    @XmlElement(name = "Reservaciones")
    protected ArrayOfMisReservaciones reservaciones;
    @XmlElement(name = "ListadoTelefonos")
    protected ArrayOfMiAgendaTelefonico listadoTelefonos;
    @XmlElement(name = "ListadoCorreos")
    protected ArrayOfMisCorreos listadoCorreos;
    @XmlElement(name = "ListarOwners")
    protected ArrayOfListadoOwners listarOwners;
    @XmlElement(name = "ListadoContratos")
    protected ArrayOfMisContratos listadoContratos;
    @XmlElement(name = "Semaforos")
    protected ArrayOfSemaforos semaforos;
    @XmlElement(name = "Surveys")
    protected ArrayOfListSurveys surveys;
    @XmlElement(name = "InfoAdicional")
    protected ArrayOfInformacionAdicional infoAdicional;
    @XmlElement(name = "Urls")
    protected ArrayOfUrls urls;

    /**
     * Obtiene el valor de la propiedad parametroBuscar.
     * 
     * @return
     *     possible object is
     *     {@link SearchOwnerRQ }
     *     
     */
    public SearchOwnerRQ getParametroBuscar() {
        return parametroBuscar;
    }

    /**
     * Define el valor de la propiedad parametroBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOwnerRQ }
     *     
     */
    public void setParametroBuscar(SearchOwnerRQ value) {
        this.parametroBuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad infoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoCuenta }
     *     
     */
    public ArrayOfInfoCuenta getInfoCuenta() {
        return infoCuenta;
    }

    /**
     * Define el valor de la propiedad infoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoCuenta }
     *     
     */
    public void setInfoCuenta(ArrayOfInfoCuenta value) {
        this.infoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad reservaciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMisReservaciones }
     *     
     */
    public ArrayOfMisReservaciones getReservaciones() {
        return reservaciones;
    }

    /**
     * Define el valor de la propiedad reservaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMisReservaciones }
     *     
     */
    public void setReservaciones(ArrayOfMisReservaciones value) {
        this.reservaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad listadoTelefonos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMiAgendaTelefonico }
     *     
     */
    public ArrayOfMiAgendaTelefonico getListadoTelefonos() {
        return listadoTelefonos;
    }

    /**
     * Define el valor de la propiedad listadoTelefonos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMiAgendaTelefonico }
     *     
     */
    public void setListadoTelefonos(ArrayOfMiAgendaTelefonico value) {
        this.listadoTelefonos = value;
    }

    /**
     * Obtiene el valor de la propiedad listadoCorreos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMisCorreos }
     *     
     */
    public ArrayOfMisCorreos getListadoCorreos() {
        return listadoCorreos;
    }

    /**
     * Define el valor de la propiedad listadoCorreos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMisCorreos }
     *     
     */
    public void setListadoCorreos(ArrayOfMisCorreos value) {
        this.listadoCorreos = value;
    }

    /**
     * Obtiene el valor de la propiedad listarOwners.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListadoOwners }
     *     
     */
    public ArrayOfListadoOwners getListarOwners() {
        return listarOwners;
    }

    /**
     * Define el valor de la propiedad listarOwners.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListadoOwners }
     *     
     */
    public void setListarOwners(ArrayOfListadoOwners value) {
        this.listarOwners = value;
    }

    /**
     * Obtiene el valor de la propiedad listadoContratos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMisContratos }
     *     
     */
    public ArrayOfMisContratos getListadoContratos() {
        return listadoContratos;
    }

    /**
     * Define el valor de la propiedad listadoContratos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMisContratos }
     *     
     */
    public void setListadoContratos(ArrayOfMisContratos value) {
        this.listadoContratos = value;
    }

    /**
     * Obtiene el valor de la propiedad semaforos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSemaforos }
     *     
     */
    public ArrayOfSemaforos getSemaforos() {
        return semaforos;
    }

    /**
     * Define el valor de la propiedad semaforos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSemaforos }
     *     
     */
    public void setSemaforos(ArrayOfSemaforos value) {
        this.semaforos = value;
    }

    /**
     * Obtiene el valor de la propiedad surveys.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListSurveys }
     *     
     */
    public ArrayOfListSurveys getSurveys() {
        return surveys;
    }

    /**
     * Define el valor de la propiedad surveys.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListSurveys }
     *     
     */
    public void setSurveys(ArrayOfListSurveys value) {
        this.surveys = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicional.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInformacionAdicional }
     *     
     */
    public ArrayOfInformacionAdicional getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Define el valor de la propiedad infoAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInformacionAdicional }
     *     
     */
    public void setInfoAdicional(ArrayOfInformacionAdicional value) {
        this.infoAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad urls.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUrls }
     *     
     */
    public ArrayOfUrls getUrls() {
        return urls;
    }

    /**
     * Define el valor de la propiedad urls.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUrls }
     *     
     */
    public void setUrls(ArrayOfUrls value) {
        this.urls = value;
    }

}
