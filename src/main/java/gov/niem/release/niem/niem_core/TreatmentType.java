package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreatmentType", propOrder = {
  "treatmentText",
  "treatmentProvider",
  "person",
  "treatmentAugmentationPoint"
})
public class TreatmentType
  extends ActivityType {

  @XmlElement(name = "TreatmentText", nillable = true)
  protected List<TextType> treatmentText;
  @XmlElement(name = "TreatmentProvider", nillable = true)
  protected List<EntityType> treatmentProvider;
  @XmlElement(name = "Person", nillable = true)
  protected List<PersonType> person;
  @XmlElement(name = "TreatmentAugmentationPoint")
  protected List<Object> treatmentAugmentationPoint;

  public List<TextType> getTreatmentText() {
    if (treatmentText == null) {
      treatmentText = new ArrayList<TextType>();
    }
    return this.treatmentText;
  }

  public List<EntityType> getTreatmentProvider() {
    if (treatmentProvider == null) {
      treatmentProvider = new ArrayList<EntityType>();
    }
    return this.treatmentProvider;
  }

  public List<PersonType> getPerson() {
    if (person == null) {
      person = new ArrayList<PersonType>();
    }
    return this.person;
  }

  public List<Object> getTreatmentAugmentationPoint() {
    if (treatmentAugmentationPoint == null) {
      treatmentAugmentationPoint = new ArrayList<Object>();
    }
    return this.treatmentAugmentationPoint;
  }

}
