
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
 *         &lt;element name="allModulesByProgrammeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfModuleResult" minOccurs="0"/>
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
    "allModulesByProgrammeByAcademicPeriodResult"
})
@XmlRootElement(name = "allModulesByProgrammeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModulesByProgrammeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfModuleResult allModulesByProgrammeByAcademicPeriodResult;

    /**
     * Gets the value of the allModulesByProgrammeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getAllModulesByProgrammeByAcademicPeriodResult() {
        return allModulesByProgrammeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModulesByProgrammeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setAllModulesByProgrammeByAcademicPeriodResult(ArrayOfModuleResult value) {
        this.allModulesByProgrammeByAcademicPeriodResult = value;
    }

}
