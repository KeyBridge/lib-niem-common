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

import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecimalRangeType", propOrder = {
  "rangeMinimumDecimalValue",
  "rangeMaximumDecimalValue",
  "decimalRangeAugmentationPoint"
})
public class DecimalRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMinimumDecimalValue", nillable = true)
  protected List<Decimal> rangeMinimumDecimalValue;
  @XmlElement(name = "RangeMaximumDecimalValue", nillable = true)
  protected List<Decimal> rangeMaximumDecimalValue;
  @XmlElement(name = "DecimalRangeAugmentationPoint")
  protected List<Object> decimalRangeAugmentationPoint;

  public List<Decimal> getRangeMinimumDecimalValue() {
    if (rangeMinimumDecimalValue == null) {
      rangeMinimumDecimalValue = new ArrayList<Decimal>();
    }
    return this.rangeMinimumDecimalValue;
  }

  public List<Decimal> getRangeMaximumDecimalValue() {
    if (rangeMaximumDecimalValue == null) {
      rangeMaximumDecimalValue = new ArrayList<Decimal>();
    }
    return this.rangeMaximumDecimalValue;
  }

  public List<Object> getDecimalRangeAugmentationPoint() {
    if (decimalRangeAugmentationPoint == null) {
      decimalRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.decimalRangeAugmentationPoint;
  }

}
