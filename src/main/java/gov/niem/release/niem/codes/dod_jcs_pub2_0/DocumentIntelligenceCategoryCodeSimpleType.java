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
package gov.niem.release.niem.codes.dod_jcs_pub2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DocumentIntelligenceCategoryCodeSimpleType")
@XmlEnum
public enum DocumentIntelligenceCategoryCodeSimpleType {

  CI,

  COMINT,

  ELINT,

  FISINT,

  GEOINT,

  HUMINT,

  IMINT,

  MASINT,

  OSINT,

  SIGINT,

  TECHINT;

  public String value() {
    return name();
  }

  public static DocumentIntelligenceCategoryCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
