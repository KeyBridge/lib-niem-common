package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressGridType", propOrder = {
  "addressGridID",
  "addressGridText",
  "addressGridAugmentationPoint"
})
public class AddressGridType
  extends ObjectType {

  @XmlElement(name = "AddressGridID", nillable = true)
  protected List<String> addressGridID;
  @XmlElement(name = "AddressGridText", nillable = true)
  protected List<TextType> addressGridText;
  @XmlElement(name = "AddressGridAugmentationPoint")
  protected List<Object> addressGridAugmentationPoint;

  public List<String> getAddressGridID() {
    if (addressGridID == null) {
      addressGridID = new ArrayList<String>();
    }
    return this.addressGridID;
  }

  public List<TextType> getAddressGridText() {
    if (addressGridText == null) {
      addressGridText = new ArrayList<TextType>();
    }
    return this.addressGridText;
  }

  public List<Object> getAddressGridAugmentationPoint() {
    if (addressGridAugmentationPoint == null) {
      addressGridAugmentationPoint = new ArrayList<Object>();
    }
    return this.addressGridAugmentationPoint;
  }

}
