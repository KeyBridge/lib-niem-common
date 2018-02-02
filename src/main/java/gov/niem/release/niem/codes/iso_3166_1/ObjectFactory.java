package gov.niem.release.niem.codes.iso_3166_1;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

  public ObjectFactory() {
  }

  public CountryAlpha2CodeType createCountryAlpha2CodeType() {
    return new CountryAlpha2CodeType();
  }

  public CountrySubdivisionCodeType createCountrySubdivisionCodeType() {
    return new CountrySubdivisionCodeType();
  }

  public CountryAlpha3CodeType createCountryAlpha3CodeType() {
    return new CountryAlpha3CodeType();
  }

  public CountryNumericCodeType createCountryNumericCodeType() {
    return new CountryNumericCodeType();
  }

}
