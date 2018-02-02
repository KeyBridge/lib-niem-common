package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
  "imageHeightValue",
  "imageLocation",
  "imageWidthValue",
  "imageAugmentationPoint"
})
public class ImageType
  extends BinaryType {

  @XmlElement(name = "ImageHeightValue", nillable = true)
  protected List<NonNegativeInteger> imageHeightValue;
  @XmlElement(name = "ImageLocation", nillable = true)
  protected List<LocationType> imageLocation;
  @XmlElement(name = "ImageWidthValue", nillable = true)
  protected List<NonNegativeInteger> imageWidthValue;
  @XmlElement(name = "ImageAugmentationPoint")
  protected List<Object> imageAugmentationPoint;

  public List<NonNegativeInteger> getImageHeightValue() {
    if (imageHeightValue == null) {
      imageHeightValue = new ArrayList<NonNegativeInteger>();
    }
    return this.imageHeightValue;
  }

  public List<LocationType> getImageLocation() {
    if (imageLocation == null) {
      imageLocation = new ArrayList<LocationType>();
    }
    return this.imageLocation;
  }

  public List<NonNegativeInteger> getImageWidthValue() {
    if (imageWidthValue == null) {
      imageWidthValue = new ArrayList<NonNegativeInteger>();
    }
    return this.imageWidthValue;
  }

  public List<Object> getImageAugmentationPoint() {
    if (imageAugmentationPoint == null) {
      imageAugmentationPoint = new ArrayList<Object>();
    }
    return this.imageAugmentationPoint;
  }

}
