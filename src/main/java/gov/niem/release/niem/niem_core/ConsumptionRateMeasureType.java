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
@XmlType(name = "ConsumptionRateMeasureType", propOrder = {
  "consumptionRateUnitAbstract",
  "consumptionRateMeasureAugmentationPoint"
})
public class ConsumptionRateMeasureType
  extends MeasureType {

  @XmlElement(name = "ConsumptionRateUnitAbstract")
  protected List<Object> consumptionRateUnitAbstract;
  @XmlElement(name = "ConsumptionRateMeasureAugmentationPoint")
  protected List<Object> consumptionRateMeasureAugmentationPoint;

  public List<Object> getConsumptionRateUnitAbstract() {
    if (consumptionRateUnitAbstract == null) {
      consumptionRateUnitAbstract = new ArrayList<Object>();
    }
    return this.consumptionRateUnitAbstract;
  }

  public List<Object> getConsumptionRateMeasureAugmentationPoint() {
    if (consumptionRateMeasureAugmentationPoint == null) {
      consumptionRateMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.consumptionRateMeasureAugmentationPoint;
  }

}
