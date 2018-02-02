package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PersonUnionStatusCodeSimpleType")
@XmlEnum
public enum PersonUnionStatusCodeSimpleType {

  @XmlEnumValue("anulled")
  ANULLED("anulled"),

  @XmlEnumValue("dissolved")
  DISSOLVED("dissolved"),

  @XmlEnumValue("married")
  MARRIED("married"),

  @XmlEnumValue("separated")
  SEPARATED("separated"),

  @XmlEnumValue("single")
  SINGLE("single"),

  @XmlEnumValue("unknown")
  UNKNOWN("unknown"),

  @XmlEnumValue("widowed")
  WIDOWED("widowed");
  private final String value;

  PersonUnionStatusCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PersonUnionStatusCodeSimpleType fromValue(String v) {
    for (PersonUnionStatusCodeSimpleType c : PersonUnionStatusCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
