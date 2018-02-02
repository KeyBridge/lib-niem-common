package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DayOfWeekCodeSimpleType")
@XmlEnum
public enum DayOfWeekCodeSimpleType {

  FRI,

  MON,

  SAT,

  SUN,

  THU,

  TUE,

  WED;

  public String value() {
    return name();
  }

  public static DayOfWeekCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
