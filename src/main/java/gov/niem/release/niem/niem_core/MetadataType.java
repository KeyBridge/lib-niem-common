package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.proxy.xsd.String;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType", propOrder = {
  "caveatText",
  "administrativeID",
  "distributionText",
  "effectiveDate",
  "expirationDate",
  "lastUpdatedDate",
  "lastVerifiedDate",
  "probabilityPercent",
  "qualityComment",
  "confidencePercent",
  "reportedDate",
  "reportingOrganizationText",
  "reportingPersonRoleText",
  "reportingPersonText",
  "sensitivityText",
  "creatorName",
  "descriptionText",
  "sourceIDText",
  "sourceContactPersonText",
  "publisherName",
  "releaseDate",
  "repositoryID",
  "sourceText",
  "languageAbstract",
  "comment"
})
public class MetadataType
  extends gov.niem.release.niem.structures.MetadataType {

  @XmlElement(name = "CaveatText", nillable = true)
  protected List<TextType> caveatText;
  @XmlElement(name = "AdministrativeID", nillable = true)
  protected List<String> administrativeID;
  @XmlElement(name = "DistributionText", nillable = true)
  protected List<TextType> distributionText;
  @XmlElement(name = "EffectiveDate", nillable = true)
  protected List<DateType> effectiveDate;
  @XmlElement(name = "ExpirationDate", nillable = true)
  protected List<DateType> expirationDate;
  @XmlElement(name = "LastUpdatedDate", nillable = true)
  protected List<DateType> lastUpdatedDate;
  @XmlElement(name = "LastVerifiedDate", nillable = true)
  protected List<DateType> lastVerifiedDate;
  @XmlElement(name = "ProbabilityPercent", nillable = true)
  protected List<Decimal> probabilityPercent;
  @XmlElement(name = "QualityComment", nillable = true)
  protected List<CommentType> qualityComment;
  @XmlElement(name = "ConfidencePercent", nillable = true)
  protected List<Decimal> confidencePercent;
  @XmlElement(name = "ReportedDate", nillable = true)
  protected List<DateType> reportedDate;
  @XmlElement(name = "ReportingOrganizationText", nillable = true)
  protected List<TextType> reportingOrganizationText;
  @XmlElement(name = "ReportingPersonRoleText", nillable = true)
  protected List<TextType> reportingPersonRoleText;
  @XmlElement(name = "ReportingPersonText", nillable = true)
  protected List<TextType> reportingPersonText;
  @XmlElement(name = "SensitivityText", nillable = true)
  protected List<TextType> sensitivityText;
  @XmlElement(name = "CreatorName", nillable = true)
  protected List<TextType> creatorName;
  @XmlElement(name = "DescriptionText", nillable = true)
  protected List<TextType> descriptionText;
  @XmlElement(name = "SourceIDText", nillable = true)
  protected List<TextType> sourceIDText;
  @XmlElement(name = "SourceContactPersonText", nillable = true)
  protected List<TextType> sourceContactPersonText;
  @XmlElement(name = "PublisherName", nillable = true)
  protected List<TextType> publisherName;
  @XmlElement(name = "ReleaseDate", nillable = true)
  protected List<DateType> releaseDate;
  @XmlElement(name = "RepositoryID", nillable = true)
  protected List<String> repositoryID;
  @XmlElement(name = "SourceText", nillable = true)
  protected List<TextType> sourceText;
  @XmlElementRef(name = "LanguageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> languageAbstract;
  @XmlElement(name = "Comment", nillable = true)
  protected List<CommentType> comment;

  public List<TextType> getCaveatText() {
    if (caveatText == null) {
      caveatText = new ArrayList<TextType>();
    }
    return this.caveatText;
  }

  public List<String> getAdministrativeID() {
    if (administrativeID == null) {
      administrativeID = new ArrayList<String>();
    }
    return this.administrativeID;
  }

  public List<TextType> getDistributionText() {
    if (distributionText == null) {
      distributionText = new ArrayList<TextType>();
    }
    return this.distributionText;
  }

  public List<DateType> getEffectiveDate() {
    if (effectiveDate == null) {
      effectiveDate = new ArrayList<DateType>();
    }
    return this.effectiveDate;
  }

  public List<DateType> getExpirationDate() {
    if (expirationDate == null) {
      expirationDate = new ArrayList<DateType>();
    }
    return this.expirationDate;
  }

  public List<DateType> getLastUpdatedDate() {
    if (lastUpdatedDate == null) {
      lastUpdatedDate = new ArrayList<DateType>();
    }
    return this.lastUpdatedDate;
  }

  public List<DateType> getLastVerifiedDate() {
    if (lastVerifiedDate == null) {
      lastVerifiedDate = new ArrayList<DateType>();
    }
    return this.lastVerifiedDate;
  }

  public List<Decimal> getProbabilityPercent() {
    if (probabilityPercent == null) {
      probabilityPercent = new ArrayList<Decimal>();
    }
    return this.probabilityPercent;
  }

  public List<CommentType> getQualityComment() {
    if (qualityComment == null) {
      qualityComment = new ArrayList<CommentType>();
    }
    return this.qualityComment;
  }

  public List<Decimal> getConfidencePercent() {
    if (confidencePercent == null) {
      confidencePercent = new ArrayList<Decimal>();
    }
    return this.confidencePercent;
  }

  public List<DateType> getReportedDate() {
    if (reportedDate == null) {
      reportedDate = new ArrayList<DateType>();
    }
    return this.reportedDate;
  }

  public List<TextType> getReportingOrganizationText() {
    if (reportingOrganizationText == null) {
      reportingOrganizationText = new ArrayList<TextType>();
    }
    return this.reportingOrganizationText;
  }

  public List<TextType> getReportingPersonRoleText() {
    if (reportingPersonRoleText == null) {
      reportingPersonRoleText = new ArrayList<TextType>();
    }
    return this.reportingPersonRoleText;
  }

  public List<TextType> getReportingPersonText() {
    if (reportingPersonText == null) {
      reportingPersonText = new ArrayList<TextType>();
    }
    return this.reportingPersonText;
  }

  public List<TextType> getSensitivityText() {
    if (sensitivityText == null) {
      sensitivityText = new ArrayList<TextType>();
    }
    return this.sensitivityText;
  }

  public List<TextType> getCreatorName() {
    if (creatorName == null) {
      creatorName = new ArrayList<TextType>();
    }
    return this.creatorName;
  }

  public List<TextType> getDescriptionText() {
    if (descriptionText == null) {
      descriptionText = new ArrayList<TextType>();
    }
    return this.descriptionText;
  }

  public List<TextType> getSourceIDText() {
    if (sourceIDText == null) {
      sourceIDText = new ArrayList<TextType>();
    }
    return this.sourceIDText;
  }

  public List<TextType> getSourceContactPersonText() {
    if (sourceContactPersonText == null) {
      sourceContactPersonText = new ArrayList<TextType>();
    }
    return this.sourceContactPersonText;
  }

  public List<TextType> getPublisherName() {
    if (publisherName == null) {
      publisherName = new ArrayList<TextType>();
    }
    return this.publisherName;
  }

  public List<DateType> getReleaseDate() {
    if (releaseDate == null) {
      releaseDate = new ArrayList<DateType>();
    }
    return this.releaseDate;
  }

  public List<String> getRepositoryID() {
    if (repositoryID == null) {
      repositoryID = new ArrayList<String>();
    }
    return this.repositoryID;
  }

  public List<TextType> getSourceText() {
    if (sourceText == null) {
      sourceText = new ArrayList<TextType>();
    }
    return this.sourceText;
  }

  public List<JAXBElement<?>> getLanguageAbstract() {
    if (languageAbstract == null) {
      languageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.languageAbstract;
  }

  public List<CommentType> getComment() {
    if (comment == null) {
      comment = new ArrayList<CommentType>();
    }
    return this.comment;
  }

}
