package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StatuteCategoryCodeSimpleType")
@XmlEnum
public enum StatuteCategoryCodeSimpleType {

  B,

  C,

  D,

  J,

  N,

  P;

  public String value() {
    return name();
  }

  public static StatuteCategoryCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
