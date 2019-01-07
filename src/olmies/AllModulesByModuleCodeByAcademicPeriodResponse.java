
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
 *         &lt;element name="allModulesByModuleCodeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfModuleResult" minOccurs="0"/>
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
    "allModulesByModuleCodeByAcademicPeriodResult"
})
@XmlRootElement(name = "allModulesByModuleCodeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModulesByModuleCodeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfModuleResult allModulesByModuleCodeByAcademicPeriodResult;

    /**
     * Gets the value of the allModulesByModuleCodeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getAllModulesByModuleCodeByAcademicPeriodResult() {
        return allModulesByModuleCodeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModulesByModuleCodeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setAllModulesByModuleCodeByAcademicPeriodResult(ArrayOfModuleResult value) {
        this.allModulesByModuleCodeByAcademicPeriodResult = value;
    }

}
