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
@XmlType(name = "LocationType", propOrder = {
  "locationAddressAbstract",
  "locationArea",
  "locationCategoryAbstract",
  "locationContactInformation",
  "locationDescriptionText",
  "locationGeospatialCoordinateAbstract",
  "locationLandmarkText",
  "locationLocale",
  "locationMapLocation",
  "locationName",
  "locationRangeDescriptionText",
  "locationRelativeLocation",
  "locationSurroundingAreaDescriptionText",
  "locationIdentification",
  "locationHeightAbstract",
  "locationFloorNumberText",
  "locationAugmentationPoint"
})
public class LocationType
  extends ObjectType {

  @XmlElementRef(name = "LocationAddressAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationAddressAbstract;
  @XmlElement(name = "LocationArea", nillable = true)
  protected List<AreaType> locationArea;
  @XmlElementRef(name = "LocationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationCategoryAbstract;
  @XmlElement(name = "LocationContactInformation", nillable = true)
  protected List<ContactInformationType> locationContactInformation;
  @XmlElement(name = "LocationDescriptionText", nillable = true)
  protected List<TextType> locationDescriptionText;
  @XmlElementRef(name = "LocationGeospatialCoordinateAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationGeospatialCoordinateAbstract;
  @XmlElement(name = "LocationLandmarkText", nillable = true)
  protected List<TextType> locationLandmarkText;
  @XmlElement(name = "LocationLocale", nillable = true)
  protected List<LocaleType> locationLocale;
  @XmlElement(name = "LocationMapLocation", nillable = true)
  protected List<MapLocationType> locationMapLocation;
  @XmlElement(name = "LocationName", nillable = true)
  protected List<ProperNameTextType> locationName;
  @XmlElement(name = "LocationRangeDescriptionText", nillable = true)
  protected List<TextType> locationRangeDescriptionText;
  @XmlElement(name = "LocationRelativeLocation", nillable = true)
  protected List<RelativeLocationType> locationRelativeLocation;
  @XmlElement(name = "LocationSurroundingAreaDescriptionText", nillable = true)
  protected List<TextType> locationSurroundingAreaDescriptionText;
  @XmlElement(name = "LocationIdentification", nillable = true)
  protected List<IdentificationType> locationIdentification;
  @XmlElementRef(name = "LocationHeightAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationHeightAbstract;
  @XmlElement(name = "LocationFloorNumberText", nillable = true)
  protected List<TextType> locationFloorNumberText;
  @XmlElement(name = "LocationAugmentationPoint")
  protected List<Object> locationAugmentationPoint;

  public List<JAXBElement<?>> getLocationAddressAbstract() {
    if (locationAddressAbstract == null) {
      locationAddressAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationAddressAbstract;
  }

  public List<AreaType> getLocationArea() {
    if (locationArea == null) {
      locationArea = new ArrayList<AreaType>();
    }
    return this.locationArea;
  }

  public List<JAXBElement<?>> getLocationCategoryAbstract() {
    if (locationCategoryAbstract == null) {
      locationCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationCategoryAbstract;
  }

  public List<ContactInformationType> getLocationContactInformation() {
    if (locationContactInformation == null) {
      locationContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.locationContactInformation;
  }

  public List<TextType> getLocationDescriptionText() {
    if (locationDescriptionText == null) {
      locationDescriptionText = new ArrayList<TextType>();
    }
    return this.locationDescriptionText;
  }

  public List<JAXBElement<?>> getLocationGeospatialCoordinateAbstract() {
    if (locationGeospatialCoordinateAbstract == null) {
      locationGeospatialCoordinateAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationGeospatialCoordinateAbstract;
  }

  public List<TextType> getLocationLandmarkText() {
    if (locationLandmarkText == null) {
      locationLandmarkText = new ArrayList<TextType>();
    }
    return this.locationLandmarkText;
  }

  public List<LocaleType> getLocationLocale() {
    if (locationLocale == null) {
      locationLocale = new ArrayList<LocaleType>();
    }
    return this.locationLocale;
  }

  public List<MapLocationType> getLocationMapLocation() {
    if (locationMapLocation == null) {
      locationMapLocation = new ArrayList<MapLocationType>();
    }
    return this.locationMapLocation;
  }

  public List<ProperNameTextType> getLocationName() {
    if (locationName == null) {
      locationName = new ArrayList<ProperNameTextType>();
    }
    return this.locationName;
  }

  public List<TextType> getLocationRangeDescriptionText() {
    if (locationRangeDescriptionText == null) {
      locationRangeDescriptionText = new ArrayList<TextType>();
    }
    return this.locationRangeDescriptionText;
  }

  public List<RelativeLocationType> getLocationRelativeLocation() {
    if (locationRelativeLocation == null) {
      locationRelativeLocation = new ArrayList<RelativeLocationType>();
    }
    return this.locationRelativeLocation;
  }

  public List<TextType> getLocationSurroundingAreaDescriptionText() {
    if (locationSurroundingAreaDescriptionText == null) {
      locationSurroundingAreaDescriptionText = new ArrayList<TextType>();
    }
    return this.locationSurroundingAreaDescriptionText;
  }

  public List<IdentificationType> getLocationIdentification() {
    if (locationIdentification == null) {
      locationIdentification = new ArrayList<IdentificationType>();
    }
    return this.locationIdentification;
  }

  public List<JAXBElement<?>> getLocationHeightAbstract() {
    if (locationHeightAbstract == null) {
      locationHeightAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationHeightAbstract;
  }

  public List<TextType> getLocationFloorNumberText() {
    if (locationFloorNumberText == null) {
      locationFloorNumberText = new ArrayList<TextType>();
    }
    return this.locationFloorNumberText;
  }

  public List<Object> getLocationAugmentationPoint() {
    if (locationAugmentationPoint == null) {
      locationAugmentationPoint = new ArrayList<Object>();
    }
    return this.locationAugmentationPoint;
  }

}
