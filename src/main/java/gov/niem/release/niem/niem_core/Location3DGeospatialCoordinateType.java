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
