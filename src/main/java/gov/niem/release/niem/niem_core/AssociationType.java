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
