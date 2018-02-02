package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PassportCategoryCodeSimpleType")
@XmlEnum
public enum PassportCategoryCodeSimpleType {

  @XmlEnumValue("Diplomat")
  DIPLOMAT("Diplomat"),

  @XmlEnumValue("Individual")
  INDIVIDUAL("Individual"),

  @XmlEnumValue("Official")
  OFFICIAL("Official");
  private final String value;

  PassportCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PassportCategoryCodeSimpleType fromValue(String v) {
    for (PassportCategoryCodeSimpleType c : PassportCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
