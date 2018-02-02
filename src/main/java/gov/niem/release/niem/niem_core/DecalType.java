package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.GMonth;
import gov.niem.release.niem.proxy.xsd.GYear;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecalType", propOrder = {
  "decalID",
  "decalColorText",
  "decalPeriodAbstract",
  "decalYearDate",
  "decalMonthDate",
  "decalAugmentationPoint"
})
public class DecalType
  extends ObjectType {

  @XmlElement(name = "DecalID", nillable = true)
  protected List<String> decalID;
  @XmlElement(name = "DecalColorText", nillable = true)
  protected List<TextType> decalColorText;
  @XmlElementRef(name = "DecalPeriodAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> decalPeriodAbstract;
  @XmlElement(name = "DecalYearDate", nillable = true)
  protected List<GYear> decalYearDate;
  @XmlElement(name = "DecalMonthDate", nillable = true)
  protected List<GMonth> decalMonthDate;
  @XmlElement(name = "DecalAugmentationPoint")
  protected List<Object> decalAugmentationPoint;

  public List<String> getDecalID() {
    if (decalID == null) {
      decalID = new ArrayList<String>();
    }
    return this.decalID;
  }

  public List<TextType> getDecalColorText() {
    if (decalColorText == null) {
      decalColorText = new ArrayList<TextType>();
    }
    return this.decalColorText;
  }

  public List<JAXBElement<?>> getDecalPeriodAbstract() {
    if (decalPeriodAbstract == null) {
      decalPeriodAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.decalPeriodAbstract;
  }

  public List<GYear> getDecalYearDate() {
    if (decalYearDate == null) {
      decalYearDate = new ArrayList<GYear>();
    }
    return this.decalYearDate;
  }

  public List<GMonth> getDecalMonthDate() {
    if (decalMonthDate == null) {
      decalMonthDate = new ArrayList<GMonth>();
    }
    return this.decalMonthDate;
  }

  public List<Object> getDecalAugmentationPoint() {
    if (decalAugmentationPoint == null) {
      decalAugmentationPoint = new ArrayList<Object>();
    }
    return this.decalAugmentationPoint;
  }

}
