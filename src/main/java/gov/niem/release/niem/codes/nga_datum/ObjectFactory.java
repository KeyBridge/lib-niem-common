package gov.niem.release.niem.codes.nga_datum;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

  public ObjectFactory() {
  }

  public VerticalDatumCodeType createVerticalDatumCodeType() {
    return new VerticalDatumCodeType();
  }

  public DirectionDatumCodeType createDirectionDatumCodeType() {
    return new DirectionDatumCodeType();
  }

}
