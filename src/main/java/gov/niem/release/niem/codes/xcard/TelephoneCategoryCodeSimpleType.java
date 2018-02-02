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
