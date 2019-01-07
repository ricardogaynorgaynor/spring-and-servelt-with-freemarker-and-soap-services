
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
 *         &lt;element name="allModulesBySchoolByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfModuleResult" minOccurs="0"/>
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
    "allModulesBySchoolByAcademicPeriodResult"
})
@XmlRootElement(name = "allModulesBySchoolByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModulesBySchoolByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfModuleResult allModulesBySchoolByAcademicPeriodResult;

    /**
     * Gets the value of the allModulesBySchoolByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getAllModulesBySchoolByAcademicPeriodResult() {
        return allModulesBySchoolByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModulesBySchoolByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setAllModulesBySchoolByAcademicPeriodResult(ArrayOfModuleResult value) {
        this.allModulesBySchoolByAcademicPeriodResult = value;
    }

}
