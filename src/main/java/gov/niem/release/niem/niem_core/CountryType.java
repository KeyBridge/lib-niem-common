package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
  "countryRepresentation",
  "countryAugmentationPoint"
})
public class CountryType
  extends ObjectType {

  @XmlElementRef(name = "CountryRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> countryRepresentation;
  @XmlElement(name = "CountryAugmentationPoint")
  protected List<Object> countryAugmentationPoint;

  public List<JAXBElement<?>> getCountryRepresentation() {
    if (countryRepresentation == null) {
      countryRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.countryRepresentation;
  }

  public List<Object> getCountryAugmentationPoint() {
    if (countryAugmentationPoint == null) {
      countryAugmentationPoint = new ArrayList<Object>();
    }
    return this.countryAugmentationPoint;
  }

}
