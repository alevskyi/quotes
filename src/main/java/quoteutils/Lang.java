//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 05:03:57 PM EET 
//


package quoteutils;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lang.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Lang">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Russian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Lang")
@XmlEnum
public enum Lang {

    @XmlEnumValue("English")
    ENGLISH("English", "en"),
    
    @XmlEnumValue("Russian")
    RUSSIAN("Russian", "ru");
    
    
    private final String value;
    private final String valueShourtcut; 
    
    Lang(String v, String vs) {
        value = v;
        valueShourtcut = vs;
    }

    public String value() {
        return value;
    }

    public static Lang fromValue(String v) {
        for (Lang c: Lang.values()) 
        {
            if (c.value.equals(v) || c.valueShourtcut.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
