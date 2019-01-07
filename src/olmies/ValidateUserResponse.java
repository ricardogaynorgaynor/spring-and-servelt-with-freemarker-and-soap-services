
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
 *         &lt;element name="validateUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validateUserResult"
})
@XmlRootElement(name = "validateUserResponse", namespace = "http://olmiesservice.utech.edu.jm/")
public class ValidateUserResponse {

    @XmlElement(namespace = "http://olmiesservice.utech.edu.jm/")
    protected boolean validateUserResult;

    /**
     * Gets the value of the validateUserResult property.
     * 
     */
    public boolean isValidateUserResult() {
        return validateUserResult;
    }

    /**
     * Sets the value of the validateUserResult property.
     * 
     */
    public void setValidateUserResult(boolean value) {
        this.validateUserResult = value;
    }

}
