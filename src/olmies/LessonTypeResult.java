
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LessonTypeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LessonTypeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lessonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lessonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LessonTypeResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "lessonTypeCode",
    "lessonTypeName",
    "moduleCode"
})
public class LessonTypeResult {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String moduleCode;

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

}
