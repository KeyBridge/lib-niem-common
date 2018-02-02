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

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientationType", propOrder = {
  "azimuthValue",
  "inclinationValue",
  "rollValue",
  "orientationAugmentationPoint"
})
public class OrientationType
  extends ObjectType {

  @XmlElement(name = "AzimuthValue", nillable = true)
  protected List<Degree360Type> azimuthValue;
  @XmlElement(name = "InclinationValue", nillable = true)
  protected List<Degree90PlusMinusType> inclinationValue;
  @XmlElement(name = "RollValue", nillable = true)
  protected List<Degree180PlusMinusType> rollValue;
  @XmlElement(name = "OrientationAugmentationPoint")
  protected List<Object> orientationAugmentationPoint;

  public List<Degree360Type> getAzimuthValue() {
    if (azimuthValue == null) {
      azimuthValue = new ArrayList<Degree360Type>();
    }
    return this.azimuthValue;
  }

  public List<Degree90PlusMinusType> getInclinationValue() {
    if (inclinationValue == null) {
      inclinationValue = new ArrayList<Degree90PlusMinusType>();
    }
    return this.inclinationValue;
  }

  public List<Degree180PlusMinusType> getRollValue() {
    if (rollValue == null) {
      rollValue = new ArrayList<Degree180PlusMinusType>();
    }
    return this.rollValue;
  }

  public List<Object> getOrientationAugmentationPoint() {
    if (orientationAugmentationPoint == null) {
      orientationAugmentationPoint = new ArrayList<Object>();
    }
    return this.orientationAugmentationPoint;
  }

}
