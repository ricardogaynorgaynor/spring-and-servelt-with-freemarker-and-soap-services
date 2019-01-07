
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProgrammeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProgrammeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgrammeResult" type="{http://olmiesservice.utech.edu.jm/}ProgrammeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProgrammeResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "programmeResult"
})
public class ArrayOfProgrammeResult {

    @XmlElement(name = "ProgrammeResult", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<ProgrammeResult> programmeResult;

    /**
     * Gets the value of the programmeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programmeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgrammeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgrammeResult }
     * 
     * 
     */
    public List<ProgrammeResult> getProgrammeResult() {
        if (programmeResult == null) {
            programmeResult = new ArrayList<ProgrammeResult>();
        }
        return this.programmeResult;
    }

}
