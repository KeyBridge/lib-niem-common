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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightMeasureType", propOrder = {
  "weightUnitAbstract",
  "weightMeasureAugmentationPoint"
})
public class WeightMeasureType
  extends MeasureType {

  @XmlElementRef(name = "WeightUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> weightUnitAbstract;
  @XmlElement(name = "WeightMeasureAugmentationPoint")
  protected List<Object> weightMeasureAugmentationPoint;

  public List<JAXBElement<?>> getWeightUnitAbstract() {
    if (weightUnitAbstract == null) {
      weightUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.weightUnitAbstract;
  }

  public List<Object> getWeightMeasureAugmentationPoint() {
    if (weightMeasureAugmentationPoint == null) {
      weightMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.weightMeasureAugmentationPoint;
  }

}
