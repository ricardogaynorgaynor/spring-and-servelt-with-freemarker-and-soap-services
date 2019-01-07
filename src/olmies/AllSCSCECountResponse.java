
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allSCSCECountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allSCSCECountResult"
})
@XmlRootElement(name = "allSCSCECountResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllSCSCECountResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected int allSCSCECountResult;

    /**
     * Gets the value of the allSCSCECountResult property.
     * 
     */
    public int getAllSCSCECountResult() {
        return allSCSCECountResult;
    }

    /**
     * Sets the value of the allSCSCECountResult property.
     * 
     */
    public void setAllSCSCECountResult(int value) {
        this.allSCSCECountResult = value;
    }

}
