package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location3DGeospatialCoordinateType", propOrder = {
  "locationHeightAbstract",
  "location3DGeospatialCoordinateAugmentationPoint"
})
public class Location3DGeospatialCoordinateType
  extends Location2DGeospatialCoordinateType {

  @XmlElementRef(name = "LocationHeightAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationHeightAbstract;
  @XmlElement(name = "Location3DGeospatialCoordinateAugmentationPoint")
  protected List<Object> location3DGeospatialCoordinateAugmentationPoint;

  public List<JAXBElement<?>> getLocationHeightAbstract() {
    if (locationHeightAbstract == null) {
      locationHeightAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationHeightAbstract;
  }

  public List<Object> getLocation3DGeospatialCoordinateAugmentationPoint() {
    if (location3DGeospatialCoordinateAugmentationPoint == null) {
      location3DGeospatialCoordinateAugmentationPoint = new ArrayList<Object>();
    }
    return this.location3DGeospatialCoordinateAugmentationPoint;
  }

}
