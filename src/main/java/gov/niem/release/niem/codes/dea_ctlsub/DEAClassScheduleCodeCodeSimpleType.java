package gov.niem.release.niem.codes.dea_ctlsub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DEAClassScheduleCodeCodeSimpleType")
@XmlEnum
public enum DEAClassScheduleCodeCodeSimpleType {

  I,

  II,

  III,

  IV,

  V;

  public String value() {
    return name();
  }

  public static DEAClassScheduleCodeCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
