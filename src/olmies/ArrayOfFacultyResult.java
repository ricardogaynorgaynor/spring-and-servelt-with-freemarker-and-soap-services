
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFacultyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFacultyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacultyResult" type="{http://olmiesservice.utech.edu.jm/}FacultyResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFacultyResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "facultyResult"
})
public class ArrayOfFacultyResult {

    @XmlElement(name = "FacultyResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<FacultyResult> facultyResult;

    /**
     * Gets the value of the facultyResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facultyResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacultyResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacultyResult }
     * 
     * 
     */
    public List<FacultyResult> getFacultyResult() {
        if (facultyResult == null) {
            facultyResult = new ArrayList<FacultyResult>();
        }
        return this.facultyResult;
    }

}
