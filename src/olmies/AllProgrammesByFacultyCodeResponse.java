
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
 *         &lt;element name="allProgrammesByFacultyCodeResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfProgrammeResult" minOccurs="0"/>
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
    "allProgrammesByFacultyCodeResult"
})
@XmlRootElement(name = "allProgrammesByFacultyCodeResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllProgrammesByFacultyCodeResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfProgrammeResult allProgrammesByFacultyCodeResult;

    /**
     * Gets the value of the allProgrammesByFacultyCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public ArrayOfProgrammeResult getAllProgrammesByFacultyCodeResult() {
        return allProgrammesByFacultyCodeResult;
    }

    /**
     * Sets the value of the allProgrammesByFacultyCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public void setAllProgrammesByFacultyCodeResult(ArrayOfProgrammeResult value) {
        this.allProgrammesByFacultyCodeResult = value;
    }

}
