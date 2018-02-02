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
