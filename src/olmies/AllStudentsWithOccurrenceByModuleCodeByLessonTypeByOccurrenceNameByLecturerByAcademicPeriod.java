
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ayr_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psl_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mod_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lessonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurrence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lectrerISASUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ayrCode",
    "pslCode",
    "modCode",
    "lessonType",
    "occurrence",
    "lectrerISASUserName"
})
@XmlRootElement(name = "allStudentsWithOccurrenceByModuleCodeByLessonTypeByOccurrenceNameByLecturerByAcademicPeriod", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllStudentsWithOccurrenceByModuleCodeByLessonTypeByOccurrenceNameByLecturerByAcademicPeriod {

    @XmlElement(name = "ayr_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String ayrCode;
    @XmlElement(name = "psl_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String pslCode;
    @XmlElement(name = "mod_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String modCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lessonType;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String occurrence;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lectrerISASUserName;

    /**
     * Gets the value of the ayrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAyrCode() {
        return ayrCode;
    }

    /**
     * Sets the value of the ayrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAyrCode(String value) {
        this.ayrCode = value;
    }

    /**
     * Gets the value of the pslCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPslCode() {
        return pslCode;
    }

    /**
     * Sets the value of the pslCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPslCode(String value) {
        this.pslCode = value;
    }

    /**
     * Gets the value of the modCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModCode() {
        return modCode;
    }

    /**
     * Sets the value of the modCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModCode(String value) {
        this.modCode = value;
    }

    /**
     * Gets the value of the lessonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonType() {
        return lessonType;
    }

    /**
     * Sets the value of the lessonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonType(String value) {
        this.lessonType = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrence(String value) {
        this.occurrence = value;
    }

    /**
     * Gets the value of the lectrerISASUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLectrerISASUserName() {
        return lectrerISASUserName;
    }

    /**
     * Sets the value of the lectrerISASUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLectrerISASUserName(String value) {
        this.lectrerISASUserName = value;
    }

}
