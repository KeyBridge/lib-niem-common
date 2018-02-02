package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressType", propOrder = {
  "progressComplianceIndicator",
  "progressComplianceText",
  "progressPaymentAmount",
  "progressTimeQuantityText",
  "progressAugmentationPoint"
})
public class ProgressType
  extends ActivityType {

  @XmlElement(name = "ProgressComplianceIndicator", nillable = true)
  protected List<Boolean> progressComplianceIndicator;
  @XmlElement(name = "ProgressComplianceText", nillable = true)
  protected List<TextType> progressComplianceText;
  @XmlElement(name = "ProgressPaymentAmount", nillable = true)
  protected List<AmountType> progressPaymentAmount;
  @XmlElement(name = "ProgressTimeQuantityText", nillable = true)
  protected List<TextType> progressTimeQuantityText;
  @XmlElement(name = "ProgressAugmentationPoint")
  protected List<Object> progressAugmentationPoint;

  public List<Boolean> getProgressComplianceIndicator() {
    if (progressComplianceIndicator == null) {
      progressComplianceIndicator = new ArrayList<Boolean>();
    }
    return this.progressComplianceIndicator;
  }

  public List<TextType> getProgressComplianceText() {
    if (progressComplianceText == null) {
      progressComplianceText = new ArrayList<TextType>();
    }
    return this.progressComplianceText;
  }

  public List<AmountType> getProgressPaymentAmount() {
    if (progressPaymentAmount == null) {
      progressPaymentAmount = new ArrayList<AmountType>();
    }
    return this.progressPaymentAmount;
  }

  public List<TextType> getProgressTimeQuantityText() {
    if (progressTimeQuantityText == null) {
      progressTimeQuantityText = new ArrayList<TextType>();
    }
    return this.progressTimeQuantityText;
  }

  public List<Object> getProgressAugmentationPoint() {
    if (progressAugmentationPoint == null) {
      progressAugmentationPoint = new ArrayList<Object>();
    }
    return this.progressAugmentationPoint;
  }

}
