package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MessageCategoryFATCACodeSimpleType")
@XmlEnum
public enum MessageCategoryFATCACodeSimpleType {

  FATCA("FATCA"),

  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  MessageCategoryFATCACodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static MessageCategoryFATCACodeSimpleType fromValue(String v) {
    for (MessageCategoryFATCACodeSimpleType c : MessageCategoryFATCACodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
