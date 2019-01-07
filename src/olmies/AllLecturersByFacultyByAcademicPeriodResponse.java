
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
 *         &lt;element name="allLecturersByFacultyByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfLecturerResult" minOccurs="0"/>
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
    "allLecturersByFacultyByAcademicPeriodResult"
})
@XmlRootElement(name = "allLecturersByFacultyByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersByFacultyByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfLecturerResult allLecturersByFacultyByAcademicPeriodResult;

    /**
     * Gets the value of the allLecturersByFacultyByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLecturerResult }
     *     
     */
    public ArrayOfLecturerResult getAllLecturersByFacultyByAcademicPeriodResult() {
        return allLecturersByFacultyByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allLecturersByFacultyByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLecturerResult }
     *     
     */
    public void setAllLecturersByFacultyByAcademicPeriodResult(ArrayOfLecturerResult value) {
        this.allLecturersByFacultyByAcademicPeriodResult = value;
    }

}
