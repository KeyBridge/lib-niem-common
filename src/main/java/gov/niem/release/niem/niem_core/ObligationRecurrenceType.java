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
@XmlType(name = "ObligationRecurrenceType", propOrder = {
  "obligationPeriodText",
  "obligationDateRange",
  "obligationRecurrenceAugmentationPoint"
})
public class ObligationRecurrenceType
  extends ObjectType {

  @XmlElement(name = "ObligationPeriodText", nillable = true)
  protected List<TextType> obligationPeriodText;
  @XmlElement(name = "ObligationDateRange", nillable = true)
  protected List<DateRangeType> obligationDateRange;
  @XmlElement(name = "ObligationRecurrenceAugmentationPoint")
  protected List<Object> obligationRecurrenceAugmentationPoint;

  public List<TextType> getObligationPeriodText() {
    if (obligationPeriodText == null) {
      obligationPeriodText = new ArrayList<TextType>();
    }
    return this.obligationPeriodText;
  }

  public List<DateRangeType> getObligationDateRange() {
    if (obligationDateRange == null) {
      obligationDateRange = new ArrayList<DateRangeType>();
    }
    return this.obligationDateRange;
  }

  public List<Object> getObligationRecurrenceAugmentationPoint() {
    if (obligationRecurrenceAugmentationPoint == null) {
      obligationRecurrenceAugmentationPoint = new ArrayList<Object>();
    }
    return this.obligationRecurrenceAugmentationPoint;
  }

}
