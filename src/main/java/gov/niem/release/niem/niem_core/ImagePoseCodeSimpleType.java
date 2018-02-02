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

@XmlType(name = "ImagePoseCodeSimpleType")
@XmlEnum
public enum ImagePoseCodeSimpleType {

  @XmlEnumValue("Frontal")
  FRONTAL("Frontal"),

  @XmlEnumValue("Oblique")
  OBLIQUE("Oblique"),

  @XmlEnumValue("Side")
  SIDE("Side");
  private final String value;

  ImagePoseCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ImagePoseCodeSimpleType fromValue(String v) {
    for (ImagePoseCodeSimpleType c : ImagePoseCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
