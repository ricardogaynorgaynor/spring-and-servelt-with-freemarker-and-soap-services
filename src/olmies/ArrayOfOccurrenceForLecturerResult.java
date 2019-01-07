
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOccurrenceForLecturerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOccurrenceForLecturerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OccurrenceForLecturerResult" type="{http://olmiesservice.utech.edu.jm/}OccurrenceForLecturerResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOccurrenceForLecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "occurrenceForLecturerResult"
})
public class ArrayOfOccurrenceForLecturerResult {

    @XmlElement(name = "OccurrenceForLecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<OccurrenceForLecturerResult> occurrenceForLecturerResult;

    /**
     * Gets the value of the occurrenceForLecturerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceForLecturerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrenceForLecturerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccurrenceForLecturerResult }
     * 
     * 
     */
    public List<OccurrenceForLecturerResult> getOccurrenceForLecturerResult() {
        if (occurrenceForLecturerResult == null) {
            occurrenceForLecturerResult = new ArrayList<OccurrenceForLecturerResult>();
        }
        return this.occurrenceForLecturerResult;
    }

}
