
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
 *         &lt;element name="facultyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "facultyCode"
})
@XmlRootElement(name = "allSchoolsByFacultyCode", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllSchoolsByFacultyCode {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String facultyCode;

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

}
