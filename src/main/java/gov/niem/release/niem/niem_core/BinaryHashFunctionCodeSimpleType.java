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

@XmlType(name = "BinaryHashFunctionCodeSimpleType")
@XmlEnum
public enum BinaryHashFunctionCodeSimpleType {

  @XmlEnumValue("MD2")
  MD_2("MD2"),

  @XmlEnumValue("MD4")
  MD_4("MD4"),

  @XmlEnumValue("MD5")
  MD_5("MD5"),

  @XmlEnumValue("SHA-1")
  SHA_1("SHA-1"),

  @XmlEnumValue("SHA-224")
  SHA_224("SHA-224"),

  @XmlEnumValue("SHA-256")
  SHA_256("SHA-256"),

  @XmlEnumValue("SHA-384")
  SHA_384("SHA-384"),

  @XmlEnumValue("SHA-512")
  SHA_512("SHA-512");
  private final String value;

  BinaryHashFunctionCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static BinaryHashFunctionCodeSimpleType fromValue(String v) {
    for (BinaryHashFunctionCodeSimpleType c : BinaryHashFunctionCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
