package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.GYear;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiscalYearDateType")
public class FiscalYearDateType
  extends GYear {

  @XmlAttribute(name = "fiscalYearStartDate", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar fiscalYearStartDate;

  public XMLGregorianCalendar getFiscalYearStartDate() {
    return fiscalYearStartDate;
  }

  public void setFiscalYearStartDate(XMLGregorianCalendar value) {
    this.fiscalYearStartDate = value;
  }

}
