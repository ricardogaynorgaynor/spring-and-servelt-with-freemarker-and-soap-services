
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSchoolResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSchoolResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolResult" type="{http://olmiesservice.utech.edu.jm/}SchoolResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSchoolResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "schoolResult"
})
public class ArrayOfSchoolResult {

    @XmlElement(name = "SchoolResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<SchoolResult> schoolResult;

    /**
     * Gets the value of the schoolResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolResult }
     * 
     * 
     */
    public List<SchoolResult> getSchoolResult() {
        if (schoolResult == null) {
            schoolResult = new ArrayList<SchoolResult>();
        }
        return this.schoolResult;
    }

}
