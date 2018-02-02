package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PersonNameCategoryCodeSimpleType")
@XmlEnum
public enum PersonNameCategoryCodeSimpleType {

  @XmlEnumValue("Alternate")
  ALTERNATE("Alternate"),

  @XmlEnumValue("Asserted")
  ASSERTED("Asserted"),

  @XmlEnumValue("at birth")
  AT_BIRTH("at birth"),

  @XmlEnumValue("Legal")
  LEGAL("Legal");
  private final String value;

  PersonNameCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PersonNameCategoryCodeSimpleType fromValue(String v) {
    for (PersonNameCategoryCodeSimpleType c : PersonNameCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
