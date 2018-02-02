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
@XmlType(name = "LongitudeCoordinateType", propOrder = {
  "longitudeDegreeValue",
  "longitudeMinuteValue",
  "longitudeSecondValue",
  "longitudeCoordinateAugmentationPoint"
})
public class LongitudeCoordinateType
  extends ObjectType {

  @XmlElement(name = "LongitudeDegreeValue", nillable = true)
  protected List<LongitudeDegreeType> longitudeDegreeValue;
  @XmlElement(name = "LongitudeMinuteValue", nillable = true)
  protected List<AngularMinuteType> longitudeMinuteValue;
  @XmlElement(name = "LongitudeSecondValue", nillable = true)
  protected List<AngularSecondType> longitudeSecondValue;
  @XmlElement(name = "LongitudeCoordinateAugmentationPoint")
  protected List<Object> longitudeCoordinateAugmentationPoint;

  public List<LongitudeDegreeType> getLongitudeDegreeValue() {
    if (longitudeDegreeValue == null) {
      longitudeDegreeValue = new ArrayList<LongitudeDegreeType>();
    }
    return this.longitudeDegreeValue;
  }

  public List<AngularMinuteType> getLongitudeMinuteValue() {
    if (longitudeMinuteValue == null) {
      longitudeMinuteValue = new ArrayList<AngularMinuteType>();
    }
    return this.longitudeMinuteValue;
  }

  public List<AngularSecondType> getLongitudeSecondValue() {
    if (longitudeSecondValue == null) {
      longitudeSecondValue = new ArrayList<AngularSecondType>();
    }
    return this.longitudeSecondValue;
  }

  public List<Object> getLongitudeCoordinateAugmentationPoint() {
    if (longitudeCoordinateAugmentationPoint == null) {
      longitudeCoordinateAugmentationPoint = new ArrayList<Object>();
    }
    return this.longitudeCoordinateAugmentationPoint;
  }

}
