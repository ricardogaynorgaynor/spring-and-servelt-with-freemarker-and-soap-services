
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
 *         &lt;element name="allModulesByFacultyByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfModuleResult" minOccurs="0"/>
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
    "allModulesByFacultyByAcademicPeriodResult"
})
@XmlRootElement(name = "allModulesByFacultyByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllModulesByFacultyByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfModuleResult allModulesByFacultyByAcademicPeriodResult;

    /**
     * Gets the value of the allModulesByFacultyByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public ArrayOfModuleResult getAllModulesByFacultyByAcademicPeriodResult() {
        return allModulesByFacultyByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allModulesByFacultyByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleResult }
     *     
     */
    public void setAllModulesByFacultyByAcademicPeriodResult(ArrayOfModuleResult value) {
        this.allModulesByFacultyByAcademicPeriodResult = value;
    }

}
