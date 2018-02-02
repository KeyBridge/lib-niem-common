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

@XmlType(name = "TimeCodeSimpleType")
@XmlEnum
public enum TimeCodeSimpleType {

  ANN("ANN"),

  @XmlEnumValue("B52")
  B_52("B52"),

  @XmlEnumValue("B98")
  B_98("B98"),

  @XmlEnumValue("C26")
  C_26("C26"),

  @XmlEnumValue("C47")
  C_47("C47"),

  @XmlEnumValue("D42")
  D_42("D42"),

  DAY("DAY"),

  HUR("HUR"),

  MIN("MIN"),

  MON("MON"),

  SEC("SEC"),

  WEE("WEE");
  private final String value;

  TimeCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static TimeCodeSimpleType fromValue(String v) {
    for (TimeCodeSimpleType c : TimeCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
