
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
 *         &lt;element name="allModuleBreakDownForStudentForAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfStudentModuleBreakDownResult" minOccurs="0"/>
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
    "allModuleBreakDownForStudentForAcademicPeriodResult"
})
@XmlRootElement(name = "allModuleBreakDownForStudentForAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModuleBreakDownForStudentForAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfStudentModuleBreakDownResult allModuleBreakDownForStudentForAcademicPeriodResult;

    /**
     * Gets the value of the allModuleBreakDownForStudentForAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStudentModuleBreakDownResult }
     *     
     */
    public ArrayOfStudentModuleBreakDownResult getAllModuleBreakDownForStudentForAcademicPeriodResult() {
        return allModuleBreakDownForStudentForAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModuleBreakDownForStudentForAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStudentModuleBreakDownResult }
     *     
     */
    public void setAllModuleBreakDownForStudentForAcademicPeriodResult(ArrayOfStudentModuleBreakDownResult value) {
        this.allModuleBreakDownForStudentForAcademicPeriodResult = value;
    }

}
