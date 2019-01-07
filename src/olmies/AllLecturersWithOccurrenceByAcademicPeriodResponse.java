
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
 *         &lt;element name="allLecturersWithOccurrenceByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfOccurrenceForLecturerResult" minOccurs="0"/>
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
    "allLecturersWithOccurrenceByAcademicPeriodResult"
})
@XmlRootElement(name = "allLecturersWithOccurrenceByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersWithOccurrenceByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfOccurrenceForLecturerResult allLecturersWithOccurrenceByAcademicPeriodResult;

    /**
     * Gets the value of the allLecturersWithOccurrenceByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOccurrenceForLecturerResult }
     *     
     */
    public ArrayOfOccurrenceForLecturerResult getAllLecturersWithOccurrenceByAcademicPeriodResult() {
        return allLecturersWithOccurrenceByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allLecturersWithOccurrenceByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOccurrenceForLecturerResult }
     *     
     */
    public void setAllLecturersWithOccurrenceByAcademicPeriodResult(ArrayOfOccurrenceForLecturerResult value) {
        this.allLecturersWithOccurrenceByAcademicPeriodResult = value;
    }

}
