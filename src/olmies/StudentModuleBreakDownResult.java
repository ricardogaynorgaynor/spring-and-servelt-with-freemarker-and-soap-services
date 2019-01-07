
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentModuleBreakDownResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentModuleBreakDownResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LecturerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LessonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LessonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccurrenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentModuleBreakDownResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "lecturerUserName",
    "lessonTypeName",
    "lessonTypeCode",
    "occurrenceName",
    "moduleCode",
    "moduleName",
    "schoolCode"
})
public class StudentModuleBreakDownResult {

    @XmlElement(name = "LecturerUserName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lecturerUserName;
    @XmlElement(name = "LessonTypeName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeName;
    @XmlElement(name = "LessonTypeCode", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonTypeCode;
    @XmlElement(name = "OccurrenceName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String occurrenceName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String moduleCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String moduleName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String schoolCode;

    /**
     * Gets the value of the lecturerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLecturerUserName() {
        return lecturerUserName;
    }

    /**
     * Sets the value of the lecturerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLecturerUserName(String value) {
        this.lecturerUserName = value;
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
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the schoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * Sets the value of the schoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCode(String value) {
        this.schoolCode = value;
    }

}
