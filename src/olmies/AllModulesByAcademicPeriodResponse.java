
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
 *         &lt;element name="allModulesByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfModuleResult" minOccurs="0"/>
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
    "allModulesByAcademicPeriodResult"
})
@XmlRootElement(name = "allModulesByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModulesByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfModuleResult allModulesByAcademicPeriodResult;

    /**
     * Gets the value of the allModulesByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getAllModulesByAcademicPeriodResult() {
        return allModulesByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModulesByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setAllModulesByAcademicPeriodResult(ArrayOfModuleResult value) {
        this.allModulesByAcademicPeriodResult = value;
    }

}
