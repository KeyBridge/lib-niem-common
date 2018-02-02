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
@XmlType(name = "AngularRateMeasureType", propOrder = {
  "angularRateUnitAbstract",
  "angularRateMeasureAugmentationPoint"
})
public class AngularRateMeasureType
  extends MeasureType {

  @XmlElement(name = "AngularRateUnitAbstract")
  protected List<Object> angularRateUnitAbstract;
  @XmlElement(name = "AngularRateMeasureAugmentationPoint")
  protected List<Object> angularRateMeasureAugmentationPoint;

  public List<Object> getAngularRateUnitAbstract() {
    if (angularRateUnitAbstract == null) {
      angularRateUnitAbstract = new ArrayList<Object>();
    }
    return this.angularRateUnitAbstract;
  }

  public List<Object> getAngularRateMeasureAugmentationPoint() {
    if (angularRateMeasureAugmentationPoint == null) {
      angularRateMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.angularRateMeasureAugmentationPoint;
  }

}
