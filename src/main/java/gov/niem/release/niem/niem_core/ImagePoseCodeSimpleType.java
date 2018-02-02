package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ImagePoseCodeSimpleType")
@XmlEnum
public enum ImagePoseCodeSimpleType {

  @XmlEnumValue("Frontal")
  FRONTAL("Frontal"),

  @XmlEnumValue("Oblique")
  OBLIQUE("Oblique"),

  @XmlEnumValue("Side")
  SIDE("Side");
  private final String value;

  ImagePoseCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ImagePoseCodeSimpleType fromValue(String v) {
    for (ImagePoseCodeSimpleType c : ImagePoseCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
