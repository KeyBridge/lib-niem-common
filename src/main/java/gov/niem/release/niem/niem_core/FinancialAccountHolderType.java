package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountHolderType", propOrder = {
  "financialAccountHolderCode",
  "financialAccountHolderAugmentationPoint"
})
public class FinancialAccountHolderType
  extends EntityType {

  @XmlElement(name = "FinancialAccountHolderCode", nillable = true)
  protected List<FinancialAccountHolderCodeType> financialAccountHolderCode;
  @XmlElement(name = "FinancialAccountHolderAugmentationPoint")
  protected List<Object> financialAccountHolderAugmentationPoint;

  public List<FinancialAccountHolderCodeType> getFinancialAccountHolderCode() {
    if (financialAccountHolderCode == null) {
      financialAccountHolderCode = new ArrayList<FinancialAccountHolderCodeType>();
    }
    return this.financialAccountHolderCode;
  }

  public List<Object> getFinancialAccountHolderAugmentationPoint() {
    if (financialAccountHolderAugmentationPoint == null) {
      financialAccountHolderAugmentationPoint = new ArrayList<Object>();
    }
    return this.financialAccountHolderAugmentationPoint;
  }

}
