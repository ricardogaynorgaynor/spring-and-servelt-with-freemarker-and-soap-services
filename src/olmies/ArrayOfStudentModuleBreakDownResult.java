
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStudentModuleBreakDownResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStudentModuleBreakDownResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentModuleBreakDownResult" type="{http://olmiesservice.utech.edu.jm/}StudentModuleBreakDownResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStudentModuleBreakDownResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "studentModuleBreakDownResult"
})
public class ArrayOfStudentModuleBreakDownResult {

    @XmlElement(name = "StudentModuleBreakDownResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<StudentModuleBreakDownResult> studentModuleBreakDownResult;

    /**
     * Gets the value of the studentModuleBreakDownResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentModuleBreakDownResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentModuleBreakDownResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentModuleBreakDownResult }
     * 
     * 
     */
    public List<StudentModuleBreakDownResult> getStudentModuleBreakDownResult() {
        if (studentModuleBreakDownResult == null) {
            studentModuleBreakDownResult = new ArrayList<StudentModuleBreakDownResult>();
        }
        return this.studentModuleBreakDownResult;
    }

}
