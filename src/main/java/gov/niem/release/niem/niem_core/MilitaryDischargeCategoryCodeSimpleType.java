package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MilitaryDischargeCategoryCodeSimpleType")
@XmlEnum
public enum MilitaryDischargeCategoryCodeSimpleType {

  B,

  D,

  G,

  H,

  M,

  N,

  O,

  Q,

  U;

  public String value() {
    return name();
  }

  public static MilitaryDischargeCategoryCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
