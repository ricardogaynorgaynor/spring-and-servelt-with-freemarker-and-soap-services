
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
 *         &lt;element name="allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfStudentResult" minOccurs="0"/>
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
    "allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult"
})
@XmlRootElement(name = "allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllStudentsWithOccurrenceByModuleCodeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfStudentResult allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult;

    /**
     * Gets the value of the allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public ArrayOfStudentResult getAllStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult() {
        return allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStudentResult }
     *     
     */
    public void setAllStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult(ArrayOfStudentResult value) {
        this.allStudentsWithOccurrenceByModuleCodeByAcademicPeriodResult = value;
    }

}
