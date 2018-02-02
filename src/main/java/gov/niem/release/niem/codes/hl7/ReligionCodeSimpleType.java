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
package gov.niem.release.niem.codes.hl7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReligionCodeSimpleType")
@XmlEnum
public enum ReligionCodeSimpleType {

  ABC,

  AGN,

  AME,

  AMT,

  ANG,

  AOG,

  ATH,

  BAH,

  BAP,

  BMA,

  BOT,

  BTA,

  BTH,

  BUD,

  CAT,

  CFR,

  CHR,

  CHS,

  CMA,

  CNF,

  COC,

  COG,

  COI,

  COL,

  COM,

  COP,

  COT,

  CRR,

  EOT,

  EPI,

  ERL,

  EVC,

  FRQ,

  FWB,

  GRE,

  HIN,

  HOT,

  HSH,

  HVA,

  JAI,

  JCO,

  JEW,

  JOR,

  JOT,

  JRC,

  JRF,

  JRN,

  JWN,

  LMS,

  LUT,

  MEN,

  MET,

  MOM,

  MOS,

  MOT,

  MSH,

  MSU,

  NAM,

  NAZ,

  NOE,

  NRL,

  ORT,

  OTH,

  PEN,

  PRC,

  PRE,

  PRO,

  QUA,

  REC,

  REO,

  SAA,

  SEV,

  SHN,

  SIK,

  SOU,

  SPI,

  UCC,

  UMD,

  UNI,

  UNU,

  VAR,

  WES,

  WMC;

  public String value() {
    return name();
  }

  public static ReligionCodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
