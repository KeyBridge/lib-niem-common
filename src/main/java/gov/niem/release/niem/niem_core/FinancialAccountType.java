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
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountType", propOrder = {
  "financialAccountCategoryText",
  "financialAccountListedName",
  "financialAccountNumberID",
  "financialAccountPresentBalanceAmount",
  "financialAccountClosedIndicator",
  "financialAccountHolder",
  "financialAccountAugmentationPoint"
})
public class FinancialAccountType
  extends ObjectType {

  @XmlElement(name = "FinancialAccountCategoryText", nillable = true)
  protected List<TextType> financialAccountCategoryText;
  @XmlElement(name = "FinancialAccountListedName", nillable = true)
  protected List<TextType> financialAccountListedName;
  @XmlElement(name = "FinancialAccountNumberID", nillable = true)
  protected List<String> financialAccountNumberID;
  @XmlElement(name = "FinancialAccountPresentBalanceAmount", nillable = true)
  protected List<AmountType> financialAccountPresentBalanceAmount;
  @XmlElement(name = "FinancialAccountClosedIndicator", nillable = true)
  protected List<Boolean> financialAccountClosedIndicator;
  @XmlElement(name = "FinancialAccountHolder", nillable = true)
  protected List<FinancialAccountHolderType> financialAccountHolder;
  @XmlElement(name = "FinancialAccountAugmentationPoint")
  protected List<Object> financialAccountAugmentationPoint;

  public List<TextType> getFinancialAccountCategoryText() {
    if (financialAccountCategoryText == null) {
      financialAccountCategoryText = new ArrayList<TextType>();
    }
    return this.financialAccountCategoryText;
  }

  public List<TextType> getFinancialAccountListedName() {
    if (financialAccountListedName == null) {
      financialAccountListedName = new ArrayList<TextType>();
    }
    return this.financialAccountListedName;
  }

  public List<String> getFinancialAccountNumberID() {
    if (financialAccountNumberID == null) {
      financialAccountNumberID = new ArrayList<String>();
    }
    return this.financialAccountNumberID;
  }

  public List<AmountType> getFinancialAccountPresentBalanceAmount() {
    if (financialAccountPresentBalanceAmount == null) {
      financialAccountPresentBalanceAmount = new ArrayList<AmountType>();
    }
    return this.financialAccountPresentBalanceAmount;
  }

  public List<Boolean> getFinancialAccountClosedIndicator() {
    if (financialAccountClosedIndicator == null) {
      financialAccountClosedIndicator = new ArrayList<Boolean>();
    }
    return this.financialAccountClosedIndicator;
  }

  public List<FinancialAccountHolderType> getFinancialAccountHolder() {
    if (financialAccountHolder == null) {
      financialAccountHolder = new ArrayList<FinancialAccountHolderType>();
    }
    return this.financialAccountHolder;
  }

  public List<Object> getFinancialAccountAugmentationPoint() {
    if (financialAccountAugmentationPoint == null) {
      financialAccountAugmentationPoint = new ArrayList<Object>();
    }
    return this.financialAccountAugmentationPoint;
  }

}
