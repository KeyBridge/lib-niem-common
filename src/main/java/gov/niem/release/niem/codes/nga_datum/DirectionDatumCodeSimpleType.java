package gov.niem.release.niem.codes.nga_datum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DirectionDatumCodeSimpleType")
@XmlEnum
public enum DirectionDatumCodeSimpleType {

  @XmlEnumValue("geodetic")
  GEODETIC("geodetic"),

  @XmlEnumValue("Magnetic")
  MAGNETIC("Magnetic"),

  @XmlEnumValue("militaryGrid")
  MILITARY_GRID("militaryGrid"),

  @XmlEnumValue("Relative")
  RELATIVE("Relative");
  private final String value;

  DirectionDatumCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static DirectionDatumCodeSimpleType fromValue(String v) {
    for (DirectionDatumCodeSimpleType c : DirectionDatumCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
