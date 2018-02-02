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
package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentMethodCodeSimpleType")
@XmlEnum
public enum PaymentMethodCodeSimpleType {

  @XmlEnumValue("Cash")
  CASH("Cash"),

  @XmlEnumValue("Check")
  CHECK("Check"),

  @XmlEnumValue("Dividends")
  DIVIDENDS("Dividends"),

  @XmlEnumValue("Gross Proceeds/Redemptions")
  GROSS_PROCEEDS_REDEMPTIONS("Gross Proceeds/Redemptions"),

  @XmlEnumValue("Interest")
  INTEREST("Interest"),

  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  PaymentMethodCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PaymentMethodCodeSimpleType fromValue(String v) {
    for (PaymentMethodCodeSimpleType c : PaymentMethodCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
