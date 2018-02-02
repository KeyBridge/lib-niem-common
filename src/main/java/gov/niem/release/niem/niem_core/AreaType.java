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
@XmlType(name = "AreaType", propOrder = {
  "areaDescriptionText",
  "areaGeographicAbstract",
  "areaRegionAbstract",
  "areaAugmentationPoint"
})
public class AreaType
  extends ObjectType {

  @XmlElement(name = "AreaDescriptionText", nillable = true)
  protected List<TextType> areaDescriptionText;
  @XmlElement(name = "AreaGeographicAbstract")
  protected List<Object> areaGeographicAbstract;
  @XmlElementRef(name = "AreaRegionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> areaRegionAbstract;
  @XmlElement(name = "AreaAugmentationPoint")
  protected List<Object> areaAugmentationPoint;

  public List<TextType> getAreaDescriptionText() {
    if (areaDescriptionText == null) {
      areaDescriptionText = new ArrayList<TextType>();
    }
    return this.areaDescriptionText;
  }

  public List<Object> getAreaGeographicAbstract() {
    if (areaGeographicAbstract == null) {
      areaGeographicAbstract = new ArrayList<Object>();
    }
    return this.areaGeographicAbstract;
  }

  public List<JAXBElement<?>> getAreaRegionAbstract() {
    if (areaRegionAbstract == null) {
      areaRegionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.areaRegionAbstract;
  }

  public List<Object> getAreaAugmentationPoint() {
    if (areaAugmentationPoint == null) {
      areaAugmentationPoint = new ArrayList<Object>();
    }
    return this.areaAugmentationPoint;
  }

}
