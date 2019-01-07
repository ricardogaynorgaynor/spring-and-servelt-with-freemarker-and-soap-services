
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OccurrenceForLecturerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccurrenceForLecturerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISASUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eva_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccurrenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccurrenceForLecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "isasUserName",
    "networkUserName",
    "evaType",
    "firstName",
    "lastName",
    "occurrenceName",
    "moduleCode"
})
public class OccurrenceForLecturerResult {

    @XmlElement(name = "ISASUserName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String isasUserName;
    @XmlElement(name = "NetworkUserName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String networkUserName;
    @XmlElement(name = "eva_type", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String evaType;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String firstName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lastName;
    @XmlElement(name = "OccurrenceName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String occurrenceName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String moduleCode;

    /**
     * Gets the value of the isasUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISASUserName() {
        return isasUserName;
    }

    /**
     * Sets the value of the isasUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISASUserName(String value) {
        this.isasUserName = value;
    }

    /**
     * Gets the value of the networkUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkUserName() {
        return networkUserName;
    }

    /**
     * Sets the value of the networkUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkUserName(String value) {
        this.networkUserName = value;
    }

    /**
     * Gets the value of the evaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaType() {
        return evaType;
    }

    /**
     * Sets the value of the evaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaType(String value) {
        this.evaType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the occurrenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceName() {
        return occurrenceName;
    }

    /**
     * Sets the value of the occurrenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceName(String value) {
        this.occurrenceName = value;
    }

    /**
     * Gets the value of the moduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Sets the value of the moduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleCode(String value) {
        this.moduleCode = value;
    }

}
