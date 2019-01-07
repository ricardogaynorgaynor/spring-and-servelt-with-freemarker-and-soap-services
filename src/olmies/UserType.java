
package olmies;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Staff"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="Executive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType", namespace = "http://olmiesservice.utech.edu.jm/")
@XmlEnum
public enum UserType {

    @XmlEnumValue("Staff")
    STAFF("Staff"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    @XmlEnumValue("Executive")
    EXECUTIVE("Executive");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
