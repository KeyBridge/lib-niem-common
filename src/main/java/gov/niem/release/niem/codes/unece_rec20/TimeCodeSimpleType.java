package gov.niem.release.niem.codes.unece_rec20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TimeCodeSimpleType")
@XmlEnum
public enum TimeCodeSimpleType {

  ANN("ANN"),

  @XmlEnumValue("B52")
  B_52("B52"),

  @XmlEnumValue("B98")
  B_98("B98"),

  @XmlEnumValue("C26")
  C_26("C26"),

  @XmlEnumValue("C47")
  C_47("C47"),

  @XmlEnumValue("D42")
  D_42("D42"),

  DAY("DAY"),

  HUR("HUR"),

  MIN("MIN"),

  MON("MON"),

  SEC("SEC"),

  WEE("WEE");
  private final String value;

  TimeCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static TimeCodeSimpleType fromValue(String v) {
    for (TimeCodeSimpleType c : TimeCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
