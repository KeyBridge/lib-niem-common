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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationType", propOrder = {
  "rest"
})
@XmlSeeAlso({
  PersonConveyanceAssociationType.class,
  ActivityConveyanceAssociationType.class,
  OrganizationUnitAssociationType.class,
  ItemLocationAssociationType.class,
  TelecommunicationDeviceSIMCardAssociationType.class,
  ActivityOrganizationAssociationType.class,
  ActivityScheduleAssociationType.class,
  PersonEmploymentAssociationType.class,
  LocationContactInformationAssociationType.class,
  PersonWorkerAssociationType.class,
  ActivityPersonAssociationType.class,
  OrganizationFacilityAssociationType.class,
  PersonDocumentAssociationType.class,
  TransportationAssociationType.class,
  OrganizationLocationAssociationType.class,
  ActivityDocumentAssociationType.class,
  ItemEntityAssociationType.class,
  ActivitySiteAssociationType.class,
  PersonIdentityAssociationType.class,
  FacilityPersonAssociationType.class,
  FacilityDocumentAssociationType.class,
  FacilityImageAssociationType.class,
  FacilityAssociationType.class,
  PersonOrganizationAssociationType.class,
  DocumentAssociationType.class,
  PersonLocationAssociationType.class,
  ActivityFacilityAssociationType.class,
  ItemContainerAssociationType.class,
  PersonAssociationType.class,
  RelatedActivityAssociationType.class,
  FacilitySiteAssociationType.class,
  FacilitySubFacilityAssociationType.class,
  OrganizationAssociationType.class,
  ActivityItemAssociationType.class,
  ItemInsuranceAssociationType.class,
  DeviceInformationAssociationType.class
})
public class AssociationType
  extends gov.niem.release.niem.structures.AssociationType {

  @XmlElementRefs({
    @XmlElementRef(name = "AssociationAugmentationPoint", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
    ,
        @XmlElementRef(name = "AssociationDateRange", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
    ,
        @XmlElementRef(name = "AssociationDescriptionText", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> rest;

  public List<JAXBElement<?>> getRest() {
    if (rest == null) {
      rest = new ArrayList<JAXBElement<?>>();
    }
    return this.rest;
  }

}
