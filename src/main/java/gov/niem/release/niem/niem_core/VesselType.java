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
@XmlType(name = "VesselType", propOrder = {
  "vesselMakeAbstract",
  "vesselCategoryAbstract",
  "vesselHullIdentification",
  "vesselHullMaterialAbstract",
  "vesselHullShapeAbstract",
  "vesselPropulsionAbstract",
  "vesselTrailer",
  "vesselAugmentationPoint"
})
public class VesselType
  extends ConveyanceType {

  @XmlElement(name = "VesselMakeAbstract")
  protected List<Object> vesselMakeAbstract;
  @XmlElement(name = "VesselCategoryAbstract")
  protected List<Object> vesselCategoryAbstract;
  @XmlElement(name = "VesselHullIdentification", nillable = true)
  protected List<IdentificationType> vesselHullIdentification;
  @XmlElementRef(name = "VesselHullMaterialAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselHullMaterialAbstract;
  @XmlElementRef(name = "VesselHullShapeAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselHullShapeAbstract;
  @XmlElementRef(name = "VesselPropulsionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselPropulsionAbstract;
  @XmlElement(name = "VesselTrailer", nillable = true)
  protected List<VehicleType> vesselTrailer;
  @XmlElement(name = "VesselAugmentationPoint")
  protected List<Object> vesselAugmentationPoint;

  public List<Object> getVesselMakeAbstract() {
    if (vesselMakeAbstract == null) {
      vesselMakeAbstract = new ArrayList<Object>();
    }
    return this.vesselMakeAbstract;
  }

  public List<Object> getVesselCategoryAbstract() {
    if (vesselCategoryAbstract == null) {
      vesselCategoryAbstract = new ArrayList<Object>();
    }
    return this.vesselCategoryAbstract;
  }

  public List<IdentificationType> getVesselHullIdentification() {
    if (vesselHullIdentification == null) {
      vesselHullIdentification = new ArrayList<IdentificationType>();
    }
    return this.vesselHullIdentification;
  }

  public List<JAXBElement<?>> getVesselHullMaterialAbstract() {
    if (vesselHullMaterialAbstract == null) {
      vesselHullMaterialAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselHullMaterialAbstract;
  }

  public List<JAXBElement<?>> getVesselHullShapeAbstract() {
    if (vesselHullShapeAbstract == null) {
      vesselHullShapeAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselHullShapeAbstract;
  }

  public List<JAXBElement<?>> getVesselPropulsionAbstract() {
    if (vesselPropulsionAbstract == null) {
      vesselPropulsionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselPropulsionAbstract;
  }

  public List<VehicleType> getVesselTrailer() {
    if (vesselTrailer == null) {
      vesselTrailer = new ArrayList<VehicleType>();
    }
    return this.vesselTrailer;
  }

  public List<Object> getVesselAugmentationPoint() {
    if (vesselAugmentationPoint == null) {
      vesselAugmentationPoint = new ArrayList<Object>();
    }
    return this.vesselAugmentationPoint;
  }

}
