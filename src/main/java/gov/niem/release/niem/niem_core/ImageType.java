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

import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
  "imageHeightValue",
  "imageLocation",
  "imageWidthValue",
  "imageAugmentationPoint"
})
public class ImageType
  extends BinaryType {

  @XmlElement(name = "ImageHeightValue", nillable = true)
  protected List<NonNegativeInteger> imageHeightValue;
  @XmlElement(name = "ImageLocation", nillable = true)
  protected List<LocationType> imageLocation;
  @XmlElement(name = "ImageWidthValue", nillable = true)
  protected List<NonNegativeInteger> imageWidthValue;
  @XmlElement(name = "ImageAugmentationPoint")
  protected List<Object> imageAugmentationPoint;

  public List<NonNegativeInteger> getImageHeightValue() {
    if (imageHeightValue == null) {
      imageHeightValue = new ArrayList<NonNegativeInteger>();
    }
    return this.imageHeightValue;
  }

  public List<LocationType> getImageLocation() {
    if (imageLocation == null) {
      imageLocation = new ArrayList<LocationType>();
    }
    return this.imageLocation;
  }

  public List<NonNegativeInteger> getImageWidthValue() {
    if (imageWidthValue == null) {
      imageWidthValue = new ArrayList<NonNegativeInteger>();
    }
    return this.imageWidthValue;
  }

  public List<Object> getImageAugmentationPoint() {
    if (imageAugmentationPoint == null) {
      imageAugmentationPoint = new ArrayList<Object>();
    }
    return this.imageAugmentationPoint;
  }

}
