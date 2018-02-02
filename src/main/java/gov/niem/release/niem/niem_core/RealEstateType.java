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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateType", propOrder = {
  "realEstateAcreageText",
  "realEstateBoundaryDescriptionText",
  "realEstateAttachedFacility",
  "realEstateAugmentationPoint"
})
public class RealEstateType
  extends ItemType {

  @XmlElement(name = "RealEstateAcreageText", nillable = true)
  protected List<TextType> realEstateAcreageText;
  @XmlElement(name = "RealEstateBoundaryDescriptionText", nillable = true)
  protected List<TextType> realEstateBoundaryDescriptionText;
  @XmlElement(name = "RealEstateAttachedFacility", nillable = true)
  protected List<FacilityType> realEstateAttachedFacility;
  @XmlElement(name = "RealEstateAugmentationPoint")
  protected List<Object> realEstateAugmentationPoint;

  public List<TextType> getRealEstateAcreageText() {
    if (realEstateAcreageText == null) {
      realEstateAcreageText = new ArrayList<TextType>();
    }
    return this.realEstateAcreageText;
  }

  public List<TextType> getRealEstateBoundaryDescriptionText() {
    if (realEstateBoundaryDescriptionText == null) {
      realEstateBoundaryDescriptionText = new ArrayList<TextType>();
    }
    return this.realEstateBoundaryDescriptionText;
  }

  public List<FacilityType> getRealEstateAttachedFacility() {
    if (realEstateAttachedFacility == null) {
      realEstateAttachedFacility = new ArrayList<FacilityType>();
    }
    return this.realEstateAttachedFacility;
  }

  public List<Object> getRealEstateAugmentationPoint() {
    if (realEstateAugmentationPoint == null) {
      realEstateAugmentationPoint = new ArrayList<Object>();
    }
    return this.realEstateAugmentationPoint;
  }

}
