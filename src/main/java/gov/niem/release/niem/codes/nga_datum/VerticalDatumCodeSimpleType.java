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
package gov.niem.release.niem.codes.nga_datum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VerticalDatumCodeSimpleType")
@XmlEnum
public enum VerticalDatumCodeSimpleType {

  @XmlEnumValue("approxLowestAstronomTide")
  APPROX_LOWEST_ASTRONOM_TIDE("approxLowestAstronomTide"),

  @XmlEnumValue("approxMeanLowerLowWater")
  APPROX_MEAN_LOWER_LOW_WATER("approxMeanLowerLowWater"),

  @XmlEnumValue("approxMeanLowWater")
  APPROX_MEAN_LOW_WATER("approxMeanLowWater"),

  @XmlEnumValue("approxMeanLowWaterSprings")
  APPROX_MEAN_LOW_WATER_SPRINGS("approxMeanLowWaterSprings"),

  @XmlEnumValue("approxMeanSeaLevel")
  APPROX_MEAN_SEA_LEVEL("approxMeanSeaLevel"),

  @XmlEnumValue("equinoctialSpringLowWater")
  EQUINOCTIAL_SPRING_LOW_WATER("equinoctialSpringLowWater"),

  @XmlEnumValue("groundLevel")
  GROUND_LEVEL("groundLevel"),

  @XmlEnumValue("higherHighWater")
  HIGHER_HIGH_WATER("higherHighWater"),

  @XmlEnumValue("higherHighWaterLargeTide")
  HIGHER_HIGH_WATER_LARGE_TIDE("higherHighWaterLargeTide"),

  @XmlEnumValue("highestAstronomicalTide")
  HIGHEST_ASTRONOMICAL_TIDE("highestAstronomicalTide"),

  @XmlEnumValue("highestHighWater")
  HIGHEST_HIGH_WATER("highestHighWater"),

  @XmlEnumValue("highWater")
  HIGH_WATER("highWater"),

  @XmlEnumValue("highWaterSprings")
  HIGH_WATER_SPRINGS("highWaterSprings"),

  @XmlEnumValue("igld1985")
  IGLD_1985("igld1985"),

  @XmlEnumValue("indianSpringHighWater")
  INDIAN_SPRING_HIGH_WATER("indianSpringHighWater"),

  @XmlEnumValue("indianSpringLowWater")
  INDIAN_SPRING_LOW_WATER("indianSpringLowWater"),

  @XmlEnumValue("lowerLowWater")
  LOWER_LOW_WATER("lowerLowWater"),

  @XmlEnumValue("lowerLowWaterLargeTide")
  LOWER_LOW_WATER_LARGE_TIDE("lowerLowWaterLargeTide"),

  @XmlEnumValue("lowestAstronomicalTide")
  LOWEST_ASTRONOMICAL_TIDE("lowestAstronomicalTide"),

  @XmlEnumValue("lowestLowWater")
  LOWEST_LOW_WATER("lowestLowWater"),

  @XmlEnumValue("lowestLowWaterSprings")
  LOWEST_LOW_WATER_SPRINGS("lowestLowWaterSprings"),

  @XmlEnumValue("lowWater")
  LOW_WATER("lowWater"),

  @XmlEnumValue("lowWaterSprings")
  LOW_WATER_SPRINGS("lowWaterSprings"),

  @XmlEnumValue("meanHigherHighWater")
  MEAN_HIGHER_HIGH_WATER("meanHigherHighWater"),

  @XmlEnumValue("meanHigherHighWaterSprings")
  MEAN_HIGHER_HIGH_WATER_SPRINGS("meanHigherHighWaterSprings"),

  @XmlEnumValue("meanHighWater")
  MEAN_HIGH_WATER("meanHighWater"),

  @XmlEnumValue("meanHighWaterNeaps")
  MEAN_HIGH_WATER_NEAPS("meanHighWaterNeaps"),

  @XmlEnumValue("meanHighWaterSprings")
  MEAN_HIGH_WATER_SPRINGS("meanHighWaterSprings"),

  @XmlEnumValue("meanLowerLowWater")
  MEAN_LOWER_LOW_WATER("meanLowerLowWater"),

  @XmlEnumValue("meanLowerLowWaterSprings")
  MEAN_LOWER_LOW_WATER_SPRINGS("meanLowerLowWaterSprings"),

  @XmlEnumValue("meanLowWater")
  MEAN_LOW_WATER("meanLowWater"),

  @XmlEnumValue("meanLowWaterNeaps")
  MEAN_LOW_WATER_NEAPS("meanLowWaterNeaps"),

  @XmlEnumValue("meanLowWaterSprings")
  MEAN_LOW_WATER_SPRINGS("meanLowWaterSprings"),

  @XmlEnumValue("meanSeaLevel")
  MEAN_SEA_LEVEL("meanSeaLevel"),

  @XmlEnumValue("meanTideLevel")
  MEAN_TIDE_LEVEL("meanTideLevel"),

  @XmlEnumValue("meanWaterLevel")
  MEAN_WATER_LEVEL("meanWaterLevel"),

  @XmlEnumValue("navd88")
  NAVD_88("navd88"),

  @XmlEnumValue("neapTide")
  NEAP_TIDE("neapTide"),

  @XmlEnumValue("nearlyHighestHighWater")
  NEARLY_HIGHEST_HIGH_WATER("nearlyHighestHighWater"),

  @XmlEnumValue("nearlyLowestLowWater")
  NEARLY_LOWEST_LOW_WATER("nearlyLowestLowWater"),

  @XmlEnumValue("ngvd29")
  NGVD_29("ngvd29"),

  @XmlEnumValue("springTide")
  SPRING_TIDE("springTide"),

  @XmlEnumValue("waterLevel")
  WATER_LEVEL("waterLevel"),

  @XmlEnumValue("wgs84Egm08Geoid")
  WGS_84_EGM_08_GEOID("wgs84Egm08Geoid"),

  @XmlEnumValue("wgs84Egm96Geoid")
  WGS_84_EGM_96_GEOID("wgs84Egm96Geoid"),

  @XmlEnumValue("wgs84Ellipsoid")
  WGS_84_ELLIPSOID("wgs84Ellipsoid");
  private final String value;

  VerticalDatumCodeSimpleType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static VerticalDatumCodeSimpleType fromValue(String v) {
    for (VerticalDatumCodeSimpleType c : VerticalDatumCodeSimpleType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
