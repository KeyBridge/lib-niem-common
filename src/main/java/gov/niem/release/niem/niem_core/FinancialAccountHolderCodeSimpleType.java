package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FinancialAccountHolderCodeSimpleType")
@XmlEnum
public enum FinancialAccountHolderCodeSimpleType {

  @XmlEnumValue("FATCA101")
  FATCA_101("FATCA101"),

  @XmlEnumValue("FATCA102")
  FATCA_102("FATCA102"),

  @XmlEnumValue("FATCA103")
  FATCA_103("FATCA103");
  private final String value;

  FinancialAccountHolderCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static FinancialAccountHolderCodeSimpleType fromValue(String v) {
    for (FinancialAccountHolderCodeSimpleType c : FinancialAccountHolderCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
