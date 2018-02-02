package gov.niem.release.niem.codes.dod_jcs_pub2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DocumentIntelligenceCategoryCodeSimpleType")
@XmlEnum
public enum DocumentIntelligenceCategoryCodeSimpleType {

  CI,

  COMINT,

  ELINT,

  FISINT,

  GEOINT,

  HUMINT,

  IMINT,

  MASINT,

  OSINT,

  SIGINT,

  TECHINT;

  public String value() {
    return name();
  }

  public static DocumentIntelligenceCategoryCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
