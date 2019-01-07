
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
 *         &lt;element name="allOccurrenceByModulesCodeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfOccurrenceResult" minOccurs="0"/>
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
    "allOccurrenceByModulesCodeByAcademicPeriodResult"
})
@XmlRootElement(name = "allOccurrenceByModulesCodeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllOccurrenceByModulesCodeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfOccurrenceResult allOccurrenceByModulesCodeByAcademicPeriodResult;

    /**
     * Gets the value of the allOccurrenceByModulesCodeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOccurrenceResult }
     *     
     */
    public ArrayOfOccurrenceResult getAllOccurrenceByModulesCodeByAcademicPeriodResult() {
        return allOccurrenceByModulesCodeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allOccurrenceByModulesCodeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOccurrenceResult }
     *     
     */
    public void setAllOccurrenceByModulesCodeByAcademicPeriodResult(ArrayOfOccurrenceResult value) {
        this.allOccurrenceByModulesCodeByAcademicPeriodResult = value;
    }

}
