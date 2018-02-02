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

import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngularMeasureType", propOrder = {
  "angularDegreeValue",
  "angularMinuteValue",
  "angularSecondValue",
  "angularMeasureAugmentationPoint"
})
public class AngularMeasureType
  extends ObjectType {

  @XmlElement(name = "AngularDegreeValue", nillable = true)
  protected List<Decimal> angularDegreeValue;
  @XmlElement(name = "AngularMinuteValue", nillable = true)
  protected List<AngularMinuteType> angularMinuteValue;
  @XmlElement(name = "AngularSecondValue", nillable = true)
  protected List<AngularSecondType> angularSecondValue;
  @XmlElement(name = "AngularMeasureAugmentationPoint")
  protected List<Object> angularMeasureAugmentationPoint;

  public List<Decimal> getAngularDegreeValue() {
    if (angularDegreeValue == null) {
      angularDegreeValue = new ArrayList<Decimal>();
    }
    return this.angularDegreeValue;
  }

  public List<AngularMinuteType> getAngularMinuteValue() {
    if (angularMinuteValue == null) {
      angularMinuteValue = new ArrayList<AngularMinuteType>();
    }
    return this.angularMinuteValue;
  }

  public List<AngularSecondType> getAngularSecondValue() {
    if (angularSecondValue == null) {
      angularSecondValue = new ArrayList<AngularSecondType>();
    }
    return this.angularSecondValue;
  }

  public List<Object> getAngularMeasureAugmentationPoint() {
    if (angularMeasureAugmentationPoint == null) {
      angularMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.angularMeasureAugmentationPoint;
  }

}
