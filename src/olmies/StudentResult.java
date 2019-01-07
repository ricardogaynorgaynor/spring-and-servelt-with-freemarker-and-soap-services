
package olmies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentCodeScjc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="academicLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facultyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccurrenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentResult", namespace = "http://olmiesservice.utech.edu.jm/", propOrder = {
    "studentCode",
    "studentCodeScjc",
    "enrollmentStatus",
    "studentGender",
    "emailAddress",
    "title",
    "academicLevel",
    "firstName",
    "middleName",
    "lastName",
    "schoolCode",
    "courseCode",
    "facultyCode",
    "occurrenceName"
})
public class StudentResult {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String studentCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String studentCodeScjc;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String enrollmentStatus;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String studentGender;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String emailAddress;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String title;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String academicLevel;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String firstName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String middleName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String lastName;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String schoolCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String courseCode;
    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected String facultyCode;
    @XmlElement(name = "OccurrenceName", namespace = "http://olmiesservice.utech.edu.jm/")
    protected String occurrenceName;

    /**
     * Gets the value of the studentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * Sets the value of the studentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCode(String value) {
        this.studentCode = value;
    }

    /**
     * Gets the value of the studentCodeScjc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCodeScjc() {
        return studentCodeScjc;
    }

    /**
     * Sets the value of the studentCodeScjc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCodeScjc(String value) {
        this.studentCodeScjc = value;
    }

    /**
     * Gets the value of the enrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Sets the value of the enrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentStatus(String value) {
        this.enrollmentStatus = value;
    }

    /**
     * Gets the value of the studentGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     * Sets the value of the studentGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentGender(String value) {
        this.studentGender = value;
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
     * Gets the value of the academicLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Sets the value of the academicLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicLevel(String value) {
        this.academicLevel = value;
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
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCode(String value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the facultyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultyCode() {
        return facultyCode;
    }

    /**
     * Sets the value of the facultyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultyCode(String value) {
        this.facultyCode = value;
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

}
