package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PleaCategoryCodeSimpleType")
@XmlEnum
public enum PleaCategoryCodeSimpleType {

  A,

  C,

  G,

  I,

  M,

  N,

  U,

  X;

  public String value() {
    return name();
  }

  public static PleaCategoryCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
