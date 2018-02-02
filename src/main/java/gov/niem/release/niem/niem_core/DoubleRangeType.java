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

import gov.niem.release.niem.proxy.xsd.Double;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleRangeType", propOrder = {
  "rangeMaximumDoubleValue",
  "rangeMinimumDoubleValue",
  "doubleRangeAugmentationPoint"
})
public class DoubleRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMaximumDoubleValue", nillable = true)
  protected List<Double> rangeMaximumDoubleValue;
  @XmlElement(name = "RangeMinimumDoubleValue", nillable = true)
  protected List<Double> rangeMinimumDoubleValue;
  @XmlElement(name = "DoubleRangeAugmentationPoint")
  protected List<Object> doubleRangeAugmentationPoint;

  public List<Double> getRangeMaximumDoubleValue() {
    if (rangeMaximumDoubleValue == null) {
      rangeMaximumDoubleValue = new ArrayList<Double>();
    }
    return this.rangeMaximumDoubleValue;
  }

  public List<Double> getRangeMinimumDoubleValue() {
    if (rangeMinimumDoubleValue == null) {
      rangeMinimumDoubleValue = new ArrayList<Double>();
    }
    return this.rangeMinimumDoubleValue;
  }

  public List<Object> getDoubleRangeAugmentationPoint() {
    if (doubleRangeAugmentationPoint == null) {
      doubleRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.doubleRangeAugmentationPoint;
  }

}
