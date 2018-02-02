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
@XmlType(name = "BearingType", propOrder = {
  "azimuthAbstract",
  "inclinationAbstract",
  "bearingAugmentationPoint"
})
public class BearingType
  extends ObjectType {

  @XmlElementRef(name = "AzimuthAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> azimuthAbstract;
  @XmlElementRef(name = "InclinationAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> inclinationAbstract;
  @XmlElement(name = "BearingAugmentationPoint")
  protected List<Object> bearingAugmentationPoint;

  public List<JAXBElement<?>> getAzimuthAbstract() {
    if (azimuthAbstract == null) {
      azimuthAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.azimuthAbstract;
  }

  public List<JAXBElement<?>> getInclinationAbstract() {
    if (inclinationAbstract == null) {
      inclinationAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.inclinationAbstract;
  }

  public List<Object> getBearingAugmentationPoint() {
    if (bearingAugmentationPoint == null) {
      bearingAugmentationPoint = new ArrayList<Object>();
    }
    return this.bearingAugmentationPoint;
  }

}
