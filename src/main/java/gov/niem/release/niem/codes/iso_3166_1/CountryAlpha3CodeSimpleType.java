package gov.niem.release.niem.codes.iso_3166_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CountryAlpha3CodeSimpleType")
@XmlEnum
public enum CountryAlpha3CodeSimpleType {

  ABW,

  AFG,

  AGO,

  AIA,

  ALA,

  ALB,

  AND,

  ARE,

  ARG,

  ARM,

  ASM,

  ATA,

  ATF,

  ATG,

  AUS,

  AUT,

  AZE,

  BDI,

  BEL,

  BEN,

  BES,

  BFA,

  BGD,

  BGR,

  BHR,

  BHS,

  BIH,

  BLM,

  BLR,

  BLZ,

  BMU,

  BOL,

  BRA,

  BRB,

  BRN,

  BTN,

  BVT,

  BWA,

  CAF,

  CAN,

  CCK,

  CHE,

  CHL,

  CHN,

  CIV,

  CMR,

  COD,

  COG,

  COK,

  COL,

  COM,

  CPV,

  CRI,

  CUB,

  CUW,

  CXR,

  CYM,

  CYP,

  CZE,

  DEU,

  DJI,

  DMA,

  DNK,

  DOM,

  DZA,

  ECU,

  EGY,

  ERI,

  ESH,

  ESP,

  EST,

  ETH,

  FIN,

  FJI,

  FLK,

  FRA,

  FRO,

  FSM,

  GAB,

  GBR,

  GEO,

  GGY,

  GHA,

  GIB,

  GIN,

  GLP,

  GMB,

  GNB,

  GNQ,

  GRC,

  GRD,

  GRL,

  GTM,

  GUF,

  GUM,

  GUY,

  HKG,

  HMD,

  HND,

  HRV,

  HTI,

  HUN,

  IDN,

  IMN,

  IND,

  IOT,

  IRL,

  IRN,

  IRQ,

  ISL,

  ISR,

  ITA,

  JAM,

  JEY,

  JOR,

  JPN,

  KAZ,

  KEN,

  KGZ,

  KHM,

  KIR,

  KNA,

  KOR,

  KWT,

  LAO,

  LBN,

  LBR,

  LBY,

  LCA,

  LIE,

  LKA,

  LSO,

  LTU,

  LUX,

  LVA,

  MAC,

  MAF,

  MAR,

  MCO,

  MDA,

  MDG,

  MDV,

  MEX,

  MHL,

  MKD,

  MLI,

  MLT,

  MMR,

  MNE,

  MNG,

  MNP,

  MOZ,

  MRT,

  MSR,

  MTQ,

  MUS,

  MWI,

  MYS,

  MYT,

  NAM,

  NCL,

  NER,

  NFK,

  NGA,

  NIC,

  NIU,

  NLD,

  NOR,

  NPL,

  NRU,

  NZL,

  OMN,

  PAK,

  PAN,

  PCN,

  PER,

  PHL,

  PLW,

  PNG,

  POL,

  PRI,

  PRK,

  PRT,

  PRY,

  PSE,

  PYF,

  QAT,

  REU,

  ROU,

  RUS,

  RWA,

  SAU,

  SDN,

  SEN,

  SGP,

  SGS,

  SHN,

  SJM,

  SLB,

  SLE,

  SLV,

  SMR,

  SOM,

  SPM,

  SRB,

  SSD,

  STP,

  SUR,

  SVK,

  SVN,

  SWE,

  SWZ,

  SXM,

  SYC,

  SYR,

  TCA,

  TCD,

  TGO,

  THA,

  TJK,

  TKL,

  TKM,

  TLS,

  TON,

  TTO,

  TUN,

  TUR,

  TUV,

  TWN,

  TZA,

  UGA,

  UKR,

  UMI,

  URY,

  USA,

  UZB,

  VAT,

  VCT,

  VEN,

  VGB,

  VIR,

  VNM,

  VUT,

  WLF,

  WSM,

  YEM,

  ZAF,

  ZMB,

  ZWE;

  public String value() {
    return name();
  }

  public static CountryAlpha3CodeSimpleType fromValue(String v) {
    return valueOf(v);
  }

}
