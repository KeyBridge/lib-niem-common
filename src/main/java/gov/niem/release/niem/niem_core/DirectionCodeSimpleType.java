package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DirectionCodeSimpleType")
@XmlEnum
public enum DirectionCodeSimpleType {

  E,

  ENE,

  ESE,

  N,

  NE,

  NNE,

  NNW,

  NW,

  S,

  SE,

  SSE,

  SSW,

  SW,

  W,

  WNW,

  WSW;

  public String value() {
    return name();
  }

  public static DirectionCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
