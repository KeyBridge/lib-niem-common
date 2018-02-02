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
package gov.niem.release.niem.codes.dea_ctlsub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DrugCategoryCodeSimpleType")
@XmlEnum
public enum DrugCategoryCodeSimpleType {

  @XmlEnumValue("A1")
  A_1("A1"),

  @XmlEnumValue("A2")
  A_2("A2"),

  @XmlEnumValue("A3")
  A_3("A3"),

  @XmlEnumValue("A4")
  A_4("A4"),

  @XmlEnumValue("A5")
  A_5("A5"),

  @XmlEnumValue("A6")
  A_6("A6"),

  @XmlEnumValue("A7")
  A_7("A7"),

  @XmlEnumValue("A8")
  A_8("A8"),

  @XmlEnumValue("B1")
  B_1("B1"),

  @XmlEnumValue("B2")
  B_2("B2"),

  @XmlEnumValue("B3")
  B_3("B3"),

  @XmlEnumValue("C1")
  C_1("C1"),

  @XmlEnumValue("C2")
  C_2("C2"),

  @XmlEnumValue("C3")
  C_3("C3"),

  @XmlEnumValue("C4")
  C_4("C4"),

  @XmlEnumValue("C5")
  C_5("C5"),

  @XmlEnumValue("D1")
  D_1("D1"),

  @XmlEnumValue("D2")
  D_2("D2"),

  @XmlEnumValue("D3")
  D_3("D3"),

  @XmlEnumValue("D4")
  D_4("D4"),

  @XmlEnumValue("E1")
  E_1("E1"),

  @XmlEnumValue("G1")
  G_1("G1"),

  @XmlEnumValue("G2")
  G_2("G2"),

  @XmlEnumValue("G3")
  G_3("G3"),

  @XmlEnumValue("H1")
  H_1("H1"),

  @XmlEnumValue("H2")
  H_2("H2"),

  @XmlEnumValue("H3")
  H_3("H3"),

  @XmlEnumValue("H4")
  H_4("H4"),

  @XmlEnumValue("L1")
  L_1("L1"),

  @XmlEnumValue("L2")
  L_2("L2"),

  @XmlEnumValue("L3")
  L_3("L3"),

  @XmlEnumValue("L4")
  L_4("L4"),

  @XmlEnumValue("L5")
  L_5("L5"),

  @XmlEnumValue("M1")
  M_1("M1"),

  @XmlEnumValue("M2")
  M_2("M2"),

  @XmlEnumValue("M3")
  M_3("M3"),

  @XmlEnumValue("M4")
  M_4("M4"),

  @XmlEnumValue("M5")
  M_5("M5"),

  @XmlEnumValue("N1")
  N_1("N1"),

  @XmlEnumValue("N2")
  N_2("N2"),

  @XmlEnumValue("N3")
  N_3("N3"),

  @XmlEnumValue("N4")
  N_4("N4"),

  @XmlEnumValue("N5")
  N_5("N5"),

  @XmlEnumValue("N6")
  N_6("N6"),

  @XmlEnumValue("N7")
  N_7("N7"),

  @XmlEnumValue("N8")
  N_8("N8"),

  @XmlEnumValue("N9")
  N_9("N9"),

  @XmlEnumValue("R1")
  R_1("R1"),

  @XmlEnumValue("S1")
  S_1("S1"),

  @XmlEnumValue("S2")
  S_2("S2"),

  @XmlEnumValue("Z1")
  Z_1("Z1");
  private final String value;

  DrugCategoryCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static DrugCategoryCodeSimpleType fromValue(String v) {
    for (DrugCategoryCodeSimpleType c : DrugCategoryCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
