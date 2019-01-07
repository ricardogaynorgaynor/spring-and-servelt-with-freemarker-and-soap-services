
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
 *         &lt;element name="allLecturersByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfLecturerResult" minOccurs="0"/>
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
    "allLecturersByAcademicPeriodResult"
})
@XmlRootElement(name = "allLecturersByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfLecturerResult allLecturersByAcademicPeriodResult;

    /**
     * Gets the value of the allLecturersByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLecturerResult }
     *     
     */
    public ArrayOfLecturerResult getAllLecturersByAcademicPeriodResult() {
        return allLecturersByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allLecturersByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLecturerResult }
     *     
     */
    public void setAllLecturersByAcademicPeriodResult(ArrayOfLecturerResult value) {
        this.allLecturersByAcademicPeriodResult = value;
    }

}
