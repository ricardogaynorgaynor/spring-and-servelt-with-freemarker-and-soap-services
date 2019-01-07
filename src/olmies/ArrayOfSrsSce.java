
package olmies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSrs_sce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSrs_sce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srs_sce" type="{http://olmiesservice.utech.edu.jm/}srs_sce" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSrs_sce", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "srsSce"
})
public class ArrayOfSrsSce {

    @XmlElement(name = "srs_sce", namespace = "http://olmiesservice.utech.edu.jm/", nillable = true)
    protected List<SrsSce> srsSce;

    /**
     * Gets the value of the srsSce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srsSce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrsSce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SrsSce }
     * 
     * 
     */
    public List<SrsSce> getSrsSce() {
        if (srsSce == null) {
            srsSce = new ArrayList<SrsSce>();
        }
        return this.srsSce;
    }

}
