
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
 *         &lt;element name="allProgrammesBySchoolCodeResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfProgrammeResult" minOccurs="0"/>
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
    "allProgrammesBySchoolCodeResult"
})
@XmlRootElement(name = "allProgrammesBySchoolCodeResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllProgrammesBySchoolCodeResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfProgrammeResult allProgrammesBySchoolCodeResult;

    /**
     * Gets the value of the allProgrammesBySchoolCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public ArrayOfProgrammeResult getAllProgrammesBySchoolCodeResult() {
        return allProgrammesBySchoolCodeResult;
    }

    /**
     * Sets the value of the allProgrammesBySchoolCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public void setAllProgrammesBySchoolCodeResult(ArrayOfProgrammeResult value) {
        this.allProgrammesBySchoolCodeResult = value;
    }

}
