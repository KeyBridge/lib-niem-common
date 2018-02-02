package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilitarySummaryType", propOrder = {
  "militaryBranchName",
  "militaryDischargeDate",
  "militaryDischargeCategoryAbstract",
  "militaryExemptionDescriptionText",
  "militaryExperienceIndicator",
  "militaryReleaseDate",
  "militaryReleaseCategoryText",
  "militaryServiceActiveIndicator",
  "militaryServiceTimeMeasure",
  "militaryStatus",
  "militaryCountry",
  "militarySummaryAugmentationPoint"
})
public class MilitarySummaryType
  extends ObjectType {

  @XmlElement(name = "MilitaryBranchName", nillable = true)
  protected List<TextType> militaryBranchName;
  @XmlElement(name = "MilitaryDischargeDate", nillable = true)
  protected List<DateType> militaryDischargeDate;
  @XmlElementRef(name = "MilitaryDischargeCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> militaryDischargeCategoryAbstract;
  @XmlElement(name = "MilitaryExemptionDescriptionText", nillable = true)
  protected List<TextType> militaryExemptionDescriptionText;
  @XmlElement(name = "MilitaryExperienceIndicator", nillable = true)
  protected List<Boolean> militaryExperienceIndicator;
  @XmlElement(name = "MilitaryReleaseDate", nillable = true)
  protected List<DateType> militaryReleaseDate;
  @XmlElement(name = "MilitaryReleaseCategoryText", nillable = true)
  protected List<TextType> militaryReleaseCategoryText;
  @XmlElement(name = "MilitaryServiceActiveIndicator", nillable = true)
  protected List<Boolean> militaryServiceActiveIndicator;
  @XmlElement(name = "MilitaryServiceTimeMeasure", nillable = true)
  protected List<TimeMeasureType> militaryServiceTimeMeasure;
  @XmlElement(name = "MilitaryStatus", nillable = true)
  protected List<StatusType> militaryStatus;
  @XmlElement(name = "MilitaryCountry", nillable = true)
  protected List<CountryType> militaryCountry;
  @XmlElement(name = "MilitarySummaryAugmentationPoint")
  protected List<Object> militarySummaryAugmentationPoint;

  public List<TextType> getMilitaryBranchName() {
    if (militaryBranchName == null) {
      militaryBranchName = new ArrayList<TextType>();
    }
    return this.militaryBranchName;
  }

  public List<DateType> getMilitaryDischargeDate() {
    if (militaryDischargeDate == null) {
      militaryDischargeDate = new ArrayList<DateType>();
    }
    return this.militaryDischargeDate;
  }

  public List<JAXBElement<?>> getMilitaryDischargeCategoryAbstract() {
    if (militaryDischargeCategoryAbstract == null) {
      militaryDischargeCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.militaryDischargeCategoryAbstract;
  }

  public List<TextType> getMilitaryExemptionDescriptionText() {
    if (militaryExemptionDescriptionText == null) {
      militaryExemptionDescriptionText = new ArrayList<TextType>();
    }
    return this.militaryExemptionDescriptionText;
  }

  public List<Boolean> getMilitaryExperienceIndicator() {
    if (militaryExperienceIndicator == null) {
      militaryExperienceIndicator = new ArrayList<Boolean>();
    }
    return this.militaryExperienceIndicator;
  }

  public List<DateType> getMilitaryReleaseDate() {
    if (militaryReleaseDate == null) {
      militaryReleaseDate = new ArrayList<DateType>();
    }
    return this.militaryReleaseDate;
  }

  public List<TextType> getMilitaryReleaseCategoryText() {
    if (militaryReleaseCategoryText == null) {
      militaryReleaseCategoryText = new ArrayList<TextType>();
    }
    return this.militaryReleaseCategoryText;
  }

  public List<Boolean> getMilitaryServiceActiveIndicator() {
    if (militaryServiceActiveIndicator == null) {
      militaryServiceActiveIndicator = new ArrayList<Boolean>();
    }
    return this.militaryServiceActiveIndicator;
  }

  public List<TimeMeasureType> getMilitaryServiceTimeMeasure() {
    if (militaryServiceTimeMeasure == null) {
      militaryServiceTimeMeasure = new ArrayList<TimeMeasureType>();
    }
    return this.militaryServiceTimeMeasure;
  }

  public List<StatusType> getMilitaryStatus() {
    if (militaryStatus == null) {
      militaryStatus = new ArrayList<StatusType>();
    }
    return this.militaryStatus;
  }

  public List<CountryType> getMilitaryCountry() {
    if (militaryCountry == null) {
      militaryCountry = new ArrayList<CountryType>();
    }
    return this.militaryCountry;
  }

  public List<Object> getMilitarySummaryAugmentationPoint() {
    if (militarySummaryAugmentationPoint == null) {
      militarySummaryAugmentationPoint = new ArrayList<Object>();
    }
    return this.militarySummaryAugmentationPoint;
  }

}
