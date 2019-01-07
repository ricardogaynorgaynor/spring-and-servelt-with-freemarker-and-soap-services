
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
 *         &lt;element name="ayr_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psl_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISASUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ayrCode",
    "pslCode",
    "networkUsername",
    "isasUsername",
    "firstName",
    "lastName",
    "email"
})
@XmlRootElement(name = "allLecturersByUserNameByAcademicPeriodAdvanceFilter", namespace = "http://olmiesservice.utech.edu.jm/")
public class AllLecturersByUserNameByAcademicPeriodAdvanceFilter {

    @XmlElement(name = "ayr_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String ayrCode;
    @XmlElement(name = "psl_code", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String pslCode;
    @XmlElement(name = "NetworkUsername", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String networkUsername;
    @XmlElement(name = "ISASUsername", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String isasUsername;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String firstName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lastName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String email;

    /**
     * Gets the value of the ayrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAyrCode() {
        return ayrCode;
    }

    /**
     * Sets the value of the ayrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAyrCode(String value) {
        this.ayrCode = value;
    }

    /**
     * Gets the value of the pslCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPslCode() {
        return pslCode;
    }

    /**
     * Sets the value of the pslCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPslCode(String value) {
        this.pslCode = value;
    }

    /**
     * Gets the value of the networkUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkUsername() {
        return networkUsername;
    }

    /**
     * Sets the value of the networkUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkUsername(String value) {
        this.networkUsername = value;
    }

    /**
     * Gets the value of the isasUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISASUsername() {
        return isasUsername;
    }

    /**
     * Sets the value of the isasUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISASUsername(String value) {
        this.isasUsername = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
