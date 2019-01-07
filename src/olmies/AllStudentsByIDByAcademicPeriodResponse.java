
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
 *         &lt;element name="allStudentsByIDByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfStudentResult" minOccurs="0"/>
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
    "allStudentsByIDByAcademicPeriodResult"
})
@XmlRootElement(name = "allStudentsByIDByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllStudentsByIDByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfStudentResult allStudentsByIDByAcademicPeriodResult;

    /**
     * Gets the value of the allStudentsByIDByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public ArrayOfStudentResult getAllStudentsByIDByAcademicPeriodResult() {
        return allStudentsByIDByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allStudentsByIDByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public void setAllStudentsByIDByAcademicPeriodResult(ArrayOfStudentResult value) {
        this.allStudentsByIDByAcademicPeriodResult = value;
    }

}
