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

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskType", propOrder = {
  "taskCriteriaForSuccessText",
  "taskCurrentStatus",
  "taskDescriptionText",
  "taskEndDate",
  "taskID",
  "taskName",
  "taskStartDate",
  "taskAugmentationPoint"
})
public class TaskType
  extends ObjectType {

  @XmlElement(name = "TaskCriteriaForSuccessText", nillable = true)
  protected List<TextType> taskCriteriaForSuccessText;
  @XmlElement(name = "TaskCurrentStatus", nillable = true)
  protected List<StatusType> taskCurrentStatus;
  @XmlElement(name = "TaskDescriptionText", nillable = true)
  protected List<String> taskDescriptionText;
  @XmlElement(name = "TaskEndDate", nillable = true)
  protected List<DateType> taskEndDate;
  @XmlElement(name = "TaskID", nillable = true)
  protected List<String> taskID;
  @XmlElement(name = "TaskName", nillable = true)
  protected List<String> taskName;
  @XmlElement(name = "TaskStartDate", nillable = true)
  protected List<DateType> taskStartDate;
  @XmlElement(name = "TaskAugmentationPoint")
  protected List<Object> taskAugmentationPoint;

  public List<TextType> getTaskCriteriaForSuccessText() {
    if (taskCriteriaForSuccessText == null) {
      taskCriteriaForSuccessText = new ArrayList<TextType>();
    }
    return this.taskCriteriaForSuccessText;
  }

  public List<StatusType> getTaskCurrentStatus() {
    if (taskCurrentStatus == null) {
      taskCurrentStatus = new ArrayList<StatusType>();
    }
    return this.taskCurrentStatus;
  }

  public List<String> getTaskDescriptionText() {
    if (taskDescriptionText == null) {
      taskDescriptionText = new ArrayList<String>();
    }
    return this.taskDescriptionText;
  }

  public List<DateType> getTaskEndDate() {
    if (taskEndDate == null) {
      taskEndDate = new ArrayList<DateType>();
    }
    return this.taskEndDate;
  }

  public List<String> getTaskID() {
    if (taskID == null) {
      taskID = new ArrayList<String>();
    }
    return this.taskID;
  }

  public List<String> getTaskName() {
    if (taskName == null) {
      taskName = new ArrayList<String>();
    }
    return this.taskName;
  }

  public List<DateType> getTaskStartDate() {
    if (taskStartDate == null) {
      taskStartDate = new ArrayList<DateType>();
    }
    return this.taskStartDate;
  }

  public List<Object> getTaskAugmentationPoint() {
    if (taskAugmentationPoint == null) {
      taskAugmentationPoint = new ArrayList<Object>();
    }
    return this.taskAugmentationPoint;
  }

}
