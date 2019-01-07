
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacultyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacultyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facultyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facultyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacultyResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "facultyCode",
    "facultyName"
})
public class FacultyResult {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String facultyCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String facultyName;

    /**
     * Gets the value of the facultyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultyCode() {
        return facultyCode;
    }

    /**
     * Sets the value of the facultyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultyCode(String value) {
        this.facultyCode = value;
    }

    /**
     * Gets the value of the facultyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultyName() {
        return facultyName;
    }

    /**
     * Sets the value of the facultyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultyName(String value) {
        this.facultyName = value;
    }

}
