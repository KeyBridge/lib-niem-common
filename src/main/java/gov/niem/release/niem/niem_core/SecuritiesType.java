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
@XmlType(name = "SecuritiesType", propOrder = {
  "securitiesCollectionDateRange",
  "securitiesDateSeriesAbstract",
  "securitiesDenominationAbstract",
  "securitiesCategoryAbstract",
  "securitiesIssuer",
  "securitiesAugmentationPoint"
})
public class SecuritiesType
  extends ItemType {

  @XmlElement(name = "SecuritiesCollectionDateRange", nillable = true)
  protected List<DateRangeType> securitiesCollectionDateRange;
  @XmlElementRef(name = "SecuritiesDateSeriesAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> securitiesDateSeriesAbstract;
  @XmlElementRef(name = "SecuritiesDenominationAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> securitiesDenominationAbstract;
  @XmlElement(name = "SecuritiesCategoryAbstract")
  protected List<Object> securitiesCategoryAbstract;
  @XmlElement(name = "SecuritiesIssuer", nillable = true)
  protected List<EntityType> securitiesIssuer;
  @XmlElement(name = "SecuritiesAugmentationPoint")
  protected List<Object> securitiesAugmentationPoint;

  public List<DateRangeType> getSecuritiesCollectionDateRange() {
    if (securitiesCollectionDateRange == null) {
      securitiesCollectionDateRange = new ArrayList<DateRangeType>();
    }
    return this.securitiesCollectionDateRange;
  }

  public List<JAXBElement<?>> getSecuritiesDateSeriesAbstract() {
    if (securitiesDateSeriesAbstract == null) {
      securitiesDateSeriesAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.securitiesDateSeriesAbstract;
  }

  public List<JAXBElement<?>> getSecuritiesDenominationAbstract() {
    if (securitiesDenominationAbstract == null) {
      securitiesDenominationAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.securitiesDenominationAbstract;
  }

  public List<Object> getSecuritiesCategoryAbstract() {
    if (securitiesCategoryAbstract == null) {
      securitiesCategoryAbstract = new ArrayList<Object>();
    }
    return this.securitiesCategoryAbstract;
  }

  public List<EntityType> getSecuritiesIssuer() {
    if (securitiesIssuer == null) {
      securitiesIssuer = new ArrayList<EntityType>();
    }
    return this.securitiesIssuer;
  }

  public List<Object> getSecuritiesAugmentationPoint() {
    if (securitiesAugmentationPoint == null) {
      securitiesAugmentationPoint = new ArrayList<Object>();
    }
    return this.securitiesAugmentationPoint;
  }

}
