package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConveyanceType", propOrder = {
  "conveyanceCargoText",
  "conveyanceEngineQuantity",
  "conveyanceMotorizedIndicator",
  "conveyanceTowedIndicator",
  "conveyanceUseAbstract",
  "conveyanceAugmentationPoint"
})
@XmlSeeAlso({
  VehicleType.class,
  AircraftType.class,
  VesselType.class
})
public class ConveyanceType
  extends ItemType {

  @XmlElement(name = "ConveyanceCargoText", nillable = true)
  protected List<TextType> conveyanceCargoText;
  @XmlElement(name = "ConveyanceEngineQuantity", nillable = true)
  protected List<NonNegativeInteger> conveyanceEngineQuantity;
  @XmlElement(name = "ConveyanceMotorizedIndicator", nillable = true)
  protected List<Boolean> conveyanceMotorizedIndicator;
  @XmlElement(name = "ConveyanceTowedIndicator", nillable = true)
  protected List<Boolean> conveyanceTowedIndicator;
  @XmlElementRef(name = "ConveyanceUseAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> conveyanceUseAbstract;
  @XmlElement(name = "ConveyanceAugmentationPoint")
  protected List<Object> conveyanceAugmentationPoint;

  public List<TextType> getConveyanceCargoText() {
    if (conveyanceCargoText == null) {
      conveyanceCargoText = new ArrayList<TextType>();
    }
    return this.conveyanceCargoText;
  }

  public List<NonNegativeInteger> getConveyanceEngineQuantity() {
    if (conveyanceEngineQuantity == null) {
      conveyanceEngineQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.conveyanceEngineQuantity;
  }

  public List<Boolean> getConveyanceMotorizedIndicator() {
    if (conveyanceMotorizedIndicator == null) {
      conveyanceMotorizedIndicator = new ArrayList<Boolean>();
    }
    return this.conveyanceMotorizedIndicator;
  }

  public List<Boolean> getConveyanceTowedIndicator() {
    if (conveyanceTowedIndicator == null) {
      conveyanceTowedIndicator = new ArrayList<Boolean>();
    }
    return this.conveyanceTowedIndicator;
  }

  public List<JAXBElement<?>> getConveyanceUseAbstract() {
    if (conveyanceUseAbstract == null) {
      conveyanceUseAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.conveyanceUseAbstract;
  }

  public List<Object> getConveyanceAugmentationPoint() {
    if (conveyanceAugmentationPoint == null) {
      conveyanceAugmentationPoint = new ArrayList<Object>();
    }
    return this.conveyanceAugmentationPoint;
  }

}
