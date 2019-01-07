
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
@XmlType(name = "", propOrder = {
    "ayrCode",
    "pslCode",
    "schoolCode"
})
@XmlRootElement(name = "allLecturersBySchoolCodeByAcademicPeriod", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersBySchoolCodeByAcademicPeriod {

    @XmlElement(name = "ayr_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String ayrCode;
    @XmlElement(name = "psl_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String pslCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String schoolCode;

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
