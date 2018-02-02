package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OffenseLevelCodeSimpleType")
@XmlEnum
public enum OffenseLevelCodeSimpleType {

  F,

  G,

  M,

  P;

  public String value() {
    return name();
  }

  public static OffenseLevelCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
