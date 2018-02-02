package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
  "organizationAbbreviationText",
  "organizationLEIIdentification",
  "organizationActivityText",
  "organizationBranchName",
  "organizationCategoryAbstract",
  "organizationDayContactInformation",
  "organizationDescriptionText",
  "organizationDoingBusinessAsName",
  "organizationEmergencyContactInformation",
  "organizationEstablishedDate",
  "organizationEveningContactInformation",
  "organizationForeignAffiliate",
  "organizationIdentification",
  "organizationIncorporatedIndicator",
  "organizationIncorporationDate",
  "organizationIncorporationLocation",
  "organizationLocalIdentification",
  "organizationLocation",
  "organizationName",
  "organizationNightContactInformation",
  "organizationOtherIdentification",
  "organizationParentAbstract",
  "organizationPrimaryContactInformation",
  "organizationPrincipalOfficial",
  "organizationStatus",
  "organizationSubUnit",
  "organizationSubUnitName",
  "organizationTaxIdentification",
  "organizationTerminationDate",
  "organizationUnitName",
  "organizationAugmentationPoint"
})
public class OrganizationType
  extends ObjectType {

  @XmlElement(name = "OrganizationAbbreviationText", nillable = true)
  protected List<TextType> organizationAbbreviationText;
  @XmlElement(name = "OrganizationLEIIdentification", nillable = true)
  protected List<IdentificationType> organizationLEIIdentification;
  @XmlElement(name = "OrganizationActivityText", nillable = true)
  protected List<TextType> organizationActivityText;
  @XmlElement(name = "OrganizationBranchName", nillable = true)
  protected List<TextType> organizationBranchName;
  @XmlElementRef(name = "OrganizationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> organizationCategoryAbstract;
  @XmlElement(name = "OrganizationDayContactInformation", nillable = true)
  protected List<ContactInformationType> organizationDayContactInformation;
  @XmlElement(name = "OrganizationDescriptionText", nillable = true)
  protected List<TextType> organizationDescriptionText;
  @XmlElement(name = "OrganizationDoingBusinessAsName", nillable = true)
  protected List<TextType> organizationDoingBusinessAsName;
  @XmlElement(name = "OrganizationEmergencyContactInformation", nillable = true)
  protected List<ContactInformationType> organizationEmergencyContactInformation;
  @XmlElement(name = "OrganizationEstablishedDate", nillable = true)
  protected List<DateType> organizationEstablishedDate;
  @XmlElement(name = "OrganizationEveningContactInformation", nillable = true)
  protected List<ContactInformationType> organizationEveningContactInformation;
  @XmlElement(name = "OrganizationForeignAffiliate", nillable = true)
  protected List<OrganizationType> organizationForeignAffiliate;
  @XmlElement(name = "OrganizationIdentification", nillable = true)
  protected List<IdentificationType> organizationIdentification;
  @XmlElement(name = "OrganizationIncorporatedIndicator", nillable = true)
  protected List<Boolean> organizationIncorporatedIndicator;
  @XmlElement(name = "OrganizationIncorporationDate", nillable = true)
  protected List<DateType> organizationIncorporationDate;
  @XmlElement(name = "OrganizationIncorporationLocation", nillable = true)
  protected List<LocationType> organizationIncorporationLocation;
  @XmlElement(name = "OrganizationLocalIdentification", nillable = true)
  protected List<IdentificationType> organizationLocalIdentification;
  @XmlElement(name = "OrganizationLocation", nillable = true)
  protected List<LocationType> organizationLocation;
  @XmlElement(name = "OrganizationName", nillable = true)
  protected List<TextType> organizationName;
  @XmlElement(name = "OrganizationNightContactInformation", nillable = true)
  protected List<ContactInformationType> organizationNightContactInformation;
  @XmlElement(name = "OrganizationOtherIdentification", nillable = true)
  protected List<IdentificationType> organizationOtherIdentification;
  @XmlElementRef(name = "OrganizationParentAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> organizationParentAbstract;
  @XmlElement(name = "OrganizationPrimaryContactInformation", nillable = true)
  protected List<ContactInformationType> organizationPrimaryContactInformation;
  @XmlElement(name = "OrganizationPrincipalOfficial", nillable = true)
  protected List<PersonType> organizationPrincipalOfficial;
  @XmlElement(name = "OrganizationStatus", nillable = true)
  protected List<StatusType> organizationStatus;
  @XmlElement(name = "OrganizationSubUnit", nillable = true)
  protected List<OrganizationType> organizationSubUnit;
  @XmlElement(name = "OrganizationSubUnitName", nillable = true)
  protected List<TextType> organizationSubUnitName;
  @XmlElement(name = "OrganizationTaxIdentification", nillable = true)
  protected List<IdentificationType> organizationTaxIdentification;
  @XmlElement(name = "OrganizationTerminationDate", nillable = true)
  protected List<DateType> organizationTerminationDate;
  @XmlElement(name = "OrganizationUnitName", nillable = true)
  protected List<TextType> organizationUnitName;
  @XmlElement(name = "OrganizationAugmentationPoint")
  protected List<Object> organizationAugmentationPoint;

  public List<TextType> getOrganizationAbbreviationText() {
    if (organizationAbbreviationText == null) {
      organizationAbbreviationText = new ArrayList<TextType>();
    }
    return this.organizationAbbreviationText;
  }

  public List<IdentificationType> getOrganizationLEIIdentification() {
    if (organizationLEIIdentification == null) {
      organizationLEIIdentification = new ArrayList<IdentificationType>();
    }
    return this.organizationLEIIdentification;
  }

  public List<TextType> getOrganizationActivityText() {
    if (organizationActivityText == null) {
      organizationActivityText = new ArrayList<TextType>();
    }
    return this.organizationActivityText;
  }

  public List<TextType> getOrganizationBranchName() {
    if (organizationBranchName == null) {
      organizationBranchName = new ArrayList<TextType>();
    }
    return this.organizationBranchName;
  }

  public List<JAXBElement<?>> getOrganizationCategoryAbstract() {
    if (organizationCategoryAbstract == null) {
      organizationCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.organizationCategoryAbstract;
  }

  public List<ContactInformationType> getOrganizationDayContactInformation() {
    if (organizationDayContactInformation == null) {
      organizationDayContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.organizationDayContactInformation;
  }

  public List<TextType> getOrganizationDescriptionText() {
    if (organizationDescriptionText == null) {
      organizationDescriptionText = new ArrayList<TextType>();
    }
    return this.organizationDescriptionText;
  }

  public List<TextType> getOrganizationDoingBusinessAsName() {
    if (organizationDoingBusinessAsName == null) {
      organizationDoingBusinessAsName = new ArrayList<TextType>();
    }
    return this.organizationDoingBusinessAsName;
  }

  public List<ContactInformationType> getOrganizationEmergencyContactInformation() {
    if (organizationEmergencyContactInformation == null) {
      organizationEmergencyContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.organizationEmergencyContactInformation;
  }

  public List<DateType> getOrganizationEstablishedDate() {
    if (organizationEstablishedDate == null) {
      organizationEstablishedDate = new ArrayList<DateType>();
    }
    return this.organizationEstablishedDate;
  }

  public List<ContactInformationType> getOrganizationEveningContactInformation() {
    if (organizationEveningContactInformation == null) {
      organizationEveningContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.organizationEveningContactInformation;
  }

  public List<OrganizationType> getOrganizationForeignAffiliate() {
    if (organizationForeignAffiliate == null) {
      organizationForeignAffiliate = new ArrayList<OrganizationType>();
    }
    return this.organizationForeignAffiliate;
  }

  public List<IdentificationType> getOrganizationIdentification() {
    if (organizationIdentification == null) {
      organizationIdentification = new ArrayList<IdentificationType>();
    }
    return this.organizationIdentification;
  }

  public List<Boolean> getOrganizationIncorporatedIndicator() {
    if (organizationIncorporatedIndicator == null) {
      organizationIncorporatedIndicator = new ArrayList<Boolean>();
    }
    return this.organizationIncorporatedIndicator;
  }

  public List<DateType> getOrganizationIncorporationDate() {
    if (organizationIncorporationDate == null) {
      organizationIncorporationDate = new ArrayList<DateType>();
    }
    return this.organizationIncorporationDate;
  }

  public List<LocationType> getOrganizationIncorporationLocation() {
    if (organizationIncorporationLocation == null) {
      organizationIncorporationLocation = new ArrayList<LocationType>();
    }
    return this.organizationIncorporationLocation;
  }

  public List<IdentificationType> getOrganizationLocalIdentification() {
    if (organizationLocalIdentification == null) {
      organizationLocalIdentification = new ArrayList<IdentificationType>();
    }
    return this.organizationLocalIdentification;
  }

  public List<LocationType> getOrganizationLocation() {
    if (organizationLocation == null) {
      organizationLocation = new ArrayList<LocationType>();
    }
    return this.organizationLocation;
  }

  public List<TextType> getOrganizationName() {
    if (organizationName == null) {
      organizationName = new ArrayList<TextType>();
    }
    return this.organizationName;
  }

  public List<ContactInformationType> getOrganizationNightContactInformation() {
    if (organizationNightContactInformation == null) {
      organizationNightContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.organizationNightContactInformation;
  }

  public List<IdentificationType> getOrganizationOtherIdentification() {
    if (organizationOtherIdentification == null) {
      organizationOtherIdentification = new ArrayList<IdentificationType>();
    }
    return this.organizationOtherIdentification;
  }

  public List<JAXBElement<?>> getOrganizationParentAbstract() {
    if (organizationParentAbstract == null) {
      organizationParentAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.organizationParentAbstract;
  }

  public List<ContactInformationType> getOrganizationPrimaryContactInformation() {
    if (organizationPrimaryContactInformation == null) {
      organizationPrimaryContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.organizationPrimaryContactInformation;
  }

  public List<PersonType> getOrganizationPrincipalOfficial() {
    if (organizationPrincipalOfficial == null) {
      organizationPrincipalOfficial = new ArrayList<PersonType>();
    }
    return this.organizationPrincipalOfficial;
  }

  public List<StatusType> getOrganizationStatus() {
    if (organizationStatus == null) {
      organizationStatus = new ArrayList<StatusType>();
    }
    return this.organizationStatus;
  }

  public List<OrganizationType> getOrganizationSubUnit() {
    if (organizationSubUnit == null) {
      organizationSubUnit = new ArrayList<OrganizationType>();
    }
    return this.organizationSubUnit;
  }

  public List<TextType> getOrganizationSubUnitName() {
    if (organizationSubUnitName == null) {
      organizationSubUnitName = new ArrayList<TextType>();
    }
    return this.organizationSubUnitName;
  }

  public List<IdentificationType> getOrganizationTaxIdentification() {
    if (organizationTaxIdentification == null) {
      organizationTaxIdentification = new ArrayList<IdentificationType>();
    }
    return this.organizationTaxIdentification;
  }

  public List<DateType> getOrganizationTerminationDate() {
    if (organizationTerminationDate == null) {
      organizationTerminationDate = new ArrayList<DateType>();
    }
    return this.organizationTerminationDate;
  }

  public List<TextType> getOrganizationUnitName() {
    if (organizationUnitName == null) {
      organizationUnitName = new ArrayList<TextType>();
    }
    return this.organizationUnitName;
  }

  public List<Object> getOrganizationAugmentationPoint() {
    if (organizationAugmentationPoint == null) {
      organizationAugmentationPoint = new ArrayList<Object>();
    }
    return this.organizationAugmentationPoint;
  }

}
