package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonUnionSeparationType", propOrder = {
  "separationCategoryAbstract",
  "separationDateRange",
  "personUnionSeparationAugmentationPoint"
})
public class PersonUnionSeparationType
  extends ActivityType {

  @XmlElementRef(name = "SeparationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> separationCategoryAbstract;
  @XmlElement(name = "SeparationDateRange", nillable = true)
  protected List<DateRangeType> separationDateRange;
  @XmlElement(name = "PersonUnionSeparationAugmentationPoint")
  protected List<Object> personUnionSeparationAugmentationPoint;

  public List<JAXBElement<?>> getSeparationCategoryAbstract() {
    if (separationCategoryAbstract == null) {
      separationCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.separationCategoryAbstract;
  }

  public List<DateRangeType> getSeparationDateRange() {
    if (separationDateRange == null) {
      separationDateRange = new ArrayList<DateRangeType>();
    }
    return this.separationDateRange;
  }

  public List<Object> getPersonUnionSeparationAugmentationPoint() {
    if (personUnionSeparationAugmentationPoint == null) {
      personUnionSeparationAugmentationPoint = new ArrayList<Object>();
    }
    return this.personUnionSeparationAugmentationPoint;
  }

}
