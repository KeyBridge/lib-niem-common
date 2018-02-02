package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncounterClassificationType", propOrder = {
  "encounterCategoryAbstract",
  "encounterClassificationAugmentationPoint"
})
public class EncounterClassificationType
  extends ObjectType {

  @XmlElementRef(name = "EncounterCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> encounterCategoryAbstract;
  @XmlElement(name = "EncounterClassificationAugmentationPoint")
  protected List<Object> encounterClassificationAugmentationPoint;

  public List<JAXBElement<?>> getEncounterCategoryAbstract() {
    if (encounterCategoryAbstract == null) {
      encounterCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.encounterCategoryAbstract;
  }

  public List<Object> getEncounterClassificationAugmentationPoint() {
    if (encounterClassificationAugmentationPoint == null) {
      encounterClassificationAugmentationPoint = new ArrayList<Object>();
    }
    return this.encounterClassificationAugmentationPoint;
  }

}
