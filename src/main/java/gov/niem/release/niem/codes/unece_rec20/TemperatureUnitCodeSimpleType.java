/* 
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.niem.release.niem.codes.unece_rec20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TemperatureUnitCodeSimpleType")
@XmlEnum
public enum TemperatureUnitCodeSimpleType {

  @XmlEnumValue("A48")
  A_48("A48"),

  CEL("CEL"),

  @XmlEnumValue("E98")
  E_98("E98"),

  @XmlEnumValue("F02")
  F_02("F02"),

  @XmlEnumValue("F10")
  F_10("F10"),

  @XmlEnumValue("F11")
  F_11("F11"),

  @XmlEnumValue("F12")
  F_12("F12"),

  @XmlEnumValue("F60")
  F_60("F60"),

  @XmlEnumValue("F61")
  F_61("F61"),

  FAH("FAH"),

  @XmlEnumValue("H12")
  H_12("H12"),

  @XmlEnumValue("H13")
  H_13("H13"),

  @XmlEnumValue("H14")
  H_14("H14"),

  @XmlEnumValue("J20")
  J_20("J20"),

  @XmlEnumValue("J21")
  J_21("J21"),

  @XmlEnumValue("J23")
  J_23("J23"),

  @XmlEnumValue("J24")
  J_24("J24"),

  @XmlEnumValue("J25")
  J_25("J25"),

  @XmlEnumValue("J26")
  J_26("J26"),

  @XmlEnumValue("J28")
  J_28("J28"),

  @XmlEnumValue("J29")
  J_29("J29"),

  @XmlEnumValue("J30")
  J_30("J30"),

  @XmlEnumValue("N79")
  N_79("N79");
  private final String value;

  TemperatureUnitCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static TemperatureUnitCodeSimpleType fromValue(String v) {
    for (TemperatureUnitCodeSimpleType c : TemperatureUnitCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
