
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OccurrenceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccurrenceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccurrenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lessonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lessonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccurrenceResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "moduleCode",
    "occurrenceName",
    "lessonTypeName",
    "lessonTypeCode"
})
public class OccurrenceResult {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String moduleCode;
    @XmlElement(name = "OccurrenceName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String occurrenceName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeCode;

    /**
     * Gets the value of the moduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Sets the value of the moduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleCode(String value) {
        this.moduleCode = value;
    }

    /**
     * Gets the value of the occurrenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceName() {
        return occurrenceName;
    }

    /**
     * Sets the value of the occurrenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceName(String value) {
        this.occurrenceName = value;
    }

    /**
     * Gets the value of the lessonTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonTypeName() {
        return lessonTypeName;
    }

    /**
     * Sets the value of the lessonTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonTypeName(String value) {
        this.lessonTypeName = value;
    }

    /**
     * Gets the value of the lessonTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonTypeCode() {
        return lessonTypeCode;
    }

    /**
     * Sets the value of the lessonTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonTypeCode(String value) {
        this.lessonTypeCode = value;
    }

}
