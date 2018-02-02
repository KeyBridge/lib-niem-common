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
@XmlType(name = "IncidentType", propOrder = {
  "incidentLocation",
  "incidentEvent",
  "incidentJurisdictionalOrganization",
  "incidentObservationText",
  "incidentReportedNarrative",
  "incidentDayPeriodText",
  "incidentAugmentationPoint"
})
public class IncidentType
  extends ActivityType {

  @XmlElement(name = "IncidentLocation", nillable = true)
  protected List<LocationType> incidentLocation;
  @XmlElement(name = "IncidentEvent", nillable = true)
  protected List<ActivityType> incidentEvent;
  @XmlElement(name = "IncidentJurisdictionalOrganization", nillable = true)
  protected List<OrganizationType> incidentJurisdictionalOrganization;
  @XmlElement(name = "IncidentObservationText", nillable = true)
  protected List<TextType> incidentObservationText;
  @XmlElement(name = "IncidentReportedNarrative", nillable = true)
  protected List<DocumentType> incidentReportedNarrative;
  @XmlElement(name = "IncidentDayPeriodText", nillable = true)
  protected List<TextType> incidentDayPeriodText;
  @XmlElement(name = "IncidentAugmentationPoint")
  protected List<Object> incidentAugmentationPoint;

  public List<LocationType> getIncidentLocation() {
    if (incidentLocation == null) {
      incidentLocation = new ArrayList<LocationType>();
    }
    return this.incidentLocation;
  }

  public List<ActivityType> getIncidentEvent() {
    if (incidentEvent == null) {
      incidentEvent = new ArrayList<ActivityType>();
    }
    return this.incidentEvent;
  }

  public List<OrganizationType> getIncidentJurisdictionalOrganization() {
    if (incidentJurisdictionalOrganization == null) {
      incidentJurisdictionalOrganization = new ArrayList<OrganizationType>();
    }
    return this.incidentJurisdictionalOrganization;
  }

  public List<TextType> getIncidentObservationText() {
    if (incidentObservationText == null) {
      incidentObservationText = new ArrayList<TextType>();
    }
    return this.incidentObservationText;
  }

  public List<DocumentType> getIncidentReportedNarrative() {
    if (incidentReportedNarrative == null) {
      incidentReportedNarrative = new ArrayList<DocumentType>();
    }
    return this.incidentReportedNarrative;
  }

  public List<TextType> getIncidentDayPeriodText() {
    if (incidentDayPeriodText == null) {
      incidentDayPeriodText = new ArrayList<TextType>();
    }
    return this.incidentDayPeriodText;
  }

  public List<Object> getIncidentAugmentationPoint() {
    if (incidentAugmentationPoint == null) {
      incidentAugmentationPoint = new ArrayList<Object>();
    }
    return this.incidentAugmentationPoint;
  }

}
