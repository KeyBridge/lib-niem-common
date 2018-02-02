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
import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", propOrder = {
  "vehicleCMVIndicator",
  "vehicleColorInteriorText",
  "vehicleDoorQuantity",
  "vehicleIdentification",
  "vehicleMakeAbstract",
  "vehicleModelAbstract",
  "vehicleMSRPAmount",
  "vehicleOdometerReadingMeasure",
  "vehiclePassengerSafeQuantity",
  "vehicleSeatingQuantity",
  "vehicleTransmissionCategoryAbstract",
  "vehicleAxleQuantity",
  "vehicleCurrentWeightMeasure",
  "vehicleGrossLadenSumWeightMeasure",
  "vehicleGrossLadenUnitWeightMeasure",
  "vehicleMaximumLoadWeightMeasure",
  "vehicleUnladenWeightMeasure",
  "vehicleAugmentationPoint"
})
public class VehicleType
  extends ConveyanceType {

  @XmlElement(name = "VehicleCMVIndicator", nillable = true)
  protected List<Boolean> vehicleCMVIndicator;
  @XmlElement(name = "VehicleColorInteriorText", nillable = true)
  protected List<TextType> vehicleColorInteriorText;
  @XmlElement(name = "VehicleDoorQuantity", nillable = true)
  protected List<NonNegativeInteger> vehicleDoorQuantity;
  @XmlElement(name = "VehicleIdentification", nillable = true)
  protected List<IdentificationType> vehicleIdentification;
  @XmlElement(name = "VehicleMakeAbstract")
  protected List<Object> vehicleMakeAbstract;
  @XmlElement(name = "VehicleModelAbstract")
  protected List<Object> vehicleModelAbstract;
  @XmlElement(name = "VehicleMSRPAmount", nillable = true)
  protected List<AmountType> vehicleMSRPAmount;
  @XmlElement(name = "VehicleOdometerReadingMeasure", nillable = true)
  protected List<LengthMeasureType> vehicleOdometerReadingMeasure;
  @XmlElement(name = "VehiclePassengerSafeQuantity", nillable = true)
  protected List<NonNegativeInteger> vehiclePassengerSafeQuantity;
  @XmlElement(name = "VehicleSeatingQuantity", nillable = true)
  protected List<NonNegativeInteger> vehicleSeatingQuantity;
  @XmlElementRef(name = "VehicleTransmissionCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vehicleTransmissionCategoryAbstract;
  @XmlElement(name = "VehicleAxleQuantity", nillable = true)
  protected List<NonNegativeInteger> vehicleAxleQuantity;
  @XmlElement(name = "VehicleCurrentWeightMeasure", nillable = true)
  protected List<WeightMeasureType> vehicleCurrentWeightMeasure;
  @XmlElement(name = "VehicleGrossLadenSumWeightMeasure", nillable = true)
  protected List<WeightMeasureType> vehicleGrossLadenSumWeightMeasure;
  @XmlElement(name = "VehicleGrossLadenUnitWeightMeasure", nillable = true)
  protected List<WeightMeasureType> vehicleGrossLadenUnitWeightMeasure;
  @XmlElement(name = "VehicleMaximumLoadWeightMeasure", nillable = true)
  protected List<WeightMeasureType> vehicleMaximumLoadWeightMeasure;
  @XmlElement(name = "VehicleUnladenWeightMeasure", nillable = true)
  protected List<WeightMeasureType> vehicleUnladenWeightMeasure;
  @XmlElement(name = "VehicleAugmentationPoint")
  protected List<Object> vehicleAugmentationPoint;

  public List<Boolean> getVehicleCMVIndicator() {
    if (vehicleCMVIndicator == null) {
      vehicleCMVIndicator = new ArrayList<Boolean>();
    }
    return this.vehicleCMVIndicator;
  }

  public List<TextType> getVehicleColorInteriorText() {
    if (vehicleColorInteriorText == null) {
      vehicleColorInteriorText = new ArrayList<TextType>();
    }
    return this.vehicleColorInteriorText;
  }

  public List<NonNegativeInteger> getVehicleDoorQuantity() {
    if (vehicleDoorQuantity == null) {
      vehicleDoorQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.vehicleDoorQuantity;
  }

  public List<IdentificationType> getVehicleIdentification() {
    if (vehicleIdentification == null) {
      vehicleIdentification = new ArrayList<IdentificationType>();
    }
    return this.vehicleIdentification;
  }

  public List<Object> getVehicleMakeAbstract() {
    if (vehicleMakeAbstract == null) {
      vehicleMakeAbstract = new ArrayList<Object>();
    }
    return this.vehicleMakeAbstract;
  }

  public List<Object> getVehicleModelAbstract() {
    if (vehicleModelAbstract == null) {
      vehicleModelAbstract = new ArrayList<Object>();
    }
    return this.vehicleModelAbstract;
  }

  public List<AmountType> getVehicleMSRPAmount() {
    if (vehicleMSRPAmount == null) {
      vehicleMSRPAmount = new ArrayList<AmountType>();
    }
    return this.vehicleMSRPAmount;
  }

  public List<LengthMeasureType> getVehicleOdometerReadingMeasure() {
    if (vehicleOdometerReadingMeasure == null) {
      vehicleOdometerReadingMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.vehicleOdometerReadingMeasure;
  }

  public List<NonNegativeInteger> getVehiclePassengerSafeQuantity() {
    if (vehiclePassengerSafeQuantity == null) {
      vehiclePassengerSafeQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.vehiclePassengerSafeQuantity;
  }

  public List<NonNegativeInteger> getVehicleSeatingQuantity() {
    if (vehicleSeatingQuantity == null) {
      vehicleSeatingQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.vehicleSeatingQuantity;
  }

  public List<JAXBElement<?>> getVehicleTransmissionCategoryAbstract() {
    if (vehicleTransmissionCategoryAbstract == null) {
      vehicleTransmissionCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vehicleTransmissionCategoryAbstract;
  }

  public List<NonNegativeInteger> getVehicleAxleQuantity() {
    if (vehicleAxleQuantity == null) {
      vehicleAxleQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.vehicleAxleQuantity;
  }

  public List<WeightMeasureType> getVehicleCurrentWeightMeasure() {
    if (vehicleCurrentWeightMeasure == null) {
      vehicleCurrentWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.vehicleCurrentWeightMeasure;
  }

  public List<WeightMeasureType> getVehicleGrossLadenSumWeightMeasure() {
    if (vehicleGrossLadenSumWeightMeasure == null) {
      vehicleGrossLadenSumWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.vehicleGrossLadenSumWeightMeasure;
  }

  public List<WeightMeasureType> getVehicleGrossLadenUnitWeightMeasure() {
    if (vehicleGrossLadenUnitWeightMeasure == null) {
      vehicleGrossLadenUnitWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.vehicleGrossLadenUnitWeightMeasure;
  }

  public List<WeightMeasureType> getVehicleMaximumLoadWeightMeasure() {
    if (vehicleMaximumLoadWeightMeasure == null) {
      vehicleMaximumLoadWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.vehicleMaximumLoadWeightMeasure;
  }

  public List<WeightMeasureType> getVehicleUnladenWeightMeasure() {
    if (vehicleUnladenWeightMeasure == null) {
      vehicleUnladenWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.vehicleUnladenWeightMeasure;
  }

  public List<Object> getVehicleAugmentationPoint() {
    if (vehicleAugmentationPoint == null) {
      vehicleAugmentationPoint = new ArrayList<Object>();
    }
    return this.vehicleAugmentationPoint;
  }

}
