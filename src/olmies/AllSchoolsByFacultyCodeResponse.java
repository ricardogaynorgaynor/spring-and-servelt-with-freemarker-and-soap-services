
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
 *         &lt;element name="allSchoolsByFacultyCodeResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfSchoolResult" minOccurs="0"/>
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
    "allSchoolsByFacultyCodeResult"
})
@XmlRootElement(name = "allSchoolsByFacultyCodeResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllSchoolsByFacultyCodeResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfSchoolResult allSchoolsByFacultyCodeResult;

    /**
     * Gets the value of the allSchoolsByFacultyCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchoolResult }
     *     
     */
    public ArrayOfSchoolResult getAllSchoolsByFacultyCodeResult() {
        return allSchoolsByFacultyCodeResult;
    }

    /**
     * Sets the value of the allSchoolsByFacultyCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchoolResult }
     *     
     */
    public void setAllSchoolsByFacultyCodeResult(ArrayOfSchoolResult value) {
        this.allSchoolsByFacultyCodeResult = value;
    }

}
