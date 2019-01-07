
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LecturerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LecturerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISASUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eve_typc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LecturerResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "networkUserName",
    "isasUserName",
    "inUse",
    "emailAddress",
    "title",
    "jobTitle",
    "eveTypc",
    "firstName",
    "lastName",
    "schoolCode"
})
public class LecturerResult {

    @XmlElement(name = "NetworkUserName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String networkUserName;
    @XmlElement(name = "ISASUserName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String isasUserName;
    @XmlElement(name = "InUse", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String inUse;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String emailAddress;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String title;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String jobTitle;
    @XmlElement(name = "eve_typc", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String eveTypc;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String firstName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lastName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String schoolCode;

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
     * Gets the value of the inUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUse(String value) {
        this.inUse = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the eveTypc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEveTypc() {
        return eveTypc;
    }

    /**
     * Sets the value of the eveTypc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEveTypc(String value) {
        this.eveTypc = value;
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
     * Gets the value of the schoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * Sets the value of the schoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCode(String value) {
        this.schoolCode = value;
    }

}
