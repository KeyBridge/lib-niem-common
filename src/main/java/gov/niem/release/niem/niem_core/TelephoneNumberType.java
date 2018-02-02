package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberType", propOrder = {
  "telephoneNumberAbstract",
  "telephoneNumberCategoryAbstract",
  "telephoneNumberDescriptionText",
  "telephoneNumberAugmentationPoint"
})
public class TelephoneNumberType
  extends ObjectType {

  @XmlElementRef(name = "TelephoneNumberAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> telephoneNumberAbstract;
  @XmlElementRef(name = "TelephoneNumberCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> telephoneNumberCategoryAbstract;
  @XmlElement(name = "TelephoneNumberDescriptionText", nillable = true)
  protected List<TextType> telephoneNumberDescriptionText;
  @XmlElement(name = "TelephoneNumberAugmentationPoint")
  protected List<Object> telephoneNumberAugmentationPoint;

  public List<JAXBElement<?>> getTelephoneNumberAbstract() {
    if (telephoneNumberAbstract == null) {
      telephoneNumberAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.telephoneNumberAbstract;
  }

  public List<JAXBElement<?>> getTelephoneNumberCategoryAbstract() {
    if (telephoneNumberCategoryAbstract == null) {
      telephoneNumberCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.telephoneNumberCategoryAbstract;
  }

  public List<TextType> getTelephoneNumberDescriptionText() {
    if (telephoneNumberDescriptionText == null) {
      telephoneNumberDescriptionText = new ArrayList<TextType>();
    }
    return this.telephoneNumberDescriptionText;
  }

  public List<Object> getTelephoneNumberAugmentationPoint() {
    if (telephoneNumberAugmentationPoint == null) {
      telephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.telephoneNumberAugmentationPoint;
  }

}
