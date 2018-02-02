package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDispositionType", propOrder = {
  "caseDispositionFinalDate",
  "caseDispositionDecision",
  "caseDispositionAugmentationPoint"
})
public class CaseDispositionType
  extends DispositionType {

  @XmlElement(name = "CaseDispositionFinalDate", nillable = true)
  protected List<DateType> caseDispositionFinalDate;
  @XmlElement(name = "CaseDispositionDecision", nillable = true)
  protected List<CaseDispositionDecisionType> caseDispositionDecision;
  @XmlElement(name = "CaseDispositionAugmentationPoint")
  protected List<Object> caseDispositionAugmentationPoint;

  public List<DateType> getCaseDispositionFinalDate() {
    if (caseDispositionFinalDate == null) {
      caseDispositionFinalDate = new ArrayList<DateType>();
    }
    return this.caseDispositionFinalDate;
  }

  public List<CaseDispositionDecisionType> getCaseDispositionDecision() {
    if (caseDispositionDecision == null) {
      caseDispositionDecision = new ArrayList<CaseDispositionDecisionType>();
    }
    return this.caseDispositionDecision;
  }

  public List<Object> getCaseDispositionAugmentationPoint() {
    if (caseDispositionAugmentationPoint == null) {
      caseDispositionAugmentationPoint = new ArrayList<Object>();
    }
    return this.caseDispositionAugmentationPoint;
  }

}
