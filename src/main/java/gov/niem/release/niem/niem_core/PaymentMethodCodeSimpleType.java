package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentMethodCodeSimpleType")
@XmlEnum
public enum PaymentMethodCodeSimpleType {

  @XmlEnumValue("Cash")
  CASH("Cash"),

  @XmlEnumValue("Check")
  CHECK("Check"),

  @XmlEnumValue("Dividends")
  DIVIDENDS("Dividends"),

  @XmlEnumValue("Gross Proceeds/Redemptions")
  GROSS_PROCEEDS_REDEMPTIONS("Gross Proceeds/Redemptions"),

  @XmlEnumValue("Interest")
  INTEREST("Interest"),

  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  PaymentMethodCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PaymentMethodCodeSimpleType fromValue(String v) {
    for (PaymentMethodCodeSimpleType c : PaymentMethodCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
