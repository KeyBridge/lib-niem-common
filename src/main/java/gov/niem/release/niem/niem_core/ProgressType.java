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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressType", propOrder = {
  "progressComplianceIndicator",
  "progressComplianceText",
  "progressPaymentAmount",
  "progressTimeQuantityText",
  "progressAugmentationPoint"
})
public class ProgressType
  extends ActivityType {

  @XmlElement(name = "ProgressComplianceIndicator", nillable = true)
  protected List<Boolean> progressComplianceIndicator;
  @XmlElement(name = "ProgressComplianceText", nillable = true)
  protected List<TextType> progressComplianceText;
  @XmlElement(name = "ProgressPaymentAmount", nillable = true)
  protected List<AmountType> progressPaymentAmount;
  @XmlElement(name = "ProgressTimeQuantityText", nillable = true)
  protected List<TextType> progressTimeQuantityText;
  @XmlElement(name = "ProgressAugmentationPoint")
  protected List<Object> progressAugmentationPoint;

  public List<Boolean> getProgressComplianceIndicator() {
    if (progressComplianceIndicator == null) {
      progressComplianceIndicator = new ArrayList<Boolean>();
    }
    return this.progressComplianceIndicator;
  }

  public List<TextType> getProgressComplianceText() {
    if (progressComplianceText == null) {
      progressComplianceText = new ArrayList<TextType>();
    }
    return this.progressComplianceText;
  }

  public List<AmountType> getProgressPaymentAmount() {
    if (progressPaymentAmount == null) {
      progressPaymentAmount = new ArrayList<AmountType>();
    }
    return this.progressPaymentAmount;
  }

  public List<TextType> getProgressTimeQuantityText() {
    if (progressTimeQuantityText == null) {
      progressTimeQuantityText = new ArrayList<TextType>();
    }
    return this.progressTimeQuantityText;
  }

  public List<Object> getProgressAugmentationPoint() {
    if (progressAugmentationPoint == null) {
      progressAugmentationPoint = new ArrayList<Object>();
    }
    return this.progressAugmentationPoint;
  }

}
