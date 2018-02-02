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
package gov.niem.release.niem.proxy.xsd;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

  public ObjectFactory() {
  }

  public Boolean createBoolean() {
    return new Boolean();
  }

  public AnyURI createAnyURI() {
    return new AnyURI();
  }

  public UnsignedInt createUnsignedInt() {
    return new UnsignedInt();
  }

  public String createString() {
    return new String();
  }

  public Time createTime() {
    return new Time();
  }

  public Decimal createDecimal() {
    return new Decimal();
  }

  public GYear createGYear() {
    return new GYear();
  }

  public NonNegativeInteger createNonNegativeInteger() {
    return new NonNegativeInteger();
  }

  public Duration createDuration() {
    return new Duration();
  }

  public Integer createInteger() {
    return new Integer();
  }

  public GYearMonth createGYearMonth() {
    return new GYearMonth();
  }

  public Date createDate() {
    return new Date();
  }

  public Base64Binary createBase64Binary() {
    return new Base64Binary();
  }

  public HexBinary createHexBinary() {
    return new HexBinary();
  }

  public GDay createGDay() {
    return new GDay();
  }

  public GMonth createGMonth() {
    return new GMonth();
  }

  public Double createDouble() {
    return new Double();
  }

  public DateTime createDateTime() {
    return new DateTime();
  }

  public Language createLanguage() {
    return new Language();
  }

  public Float createFloat() {
    return new Float();
  }

  public NormalizedString createNormalizedString() {
    return new NormalizedString();
  }

  public Long createLong() {
    return new Long();
  }

  public NegativeInteger createNegativeInteger() {
    return new NegativeInteger();
  }

  public UnsignedByte createUnsignedByte() {
    return new UnsignedByte();
  }

  public UnsignedLong createUnsignedLong() {
    return new UnsignedLong();
  }

  public GMonthDay createGMonthDay() {
    return new GMonthDay();
  }

  public UnsignedShort createUnsignedShort() {
    return new UnsignedShort();
  }

  public Byte createByte() {
    return new Byte();
  }

  public Int createInt() {
    return new Int();
  }

  public Token createToken() {
    return new Token();
  }

  public NonPositiveInteger createNonPositiveInteger() {
    return new NonPositiveInteger();
  }

  public PositiveInteger createPositiveInteger() {
    return new PositiveInteger();
  }

  public Short createShort() {
    return new Short();
  }

}
