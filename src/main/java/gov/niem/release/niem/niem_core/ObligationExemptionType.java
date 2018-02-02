package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligationExemptionType", propOrder = {
  "financialObligationExemptionAmount",
  "obligationExemptionDescriptionText",
  "obligationExemptionAugmentationPoint"
})
public class ObligationExemptionType
  extends ObjectType {

  @XmlElement(name = "FinancialObligationExemptionAmount", nillable = true)
  protected List<AmountType> financialObligationExemptionAmount;
  @XmlElement(name = "ObligationExemptionDescriptionText", nillable = true)
  protected List<TextType> obligationExemptionDescriptionText;
  @XmlElement(name = "ObligationExemptionAugmentationPoint")
  protected List<Object> obligationExemptionAugmentationPoint;

  public List<AmountType> getFinancialObligationExemptionAmount() {
    if (financialObligationExemptionAmount == null) {
      financialObligationExemptionAmount = new ArrayList<AmountType>();
    }
    return this.financialObligationExemptionAmount;
  }

  public List<TextType> getObligationExemptionDescriptionText() {
    if (obligationExemptionDescriptionText == null) {
      obligationExemptionDescriptionText = new ArrayList<TextType>();
    }
    return this.obligationExemptionDescriptionText;
  }

  public List<Object> getObligationExemptionAugmentationPoint() {
    if (obligationExemptionAugmentationPoint == null) {
      obligationExemptionAugmentationPoint = new ArrayList<Object>();
    }
    return this.obligationExemptionAugmentationPoint;
  }

}
