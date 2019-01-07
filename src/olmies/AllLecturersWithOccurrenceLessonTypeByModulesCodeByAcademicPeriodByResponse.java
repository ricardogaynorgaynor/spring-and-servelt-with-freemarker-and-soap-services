
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
 *         &lt;element name="allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfLecturerLessonTypeOccurrenceResult" minOccurs="0"/>
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
    "allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult"
})
@XmlRootElement(name = "allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfLecturerLessonTypeOccurrenceResult allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult;

    /**
     * Gets the value of the allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLecturerLessonTypeOccurrenceResult }
     *     
     */
    public ArrayOfLecturerLessonTypeOccurrenceResult getAllLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult() {
        return allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult;
    }

    /**
     * Sets the value of the allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLecturerLessonTypeOccurrenceResult }
     *     
     */
    public void setAllLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult(ArrayOfLecturerLessonTypeOccurrenceResult value) {
        this.allLecturersWithOccurrenceLessonTypeByModulesCodeByAcademicPeriodByResult = value;
    }

}
