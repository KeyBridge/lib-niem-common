package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FinancialAccountNumberCategoryCodeSimpleType")
@XmlEnum
public enum FinancialAccountNumberCategoryCodeSimpleType {

  IBAN("IBAN"),

  ISIN("ISIN"),

  OBAN("OBAN"),

  OSIN("OSIN"),

  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  FinancialAccountNumberCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static FinancialAccountNumberCategoryCodeSimpleType fromValue(String v) {
    for (FinancialAccountNumberCategoryCodeSimpleType c : FinancialAccountNumberCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
