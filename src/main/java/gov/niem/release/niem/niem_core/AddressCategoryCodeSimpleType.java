package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AddressCategoryCodeSimpleType")
@XmlEnum
public enum AddressCategoryCodeSimpleType {

  @XmlEnumValue("business")
  BUSINESS("business"),

  @XmlEnumValue("registered office")
  REGISTERED_OFFICE("registered office"),

  @XmlEnumValue("residential")
  RESIDENTIAL("residential"),

  @XmlEnumValue("residential or business")
  RESIDENTIAL_OR_BUSINESS("residential or business"),

  @XmlEnumValue("unspecified")
  UNSPECIFIED("unspecified");
  private final String value;

  AddressCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static AddressCategoryCodeSimpleType fromValue(String v) {
    for (AddressCategoryCodeSimpleType c : AddressCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
