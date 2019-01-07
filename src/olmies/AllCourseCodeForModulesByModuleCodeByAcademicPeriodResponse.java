
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
 *         &lt;element name="allCourseCodeForModulesByModuleCodeByAcademicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfProgrammeResult" minOccurs="0"/>
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
    "allCourseCodeForModulesByModuleCodeByAcademicPeriodResult"
})
@XmlRootElement(name = "allCourseCodeForModulesByModuleCodeByAcademicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllCourseCodeForModulesByModuleCodeByAcademicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfProgrammeResult allCourseCodeForModulesByModuleCodeByAcademicPeriodResult;

    /**
     * Gets the value of the allCourseCodeForModulesByModuleCodeByAcademicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public ArrayOfProgrammeResult getAllCourseCodeForModulesByModuleCodeByAcademicPeriodResult() {
        return allCourseCodeForModulesByModuleCodeByAcademicPeriodResult;
    }

    /**
     * Sets the value of the allCourseCodeForModulesByModuleCodeByAcademicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgrammeResult }
     *     
     */
    public void setAllCourseCodeForModulesByModuleCodeByAcademicPeriodResult(ArrayOfProgrammeResult value) {
        this.allCourseCodeForModulesByModuleCodeByAcademicPeriodResult = value;
    }

}
