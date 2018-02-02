package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location2DGeospatialCoordinateType", propOrder = {
  "geographicDatumAbstract",
  "geographicCoordinateLatitude",
  "geographicCoordinateLongitude",
  "location2DGeospatialCoordinateAugmentationPoint"
})
@XmlSeeAlso({
  Location3DGeospatialCoordinateType.class
})
public class Location2DGeospatialCoordinateType
  extends ObjectType {

  @XmlElementRef(name = "GeographicDatumAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected JAXBElement<?> geographicDatumAbstract;
  @XmlElement(name = "GeographicCoordinateLatitude", required = true, nillable = true)
  protected LatitudeCoordinateType geographicCoordinateLatitude;
  @XmlElement(name = "GeographicCoordinateLongitude", required = true, nillable = true)
  protected LongitudeCoordinateType geographicCoordinateLongitude;
  @XmlElement(name = "Location2DGeospatialCoordinateAugmentationPoint")
  protected List<Object> location2DGeospatialCoordinateAugmentationPoint;

  public JAXBElement<?> getGeographicDatumAbstract() {
    return geographicDatumAbstract;
  }

  public void setGeographicDatumAbstract(JAXBElement<?> value) {
    this.geographicDatumAbstract = value;
  }

  public LatitudeCoordinateType getGeographicCoordinateLatitude() {
    return geographicCoordinateLatitude;
  }

  public void setGeographicCoordinateLatitude(LatitudeCoordinateType value) {
    this.geographicCoordinateLatitude = value;
  }

  public LongitudeCoordinateType getGeographicCoordinateLongitude() {
    return geographicCoordinateLongitude;
  }

  public void setGeographicCoordinateLongitude(LongitudeCoordinateType value) {
    this.geographicCoordinateLongitude = value;
  }

  public List<Object> getLocation2DGeospatialCoordinateAugmentationPoint() {
    if (location2DGeospatialCoordinateAugmentationPoint == null) {
      location2DGeospatialCoordinateAugmentationPoint = new ArrayList<Object>();
    }
    return this.location2DGeospatialCoordinateAugmentationPoint;
  }

}
