package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDispositionDecisionType", propOrder = {
  "caseDispositionDecisionText",
  "caseDispositionDecisionCategoryText",
  "caseDispositionDecisionAugmentationPoint"
})
public class CaseDispositionDecisionType
  extends ObjectType {

  @XmlElement(name = "CaseDispositionDecisionText", nillable = true)
  protected List<TextType> caseDispositionDecisionText;
  @XmlElement(name = "CaseDispositionDecisionCategoryText", nillable = true)
  protected List<TextType> caseDispositionDecisionCategoryText;
  @XmlElement(name = "CaseDispositionDecisionAugmentationPoint")
  protected List<Object> caseDispositionDecisionAugmentationPoint;

  public List<TextType> getCaseDispositionDecisionText() {
    if (caseDispositionDecisionText == null) {
      caseDispositionDecisionText = new ArrayList<TextType>();
    }
    return this.caseDispositionDecisionText;
  }

  public List<TextType> getCaseDispositionDecisionCategoryText() {
    if (caseDispositionDecisionCategoryText == null) {
      caseDispositionDecisionCategoryText = new ArrayList<TextType>();
    }
    return this.caseDispositionDecisionCategoryText;
  }

  public List<Object> getCaseDispositionDecisionAugmentationPoint() {
    if (caseDispositionDecisionAugmentationPoint == null) {
      caseDispositionDecisionAugmentationPoint = new ArrayList<Object>();
    }
    return this.caseDispositionDecisionAugmentationPoint;
  }

}
