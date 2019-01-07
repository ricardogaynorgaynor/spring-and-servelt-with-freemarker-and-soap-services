
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
 *         &lt;element name="allStudentCourseByStudentIDAcdemicPeriodResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfString" minOccurs="0"/>
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
    "allStudentCourseByStudentIDAcdemicPeriodResult"
})
@XmlRootElement(name = "allStudentCourseByStudentIDAcdemicPeriodResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllStudentCourseByStudentIDAcdemicPeriodResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfString allStudentCourseByStudentIDAcdemicPeriodResult;

    /**
     * Gets the value of the allStudentCourseByStudentIDAcdemicPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllStudentCourseByStudentIDAcdemicPeriodResult() {
        return allStudentCourseByStudentIDAcdemicPeriodResult;
    }

    /**
     * Sets the value of the allStudentCourseByStudentIDAcdemicPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllStudentCourseByStudentIDAcdemicPeriodResult(ArrayOfString value) {
        this.allStudentCourseByStudentIDAcdemicPeriodResult = value;
    }

}
