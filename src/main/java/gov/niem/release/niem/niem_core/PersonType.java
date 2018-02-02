package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
  "personAccentText",
  "personAgeDescriptionText",
  "personAgeMeasure",
  "personBirthDate",
  "personBirthLocation",
  "personBloodTypeAbstract",
  "personBodyXRaysAvailableAbstract",
  "personBuildAbstract",
  "personCapability",
  "personCircumcisionIndicator",
  "personCitizenshipAbstract",
  "personComplexionText",
  "personDeathDate",
  "personDependentQuantity",
  "personDescriptionText",
  "personDigitalImage",
  "personDigitizedSignatureImage",
  "personDisguiseDescriptionText",
  "personOrganDonorAbstract",
  "personEducationLevelText",
  "personEthnicityAbstract",
  "personEyeColorAbstract",
  "personEyewearAbstract",
  "personFacialHairAbstract",
  "personHairLengthAbstract",
  "personHairStyleAbstract",
  "personGeneralAppearanceDescriptionText",
  "personHairAppearanceText",
  "personHairCategoryText",
  "personHairColorAbstract",
  "personHandednessText",
  "personHeightDescriptionText",
  "personHeightMeasure",
  "personHumanResourceIdentification",
  "personInjury",
  "personJewelryDescriptionText",
  "personLanguageEnglishIndicator",
  "personLearningDisabilityText",
  "personLicenseIdentification",
  "personLivingIndicator",
  "personMedicalCondition",
  "personMedicalDescriptionText",
  "personMedicalFileIndicator",
  "personMedicationRequiredText",
  "personMentalStateText",
  "personMilitarySummary",
  "personMoodDescriptionText",
  "personName",
  "personNationalIdentification",
  "personOrganDonatorIndicator",
  "personOtherIdentification",
  "personPassportIdentification",
  "personPhysicalDisabilityText",
  "personPhysicalFeature",
  "personPrimaryLanguage",
  "personRaceAbstract",
  "personReligionAbstract",
  "personResidentAbstract",
  "personSecondaryLanguage",
  "personSecurityClearanceAbstract",
  "personSexAbstract",
  "personSexualOrientationText",
  "personSkinToneAbstract",
  "personSpeechDescriptionText",
  "personSSNIdentification",
  "personStateIdentification",
  "personTaxIdentification",
  "personUnionStatusAbstract",
  "personUSCitizenIndicator",
  "personVisionPrescriptionText",
  "personWeightDescriptionText",
  "personWeightMeasure",
  "personXRayImage",
  "personNationalityAbstract",
  "employmentContactInformation",
  "personEmergencyContactInformation",
  "personHomeContactInformation",
  "personAugmentationPoint"
})
public class PersonType
  extends ObjectType {

  @XmlElement(name = "PersonAccentText", nillable = true)
  protected List<TextType> personAccentText;
  @XmlElement(name = "PersonAgeDescriptionText", nillable = true)
  protected List<TextType> personAgeDescriptionText;
  @XmlElement(name = "PersonAgeMeasure", nillable = true)
  protected List<TimeMeasureType> personAgeMeasure;
  @XmlElement(name = "PersonBirthDate", nillable = true)
  protected List<DateType> personBirthDate;
  @XmlElement(name = "PersonBirthLocation", nillable = true)
  protected List<LocationType> personBirthLocation;
  @XmlElementRef(name = "PersonBloodTypeAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personBloodTypeAbstract;
  @XmlElementRef(name = "PersonBodyXRaysAvailableAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personBodyXRaysAvailableAbstract;
  @XmlElementRef(name = "PersonBuildAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personBuildAbstract;
  @XmlElement(name = "PersonCapability", nillable = true)
  protected List<CapabilityType> personCapability;
  @XmlElement(name = "PersonCircumcisionIndicator", nillable = true)
  protected List<Boolean> personCircumcisionIndicator;
  @XmlElementRef(name = "PersonCitizenshipAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personCitizenshipAbstract;
  @XmlElement(name = "PersonComplexionText", nillable = true)
  protected List<TextType> personComplexionText;
  @XmlElement(name = "PersonDeathDate", nillable = true)
  protected List<DateType> personDeathDate;
  @XmlElement(name = "PersonDependentQuantity", nillable = true)
  protected List<QuantityType> personDependentQuantity;
  @XmlElement(name = "PersonDescriptionText", nillable = true)
  protected List<TextType> personDescriptionText;
  @XmlElement(name = "PersonDigitalImage", nillable = true)
  protected List<ImageType> personDigitalImage;
  @XmlElement(name = "PersonDigitizedSignatureImage", nillable = true)
  protected List<ImageType> personDigitizedSignatureImage;
  @XmlElement(name = "PersonDisguiseDescriptionText", nillable = true)
  protected List<TextType> personDisguiseDescriptionText;
  @XmlElementRef(name = "PersonOrganDonorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personOrganDonorAbstract;
  @XmlElement(name = "PersonEducationLevelText", nillable = true)
  protected List<TextType> personEducationLevelText;
  @XmlElementRef(name = "PersonEthnicityAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personEthnicityAbstract;
  @XmlElementRef(name = "PersonEyeColorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personEyeColorAbstract;
  @XmlElementRef(name = "PersonEyewearAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personEyewearAbstract;
  @XmlElementRef(name = "PersonFacialHairAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personFacialHairAbstract;
  @XmlElementRef(name = "PersonHairLengthAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personHairLengthAbstract;
  @XmlElementRef(name = "PersonHairStyleAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personHairStyleAbstract;
  @XmlElement(name = "PersonGeneralAppearanceDescriptionText", nillable = true)
  protected List<TextType> personGeneralAppearanceDescriptionText;
  @XmlElement(name = "PersonHairAppearanceText", nillable = true)
  protected List<TextType> personHairAppearanceText;
  @XmlElement(name = "PersonHairCategoryText", nillable = true)
  protected List<TextType> personHairCategoryText;
  @XmlElementRef(name = "PersonHairColorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personHairColorAbstract;
  @XmlElement(name = "PersonHandednessText", nillable = true)
  protected List<TextType> personHandednessText;
  @XmlElement(name = "PersonHeightDescriptionText", nillable = true)
  protected List<TextType> personHeightDescriptionText;
  @XmlElement(name = "PersonHeightMeasure", nillable = true)
  protected List<LengthMeasureType> personHeightMeasure;
  @XmlElement(name = "PersonHumanResourceIdentification", nillable = true)
  protected List<IdentificationType> personHumanResourceIdentification;
  @XmlElement(name = "PersonInjury", nillable = true)
  protected List<InjuryType> personInjury;
  @XmlElement(name = "PersonJewelryDescriptionText", nillable = true)
  protected List<TextType> personJewelryDescriptionText;
  @XmlElement(name = "PersonLanguageEnglishIndicator", nillable = true)
  protected List<Boolean> personLanguageEnglishIndicator;
  @XmlElement(name = "PersonLearningDisabilityText", nillable = true)
  protected List<TextType> personLearningDisabilityText;
  @XmlElement(name = "PersonLicenseIdentification", nillable = true)
  protected List<IdentificationType> personLicenseIdentification;
  @XmlElement(name = "PersonLivingIndicator", nillable = true)
  protected List<Boolean> personLivingIndicator;
  @XmlElement(name = "PersonMedicalCondition", nillable = true)
  protected List<MedicalConditionType> personMedicalCondition;
  @XmlElement(name = "PersonMedicalDescriptionText", nillable = true)
  protected List<TextType> personMedicalDescriptionText;
  @XmlElement(name = "PersonMedicalFileIndicator", nillable = true)
  protected List<Boolean> personMedicalFileIndicator;
  @XmlElement(name = "PersonMedicationRequiredText", nillable = true)
  protected List<TextType> personMedicationRequiredText;
  @XmlElement(name = "PersonMentalStateText", nillable = true)
  protected List<TextType> personMentalStateText;
  @XmlElement(name = "PersonMilitarySummary", nillable = true)
  protected List<MilitarySummaryType> personMilitarySummary;
  @XmlElement(name = "PersonMoodDescriptionText", nillable = true)
  protected List<TextType> personMoodDescriptionText;
  @XmlElement(name = "PersonName", nillable = true)
  protected List<PersonNameType> personName;
  @XmlElement(name = "PersonNationalIdentification", nillable = true)
  protected List<IdentificationType> personNationalIdentification;
  @XmlElement(name = "PersonOrganDonatorIndicator", nillable = true)
  protected List<Boolean> personOrganDonatorIndicator;
  @XmlElement(name = "PersonOtherIdentification", nillable = true)
  protected List<IdentificationType> personOtherIdentification;
  @XmlElement(name = "PersonPassportIdentification", nillable = true)
  protected List<IdentificationType> personPassportIdentification;
  @XmlElement(name = "PersonPhysicalDisabilityText", nillable = true)
  protected List<TextType> personPhysicalDisabilityText;
  @XmlElement(name = "PersonPhysicalFeature", nillable = true)
  protected List<PhysicalFeatureType> personPhysicalFeature;
  @XmlElement(name = "PersonPrimaryLanguage", nillable = true)
  protected List<PersonLanguageType> personPrimaryLanguage;
  @XmlElementRef(name = "PersonRaceAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personRaceAbstract;
  @XmlElementRef(name = "PersonReligionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personReligionAbstract;
  @XmlElementRef(name = "PersonResidentAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personResidentAbstract;
  @XmlElement(name = "PersonSecondaryLanguage", nillable = true)
  protected List<PersonLanguageType> personSecondaryLanguage;
  @XmlElementRef(name = "PersonSecurityClearanceAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personSecurityClearanceAbstract;
  @XmlElementRef(name = "PersonSexAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personSexAbstract;
  @XmlElement(name = "PersonSexualOrientationText", nillable = true)
  protected List<TextType> personSexualOrientationText;
  @XmlElementRef(name = "PersonSkinToneAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personSkinToneAbstract;
  @XmlElement(name = "PersonSpeechDescriptionText", nillable = true)
  protected List<TextType> personSpeechDescriptionText;
  @XmlElement(name = "PersonSSNIdentification", nillable = true)
  protected List<IdentificationType> personSSNIdentification;
  @XmlElement(name = "PersonStateIdentification", nillable = true)
  protected List<IdentificationType> personStateIdentification;
  @XmlElement(name = "PersonTaxIdentification", nillable = true)
  protected List<IdentificationType> personTaxIdentification;
  @XmlElementRef(name = "PersonUnionStatusAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personUnionStatusAbstract;
  @XmlElement(name = "PersonUSCitizenIndicator", nillable = true)
  protected List<Boolean> personUSCitizenIndicator;
  @XmlElement(name = "PersonVisionPrescriptionText", nillable = true)
  protected List<TextType> personVisionPrescriptionText;
  @XmlElement(name = "PersonWeightDescriptionText", nillable = true)
  protected List<TextType> personWeightDescriptionText;
  @XmlElement(name = "PersonWeightMeasure", nillable = true)
  protected List<WeightMeasureType> personWeightMeasure;
  @XmlElement(name = "PersonXRayImage", nillable = true)
  protected List<ImageType> personXRayImage;
  @XmlElementRef(name = "PersonNationalityAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personNationalityAbstract;
  @XmlElement(name = "EmploymentContactInformation", nillable = true)
  protected List<ContactInformationType> employmentContactInformation;
  @XmlElement(name = "PersonEmergencyContactInformation", nillable = true)
  protected List<ContactInformationType> personEmergencyContactInformation;
  @XmlElement(name = "PersonHomeContactInformation", nillable = true)
  protected List<ContactInformationType> personHomeContactInformation;
  @XmlElement(name = "PersonAugmentationPoint")
  protected List<Object> personAugmentationPoint;

  public List<TextType> getPersonAccentText() {
    if (personAccentText == null) {
      personAccentText = new ArrayList<TextType>();
    }
    return this.personAccentText;
  }

  public List<TextType> getPersonAgeDescriptionText() {
    if (personAgeDescriptionText == null) {
      personAgeDescriptionText = new ArrayList<TextType>();
    }
    return this.personAgeDescriptionText;
  }

  public List<TimeMeasureType> getPersonAgeMeasure() {
    if (personAgeMeasure == null) {
      personAgeMeasure = new ArrayList<TimeMeasureType>();
    }
    return this.personAgeMeasure;
  }

  public List<DateType> getPersonBirthDate() {
    if (personBirthDate == null) {
      personBirthDate = new ArrayList<DateType>();
    }
    return this.personBirthDate;
  }

  public List<LocationType> getPersonBirthLocation() {
    if (personBirthLocation == null) {
      personBirthLocation = new ArrayList<LocationType>();
    }
    return this.personBirthLocation;
  }

  public List<JAXBElement<?>> getPersonBloodTypeAbstract() {
    if (personBloodTypeAbstract == null) {
      personBloodTypeAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personBloodTypeAbstract;
  }

  public List<JAXBElement<?>> getPersonBodyXRaysAvailableAbstract() {
    if (personBodyXRaysAvailableAbstract == null) {
      personBodyXRaysAvailableAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personBodyXRaysAvailableAbstract;
  }

  public List<JAXBElement<?>> getPersonBuildAbstract() {
    if (personBuildAbstract == null) {
      personBuildAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personBuildAbstract;
  }

  public List<CapabilityType> getPersonCapability() {
    if (personCapability == null) {
      personCapability = new ArrayList<CapabilityType>();
    }
    return this.personCapability;
  }

  public List<Boolean> getPersonCircumcisionIndicator() {
    if (personCircumcisionIndicator == null) {
      personCircumcisionIndicator = new ArrayList<Boolean>();
    }
    return this.personCircumcisionIndicator;
  }

  public List<JAXBElement<?>> getPersonCitizenshipAbstract() {
    if (personCitizenshipAbstract == null) {
      personCitizenshipAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personCitizenshipAbstract;
  }

  public List<TextType> getPersonComplexionText() {
    if (personComplexionText == null) {
      personComplexionText = new ArrayList<TextType>();
    }
    return this.personComplexionText;
  }

  public List<DateType> getPersonDeathDate() {
    if (personDeathDate == null) {
      personDeathDate = new ArrayList<DateType>();
    }
    return this.personDeathDate;
  }

  public List<QuantityType> getPersonDependentQuantity() {
    if (personDependentQuantity == null) {
      personDependentQuantity = new ArrayList<QuantityType>();
    }
    return this.personDependentQuantity;
  }

  public List<TextType> getPersonDescriptionText() {
    if (personDescriptionText == null) {
      personDescriptionText = new ArrayList<TextType>();
    }
    return this.personDescriptionText;
  }

  public List<ImageType> getPersonDigitalImage() {
    if (personDigitalImage == null) {
      personDigitalImage = new ArrayList<ImageType>();
    }
    return this.personDigitalImage;
  }

  public List<ImageType> getPersonDigitizedSignatureImage() {
    if (personDigitizedSignatureImage == null) {
      personDigitizedSignatureImage = new ArrayList<ImageType>();
    }
    return this.personDigitizedSignatureImage;
  }

  public List<TextType> getPersonDisguiseDescriptionText() {
    if (personDisguiseDescriptionText == null) {
      personDisguiseDescriptionText = new ArrayList<TextType>();
    }
    return this.personDisguiseDescriptionText;
  }

  public List<JAXBElement<?>> getPersonOrganDonorAbstract() {
    if (personOrganDonorAbstract == null) {
      personOrganDonorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personOrganDonorAbstract;
  }

  public List<TextType> getPersonEducationLevelText() {
    if (personEducationLevelText == null) {
      personEducationLevelText = new ArrayList<TextType>();
    }
    return this.personEducationLevelText;
  }

  public List<JAXBElement<?>> getPersonEthnicityAbstract() {
    if (personEthnicityAbstract == null) {
      personEthnicityAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personEthnicityAbstract;
  }

  public List<JAXBElement<?>> getPersonEyeColorAbstract() {
    if (personEyeColorAbstract == null) {
      personEyeColorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personEyeColorAbstract;
  }

  public List<JAXBElement<?>> getPersonEyewearAbstract() {
    if (personEyewearAbstract == null) {
      personEyewearAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personEyewearAbstract;
  }

  public List<JAXBElement<?>> getPersonFacialHairAbstract() {
    if (personFacialHairAbstract == null) {
      personFacialHairAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personFacialHairAbstract;
  }

  public List<JAXBElement<?>> getPersonHairLengthAbstract() {
    if (personHairLengthAbstract == null) {
      personHairLengthAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personHairLengthAbstract;
  }

  public List<JAXBElement<?>> getPersonHairStyleAbstract() {
    if (personHairStyleAbstract == null) {
      personHairStyleAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personHairStyleAbstract;
  }

  public List<TextType> getPersonGeneralAppearanceDescriptionText() {
    if (personGeneralAppearanceDescriptionText == null) {
      personGeneralAppearanceDescriptionText = new ArrayList<TextType>();
    }
    return this.personGeneralAppearanceDescriptionText;
  }

  public List<TextType> getPersonHairAppearanceText() {
    if (personHairAppearanceText == null) {
      personHairAppearanceText = new ArrayList<TextType>();
    }
    return this.personHairAppearanceText;
  }

  public List<TextType> getPersonHairCategoryText() {
    if (personHairCategoryText == null) {
      personHairCategoryText = new ArrayList<TextType>();
    }
    return this.personHairCategoryText;
  }

  public List<JAXBElement<?>> getPersonHairColorAbstract() {
    if (personHairColorAbstract == null) {
      personHairColorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personHairColorAbstract;
  }

  public List<TextType> getPersonHandednessText() {
    if (personHandednessText == null) {
      personHandednessText = new ArrayList<TextType>();
    }
    return this.personHandednessText;
  }

  public List<TextType> getPersonHeightDescriptionText() {
    if (personHeightDescriptionText == null) {
      personHeightDescriptionText = new ArrayList<TextType>();
    }
    return this.personHeightDescriptionText;
  }

  public List<LengthMeasureType> getPersonHeightMeasure() {
    if (personHeightMeasure == null) {
      personHeightMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.personHeightMeasure;
  }

  public List<IdentificationType> getPersonHumanResourceIdentification() {
    if (personHumanResourceIdentification == null) {
      personHumanResourceIdentification = new ArrayList<IdentificationType>();
    }
    return this.personHumanResourceIdentification;
  }

  public List<InjuryType> getPersonInjury() {
    if (personInjury == null) {
      personInjury = new ArrayList<InjuryType>();
    }
    return this.personInjury;
  }

  public List<TextType> getPersonJewelryDescriptionText() {
    if (personJewelryDescriptionText == null) {
      personJewelryDescriptionText = new ArrayList<TextType>();
    }
    return this.personJewelryDescriptionText;
  }

  public List<Boolean> getPersonLanguageEnglishIndicator() {
    if (personLanguageEnglishIndicator == null) {
      personLanguageEnglishIndicator = new ArrayList<Boolean>();
    }
    return this.personLanguageEnglishIndicator;
  }

  public List<TextType> getPersonLearningDisabilityText() {
    if (personLearningDisabilityText == null) {
      personLearningDisabilityText = new ArrayList<TextType>();
    }
    return this.personLearningDisabilityText;
  }

  public List<IdentificationType> getPersonLicenseIdentification() {
    if (personLicenseIdentification == null) {
      personLicenseIdentification = new ArrayList<IdentificationType>();
    }
    return this.personLicenseIdentification;
  }

  public List<Boolean> getPersonLivingIndicator() {
    if (personLivingIndicator == null) {
      personLivingIndicator = new ArrayList<Boolean>();
    }
    return this.personLivingIndicator;
  }

  public List<MedicalConditionType> getPersonMedicalCondition() {
    if (personMedicalCondition == null) {
      personMedicalCondition = new ArrayList<MedicalConditionType>();
    }
    return this.personMedicalCondition;
  }

  public List<TextType> getPersonMedicalDescriptionText() {
    if (personMedicalDescriptionText == null) {
      personMedicalDescriptionText = new ArrayList<TextType>();
    }
    return this.personMedicalDescriptionText;
  }

  public List<Boolean> getPersonMedicalFileIndicator() {
    if (personMedicalFileIndicator == null) {
      personMedicalFileIndicator = new ArrayList<Boolean>();
    }
    return this.personMedicalFileIndicator;
  }

  public List<TextType> getPersonMedicationRequiredText() {
    if (personMedicationRequiredText == null) {
      personMedicationRequiredText = new ArrayList<TextType>();
    }
    return this.personMedicationRequiredText;
  }

  public List<TextType> getPersonMentalStateText() {
    if (personMentalStateText == null) {
      personMentalStateText = new ArrayList<TextType>();
    }
    return this.personMentalStateText;
  }

  public List<MilitarySummaryType> getPersonMilitarySummary() {
    if (personMilitarySummary == null) {
      personMilitarySummary = new ArrayList<MilitarySummaryType>();
    }
    return this.personMilitarySummary;
  }

  public List<TextType> getPersonMoodDescriptionText() {
    if (personMoodDescriptionText == null) {
      personMoodDescriptionText = new ArrayList<TextType>();
    }
    return this.personMoodDescriptionText;
  }

  public List<PersonNameType> getPersonName() {
    if (personName == null) {
      personName = new ArrayList<PersonNameType>();
    }
    return this.personName;
  }

  public List<IdentificationType> getPersonNationalIdentification() {
    if (personNationalIdentification == null) {
      personNationalIdentification = new ArrayList<IdentificationType>();
    }
    return this.personNationalIdentification;
  }

  public List<Boolean> getPersonOrganDonatorIndicator() {
    if (personOrganDonatorIndicator == null) {
      personOrganDonatorIndicator = new ArrayList<Boolean>();
    }
    return this.personOrganDonatorIndicator;
  }

  public List<IdentificationType> getPersonOtherIdentification() {
    if (personOtherIdentification == null) {
      personOtherIdentification = new ArrayList<IdentificationType>();
    }
    return this.personOtherIdentification;
  }

  public List<IdentificationType> getPersonPassportIdentification() {
    if (personPassportIdentification == null) {
      personPassportIdentification = new ArrayList<IdentificationType>();
    }
    return this.personPassportIdentification;
  }

  public List<TextType> getPersonPhysicalDisabilityText() {
    if (personPhysicalDisabilityText == null) {
      personPhysicalDisabilityText = new ArrayList<TextType>();
    }
    return this.personPhysicalDisabilityText;
  }

  public List<PhysicalFeatureType> getPersonPhysicalFeature() {
    if (personPhysicalFeature == null) {
      personPhysicalFeature = new ArrayList<PhysicalFeatureType>();
    }
    return this.personPhysicalFeature;
  }

  public List<PersonLanguageType> getPersonPrimaryLanguage() {
    if (personPrimaryLanguage == null) {
      personPrimaryLanguage = new ArrayList<PersonLanguageType>();
    }
    return this.personPrimaryLanguage;
  }

  public List<JAXBElement<?>> getPersonRaceAbstract() {
    if (personRaceAbstract == null) {
      personRaceAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personRaceAbstract;
  }

  public List<JAXBElement<?>> getPersonReligionAbstract() {
    if (personReligionAbstract == null) {
      personReligionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personReligionAbstract;
  }

  public List<JAXBElement<?>> getPersonResidentAbstract() {
    if (personResidentAbstract == null) {
      personResidentAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personResidentAbstract;
  }

  public List<PersonLanguageType> getPersonSecondaryLanguage() {
    if (personSecondaryLanguage == null) {
      personSecondaryLanguage = new ArrayList<PersonLanguageType>();
    }
    return this.personSecondaryLanguage;
  }

  public List<JAXBElement<?>> getPersonSecurityClearanceAbstract() {
    if (personSecurityClearanceAbstract == null) {
      personSecurityClearanceAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personSecurityClearanceAbstract;
  }

  public List<JAXBElement<?>> getPersonSexAbstract() {
    if (personSexAbstract == null) {
      personSexAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personSexAbstract;
  }

  public List<TextType> getPersonSexualOrientationText() {
    if (personSexualOrientationText == null) {
      personSexualOrientationText = new ArrayList<TextType>();
    }
    return this.personSexualOrientationText;
  }

  public List<JAXBElement<?>> getPersonSkinToneAbstract() {
    if (personSkinToneAbstract == null) {
      personSkinToneAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personSkinToneAbstract;
  }

  public List<TextType> getPersonSpeechDescriptionText() {
    if (personSpeechDescriptionText == null) {
      personSpeechDescriptionText = new ArrayList<TextType>();
    }
    return this.personSpeechDescriptionText;
  }

  public List<IdentificationType> getPersonSSNIdentification() {
    if (personSSNIdentification == null) {
      personSSNIdentification = new ArrayList<IdentificationType>();
    }
    return this.personSSNIdentification;
  }

  public List<IdentificationType> getPersonStateIdentification() {
    if (personStateIdentification == null) {
      personStateIdentification = new ArrayList<IdentificationType>();
    }
    return this.personStateIdentification;
  }

  public List<IdentificationType> getPersonTaxIdentification() {
    if (personTaxIdentification == null) {
      personTaxIdentification = new ArrayList<IdentificationType>();
    }
    return this.personTaxIdentification;
  }

  public List<JAXBElement<?>> getPersonUnionStatusAbstract() {
    if (personUnionStatusAbstract == null) {
      personUnionStatusAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personUnionStatusAbstract;
  }

  public List<Boolean> getPersonUSCitizenIndicator() {
    if (personUSCitizenIndicator == null) {
      personUSCitizenIndicator = new ArrayList<Boolean>();
    }
    return this.personUSCitizenIndicator;
  }

  public List<TextType> getPersonVisionPrescriptionText() {
    if (personVisionPrescriptionText == null) {
      personVisionPrescriptionText = new ArrayList<TextType>();
    }
    return this.personVisionPrescriptionText;
  }

  public List<TextType> getPersonWeightDescriptionText() {
    if (personWeightDescriptionText == null) {
      personWeightDescriptionText = new ArrayList<TextType>();
    }
    return this.personWeightDescriptionText;
  }

  public List<WeightMeasureType> getPersonWeightMeasure() {
    if (personWeightMeasure == null) {
      personWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.personWeightMeasure;
  }

  public List<ImageType> getPersonXRayImage() {
    if (personXRayImage == null) {
      personXRayImage = new ArrayList<ImageType>();
    }
    return this.personXRayImage;
  }

  public List<JAXBElement<?>> getPersonNationalityAbstract() {
    if (personNationalityAbstract == null) {
      personNationalityAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personNationalityAbstract;
  }

  public List<ContactInformationType> getEmploymentContactInformation() {
    if (employmentContactInformation == null) {
      employmentContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.employmentContactInformation;
  }

  public List<ContactInformationType> getPersonEmergencyContactInformation() {
    if (personEmergencyContactInformation == null) {
      personEmergencyContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.personEmergencyContactInformation;
  }

  public List<ContactInformationType> getPersonHomeContactInformation() {
    if (personHomeContactInformation == null) {
      personHomeContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.personHomeContactInformation;
  }

  public List<Object> getPersonAugmentationPoint() {
    if (personAugmentationPoint == null) {
      personAugmentationPoint = new ArrayList<Object>();
    }
    return this.personAugmentationPoint;
  }

}
