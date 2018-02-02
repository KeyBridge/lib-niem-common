package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugType", propOrder = {
  "drugDaysSupplyQuantity",
  "drugStrengthText",
  "deaClassScheduleAbstract",
  "drugCoverageExceptionReasonText",
  "drugAugmentationPoint"
})
public class DrugType
  extends SubstanceType {

  @XmlElement(name = "DrugDaysSupplyQuantity", nillable = true)
  protected List<QuantityType> drugDaysSupplyQuantity;
  @XmlElement(name = "DrugStrengthText", nillable = true)
  protected List<TextType> drugStrengthText;
  @XmlElementRef(name = "DEAClassScheduleAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> deaClassScheduleAbstract;
  @XmlElement(name = "DrugCoverageExceptionReasonText", nillable = true)
  protected List<TextType> drugCoverageExceptionReasonText;
  @XmlElement(name = "DrugAugmentationPoint")
  protected List<Object> drugAugmentationPoint;

  public List<QuantityType> getDrugDaysSupplyQuantity() {
    if (drugDaysSupplyQuantity == null) {
      drugDaysSupplyQuantity = new ArrayList<QuantityType>();
    }
    return this.drugDaysSupplyQuantity;
  }

  public List<TextType> getDrugStrengthText() {
    if (drugStrengthText == null) {
      drugStrengthText = new ArrayList<TextType>();
    }
    return this.drugStrengthText;
  }

  public List<JAXBElement<?>> getDEAClassScheduleAbstract() {
    if (deaClassScheduleAbstract == null) {
      deaClassScheduleAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.deaClassScheduleAbstract;
  }

  public List<TextType> getDrugCoverageExceptionReasonText() {
    if (drugCoverageExceptionReasonText == null) {
      drugCoverageExceptionReasonText = new ArrayList<TextType>();
    }
    return this.drugCoverageExceptionReasonText;
  }

  public List<Object> getDrugAugmentationPoint() {
    if (drugAugmentationPoint == null) {
      drugAugmentationPoint = new ArrayList<Object>();
    }
    return this.drugAugmentationPoint;
  }

}
