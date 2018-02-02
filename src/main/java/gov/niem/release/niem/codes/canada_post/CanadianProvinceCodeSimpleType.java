package gov.niem.release.niem.codes.canada_post;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CanadianProvinceCodeSimpleType")
@XmlEnum
public enum CanadianProvinceCodeSimpleType {

  AB,

  BC,

  MB,

  NB,

  NL,

  NS,

  NT,

  NU,

  ON,

  PE,

  QC,

  SK,

  YT;

  public String value() {
    return name();
  }

  public static CanadianProvinceCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
