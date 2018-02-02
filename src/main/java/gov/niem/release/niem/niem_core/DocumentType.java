package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
  "documentCategoryAbstract",
  "documentSensitivityAbstract",
  "caveatText",
  "documentAlternativeTitleText",
  "documentSoftwareName",
  "documentApprovedIndicator",
  "documentBinary",
  "documentCategoryDescriptionText",
  "documentContentListText",
  "documentCopyrightIndicator",
  "documentCountry",
  "documentCreationDate",
  "documentDescriptionText",
  "documentDispositionAuthorityName",
  "documentDispositionInstructionText",
  "documentDisputedIndicator",
  "documentDisputedReasonText",
  "documentEffectiveDate",
  "documentEntrySubmitter",
  "documentExpirationDate",
  "documentFileControlID",
  "documentFiledDate",
  "documentFileExtensionText",
  "documentFileName",
  "documentFormatText",
  "documentGroupID",
  "documentIdentification",
  "documentInformationCutOffDate",
  "documentIntelligenceCategoryAbstract",
  "documentKeywordText",
  "documentLastModifiedDate",
  "documentLocation",
  "documentLocationURI",
  "documentManagementCyclePeriodText",
  "documentMediaCategoryText",
  "documentMediumText",
  "documentOtherRecipient",
  "documentPermanentRecordIndicator",
  "documentPostDate",
  "documentPrivacyActIndicator",
  "documentPublicationDate",
  "documentReceivedDate",
  "documentRecipient",
  "documentRelatedResourceText",
  "documentRightsText",
  "documentSequenceID",
  "documentSource",
  "documentSourceText",
  "documentStatus",
  "documentSubjectAbstract",
  "documentSummaryText",
  "documentSupplementalMarkingText",
  "documentTitleText",
  "documentVitalIndicator",
  "documentAuthor",
  "documentContributor",
  "documentCoverageAbstract",
  "documentFormatCategoryText",
  "documentLanguageAbstract",
  "documentSubmissionAmount",
  "documentSubmitter",
  "documentIssuanceDate",
  "documentStatusDetails",
  "documentIssuanceLocation",
  "documentEUDataPrivacyIndicator",
  "documentAugmentationPoint"
})
@XmlSeeAlso({
  ManifestType.class,
  PassportType.class
})
public class DocumentType
  extends ObjectType {

  @XmlElementRef(name = "DocumentCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentCategoryAbstract;
  @XmlElementRef(name = "DocumentSensitivityAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentSensitivityAbstract;
  @XmlElement(name = "CaveatText", nillable = true)
  protected List<TextType> caveatText;
  @XmlElement(name = "DocumentAlternativeTitleText", nillable = true)
  protected List<TextType> documentAlternativeTitleText;
  @XmlElement(name = "DocumentSoftwareName", nillable = true)
  protected List<SoftwareNameType> documentSoftwareName;
  @XmlElement(name = "DocumentApprovedIndicator", nillable = true)
  protected List<Boolean> documentApprovedIndicator;
  @XmlElement(name = "DocumentBinary", nillable = true)
  protected List<BinaryType> documentBinary;
  @XmlElement(name = "DocumentCategoryDescriptionText", nillable = true)
  protected List<TextType> documentCategoryDescriptionText;
  @XmlElement(name = "DocumentContentListText", nillable = true)
  protected List<TextType> documentContentListText;
  @XmlElement(name = "DocumentCopyrightIndicator", nillable = true)
  protected List<Boolean> documentCopyrightIndicator;
  @XmlElement(name = "DocumentCountry", nillable = true)
  protected List<CountryType> documentCountry;
  @XmlElement(name = "DocumentCreationDate", nillable = true)
  protected List<DateType> documentCreationDate;
  @XmlElement(name = "DocumentDescriptionText", nillable = true)
  protected List<TextType> documentDescriptionText;
  @XmlElement(name = "DocumentDispositionAuthorityName", nillable = true)
  protected List<TextType> documentDispositionAuthorityName;
  @XmlElement(name = "DocumentDispositionInstructionText", nillable = true)
  protected List<TextType> documentDispositionInstructionText;
  @XmlElement(name = "DocumentDisputedIndicator", nillable = true)
  protected List<Boolean> documentDisputedIndicator;
  @XmlElement(name = "DocumentDisputedReasonText", nillable = true)
  protected List<TextType> documentDisputedReasonText;
  @XmlElement(name = "DocumentEffectiveDate", nillable = true)
  protected List<DateType> documentEffectiveDate;
  @XmlElement(name = "DocumentEntrySubmitter", nillable = true)
  protected List<PersonType> documentEntrySubmitter;
  @XmlElement(name = "DocumentExpirationDate", nillable = true)
  protected List<DateType> documentExpirationDate;
  @XmlElement(name = "DocumentFileControlID", nillable = true)
  protected List<String> documentFileControlID;
  @XmlElement(name = "DocumentFiledDate", nillable = true)
  protected List<DateType> documentFiledDate;
  @XmlElement(name = "DocumentFileExtensionText", nillable = true)
  protected List<TextType> documentFileExtensionText;
  @XmlElement(name = "DocumentFileName", nillable = true)
  protected List<TextType> documentFileName;
  @XmlElement(name = "DocumentFormatText", nillable = true)
  protected List<TextType> documentFormatText;
  @XmlElement(name = "DocumentGroupID", nillable = true)
  protected List<String> documentGroupID;
  @XmlElement(name = "DocumentIdentification", nillable = true)
  protected List<IdentificationType> documentIdentification;
  @XmlElement(name = "DocumentInformationCutOffDate", nillable = true)
  protected List<DateType> documentInformationCutOffDate;
  @XmlElementRef(name = "DocumentIntelligenceCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentIntelligenceCategoryAbstract;
  @XmlElement(name = "DocumentKeywordText", nillable = true)
  protected List<TextType> documentKeywordText;
  @XmlElement(name = "DocumentLastModifiedDate", nillable = true)
  protected List<DateType> documentLastModifiedDate;
  @XmlElement(name = "DocumentLocation", nillable = true)
  protected List<LocationType> documentLocation;
  @XmlElement(name = "DocumentLocationURI", nillable = true)
  protected List<AnyURI> documentLocationURI;
  @XmlElement(name = "DocumentManagementCyclePeriodText", nillable = true)
  protected List<TextType> documentManagementCyclePeriodText;
  @XmlElement(name = "DocumentMediaCategoryText", nillable = true)
  protected List<TextType> documentMediaCategoryText;
  @XmlElement(name = "DocumentMediumText", nillable = true)
  protected List<TextType> documentMediumText;
  @XmlElement(name = "DocumentOtherRecipient", nillable = true)
  protected List<EntityType> documentOtherRecipient;
  @XmlElement(name = "DocumentPermanentRecordIndicator", nillable = true)
  protected List<Boolean> documentPermanentRecordIndicator;
  @XmlElement(name = "DocumentPostDate", nillable = true)
  protected List<DateType> documentPostDate;
  @XmlElement(name = "DocumentPrivacyActIndicator", nillable = true)
  protected List<Boolean> documentPrivacyActIndicator;
  @XmlElement(name = "DocumentPublicationDate", nillable = true)
  protected List<DateType> documentPublicationDate;
  @XmlElement(name = "DocumentReceivedDate", nillable = true)
  protected List<DateType> documentReceivedDate;
  @XmlElement(name = "DocumentRecipient", nillable = true)
  protected List<EntityType> documentRecipient;
  @XmlElement(name = "DocumentRelatedResourceText", nillable = true)
  protected List<TextType> documentRelatedResourceText;
  @XmlElement(name = "DocumentRightsText", nillable = true)
  protected List<TextType> documentRightsText;
  @XmlElement(name = "DocumentSequenceID", nillable = true)
  protected List<String> documentSequenceID;
  @XmlElement(name = "DocumentSource", nillable = true)
  protected List<EntityType> documentSource;
  @XmlElement(name = "DocumentSourceText", nillable = true)
  protected List<TextType> documentSourceText;
  @XmlElement(name = "DocumentStatus", nillable = true)
  protected List<StatusType> documentStatus;
  @XmlElementRef(name = "DocumentSubjectAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentSubjectAbstract;
  @XmlElement(name = "DocumentSummaryText", nillable = true)
  protected List<TextType> documentSummaryText;
  @XmlElement(name = "DocumentSupplementalMarkingText", nillable = true)
  protected List<TextType> documentSupplementalMarkingText;
  @XmlElement(name = "DocumentTitleText", nillable = true)
  protected List<TextType> documentTitleText;
  @XmlElement(name = "DocumentVitalIndicator", nillable = true)
  protected List<Boolean> documentVitalIndicator;
  @XmlElement(name = "DocumentAuthor", nillable = true)
  protected List<EntityType> documentAuthor;
  @XmlElement(name = "DocumentContributor", nillable = true)
  protected List<EntityType> documentContributor;
  @XmlElementRef(name = "DocumentCoverageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentCoverageAbstract;
  @XmlElement(name = "DocumentFormatCategoryText", nillable = true)
  protected List<TextType> documentFormatCategoryText;
  @XmlElementRef(name = "DocumentLanguageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> documentLanguageAbstract;
  @XmlElement(name = "DocumentSubmissionAmount", nillable = true)
  protected List<AmountType> documentSubmissionAmount;
  @XmlElement(name = "DocumentSubmitter", nillable = true)
  protected List<EntityType> documentSubmitter;
  @XmlElement(name = "DocumentIssuanceDate", nillable = true)
  protected List<DateType> documentIssuanceDate;
  @XmlElement(name = "DocumentStatusDetails", nillable = true)
  protected List<DocumentStatusDetailsType> documentStatusDetails;
  @XmlElement(name = "DocumentIssuanceLocation", nillable = true)
  protected List<LocationType> documentIssuanceLocation;
  @XmlElement(name = "DocumentEUDataPrivacyIndicator", nillable = true)
  protected List<Boolean> documentEUDataPrivacyIndicator;
  @XmlElement(name = "DocumentAugmentationPoint")
  protected List<Object> documentAugmentationPoint;

  public List<JAXBElement<?>> getDocumentCategoryAbstract() {
    if (documentCategoryAbstract == null) {
      documentCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentCategoryAbstract;
  }

  public List<JAXBElement<?>> getDocumentSensitivityAbstract() {
    if (documentSensitivityAbstract == null) {
      documentSensitivityAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentSensitivityAbstract;
  }

  public List<TextType> getCaveatText() {
    if (caveatText == null) {
      caveatText = new ArrayList<TextType>();
    }
    return this.caveatText;
  }

  public List<TextType> getDocumentAlternativeTitleText() {
    if (documentAlternativeTitleText == null) {
      documentAlternativeTitleText = new ArrayList<TextType>();
    }
    return this.documentAlternativeTitleText;
  }

  public List<SoftwareNameType> getDocumentSoftwareName() {
    if (documentSoftwareName == null) {
      documentSoftwareName = new ArrayList<SoftwareNameType>();
    }
    return this.documentSoftwareName;
  }

  public List<Boolean> getDocumentApprovedIndicator() {
    if (documentApprovedIndicator == null) {
      documentApprovedIndicator = new ArrayList<Boolean>();
    }
    return this.documentApprovedIndicator;
  }

  public List<BinaryType> getDocumentBinary() {
    if (documentBinary == null) {
      documentBinary = new ArrayList<BinaryType>();
    }
    return this.documentBinary;
  }

  public List<TextType> getDocumentCategoryDescriptionText() {
    if (documentCategoryDescriptionText == null) {
      documentCategoryDescriptionText = new ArrayList<TextType>();
    }
    return this.documentCategoryDescriptionText;
  }

  public List<TextType> getDocumentContentListText() {
    if (documentContentListText == null) {
      documentContentListText = new ArrayList<TextType>();
    }
    return this.documentContentListText;
  }

  public List<Boolean> getDocumentCopyrightIndicator() {
    if (documentCopyrightIndicator == null) {
      documentCopyrightIndicator = new ArrayList<Boolean>();
    }
    return this.documentCopyrightIndicator;
  }

  public List<CountryType> getDocumentCountry() {
    if (documentCountry == null) {
      documentCountry = new ArrayList<CountryType>();
    }
    return this.documentCountry;
  }

  public List<DateType> getDocumentCreationDate() {
    if (documentCreationDate == null) {
      documentCreationDate = new ArrayList<DateType>();
    }
    return this.documentCreationDate;
  }

  public List<TextType> getDocumentDescriptionText() {
    if (documentDescriptionText == null) {
      documentDescriptionText = new ArrayList<TextType>();
    }
    return this.documentDescriptionText;
  }

  public List<TextType> getDocumentDispositionAuthorityName() {
    if (documentDispositionAuthorityName == null) {
      documentDispositionAuthorityName = new ArrayList<TextType>();
    }
    return this.documentDispositionAuthorityName;
  }

  public List<TextType> getDocumentDispositionInstructionText() {
    if (documentDispositionInstructionText == null) {
      documentDispositionInstructionText = new ArrayList<TextType>();
    }
    return this.documentDispositionInstructionText;
  }

  public List<Boolean> getDocumentDisputedIndicator() {
    if (documentDisputedIndicator == null) {
      documentDisputedIndicator = new ArrayList<Boolean>();
    }
    return this.documentDisputedIndicator;
  }

  public List<TextType> getDocumentDisputedReasonText() {
    if (documentDisputedReasonText == null) {
      documentDisputedReasonText = new ArrayList<TextType>();
    }
    return this.documentDisputedReasonText;
  }

  public List<DateType> getDocumentEffectiveDate() {
    if (documentEffectiveDate == null) {
      documentEffectiveDate = new ArrayList<DateType>();
    }
    return this.documentEffectiveDate;
  }

  public List<PersonType> getDocumentEntrySubmitter() {
    if (documentEntrySubmitter == null) {
      documentEntrySubmitter = new ArrayList<PersonType>();
    }
    return this.documentEntrySubmitter;
  }

  public List<DateType> getDocumentExpirationDate() {
    if (documentExpirationDate == null) {
      documentExpirationDate = new ArrayList<DateType>();
    }
    return this.documentExpirationDate;
  }

  public List<String> getDocumentFileControlID() {
    if (documentFileControlID == null) {
      documentFileControlID = new ArrayList<String>();
    }
    return this.documentFileControlID;
  }

  public List<DateType> getDocumentFiledDate() {
    if (documentFiledDate == null) {
      documentFiledDate = new ArrayList<DateType>();
    }
    return this.documentFiledDate;
  }

  public List<TextType> getDocumentFileExtensionText() {
    if (documentFileExtensionText == null) {
      documentFileExtensionText = new ArrayList<TextType>();
    }
    return this.documentFileExtensionText;
  }

  public List<TextType> getDocumentFileName() {
    if (documentFileName == null) {
      documentFileName = new ArrayList<TextType>();
    }
    return this.documentFileName;
  }

  public List<TextType> getDocumentFormatText() {
    if (documentFormatText == null) {
      documentFormatText = new ArrayList<TextType>();
    }
    return this.documentFormatText;
  }

  public List<String> getDocumentGroupID() {
    if (documentGroupID == null) {
      documentGroupID = new ArrayList<String>();
    }
    return this.documentGroupID;
  }

  public List<IdentificationType> getDocumentIdentification() {
    if (documentIdentification == null) {
      documentIdentification = new ArrayList<IdentificationType>();
    }
    return this.documentIdentification;
  }

  public List<DateType> getDocumentInformationCutOffDate() {
    if (documentInformationCutOffDate == null) {
      documentInformationCutOffDate = new ArrayList<DateType>();
    }
    return this.documentInformationCutOffDate;
  }

  public List<JAXBElement<?>> getDocumentIntelligenceCategoryAbstract() {
    if (documentIntelligenceCategoryAbstract == null) {
      documentIntelligenceCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentIntelligenceCategoryAbstract;
  }

  public List<TextType> getDocumentKeywordText() {
    if (documentKeywordText == null) {
      documentKeywordText = new ArrayList<TextType>();
    }
    return this.documentKeywordText;
  }

  public List<DateType> getDocumentLastModifiedDate() {
    if (documentLastModifiedDate == null) {
      documentLastModifiedDate = new ArrayList<DateType>();
    }
    return this.documentLastModifiedDate;
  }

  public List<LocationType> getDocumentLocation() {
    if (documentLocation == null) {
      documentLocation = new ArrayList<LocationType>();
    }
    return this.documentLocation;
  }

  public List<AnyURI> getDocumentLocationURI() {
    if (documentLocationURI == null) {
      documentLocationURI = new ArrayList<AnyURI>();
    }
    return this.documentLocationURI;
  }

  public List<TextType> getDocumentManagementCyclePeriodText() {
    if (documentManagementCyclePeriodText == null) {
      documentManagementCyclePeriodText = new ArrayList<TextType>();
    }
    return this.documentManagementCyclePeriodText;
  }

  public List<TextType> getDocumentMediaCategoryText() {
    if (documentMediaCategoryText == null) {
      documentMediaCategoryText = new ArrayList<TextType>();
    }
    return this.documentMediaCategoryText;
  }

  public List<TextType> getDocumentMediumText() {
    if (documentMediumText == null) {
      documentMediumText = new ArrayList<TextType>();
    }
    return this.documentMediumText;
  }

  public List<EntityType> getDocumentOtherRecipient() {
    if (documentOtherRecipient == null) {
      documentOtherRecipient = new ArrayList<EntityType>();
    }
    return this.documentOtherRecipient;
  }

  public List<Boolean> getDocumentPermanentRecordIndicator() {
    if (documentPermanentRecordIndicator == null) {
      documentPermanentRecordIndicator = new ArrayList<Boolean>();
    }
    return this.documentPermanentRecordIndicator;
  }

  public List<DateType> getDocumentPostDate() {
    if (documentPostDate == null) {
      documentPostDate = new ArrayList<DateType>();
    }
    return this.documentPostDate;
  }

  public List<Boolean> getDocumentPrivacyActIndicator() {
    if (documentPrivacyActIndicator == null) {
      documentPrivacyActIndicator = new ArrayList<Boolean>();
    }
    return this.documentPrivacyActIndicator;
  }

  public List<DateType> getDocumentPublicationDate() {
    if (documentPublicationDate == null) {
      documentPublicationDate = new ArrayList<DateType>();
    }
    return this.documentPublicationDate;
  }

  public List<DateType> getDocumentReceivedDate() {
    if (documentReceivedDate == null) {
      documentReceivedDate = new ArrayList<DateType>();
    }
    return this.documentReceivedDate;
  }

  public List<EntityType> getDocumentRecipient() {
    if (documentRecipient == null) {
      documentRecipient = new ArrayList<EntityType>();
    }
    return this.documentRecipient;
  }

  public List<TextType> getDocumentRelatedResourceText() {
    if (documentRelatedResourceText == null) {
      documentRelatedResourceText = new ArrayList<TextType>();
    }
    return this.documentRelatedResourceText;
  }

  public List<TextType> getDocumentRightsText() {
    if (documentRightsText == null) {
      documentRightsText = new ArrayList<TextType>();
    }
    return this.documentRightsText;
  }

  public List<String> getDocumentSequenceID() {
    if (documentSequenceID == null) {
      documentSequenceID = new ArrayList<String>();
    }
    return this.documentSequenceID;
  }

  public List<EntityType> getDocumentSource() {
    if (documentSource == null) {
      documentSource = new ArrayList<EntityType>();
    }
    return this.documentSource;
  }

  public List<TextType> getDocumentSourceText() {
    if (documentSourceText == null) {
      documentSourceText = new ArrayList<TextType>();
    }
    return this.documentSourceText;
  }

  public List<StatusType> getDocumentStatus() {
    if (documentStatus == null) {
      documentStatus = new ArrayList<StatusType>();
    }
    return this.documentStatus;
  }

  public List<JAXBElement<?>> getDocumentSubjectAbstract() {
    if (documentSubjectAbstract == null) {
      documentSubjectAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentSubjectAbstract;
  }

  public List<TextType> getDocumentSummaryText() {
    if (documentSummaryText == null) {
      documentSummaryText = new ArrayList<TextType>();
    }
    return this.documentSummaryText;
  }

  public List<TextType> getDocumentSupplementalMarkingText() {
    if (documentSupplementalMarkingText == null) {
      documentSupplementalMarkingText = new ArrayList<TextType>();
    }
    return this.documentSupplementalMarkingText;
  }

  public List<TextType> getDocumentTitleText() {
    if (documentTitleText == null) {
      documentTitleText = new ArrayList<TextType>();
    }
    return this.documentTitleText;
  }

  public List<Boolean> getDocumentVitalIndicator() {
    if (documentVitalIndicator == null) {
      documentVitalIndicator = new ArrayList<Boolean>();
    }
    return this.documentVitalIndicator;
  }

  public List<EntityType> getDocumentAuthor() {
    if (documentAuthor == null) {
      documentAuthor = new ArrayList<EntityType>();
    }
    return this.documentAuthor;
  }

  public List<EntityType> getDocumentContributor() {
    if (documentContributor == null) {
      documentContributor = new ArrayList<EntityType>();
    }
    return this.documentContributor;
  }

  public List<JAXBElement<?>> getDocumentCoverageAbstract() {
    if (documentCoverageAbstract == null) {
      documentCoverageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentCoverageAbstract;
  }

  public List<TextType> getDocumentFormatCategoryText() {
    if (documentFormatCategoryText == null) {
      documentFormatCategoryText = new ArrayList<TextType>();
    }
    return this.documentFormatCategoryText;
  }

  public List<JAXBElement<?>> getDocumentLanguageAbstract() {
    if (documentLanguageAbstract == null) {
      documentLanguageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.documentLanguageAbstract;
  }

  public List<AmountType> getDocumentSubmissionAmount() {
    if (documentSubmissionAmount == null) {
      documentSubmissionAmount = new ArrayList<AmountType>();
    }
    return this.documentSubmissionAmount;
  }

  public List<EntityType> getDocumentSubmitter() {
    if (documentSubmitter == null) {
      documentSubmitter = new ArrayList<EntityType>();
    }
    return this.documentSubmitter;
  }

  public List<DateType> getDocumentIssuanceDate() {
    if (documentIssuanceDate == null) {
      documentIssuanceDate = new ArrayList<DateType>();
    }
    return this.documentIssuanceDate;
  }

  public List<DocumentStatusDetailsType> getDocumentStatusDetails() {
    if (documentStatusDetails == null) {
      documentStatusDetails = new ArrayList<DocumentStatusDetailsType>();
    }
    return this.documentStatusDetails;
  }

  public List<LocationType> getDocumentIssuanceLocation() {
    if (documentIssuanceLocation == null) {
      documentIssuanceLocation = new ArrayList<LocationType>();
    }
    return this.documentIssuanceLocation;
  }

  public List<Boolean> getDocumentEUDataPrivacyIndicator() {
    if (documentEUDataPrivacyIndicator == null) {
      documentEUDataPrivacyIndicator = new ArrayList<Boolean>();
    }
    return this.documentEUDataPrivacyIndicator;
  }

  public List<Object> getDocumentAugmentationPoint() {
    if (documentAugmentationPoint == null) {
      documentAugmentationPoint = new ArrayList<Object>();
    }
    return this.documentAugmentationPoint;
  }

}
