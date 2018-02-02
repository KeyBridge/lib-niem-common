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
@XmlType(name = "MissionType", propOrder = {
  "missionName",
  "missionCommencementNoEarlierThanDate",
  "missionCommencementNoLaterThanDate",
  "contactInformation",
  "missionID",
  "missionAugmentationPoint"
})
public class MissionType
  extends ObjectType {

  @XmlElement(name = "MissionName", nillable = true)
  protected List<String> missionName;
  @XmlElement(name = "MissionCommencementNoEarlierThanDate", nillable = true)
  protected List<DateType> missionCommencementNoEarlierThanDate;
  @XmlElement(name = "MissionCommencementNoLaterThanDate", nillable = true)
  protected List<DateType> missionCommencementNoLaterThanDate;
  @XmlElement(name = "ContactInformation", nillable = true)
  protected List<ContactInformationType> contactInformation;
  @XmlElement(name = "MissionID", nillable = true)
  protected List<String> missionID;
  @XmlElement(name = "MissionAugmentationPoint")
  protected List<Object> missionAugmentationPoint;

  public List<String> getMissionName() {
    if (missionName == null) {
      missionName = new ArrayList<String>();
    }
    return this.missionName;
  }

  public List<DateType> getMissionCommencementNoEarlierThanDate() {
    if (missionCommencementNoEarlierThanDate == null) {
      missionCommencementNoEarlierThanDate = new ArrayList<DateType>();
    }
    return this.missionCommencementNoEarlierThanDate;
  }

  public List<DateType> getMissionCommencementNoLaterThanDate() {
    if (missionCommencementNoLaterThanDate == null) {
      missionCommencementNoLaterThanDate = new ArrayList<DateType>();
    }
    return this.missionCommencementNoLaterThanDate;
  }

  public List<ContactInformationType> getContactInformation() {
    if (contactInformation == null) {
      contactInformation = new ArrayList<ContactInformationType>();
    }
    return this.contactInformation;
  }

  public List<String> getMissionID() {
    if (missionID == null) {
      missionID = new ArrayList<String>();
    }
    return this.missionID;
  }

  public List<Object> getMissionAugmentationPoint() {
    if (missionAugmentationPoint == null) {
      missionAugmentationPoint = new ArrayList<Object>();
    }
    return this.missionAugmentationPoint;
  }

}
