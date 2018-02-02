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
@XmlType(name = "DateRangeType", propOrder = {
  "startDate",
  "endDate",
  "dateRangeAugmentationPoint"
})
public class DateRangeType
  extends ObjectType {

  @XmlElement(name = "StartDate", nillable = true)
  protected List<DateType> startDate;
  @XmlElement(name = "EndDate", nillable = true)
  protected List<DateType> endDate;
  @XmlElement(name = "DateRangeAugmentationPoint")
  protected List<Object> dateRangeAugmentationPoint;

  public List<DateType> getStartDate() {
    if (startDate == null) {
      startDate = new ArrayList<DateType>();
    }
    return this.startDate;
  }

  public List<DateType> getEndDate() {
    if (endDate == null) {
      endDate = new ArrayList<DateType>();
    }
    return this.endDate;
  }

  public List<Object> getDateRangeAugmentationPoint() {
    if (dateRangeAugmentationPoint == null) {
      dateRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.dateRangeAugmentationPoint;
  }

}
