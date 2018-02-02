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
@XmlType(name = "LatitudeCoordinateType", propOrder = {
  "latitudeDegreeValue",
  "latitudeMinuteValue",
  "latitudeSecondValue",
  "latitudeCoordinateAugmentationPoint"
})
public class LatitudeCoordinateType
  extends ObjectType {

  @XmlElement(name = "LatitudeDegreeValue", nillable = true)
  protected List<LatitudeDegreeType> latitudeDegreeValue;
  @XmlElement(name = "LatitudeMinuteValue", nillable = true)
  protected List<AngularMinuteType> latitudeMinuteValue;
  @XmlElement(name = "LatitudeSecondValue", nillable = true)
  protected List<AngularSecondType> latitudeSecondValue;
  @XmlElement(name = "LatitudeCoordinateAugmentationPoint")
  protected List<Object> latitudeCoordinateAugmentationPoint;

  public List<LatitudeDegreeType> getLatitudeDegreeValue() {
    if (latitudeDegreeValue == null) {
      latitudeDegreeValue = new ArrayList<LatitudeDegreeType>();
    }
    return this.latitudeDegreeValue;
  }

  public List<AngularMinuteType> getLatitudeMinuteValue() {
    if (latitudeMinuteValue == null) {
      latitudeMinuteValue = new ArrayList<AngularMinuteType>();
    }
    return this.latitudeMinuteValue;
  }

  public List<AngularSecondType> getLatitudeSecondValue() {
    if (latitudeSecondValue == null) {
      latitudeSecondValue = new ArrayList<AngularSecondType>();
    }
    return this.latitudeSecondValue;
  }

  public List<Object> getLatitudeCoordinateAugmentationPoint() {
    if (latitudeCoordinateAugmentationPoint == null) {
      latitudeCoordinateAugmentationPoint = new ArrayList<Object>();
    }
    return this.latitudeCoordinateAugmentationPoint;
  }

}
