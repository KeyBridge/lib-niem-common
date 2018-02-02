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
@XmlType(name = "RelativeLocationType", propOrder = {
  "relativeLocationDescriptionText",
  "relativeLocationDirectionAbstract",
  "relativeLocationDistanceMeasure",
  "relativeLocationHeadingValue",
  "relativeLocationReferencePoint",
  "relativeLocationAugmentationPoint"
})
public class RelativeLocationType
  extends ObjectType {

  @XmlElement(name = "RelativeLocationDescriptionText", nillable = true)
  protected List<TextType> relativeLocationDescriptionText;
  @XmlElementRef(name = "RelativeLocationDirectionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> relativeLocationDirectionAbstract;
  @XmlElement(name = "RelativeLocationDistanceMeasure", nillable = true)
  protected List<LengthMeasureType> relativeLocationDistanceMeasure;
  @XmlElement(name = "RelativeLocationHeadingValue", nillable = true)
  protected List<RelativeLocationHeadingType> relativeLocationHeadingValue;
  @XmlElement(name = "RelativeLocationReferencePoint", nillable = true)
  protected List<LocationType> relativeLocationReferencePoint;
  @XmlElement(name = "RelativeLocationAugmentationPoint")
  protected List<Object> relativeLocationAugmentationPoint;

  public List<TextType> getRelativeLocationDescriptionText() {
    if (relativeLocationDescriptionText == null) {
      relativeLocationDescriptionText = new ArrayList<TextType>();
    }
    return this.relativeLocationDescriptionText;
  }

  public List<JAXBElement<?>> getRelativeLocationDirectionAbstract() {
    if (relativeLocationDirectionAbstract == null) {
      relativeLocationDirectionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.relativeLocationDirectionAbstract;
  }

  public List<LengthMeasureType> getRelativeLocationDistanceMeasure() {
    if (relativeLocationDistanceMeasure == null) {
      relativeLocationDistanceMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.relativeLocationDistanceMeasure;
  }

  public List<RelativeLocationHeadingType> getRelativeLocationHeadingValue() {
    if (relativeLocationHeadingValue == null) {
      relativeLocationHeadingValue = new ArrayList<RelativeLocationHeadingType>();
    }
    return this.relativeLocationHeadingValue;
  }

  public List<LocationType> getRelativeLocationReferencePoint() {
    if (relativeLocationReferencePoint == null) {
      relativeLocationReferencePoint = new ArrayList<LocationType>();
    }
    return this.relativeLocationReferencePoint;
  }

  public List<Object> getRelativeLocationAugmentationPoint() {
    if (relativeLocationAugmentationPoint == null) {
      relativeLocationAugmentationPoint = new ArrayList<Object>();
    }
    return this.relativeLocationAugmentationPoint;
  }

}
