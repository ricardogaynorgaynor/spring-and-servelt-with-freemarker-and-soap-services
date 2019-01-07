
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
 *         &lt;element name="allLessonTypeByModuleCodeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfLessonTypeResult" minOccurs="0"/>
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
    "allLessonTypeByModuleCodeByAcademicPeriodResult"
})
@XmlRootElement(name = "allLessonTypeByModuleCodeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLessonTypeByModuleCodeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfLessonTypeResult allLessonTypeByModuleCodeByAcademicPeriodResult;

    /**
     * Gets the value of the allLessonTypeByModuleCodeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLessonTypeResult }
     *     
     */
    public ArrayOfLessonTypeResult getAllLessonTypeByModuleCodeByAcademicPeriodResult() {
        return allLessonTypeByModuleCodeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allLessonTypeByModuleCodeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLessonTypeResult }
     *     
     */
    public void setAllLessonTypeByModuleCodeByAcademicPeriodResult(ArrayOfLessonTypeResult value) {
        this.allLessonTypeByModuleCodeByAcademicPeriodResult = value;
    }

}
