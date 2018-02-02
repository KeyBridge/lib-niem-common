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
@XmlType(name = "CircularRegionType", propOrder = {
  "circularRegionCenterCoordinate",
  "circularRegionRadiusLengthMeasure",
  "circularRegionAugmentationPoint"
})
public class CircularRegionType
  extends ObjectType {

  @XmlElement(name = "CircularRegionCenterCoordinate", nillable = true)
  protected List<Location2DGeospatialCoordinateType> circularRegionCenterCoordinate;
  @XmlElement(name = "CircularRegionRadiusLengthMeasure", nillable = true)
  protected List<LengthMeasureType> circularRegionRadiusLengthMeasure;
  @XmlElement(name = "CircularRegionAugmentationPoint")
  protected List<Object> circularRegionAugmentationPoint;

  public List<Location2DGeospatialCoordinateType> getCircularRegionCenterCoordinate() {
    if (circularRegionCenterCoordinate == null) {
      circularRegionCenterCoordinate = new ArrayList<Location2DGeospatialCoordinateType>();
    }
    return this.circularRegionCenterCoordinate;
  }

  public List<LengthMeasureType> getCircularRegionRadiusLengthMeasure() {
    if (circularRegionRadiusLengthMeasure == null) {
      circularRegionRadiusLengthMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.circularRegionRadiusLengthMeasure;
  }

  public List<Object> getCircularRegionAugmentationPoint() {
    if (circularRegionAugmentationPoint == null) {
      circularRegionAugmentationPoint = new ArrayList<Object>();
    }
    return this.circularRegionAugmentationPoint;
  }

}
