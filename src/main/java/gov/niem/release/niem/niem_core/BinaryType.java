package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryType", propOrder = {
  "binaryID",
  "binaryCategoryAbstract",
  "binaryHash",
  "binaryLocationText",
  "binaryAvailableIndicator",
  "binaryObjectAbstract",
  "binaryCaptureDate",
  "binaryCapturer",
  "binaryDescriptionText",
  "binaryFormatText",
  "binaryFormatStandardName",
  "binaryURI",
  "binarySizeValue",
  "binaryAugmentationPoint"
})
@XmlSeeAlso({
  ImageType.class
})
public class BinaryType
  extends ObjectType {

  @XmlElement(name = "BinaryID", nillable = true)
  protected List<String> binaryID;
  @XmlElementRef(name = "BinaryCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> binaryCategoryAbstract;
  @XmlElement(name = "BinaryHash", nillable = true)
  protected List<BinaryHashType> binaryHash;
  @XmlElement(name = "BinaryLocationText", nillable = true)
  protected List<TextType> binaryLocationText;
  @XmlElement(name = "BinaryAvailableIndicator", nillable = true)
  protected List<Boolean> binaryAvailableIndicator;
  @XmlElementRef(name = "BinaryObjectAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> binaryObjectAbstract;
  @XmlElement(name = "BinaryCaptureDate", nillable = true)
  protected List<DateType> binaryCaptureDate;
  @XmlElement(name = "BinaryCapturer", nillable = true)
  protected List<EntityType> binaryCapturer;
  @XmlElement(name = "BinaryDescriptionText", nillable = true)
  protected List<TextType> binaryDescriptionText;
  @XmlElement(name = "BinaryFormatText", nillable = true)
  protected List<TextType> binaryFormatText;
  @XmlElement(name = "BinaryFormatStandardName", nillable = true)
  protected List<TextType> binaryFormatStandardName;
  @XmlElement(name = "BinaryURI", nillable = true)
  protected List<AnyURI> binaryURI;
  @XmlElement(name = "BinarySizeValue", nillable = true)
  protected List<NonNegativeDecimalType> binarySizeValue;
  @XmlElement(name = "BinaryAugmentationPoint")
  protected List<Object> binaryAugmentationPoint;

  public List<String> getBinaryID() {
    if (binaryID == null) {
      binaryID = new ArrayList<String>();
    }
    return this.binaryID;
  }

  public List<JAXBElement<?>> getBinaryCategoryAbstract() {
    if (binaryCategoryAbstract == null) {
      binaryCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.binaryCategoryAbstract;
  }

  public List<BinaryHashType> getBinaryHash() {
    if (binaryHash == null) {
      binaryHash = new ArrayList<BinaryHashType>();
    }
    return this.binaryHash;
  }

  public List<TextType> getBinaryLocationText() {
    if (binaryLocationText == null) {
      binaryLocationText = new ArrayList<TextType>();
    }
    return this.binaryLocationText;
  }

  public List<Boolean> getBinaryAvailableIndicator() {
    if (binaryAvailableIndicator == null) {
      binaryAvailableIndicator = new ArrayList<Boolean>();
    }
    return this.binaryAvailableIndicator;
  }

  public List<JAXBElement<?>> getBinaryObjectAbstract() {
    if (binaryObjectAbstract == null) {
      binaryObjectAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.binaryObjectAbstract;
  }

  public List<DateType> getBinaryCaptureDate() {
    if (binaryCaptureDate == null) {
      binaryCaptureDate = new ArrayList<DateType>();
    }
    return this.binaryCaptureDate;
  }

  public List<EntityType> getBinaryCapturer() {
    if (binaryCapturer == null) {
      binaryCapturer = new ArrayList<EntityType>();
    }
    return this.binaryCapturer;
  }

  public List<TextType> getBinaryDescriptionText() {
    if (binaryDescriptionText == null) {
      binaryDescriptionText = new ArrayList<TextType>();
    }
    return this.binaryDescriptionText;
  }

  public List<TextType> getBinaryFormatText() {
    if (binaryFormatText == null) {
      binaryFormatText = new ArrayList<TextType>();
    }
    return this.binaryFormatText;
  }

  public List<TextType> getBinaryFormatStandardName() {
    if (binaryFormatStandardName == null) {
      binaryFormatStandardName = new ArrayList<TextType>();
    }
    return this.binaryFormatStandardName;
  }

  public List<AnyURI> getBinaryURI() {
    if (binaryURI == null) {
      binaryURI = new ArrayList<AnyURI>();
    }
    return this.binaryURI;
  }

  public List<NonNegativeDecimalType> getBinarySizeValue() {
    if (binarySizeValue == null) {
      binarySizeValue = new ArrayList<NonNegativeDecimalType>();
    }
    return this.binarySizeValue;
  }

  public List<Object> getBinaryAugmentationPoint() {
    if (binaryAugmentationPoint == null) {
      binaryAugmentationPoint = new ArrayList<Object>();
    }
    return this.binaryAugmentationPoint;
  }

}
