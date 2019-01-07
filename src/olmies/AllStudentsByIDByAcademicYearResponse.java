
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
 *         &lt;element name="allStudentsByIDByAcademicYearResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfStudentResult" minOccurs="0"/>
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
    "allStudentsByIDByAcademicYearResult"
})
@XmlRootElement(name = "allStudentsByIDByAcademicYearResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllStudentsByIDByAcademicYearResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfStudentResult allStudentsByIDByAcademicYearResult;

    /**
     * Gets the value of the allStudentsByIDByAcademicYearResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public ArrayOfStudentResult getAllStudentsByIDByAcademicYearResult() {
        return allStudentsByIDByAcademicYearResult;
    }

    /**
     * Sets the value of the allStudentsByIDByAcademicYearResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public void setAllStudentsByIDByAcademicYearResult(ArrayOfStudentResult value) {
        this.allStudentsByIDByAcademicYearResult = value;
    }

}
