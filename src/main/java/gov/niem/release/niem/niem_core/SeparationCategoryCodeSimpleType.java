package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SeparationCategoryCodeSimpleType")
@XmlEnum
public enum SeparationCategoryCodeSimpleType {

  @XmlEnumValue("Legal")
  LEGAL("Legal"),

  @XmlEnumValue("Physical")
  PHYSICAL("Physical"),

  @XmlEnumValue("Unknown")
  UNKNOWN("Unknown");
  private final String value;

  SeparationCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SeparationCategoryCodeSimpleType fromValue(String v) {
    for (SeparationCategoryCodeSimpleType c : SeparationCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
