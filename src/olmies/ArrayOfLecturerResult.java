
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLecturerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLecturerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LecturerResult" type="{http://olmiesservice.utech.edu.jm/}LecturerResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "lecturerResult"
})
public class ArrayOfLecturerResult {

    @XmlElement(name = "LecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<LecturerResult> lecturerResult;

    /**
     * Gets the value of the lecturerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lecturerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLecturerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LecturerResult }
     * 
     * 
     */
    public List<LecturerResult> getLecturerResult() {
        if (lecturerResult == null) {
            lecturerResult = new ArrayList<LecturerResult>();
        }
        return this.lecturerResult;
    }

}
