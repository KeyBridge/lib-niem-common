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
@XmlType(name = "SubstanceMeasureType", propOrder = {
  "substanceUnitAbstract",
  "substanceMeasureAugmentationPoint"
})
public class SubstanceMeasureType
  extends MeasureType {

  @XmlElement(name = "SubstanceUnitAbstract")
  protected List<Object> substanceUnitAbstract;
  @XmlElement(name = "SubstanceMeasureAugmentationPoint")
  protected List<Object> substanceMeasureAugmentationPoint;

  public List<Object> getSubstanceUnitAbstract() {
    if (substanceUnitAbstract == null) {
      substanceUnitAbstract = new ArrayList<Object>();
    }
    return this.substanceUnitAbstract;
  }

  public List<Object> getSubstanceMeasureAugmentationPoint() {
    if (substanceMeasureAugmentationPoint == null) {
      substanceMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.substanceMeasureAugmentationPoint;
  }

}
