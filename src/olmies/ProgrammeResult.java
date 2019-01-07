
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgrammeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgrammeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programmeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programmeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammeResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "programmeCode",
    "programmeName",
    "schoolCode"
})
public class ProgrammeResult {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String programmeCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String programmeName;
    @XmlElement(name = "SchoolCode", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String schoolCode;

    /**
     * Gets the value of the programmeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrammeCode() {
        return programmeCode;
    }

    /**
     * Sets the value of the programmeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrammeCode(String value) {
        this.programmeCode = value;
    }

    /**
     * Gets the value of the programmeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrammeName() {
        return programmeName;
    }

    /**
     * Sets the value of the programmeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrammeName(String value) {
        this.programmeName = value;
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
