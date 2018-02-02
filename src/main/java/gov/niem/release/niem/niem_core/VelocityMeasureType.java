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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VelocityMeasureType", propOrder = {
  "bearing",
  "velocityMeasureAugmentationPoint"
})
public class VelocityMeasureType
  extends SpeedMeasureType {

  @XmlElement(name = "Bearing", nillable = true)
  protected List<BearingType> bearing;
  @XmlElement(name = "VelocityMeasureAugmentationPoint")
  protected List<Object> velocityMeasureAugmentationPoint;

  public List<BearingType> getBearing() {
    if (bearing == null) {
      bearing = new ArrayList<BearingType>();
    }
    return this.bearing;
  }

  public List<Object> getVelocityMeasureAugmentationPoint() {
    if (velocityMeasureAugmentationPoint == null) {
      velocityMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.velocityMeasureAugmentationPoint;
  }

}
