
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOccurrenceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOccurrenceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OccurrenceResult" type="{http://olmiesservice.utech.edu.jm/}OccurrenceResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOccurrenceResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "occurrenceResult"
})
public class ArrayOfOccurrenceResult {

    @XmlElement(name = "OccurrenceResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<OccurrenceResult> occurrenceResult;

    /**
     * Gets the value of the occurrenceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrenceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccurrenceResult }
     * 
     * 
     */
    public List<OccurrenceResult> getOccurrenceResult() {
        if (occurrenceResult == null) {
            occurrenceResult = new ArrayList<OccurrenceResult>();
        }
        return this.occurrenceResult;
    }

}
