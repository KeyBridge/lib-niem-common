package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PersonUnionCategoryCodeSimpleType")
@XmlEnum
public enum PersonUnionCategoryCodeSimpleType {

  @XmlEnumValue("civil union")
  CIVIL_UNION("civil union"),

  @XmlEnumValue("common law")
  COMMON_LAW("common law"),

  @XmlEnumValue("domestic partnership")
  DOMESTIC_PARTNERSHIP("domestic partnership"),

  @XmlEnumValue("married")
  MARRIED("married"),

  @XmlEnumValue("unknown")
  UNKNOWN("unknown");
  private final String value;

  PersonUnionCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PersonUnionCategoryCodeSimpleType fromValue(String v) {
    for (PersonUnionCategoryCodeSimpleType c : PersonUnionCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
