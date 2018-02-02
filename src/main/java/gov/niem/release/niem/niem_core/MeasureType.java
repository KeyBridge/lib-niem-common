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

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
  "measureValueAbstract",
  "measureCommentText",
  "measureDate",
  "measureErrorAbstract",
  "measureUnitAbstract",
  "measurer",
  "measureMethodText",
  "measureEstimatedIndicator",
  "measureAugmentationPoint"
})
@XmlSeeAlso({
  WeightMeasureType.class,
  LocationHeightMeasureType.class,
  VolumeMeasureType.class,
  TimeMeasureType.class,
  LengthMeasureType.class,
  ConsumptionRateMeasureType.class,
  SubstanceMeasureType.class,
  AngularRateMeasureType.class,
  TemperatureMeasureType.class,
  SpeedMeasureType.class,
  AngleMeasureType.class
})
public class MeasureType
  extends ObjectType {

  @XmlElementRef(name = "MeasureValueAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> measureValueAbstract;
  @XmlElement(name = "MeasureCommentText", nillable = true)
  protected List<TextType> measureCommentText;
  @XmlElement(name = "MeasureDate", nillable = true)
  protected List<DateType> measureDate;
  @XmlElementRef(name = "MeasureErrorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> measureErrorAbstract;
  @XmlElementRef(name = "MeasureUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> measureUnitAbstract;
  @XmlElement(name = "Measurer", nillable = true)
  protected List<EntityType> measurer;
  @XmlElement(name = "MeasureMethodText", nillable = true)
  protected List<TextType> measureMethodText;
  @XmlElement(name = "MeasureEstimatedIndicator", nillable = true)
  protected List<Boolean> measureEstimatedIndicator;
  @XmlElement(name = "MeasureAugmentationPoint")
  protected List<Object> measureAugmentationPoint;

  public List<JAXBElement<?>> getMeasureValueAbstract() {
    if (measureValueAbstract == null) {
      measureValueAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.measureValueAbstract;
  }

  public List<TextType> getMeasureCommentText() {
    if (measureCommentText == null) {
      measureCommentText = new ArrayList<TextType>();
    }
    return this.measureCommentText;
  }

  public List<DateType> getMeasureDate() {
    if (measureDate == null) {
      measureDate = new ArrayList<DateType>();
    }
    return this.measureDate;
  }

  public List<JAXBElement<?>> getMeasureErrorAbstract() {
    if (measureErrorAbstract == null) {
      measureErrorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.measureErrorAbstract;
  }

  public List<JAXBElement<?>> getMeasureUnitAbstract() {
    if (measureUnitAbstract == null) {
      measureUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.measureUnitAbstract;
  }

  public List<EntityType> getMeasurer() {
    if (measurer == null) {
      measurer = new ArrayList<EntityType>();
    }
    return this.measurer;
  }

  public List<TextType> getMeasureMethodText() {
    if (measureMethodText == null) {
      measureMethodText = new ArrayList<TextType>();
    }
    return this.measureMethodText;
  }

  public List<Boolean> getMeasureEstimatedIndicator() {
    if (measureEstimatedIndicator == null) {
      measureEstimatedIndicator = new ArrayList<Boolean>();
    }
    return this.measureEstimatedIndicator;
  }

  public List<Object> getMeasureAugmentationPoint() {
    if (measureAugmentationPoint == null) {
      measureAugmentationPoint = new ArrayList<Object>();
    }
    return this.measureAugmentationPoint;
  }

}
