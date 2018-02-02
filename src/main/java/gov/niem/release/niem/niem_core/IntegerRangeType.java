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

import gov.niem.release.niem.proxy.xsd.Integer;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerRangeType", propOrder = {
  "rangeMaximumIntegerValue",
  "rangeMinimumIntegerValue",
  "integerRangeAugmentationPoint"
})
public class IntegerRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMaximumIntegerValue", nillable = true)
  protected List<Integer> rangeMaximumIntegerValue;
  @XmlElement(name = "RangeMinimumIntegerValue", nillable = true)
  protected List<Integer> rangeMinimumIntegerValue;
  @XmlElement(name = "IntegerRangeAugmentationPoint")
  protected List<Object> integerRangeAugmentationPoint;

  public List<Integer> getRangeMaximumIntegerValue() {
    if (rangeMaximumIntegerValue == null) {
      rangeMaximumIntegerValue = new ArrayList<Integer>();
    }
    return this.rangeMaximumIntegerValue;
  }

  public List<Integer> getRangeMinimumIntegerValue() {
    if (rangeMinimumIntegerValue == null) {
      rangeMinimumIntegerValue = new ArrayList<Integer>();
    }
    return this.rangeMinimumIntegerValue;
  }

  public List<Object> getIntegerRangeAugmentationPoint() {
    if (integerRangeAugmentationPoint == null) {
      integerRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.integerRangeAugmentationPoint;
  }

}
