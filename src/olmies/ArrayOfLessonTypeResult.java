
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLessonTypeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLessonTypeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LessonTypeResult" type="{http://olmiesservice.utech.edu.jm/}LessonTypeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLessonTypeResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "lessonTypeResult"
})
public class ArrayOfLessonTypeResult {

    @XmlElement(name = "LessonTypeResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<LessonTypeResult> lessonTypeResult;

    /**
     * Gets the value of the lessonTypeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lessonTypeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLessonTypeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LessonTypeResult }
     * 
     * 
     */
    public List<LessonTypeResult> getLessonTypeResult() {
        if (lessonTypeResult == null) {
            lessonTypeResult = new ArrayList<LessonTypeResult>();
        }
        return this.lessonTypeResult;
    }

}
