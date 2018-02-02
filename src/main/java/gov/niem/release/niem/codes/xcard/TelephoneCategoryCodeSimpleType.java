package gov.niem.release.niem.codes.xcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TelephoneCategoryCodeSimpleType")
@XmlEnum
public enum TelephoneCategoryCodeSimpleType {

  @XmlEnumValue("cell")
  CELL("cell"),

  @XmlEnumValue("fax")
  FAX("fax"),

  @XmlEnumValue("home")
  HOME("home"),

  @XmlEnumValue("pager")
  PAGER("pager"),

  @XmlEnumValue("text")
  TEXT("text"),

  @XmlEnumValue("textphone")
  TEXTPHONE("textphone"),

  @XmlEnumValue("video")
  VIDEO("video"),

  @XmlEnumValue("voice")
  VOICE("voice"),

  @XmlEnumValue("work")
  WORK("work");
  private final String value;

  TelephoneCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static TelephoneCategoryCodeSimpleType fromValue(String v) {
    for (TelephoneCategoryCodeSimpleType c : TelephoneCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
