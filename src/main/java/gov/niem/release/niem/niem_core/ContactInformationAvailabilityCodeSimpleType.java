package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ContactInformationAvailabilityCodeSimpleType")
@XmlEnum
public enum ContactInformationAvailabilityCodeSimpleType {

  @XmlEnumValue("day")
  DAY("day"),

  @XmlEnumValue("emergency")
  EMERGENCY("emergency"),

  @XmlEnumValue("evening")
  EVENING("evening"),

  @XmlEnumValue("night")
  NIGHT("night"),

  @XmlEnumValue("primary")
  PRIMARY("primary"),

  @XmlEnumValue("secondary")
  SECONDARY("secondary");
  private final String value;

  ContactInformationAvailabilityCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ContactInformationAvailabilityCodeSimpleType fromValue(String v) {
    for (ContactInformationAvailabilityCodeSimpleType c : ContactInformationAvailabilityCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
