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
package gov.niem.release.niem.codes.usps_states;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "USStateCodeSimpleType")
@XmlEnum
public enum USStateCodeSimpleType {

  AA,

  AE,

  AK,

  AL,

  AP,

  AR,

  AS,

  AZ,

  CA,

  CO,

  CT,

  DC,

  DE,

  FL,

  FM,

  GA,

  GU,

  HI,

  IA,

  ID,

  IL,

  IN,

  KS,

  KY,

  LA,

  MA,

  MD,

  ME,

  MH,

  MI,

  MN,

  MO,

  MP,

  MS,

  MT,

  NC,

  ND,

  NE,

  NH,

  NJ,

  NM,

  NV,

  NY,

  OH,

  OK,

  OR,

  PA,

  PR,

  PW,

  RI,

  SC,

  SD,

  TN,

  TX,

  UT,

  VA,

  VI,

  VT,

  WA,

  WI,

  WV,

  WY;

  public String value() {
    return name();
  }

  public static USStateCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
