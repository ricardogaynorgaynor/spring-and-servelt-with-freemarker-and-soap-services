
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStudentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStudentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentResult" type="{http://olmiesservice.utech.edu.jm/}StudentResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStudentResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "studentResult"
})
public class ArrayOfStudentResult {

    @XmlElement(name = "StudentResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<StudentResult> studentResult;

    /**
     * Gets the value of the studentResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentResult }
     * 
     * 
     */
    public List<StudentResult> getStudentResult() {
        if (studentResult == null) {
            studentResult = new ArrayList<StudentResult>();
        }
        return this.studentResult;
    }

}
