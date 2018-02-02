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

import gov.niem.release.niem.proxy.xsd.Time;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeRangeType", propOrder = {
  "beginTime",
  "endTime",
  "timeRangeAugmentationPoint"
})
public class TimeRangeType
  extends ObjectType {

  @XmlElement(name = "BeginTime", nillable = true)
  protected List<Time> beginTime;
  @XmlElement(name = "EndTime", nillable = true)
  protected List<Time> endTime;
  @XmlElement(name = "TimeRangeAugmentationPoint")
  protected List<Object> timeRangeAugmentationPoint;

  public List<Time> getBeginTime() {
    if (beginTime == null) {
      beginTime = new ArrayList<Time>();
    }
    return this.beginTime;
  }

  public List<Time> getEndTime() {
    if (endTime == null) {
      endTime = new ArrayList<Time>();
    }
    return this.endTime;
  }

  public List<Object> getTimeRangeAugmentationPoint() {
    if (timeRangeAugmentationPoint == null) {
      timeRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.timeRangeAugmentationPoint;
  }

}
