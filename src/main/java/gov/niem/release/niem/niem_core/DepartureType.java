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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureType", propOrder = {
  "departureDate",
  "departureEstimatedDate",
  "departureLocation",
  "departureAugmentationPoint"
})
public class DepartureType
  extends ObjectType {

  @XmlElement(name = "DepartureDate", nillable = true)
  protected List<DateType> departureDate;
  @XmlElement(name = "DepartureEstimatedDate", nillable = true)
  protected List<DateType> departureEstimatedDate;
  @XmlElement(name = "DepartureLocation", nillable = true)
  protected List<LocationType> departureLocation;
  @XmlElement(name = "DepartureAugmentationPoint")
  protected List<Object> departureAugmentationPoint;

  public List<DateType> getDepartureDate() {
    if (departureDate == null) {
      departureDate = new ArrayList<DateType>();
    }
    return this.departureDate;
  }

  public List<DateType> getDepartureEstimatedDate() {
    if (departureEstimatedDate == null) {
      departureEstimatedDate = new ArrayList<DateType>();
    }
    return this.departureEstimatedDate;
  }

  public List<LocationType> getDepartureLocation() {
    if (departureLocation == null) {
      departureLocation = new ArrayList<LocationType>();
    }
    return this.departureLocation;
  }

  public List<Object> getDepartureAugmentationPoint() {
    if (departureAugmentationPoint == null) {
      departureAugmentationPoint = new ArrayList<Object>();
    }
    return this.departureAugmentationPoint;
  }

}
