package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstanceMeasureType", propOrder = {
  "substanceUnitAbstract",
  "substanceMeasureAugmentationPoint"
})
public class SubstanceMeasureType
  extends MeasureType {

  @XmlElement(name = "SubstanceUnitAbstract")
  protected List<Object> substanceUnitAbstract;
  @XmlElement(name = "SubstanceMeasureAugmentationPoint")
  protected List<Object> substanceMeasureAugmentationPoint;

  public List<Object> getSubstanceUnitAbstract() {
    if (substanceUnitAbstract == null) {
      substanceUnitAbstract = new ArrayList<Object>();
    }
    return this.substanceUnitAbstract;
  }

  public List<Object> getSubstanceMeasureAugmentationPoint() {
    if (substanceMeasureAugmentationPoint == null) {
      substanceMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.substanceMeasureAugmentationPoint;
  }

}
