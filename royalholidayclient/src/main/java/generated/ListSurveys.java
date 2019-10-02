
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListSurveys complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListSurveys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSurveys", propOrder = {
    "surveName",
    "questionText",
    "answer"
})
public class ListSurveys {

    @XmlElement(name = "SurveName")
    protected String surveName;
    @XmlElement(name = "QuestionText")
    protected String questionText;
    @XmlElement(name = "Answer")
    protected String answer;

    /**
     * Obtiene el valor de la propiedad surveName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveName() {
        return surveName;
    }

    /**
     * Define el valor de la propiedad surveName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveName(String value) {
        this.surveName = value;
    }

    /**
     * Obtiene el valor de la propiedad questionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Define el valor de la propiedad questionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * Obtiene el valor de la propiedad answer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Define el valor de la propiedad answer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

}
