/* 
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
