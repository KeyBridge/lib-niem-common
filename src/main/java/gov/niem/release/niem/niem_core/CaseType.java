package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.GYear;
import gov.niem.release.niem.proxy.xsd.String;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseType", propOrder = {
  "caseTitleText",
  "caseCategoryText",
  "caseGeneralCategoryText",
  "caseYearDate",
  "caseTrackingID",
  "caseSubCategoryText",
  "caseDocketID",
  "caseResolutionText",
  "caseFiling",
  "caseAugmentationPoint"
})
public class CaseType
  extends ActivityType {

  @XmlElement(name = "CaseTitleText", nillable = true)
  protected List<TextType> caseTitleText;
  @XmlElement(name = "CaseCategoryText", nillable = true)
  protected List<TextType> caseCategoryText;
  @XmlElement(name = "CaseGeneralCategoryText", nillable = true)
  protected List<TextType> caseGeneralCategoryText;
  @XmlElement(name = "CaseYearDate", nillable = true)
  protected List<GYear> caseYearDate;
  @XmlElement(name = "CaseTrackingID", nillable = true)
  protected List<String> caseTrackingID;
  @XmlElement(name = "CaseSubCategoryText", nillable = true)
  protected List<String> caseSubCategoryText;
  @XmlElement(name = "CaseDocketID", nillable = true)
  protected List<String> caseDocketID;
  @XmlElement(name = "CaseResolutionText", nillable = true)
  protected List<TextType> caseResolutionText;
  @XmlElement(name = "CaseFiling", nillable = true)
  protected List<DocumentType> caseFiling;
  @XmlElement(name = "CaseAugmentationPoint")
  protected List<Object> caseAugmentationPoint;

  public List<TextType> getCaseTitleText() {
    if (caseTitleText == null) {
      caseTitleText = new ArrayList<TextType>();
    }
    return this.caseTitleText;
  }

  public List<TextType> getCaseCategoryText() {
    if (caseCategoryText == null) {
      caseCategoryText = new ArrayList<TextType>();
    }
    return this.caseCategoryText;
  }

  public List<TextType> getCaseGeneralCategoryText() {
    if (caseGeneralCategoryText == null) {
      caseGeneralCategoryText = new ArrayList<TextType>();
    }
    return this.caseGeneralCategoryText;
  }

  public List<GYear> getCaseYearDate() {
    if (caseYearDate == null) {
      caseYearDate = new ArrayList<GYear>();
    }
    return this.caseYearDate;
  }

  public List<String> getCaseTrackingID() {
    if (caseTrackingID == null) {
      caseTrackingID = new ArrayList<String>();
    }
    return this.caseTrackingID;
  }

  public List<String> getCaseSubCategoryText() {
    if (caseSubCategoryText == null) {
      caseSubCategoryText = new ArrayList<String>();
    }
    return this.caseSubCategoryText;
  }

  public List<String> getCaseDocketID() {
    if (caseDocketID == null) {
      caseDocketID = new ArrayList<String>();
    }
    return this.caseDocketID;
  }

  public List<TextType> getCaseResolutionText() {
    if (caseResolutionText == null) {
      caseResolutionText = new ArrayList<TextType>();
    }
    return this.caseResolutionText;
  }

  public List<DocumentType> getCaseFiling() {
    if (caseFiling == null) {
      caseFiling = new ArrayList<DocumentType>();
    }
    return this.caseFiling;
  }

  public List<Object> getCaseAugmentationPoint() {
    if (caseAugmentationPoint == null) {
      caseAugmentationPoint = new ArrayList<Object>();
    }
    return this.caseAugmentationPoint;
  }

}
