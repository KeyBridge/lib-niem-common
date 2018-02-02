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
@XmlType(name = "CountryType", propOrder = {
  "countryRepresentation",
  "countryAugmentationPoint"
})
public class CountryType
  extends ObjectType {

  @XmlElementRef(name = "CountryRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> countryRepresentation;
  @XmlElement(name = "CountryAugmentationPoint")
  protected List<Object> countryAugmentationPoint;

  public List<JAXBElement<?>> getCountryRepresentation() {
    if (countryRepresentation == null) {
      countryRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.countryRepresentation;
  }

  public List<Object> getCountryAugmentationPoint() {
    if (countryAugmentationPoint == null) {
      countryAugmentationPoint = new ArrayList<Object>();
    }
    return this.countryAugmentationPoint;
  }

}
