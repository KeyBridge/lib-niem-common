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
@XmlType(name = "ManifestType", propOrder = {
  "manifestCategoryAbstract",
  "manifestTransmittedDate",
  "manifestAugmentationPoint"
})
public class ManifestType
  extends DocumentType {

  @XmlElementRef(name = "ManifestCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> manifestCategoryAbstract;
  @XmlElement(name = "ManifestTransmittedDate", nillable = true)
  protected List<DateType> manifestTransmittedDate;
  @XmlElement(name = "ManifestAugmentationPoint")
  protected List<Object> manifestAugmentationPoint;

  public List<JAXBElement<?>> getManifestCategoryAbstract() {
    if (manifestCategoryAbstract == null) {
      manifestCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.manifestCategoryAbstract;
  }

  public List<DateType> getManifestTransmittedDate() {
    if (manifestTransmittedDate == null) {
      manifestTransmittedDate = new ArrayList<DateType>();
    }
    return this.manifestTransmittedDate;
  }

  public List<Object> getManifestAugmentationPoint() {
    if (manifestAugmentationPoint == null) {
      manifestAugmentationPoint = new ArrayList<Object>();
    }
    return this.manifestAugmentationPoint;
  }

}
