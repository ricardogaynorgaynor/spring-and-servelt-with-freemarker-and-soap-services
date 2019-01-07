
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
 *         &lt;element name="allFacultiesResult" type="{http://olmiesservice.utech.edu.jm/}ArrayOfFacultyResult" minOccurs="0"/>
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
    "allFacultiesResult"
})
@XmlRootElement(name = "allFacultiesResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllFacultiesResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected ArrayOfFacultyResult allFacultiesResult;

    /**
     * Gets the value of the allFacultiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacultyResult }
     *     
     */
    public ArrayOfFacultyResult getAllFacultiesResult() {
        return allFacultiesResult;
    }

    /**
     * Sets the value of the allFacultiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacultyResult }
     *     
     */
    public void setAllFacultiesResult(ArrayOfFacultyResult value) {
        this.allFacultiesResult = value;
    }

}
