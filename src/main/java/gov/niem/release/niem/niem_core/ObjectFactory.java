package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.GDay;
import gov.niem.release.niem.proxy.xsd.HexBinary;
import gov.niem.release.niem.proxy.xsd.GMonth;
import gov.niem.release.niem.proxy.xsd.Time;
import gov.niem.release.niem.proxy.xsd.Duration;
import gov.niem.release.niem.proxy.xsd.GYear;
import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import gov.niem.release.niem.proxy.xsd.DateTime;
import gov.niem.release.niem.proxy.xsd.Date;
import gov.niem.release.niem.proxy.xsd.Base64Binary;
import gov.niem.release.niem.proxy.xsd.UnsignedInt;
import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.proxy.xsd.GYearMonth;
import gov.niem.release.niem.codes.unece_rec20.MassCodeType;
import gov.niem.release.niem.codes.unece_rec20.TemperatureUnitCodeType;
import gov.niem.release.niem.codes.unece_rec20.TimeCodeType;
import gov.niem.release.niem.codes.unece_rec20.VelocityCodeType;
import gov.niem.release.niem.codes.unece_rec20.LengthCodeType;
import gov.niem.release.niem.codes.unece_rec20.VolumeUnitCodeType;
import gov.niem.release.niem.codes.canada_post.CanadianProvinceCodeType;
import gov.niem.release.niem.codes.census_commodity.ConveyanceCategoryCodeType;
import gov.niem.release.niem.codes.census_commodity.ElectronicEquipmentCategoryCodeType;
import gov.niem.release.niem.codes.census_commodity.ElectronicInstrumentCategoryCodeType;
import gov.niem.release.niem.codes.census_commodity.MachineryCategoryCodeType;
import gov.niem.release.niem.codes.census_uscounty.USCountyCodeType;
import gov.niem.release.niem.codes.dea_ctlsub.DEAClassScheduleCodeCodeType;
import gov.niem.release.niem.codes.dea_ctlsub.DrugCodeType;
import gov.niem.release.niem.codes.dod_jcs_pub2_0.DocumentIntelligenceCategoryCodeType;
import gov.niem.release.niem.codes.dol_soc.OccupationCodeType;
import gov.niem.release.niem.codes.dot_hazmat.HazmatUNCodeType;
import gov.niem.release.niem.codes.fips_5_2.USStateNumericCodeType;
import gov.niem.release.niem.codes.hl7.ReligionCodeType;
import gov.niem.release.niem.codes.iso_3166_1.CountryAlpha2CodeType;
import gov.niem.release.niem.codes.iso_3166_1.CountryAlpha3CodeType;
import gov.niem.release.niem.codes.iso_3166_1.CountryNumericCodeType;
import gov.niem.release.niem.codes.iso_3166_1.CountrySubdivisionCodeType;
import gov.niem.release.niem.codes.iso_4217.CurrencyCodeType;
import gov.niem.release.niem.codes.iso_639_3.LanguageCodeType;
import gov.niem.release.niem.codes.nga_datum.DirectionDatumCodeType;
import gov.niem.release.niem.codes.nga_datum.VerticalDatumCodeType;
import gov.niem.release.niem.codes.occs_facility.FacilityUsageCodeType;
import gov.niem.release.niem.codes.occs_facility.FacilityUsageLevel1CodeType;
import gov.niem.release.niem.codes.occs_facility.FacilityUsageLevel2CodeType;
import gov.niem.release.niem.codes.usps_states.USStateCodeType;
import gov.niem.release.niem.codes.xcard.TelephoneCategoryCodeType;
import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.Double;
import gov.niem.release.niem.proxy.xsd.Integer;
import gov.niem.release.niem.proxy.xsd.String;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

  private final static QName _PersonWorker_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorker");
  private final static QName _RiskReductionFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RiskReductionFacility");
  private final static QName _MessageID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageID");
  private final static QName _PersonDigitalImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDigitalImage");
  private final static QName _RequestAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestAugmentationPoint");
  private final static QName _AzimuthDecimalValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AzimuthDecimalValue");
  private final static QName _MeasureUnsignedIntegerRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureUnsignedIntegerRange");
  private final static QName _LengthMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LengthMeasureAugmentationPoint");
  private final static QName _DocumentStatusCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentStatusCategoryAbstract");
  private final static QName _OrganizationOperatesFacilityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationOperatesFacilityAssociation");
  private final static QName _PersonLicenseIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLicenseIdentification");
  private final static QName _FacilitySiteDiagram_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySiteDiagram");
  private final static QName _Equipment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Equipment");
  private final static QName _NANPTelephoneNumber_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "NANPTelephoneNumber");
  private final static QName _SeparationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SeparationCategoryText");
  private final static QName _PersonNameSuffixText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameSuffixText");
  private final static QName _RelatedActivity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelatedActivity");
  private final static QName _ActivityInvolvementText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityInvolvementText");
  private final static QName _DocumentSensitivityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSensitivityText");
  private final static QName _MissionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionAugmentationPoint");
  private final static QName _OrganizationSubUnitName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationSubUnitName");
  private final static QName _ContactRadio_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactRadio");
  private final static QName _VesselPropulsionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselPropulsionAbstract");
  private final static QName _Container_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Container");
  private final static QName _InternationalTelephoneNumber_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InternationalTelephoneNumber");
  private final static QName _PersonLocationAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLocationAssociationAugmentationPoint");
  private final static QName _PersonRaceAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonRaceAbstract");
  private final static QName _PhysicalFeature_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeature");
  private final static QName _ItemHoldingOrganization_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemHoldingOrganization");
  private final static QName _VehicleGrossLadenUnitWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleGrossLadenUnitWeightMeasure");
  private final static QName _LocaleRegionName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleRegionName");
  private final static QName _SpeedMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SpeedMeasure");
  private final static QName _DocumentDispositionAuthorityName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentDispositionAuthorityName");
  private final static QName _PersonLanguageEnglishIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLanguageEnglishIndicator");
  private final static QName _LocationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCategoryText");
  private final static QName _PreviousActivityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PreviousActivityAssociation");
  private final static QName _OrganizationIncorporationLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationIncorporationLocation");
  private final static QName _DocumentAlternativeTitleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentAlternativeTitleText");
  private final static QName _MilitaryBranchName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryBranchName");
  private final static QName _PersonLanguageAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLanguageAugmentationPoint");
  private final static QName _ProgramCapacityQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramCapacityQuantity");
  private final static QName _PublicService_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicService");
  private final static QName _MessageSenderAddressID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSenderAddressID");
  private final static QName _InjuryCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryCategoryAbstract");
  private final static QName _ActivityResponsibleOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityResponsibleOrganizationAssociation");
  private final static QName _HazardousMaterialCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HazardousMaterialCode");
  private final static QName _Substance_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Substance");
  private final static QName _LocationCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCategoryAbstract");
  private final static QName _ConveyancePassengerQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyancePassengerQuantity");
  private final static QName _Identification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Identification");
  private final static QName _LocationCountyAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountyAbstract");
  private final static QName _SiteMobileDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteMobileDescriptionText");
  private final static QName _RelativeLocationDirectionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationDirectionAbstract");
  private final static QName _ObligationEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationEntity");
  private final static QName _SecuritiesDateSeriesAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesDateSeriesAbstract");
  private final static QName _PersonWorkLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorkLocation");
  private final static QName _VehicleUnladenWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleUnladenWeightMeasure");
  private final static QName _PassportCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportCategoryCode");
  private final static QName _ConveyanceFuelCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceFuelCategoryText");
  private final static QName _PersonEmergencyContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEmergencyContactInformation");
  private final static QName _DecalPeriodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalPeriodText");
  private final static QName _EntityAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityAugmentationPoint");
  private final static QName _MessageAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageAugmentationPoint");
  private final static QName _MessageReceivedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageReceivedDate");
  private final static QName _Document_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Document");
  private final static QName _DocumentLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentLocation");
  private final static QName _OrganizationIncorporatedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationIncorporatedIndicator");
  private final static QName _DocumentSubmitter_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSubmitter");
  private final static QName _TimeRangeAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TimeRangeAugmentationPoint");
  private final static QName _ItemInsuranceAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemInsuranceAssociationAugmentationPoint");
  private final static QName _LocationHeightVerticalDatumAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationHeightVerticalDatumAbstract");
  private final static QName _MissionCommencementNoLaterThanDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionCommencementNoLaterThanDate");
  private final static QName _EquipmentAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EquipmentAugmentationPoint");
  private final static QName _Location2DGeospatialCoordinateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Location2DGeospatialCoordinateAugmentationPoint");
  private final static QName _MeasureValueListAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureValueListAbstract");
  private final static QName _PersonBuildText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBuildText");
  private final static QName _LocationCountryISO3166Alpha2Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountryISO3166Alpha2Code");
  private final static QName _VehicleDoorQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleDoorQuantity");
  private final static QName _ResidentialFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ResidentialFacility");
  private final static QName _CircularRegion_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CircularRegion");
  private final static QName _RecommendationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationAugmentationPoint");
  private final static QName _MapHorizontalCoordinateText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapHorizontalCoordinateText");
  private final static QName _PersonUnionCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionCategoryCode");
  private final static QName _SystemUserNameAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemUserNameAbstract");
  private final static QName _IncidentVehicleAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentVehicleAssociation");
  private final static QName _PersonHairLengthText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairLengthText");
  private final static QName _LocationContainsOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationContainsOrganizationAssociation");
  private final static QName _UserLogonID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "UserLogonID");
  private final static QName _ActivityDocumentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityDocumentAssociation");
  private final static QName _DocumentFileExtensionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFileExtensionText");
  private final static QName _RequestText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestText");
  private final static QName _DocumentRelatedResourceText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentRelatedResourceText");
  private final static QName _PublicServiceLanguageCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceLanguageCode");
  private final static QName _SecondaryDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecondaryDocument");
  private final static QName _StrangerAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StrangerAssociation");
  private final static QName _FingerprintTakenIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FingerprintTakenIndicator");
  private final static QName _PersonJuvenileClaimedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonJuvenileClaimedIndicator");
  private final static QName _IncidentDayPeriodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentDayPeriodText");
  private final static QName _ReferralSupervisor_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralSupervisor");
  private final static QName _PersonMilitarySummary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMilitarySummary");
  private final static QName _Drug_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Drug");
  private final static QName _LengthUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LengthUnitCode");
  private final static QName _MessageRecipientEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageRecipientEntity");
  private final static QName _LocationUTMCoordinateValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationUTMCoordinateValue");
  private final static QName _FacilitySecurityLevelText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySecurityLevelText");
  private final static QName _WeightMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeightMeasureAugmentationPoint");
  private final static QName _Date_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Date");
  private final static QName _PersonLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLocationAssociation");
  private final static QName _ContactInformationDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformationDescriptionText");
  private final static QName _YearMonthDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "YearMonthDate");
  private final static QName _DispositionReportedAuthorityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionReportedAuthorityText");
  private final static QName _ReleaseItem_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseItem");
  private final static QName _CaseAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseAugmentationPoint");
  private final static QName _MilitaryDischargeCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryDischargeCategoryAbstract");
  private final static QName _PersonBodyXRaysAvailableText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBodyXRaysAvailableText");
  private final static QName _AngularMinuteValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularMinuteValue");
  private final static QName _ProgramAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramAugmentationPoint");
  private final static QName _ItemOwnerPurchasedValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOwnerPurchasedValue");
  private final static QName _PublicServiceInputResourceDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceInputResourceDocument");
  private final static QName _OrganizationPrincipalOfficial_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationPrincipalOfficial");
  private final static QName _SourceContactPersonText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SourceContactPersonText");
  private final static QName _HighwayFullText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HighwayFullText");
  private final static QName _Measurer_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Measurer");
  private final static QName _Site_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Site");
  private final static QName _DocumentSourceText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSourceText");
  private final static QName _PersonUnionCertificateIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionCertificateIndicator");
  private final static QName _PersonTaxIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonTaxIdentification");
  private final static QName _PersonHairCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairCategoryText");
  private final static QName _EmployeeDepartmentName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeDepartmentName");
  private final static QName _PersonLearningDisabilityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLearningDisabilityText");
  private final static QName _RangeMaximumIntegerValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMaximumIntegerValue");
  private final static QName _FacilityUsageText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityUsageText");
  private final static QName _SystemAuditEventAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemAuditEventAugmentationPoint");
  private final static QName _DeviceIncomingTextMessage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceIncomingTextMessage");
  private final static QName _StatusDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusDate");
  private final static QName _TransportationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TransportationAssociation");
  private final static QName _IntangibleItem_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntangibleItem");
  private final static QName _PersonStateIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonStateIdentification");
  private final static QName _VelocityMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VelocityMeasureAugmentationPoint");
  private final static QName _ImageHeightValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ImageHeightValue");
  private final static QName _Facility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Facility");
  private final static QName _IncidentEvent_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentEvent");
  private final static QName _WeaponAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponAugmentationPoint");
  private final static QName _PersonOrganDonorAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganDonorAbstract");
  private final static QName _FacilityMaxOccupancyQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityMaxOccupancyQuantity");
  private final static QName _BinaryCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryCategoryAbstract");
  private final static QName _Fee_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Fee");
  private final static QName _LocationDirectionsText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationDirectionsText");
  private final static QName _ConfidencePercent_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConfidencePercent");
  private final static QName _DocumentFormatText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFormatText");
  private final static QName _ActivitySupervisorPersonAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivitySupervisorPersonAssociation");
  private final static QName _ObligationTotalDuration_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationTotalDuration");
  private final static QName _OrganizationDayContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationDayContactInformation");
  private final static QName _Computer_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Computer");
  private final static QName _RiskReductionProgram_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RiskReductionProgram");
  private final static QName _RelativeLocationHeadingValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationHeadingValue");
  private final static QName _MeasureIntegerValueList_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureIntegerValueList");
  private final static QName _EntityRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityRepresentation");
  private final static QName _MessageSentDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSentDate");
  private final static QName _ItemPossessionDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemPossessionDescriptionText");
  private final static QName _ItemStateIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemStateIdentification");
  private final static QName _PersonCitizenshipAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCitizenshipAbstract");
  private final static QName _IdentificationCategoryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationCategoryDescriptionText");
  private final static QName _VehicleTransmissionCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleTransmissionCategoryAbstract");
  private final static QName _CrossStreetRelativeLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrossStreetRelativeLocation");
  private final static QName _ItemSizeDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemSizeDescriptionText");
  private final static QName _MessageCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageCategoryText");
  private final static QName _PersonDocumentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDocumentAssociation");
  private final static QName _LocationHeightMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationHeightMeasureAugmentationPoint");
  private final static QName _ContactWebsiteURI_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactWebsiteURI");
  private final static QName _ActivityBillRecipientPersonAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityBillRecipientPersonAssociation");
  private final static QName _ItemStyleAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemStyleAbstract");
  private final static QName _OrganizationSubUnit_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationSubUnit");
  private final static QName _ObligationProgressDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationProgressDescriptionText");
  private final static QName _ConveyedPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyedPerson");
  private final static QName _LocaleCensusBlockID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleCensusBlockID");
  private final static QName _AnomalyContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyContactInformation");
  private final static QName _TelephoneNumberDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberDescriptionText");
  private final static QName _DocumentLocationURI_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentLocationURI");
  private final static QName _ManifestTransmittedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ManifestTransmittedDate");
  private final static QName _DeviceStoredTelephoneNumber_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredTelephoneNumber");
  private final static QName _OrganizationStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationStatus");
  private final static QName _EncounterClassification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EncounterClassification");
  private final static QName _DocumentOtherRecipient_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentOtherRecipient");
  private final static QName _ReportedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReportedDate");
  private final static QName _CaseResolutionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseResolutionText");
  private final static QName _PublicServiceLanguageName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceLanguageName");
  private final static QName _EmployeeSupervisor_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeSupervisor");
  private final static QName _DeviceStoredContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredContactInformation");
  private final static QName _RangeMaximumUnsignedIntegerValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMaximumUnsignedIntegerValue");
  private final static QName _VolumeMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VolumeMeasure");
  private final static QName _AircraftAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftAugmentationPoint");
  private final static QName _OrganizationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationAugmentationPoint");
  private final static QName _AddressDeliveryPointAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressDeliveryPointAbstract");
  private final static QName _MeasurePointAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasurePointAbstract");
  private final static QName _CapabilityEndDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityEndDate");
  private final static QName _ItemRecoveredValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemRecoveredValue");
  private final static QName _LocationDepth_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationDepth");
  private final static QName _LocationCanadianProvinceCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCanadianProvinceCode");
  private final static QName _LanguageCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LanguageCode");
  private final static QName _PersonDisguiseDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisguiseDescriptionText");
  private final static QName _Vehicle_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Vehicle");
  private final static QName _CalendarDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CalendarDate");
  private final static QName _PermitStartDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitStartDate");
  private final static QName _IdentificationExpirationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationExpirationDate");
  private final static QName _OrganizationTerminationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationTerminationDate");
  private final static QName _PersonHairStyleAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairStyleAbstract");
  private final static QName _ItemTransactionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemTransactionAugmentationPoint");
  private final static QName _IdentityStolenIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityStolenIndicator");
  private final static QName _RequestContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestContactInformation");
  private final static QName _PersonPreferredName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPreferredName");
  private final static QName _SystemOperatingModeName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemOperatingModeName");
  private final static QName _AddressSecondaryUnitText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressSecondaryUnitText");
  private final static QName _LatitudeDegreeValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LatitudeDegreeValue");
  private final static QName _PersonReligionCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonReligionCode");
  private final static QName _AssessmentProgram_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentProgram");
  private final static QName _ItemValueDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueDescriptionText");
  private final static QName _ActivityInvolvementAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityInvolvementAbstract");
  private final static QName _TelecommunicationDeviceSIMCardAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelecommunicationDeviceSIMCardAssociation");
  private final static QName _DocumentContributor_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentContributor");
  private final static QName _ActivityInvolvedOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityInvolvedOrganizationAssociation");
  private final static QName _CaseDispositionDecisionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionDecisionAugmentationPoint");
  private final static QName _OrganizationParentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationParentAssociation");
  private final static QName _EmploymentLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmploymentLocation");
  private final static QName _AngularRateUnitAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularRateUnitAbstract");
  private final static QName _ArrivalLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ArrivalLocation");
  private final static QName _PersonHairStyleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairStyleText");
  private final static QName _SystemName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemName");
  private final static QName _VehicleGarageLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleGarageLocationAssociation");
  private final static QName _TelephoneNumberCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberCategoryAbstract");
  private final static QName _PersonOrganizationAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganizationAssociationAugmentationPoint");
  private final static QName _FinancialAccountHolder_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountHolder");
  private final static QName _LocationArea_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationArea");
  private final static QName _ActivityConveyanceAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityConveyanceAssociation");
  private final static QName _LocaleJudicialDistrictAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleJudicialDistrictAbstract");
  private final static QName _PersonMentalStateText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMentalStateText");
  private final static QName _ImageLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ImageLocation");
  private final static QName _PersonMaidenName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMaidenName");
  private final static QName _ObligationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationAugmentationPoint");
  private final static QName _DocumentApprovedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentApprovedIndicator");
  private final static QName _DocumentSource_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSource");
  private final static QName _ItemBarCodeIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemBarCodeIdentification");
  private final static QName _UserPersonName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "UserPersonName");
  private final static QName _EncounterCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EncounterCategoryAbstract");
  private final static QName _ProgressComplianceIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgressComplianceIndicator");
  private final static QName _StreetAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetAugmentationPoint");
  private final static QName _ContactMeansAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactMeansAbstract");
  private final static QName _FacilityCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityCategoryCode");
  private final static QName _DisciplinaryActionRestitution_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionRestitution");
  private final static QName _PersonUSCitizenIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUSCitizenIndicator");
  private final static QName _PhysicalFeatureCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureCategoryText");
  private final static QName _CurrencyCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CurrencyCode");
  private final static QName _DocumentLanguageCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentLanguageCode");
  private final static QName _PersonConveyanceAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonConveyanceAssociation");
  private final static QName _SecuritiesDateSeriesText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesDateSeriesText");
  private final static QName _TelephoneNumberAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberAugmentationPoint");
  private final static QName _IncidentReportedNarrative_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentReportedNarrative");
  private final static QName _GenericEntityAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "GenericEntityAugmentationPoint");
  private final static QName _PersonEncounter_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEncounter");
  private final static QName _FinancialAccountHolderAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountHolderAugmentationPoint");
  private final static QName _ConveyanceOperator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceOperator");
  private final static QName _FullTelephoneNumberAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FullTelephoneNumberAugmentationPoint");
  private final static QName _PersonWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWeightMeasure");
  private final static QName _DocumentIntelligenceCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIntelligenceCategoryCode");
  private final static QName _RollValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RollValue");
  private final static QName _Employee_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Employee");
  private final static QName _EmployeeEarningsRateText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeEarningsRateText");
  private final static QName _ContactEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactEntity");
  private final static QName _ScheduleActivityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleActivityText");
  private final static QName _DepartureEstimatedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DepartureEstimatedDate");
  private final static QName _PersonPrimaryLanguage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPrimaryLanguage");
  private final static QName _UTMCoordinateValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "UTMCoordinateValue");
  private final static QName _OrganizationEmergencyContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationEmergencyContactInformation");
  private final static QName _Highway_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Highway");
  private final static QName _Employer_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Employer");
  private final static QName _PersonSpeechDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSpeechDescriptionText");
  private final static QName _PersonResidenceAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonResidenceAssociationAugmentationPoint");
  private final static QName _RelativeLocationReferencePoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationReferencePoint");
  private final static QName _TimeUnitAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TimeUnitAbstract");
  private final static QName _DateRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateRange");
  private final static QName _PersonDigitizedSignatureImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDigitizedSignatureImage");
  private final static QName _IntellectualPropertyTerminationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyTerminationDate");
  private final static QName _ItemLengthMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemLengthMeasure");
  private final static QName _OrganizationActivityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationActivityText");
  private final static QName _PersonPrimaryWorkerAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPrimaryWorkerAssociation");
  private final static QName _CommentCreationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommentCreationDate");
  private final static QName _TaskCriteriaForSuccessText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskCriteriaForSuccessText");
  private final static QName _AircraftTailIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftTailIdentification");
  private final static QName _ResidencePaymentPeriodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ResidencePaymentPeriodText");
  private final static QName _CapabilityGeneralCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityGeneralCategoryText");
  private final static QName _IntellectualItemBusinessAreaText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualItemBusinessAreaText");
  private final static QName _ItemAgeMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemAgeMeasure");
  private final static QName _MessageSenderEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSenderEntity");
  private final static QName _DeviceIMEIIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceIMEIIdentification");
  private final static QName _SupervisionFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionFacility");
  private final static QName _ActivityPersonAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityPersonAssociation");
  private final static QName _GenericEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "GenericEntity");
  private final static QName _VehicleMaximumLoadWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleMaximumLoadWeightMeasure");
  private final static QName _Incident_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Incident");
  private final static QName _PersonUnionAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionAssociationAugmentationPoint");
  private final static QName _Aircraft_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Aircraft");
  private final static QName _VehicleColorInteriorText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleColorInteriorText");
  private final static QName _LocationAddressAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationAddressAbstract");
  private final static QName _PersonNameAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameAugmentationPoint");
  private final static QName _PersonNameCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameCategoryText");
  private final static QName _OrganizationLocalIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationLocalIdentification");
  private final static QName _SupervisionMandatoryIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionMandatoryIndicator");
  private final static QName _ActivityRelationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityRelationText");
  private final static QName _LocaleZoneName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleZoneName");
  private final static QName _TelephoneNumberCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberCategoryText");
  private final static QName _ArrivalEstimatedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ArrivalEstimatedDate");
  private final static QName _RealEstateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RealEstateAugmentationPoint");
  private final static QName _ItemCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemCategoryText");
  private final static QName _SiteOwnerEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteOwnerEntity");
  private final static QName _LocaleNeighborhoodName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleNeighborhoodName");
  private final static QName _DeviceStoredVideoBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredVideoBinary");
  private final static QName _InjurySeverityAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjurySeverityAbstract");
  private final static QName _MeasureValueText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureValueText");
  private final static QName _FacilityLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityLocation");
  private final static QName _DateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateAugmentationPoint");
  private final static QName _ReferralMandatoryIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralMandatoryIndicator");
  private final static QName _ProgramPubliclyRunIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramPubliclyRunIndicator");
  private final static QName _AircraftBaseAirport_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftBaseAirport");
  private final static QName _IntellectualPropertyAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyAugmentationPoint");
  private final static QName _OrganizationUnitAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationUnitAssociationAugmentationPoint");
  private final static QName _Disposition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Disposition");
  private final static QName _UnsignedIntegerRangeAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "UnsignedIntegerRangeAugmentationPoint");
  private final static QName _CaseTrackingID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseTrackingID");
  private final static QName _CrisisLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisLocation");
  private final static QName _ItemColorDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemColorDescriptionText");
  private final static QName _ProgressComplianceText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgressComplianceText");
  private final static QName _YearDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "YearDate");
  private final static QName _LocationContactInformationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationContactInformationAssociation");
  private final static QName _ActivityDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityDate");
  private final static QName _PassportNumberIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportNumberIdentification");
  private final static QName _RecommendationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationDate");
  private final static QName _ScheduleDayStartTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayStartTime");
  private final static QName _MeasureErrorValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureErrorValue");
  private final static QName _PolygonCoordinate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PolygonCoordinate");
  private final static QName _VesselPropulsionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselPropulsionText");
  private final static QName _ActivityStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityStatus");
  private final static QName _SiteSpecialInformationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteSpecialInformationText");
  private final static QName _Organization_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Organization");
  private final static QName _EndTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EndTime");
  private final static QName _StateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StateAugmentationPoint");
  private final static QName _DocumentRelationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentRelationText");
  private final static QName _InsuranceAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceAugmentationPoint");
  private final static QName _ProgramCondition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramCondition");
  private final static QName _Injury_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Injury");
  private final static QName _CaseDispositionDecision_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionDecision");
  private final static QName _TreatmentProvider_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TreatmentProvider");
  private final static QName _RelativeLocationDirectionCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationDirectionCode");
  private final static QName _IdentificationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationAugmentationPoint");
  private final static QName _PersonEmploymentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEmploymentAssociation");
  private final static QName _PersonResidentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonResidentText");
  private final static QName _ItemBrandName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemBrandName");
  private final static QName _ProgramResidentialIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramResidentialIndicator");
  private final static QName _LocationLocale_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationLocale");
  private final static QName _BinaryCaptureDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryCaptureDate");
  private final static QName _ObligationRequirementDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationRequirementDescriptionText");
  private final static QName _IdentityTerminationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityTerminationDate");
  private final static QName _AircraftFuselageColorAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftFuselageColorAbstract");
  private final static QName _DispositionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionAugmentationPoint");
  private final static QName _DecalPeriodAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalPeriodAbstract");
  private final static QName _ObligationPaidAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationPaidAbstract");
  private final static QName _SupervisionCustodyStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionCustodyStatus");
  private final static QName _ConditionViolatedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionViolatedIndicator");
  private final static QName _VesselHullIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselHullIdentification");
  private final static QName _CaseDispositionDecisionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionDecisionText");
  private final static QName _AddressCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressCategoryCode");
  private final static QName _CaseFiling_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseFiling");
  private final static QName _ActivityScheduleAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityScheduleAssociation");
  private final static QName _JurisdictionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "JurisdictionAbstract");
  private final static QName _DocumentManagementCyclePeriodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentManagementCyclePeriodText");
  private final static QName _ItemValueAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueAugmentationPoint");
  private final static QName _AssociationDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssociationDescriptionText");
  private final static QName _DoubleRangeAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DoubleRangeAugmentationPoint");
  private final static QName _FinancialAccountCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountCategoryText");
  private final static QName _TelephoneNumberFullID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberFullID");
  private final static QName _MapCoordinateFullText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapCoordinateFullText");
  private final static QName _DocumentGroupID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentGroupID");
  private final static QName _RequestCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestCategoryText");
  private final static QName _Vessel_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Vessel");
  private final static QName _PersonLastSeenLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLastSeenLocationAssociation");
  private final static QName _PersonAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAugmentationPoint");
  private final static QName _ItemTransaction_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemTransaction");
  private final static QName _ScheduleDayOfWeekCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayOfWeekCode");
  private final static QName _PersonJuvenileVerifiedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonJuvenileVerifiedIndicator");
  private final static QName _PersonFormerEmploymentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonFormerEmploymentAssociation");
  private final static QName _BinaryHashCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHashCode");
  private final static QName _ImageAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ImageAugmentationPoint");
  private final static QName _ObligationExemptionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationExemptionAugmentationPoint");
  private final static QName _PermitUsageText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitUsageText");
  private final static QName _FacilityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityAssociation");
  private final static QName _ReportingOrganizationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReportingOrganizationText");
  private final static QName _DecimalRangeAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecimalRangeAugmentationPoint");
  private final static QName _MilitaryDischargeCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryDischargeCategoryText");
  private final static QName _ElectronicInstrument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicInstrument");
  private final static QName _DocumentBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentBinary");
  private final static QName _Location_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Location");
  private final static QName _LocationOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationOrganizationAssociation");
  private final static QName _InjuryLocationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryLocationText");
  private final static QName _ConditionSetDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionSetDate");
  private final static QName _Percent_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Percent");
  private final static QName _FacilityImageAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityImageAssociationAugmentationPoint");
  private final static QName _RealEstate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RealEstate");
  private final static QName _WeaponUsageIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponUsageIndicator");
  private final static QName _PassportCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportCategoryAbstract");
  private final static QName _SubstanceMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceMeasure");
  private final static QName _ReportingPersonText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReportingPersonText");
  private final static QName _SystemAuditEvent_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemAuditEvent");
  private final static QName _ObligationExemptionIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationExemptionIndicator");
  private final static QName _Anomaly_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Anomaly");
  private final static QName _EntityPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityPerson");
  private final static QName _BinaryHash_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHash");
  private final static QName _PersonEncounterLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEncounterLocation");
  private final static QName _LastUpdatedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LastUpdatedDate");
  private final static QName _PersonSexAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSexAbstract");
  private final static QName _PersonReadsLanguageIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonReadsLanguageIndicator");
  private final static QName _TaskName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskName");
  private final static QName _ContactInformationAvailabilityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformationAvailabilityText");
  private final static QName _Kit_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Kit");
  private final static QName _CrisisIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisIdentification");
  private final static QName _FacilityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityDescriptionText");
  private final static QName _ActivityReportingOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityReportingOrganizationAssociation");
  private final static QName _PublicServiceName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceName");
  private final static QName _OrganizationTaxIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationTaxIdentification");
  private final static QName _Program_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Program");
  private final static QName _FacilitySiteAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySiteAssociationAugmentationPoint");
  private final static QName _InjuryCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryCategoryText");
  private final static QName _ItemOwnerAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOwnerAssociation");
  private final static QName _InsuranceCoverageCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCoverageCategoryText");
  private final static QName _FacilityCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityCategoryAbstract");
  private final static QName _FinancialAccountNumberCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountNumberCategoryCode");
  private final static QName _PersonMoodDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMoodDescriptionText");
  private final static QName _ItemLocationAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemLocationAssociationAugmentationPoint");
  private final static QName _DeviceInformationAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceInformationAssociationAugmentationPoint");
  private final static QName _FacilityPersonAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityPersonAssociationAugmentationPoint");
  private final static QName _RoleOfItem_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RoleOfItem");
  private final static QName _ProgressTimeQuantityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgressTimeQuantityText");
  private final static QName _VehicleTransmissionCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleTransmissionCategoryText");
  private final static QName _ItemName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemName");
  private final static QName _PersonDocumentAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDocumentAssociationAugmentationPoint");
  private final static QName _MessageRecipientName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageRecipientName");
  private final static QName _BinaryHashFunctionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHashFunctionText");
  private final static QName _VehicleIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleIdentification");
  private final static QName _DocumentDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentDescriptionText");
  private final static QName _ConditionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionAugmentationPoint");
  private final static QName _Metadata_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Metadata");
  private final static QName _LocationName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationName");
  private final static QName _FacilityImageAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityImageAssociation");
  private final static QName _PersonEyewearAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEyewearAbstract");
  private final static QName _ActivityPrimaryOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityPrimaryOrganizationAssociation");
  private final static QName _PersonSexText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSexText");
  private final static QName _ItemQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemQuantity");
  private final static QName _DeviceStoredBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredBinary");
  private final static QName _ScheduleStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleStatus");
  private final static QName _ServiceDeliveryNGO_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ServiceDeliveryNGO");
  private final static QName _DocumentRightsText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentRightsText");
  private final static QName _ItemValueAssigningMethodAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueAssigningMethodAbstract");
  private final static QName _PersonHairColorText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairColorText");
  private final static QName _MissionID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionID");
  private final static QName _Departure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Departure");
  private final static QName _DocumentFiledDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFiledDate");
  private final static QName _ProgramReferral_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramReferral");
  private final static QName _PolygonRegionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PolygonRegionAugmentationPoint");
  private final static QName _Measure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Measure");
  private final static QName _MapDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapDate");
  private final static QName _DrugCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugCode");
  private final static QName _ObligationExemptionDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationExemptionDescriptionText");
  private final static QName _AzimuthAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AzimuthAbstract");
  private final static QName _Activity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Activity");
  private final static QName _CommercialFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommercialFacility");
  private final static QName _ContactInformationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformationAugmentationPoint");
  private final static QName _PublicServiceRelatedService_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceRelatedService");
  private final static QName _InclinationDecimalValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InclinationDecimalValue");
  private final static QName _DocumentCopyrightIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCopyrightIndicator");
  private final static QName _PersonSecurityClearanceAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSecurityClearanceAbstract");
  private final static QName _TowingCompany_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TowingCompany");
  private final static QName _ScheduleAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleAugmentationPoint");
  private final static QName _VehiclePassengerSafeQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehiclePassengerSafeQuantity");
  private final static QName _EmployeeOccupationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeOccupationAbstract");
  private final static QName _ElectronicAddressDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicAddressDescriptionText");
  private final static QName _VesselAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselAugmentationPoint");
  private final static QName _DistributionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DistributionText");
  private final static QName _DocumentCoverageText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCoverageText");
  private final static QName _LocaleSubdivisionName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleSubdivisionName");
  private final static QName _IdentificationID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationID");
  private final static QName _TelephoneNumberID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberID");
  private final static QName _PersonOrganizationAffiliationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganizationAffiliationAssociation");
  private final static QName _IntellectualPropertyCreationEventText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyCreationEventText");
  private final static QName _StatusIssuerText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusIssuerText");
  private final static QName _SubstanceFoundDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceFoundDescriptionText");
  private final static QName _AircraftWingColorText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftWingColorText");
  private final static QName _SoftwareName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SoftwareName");
  private final static QName _LocationHeightVerticalDatumCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationHeightVerticalDatumCode");
  private final static QName _AngleMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngleMeasureAugmentationPoint");
  private final static QName _MapLocationDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapLocationDescriptionText");
  private final static QName _Assessment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Assessment");
  private final static QName _LocationCountry_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountry");
  private final static QName _RecommendationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationCategoryText");
  private final static QName _IntegerRangeAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntegerRangeAugmentationPoint");
  private final static QName _DeviceCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceCategoryAbstract");
  private final static QName _SubstanceMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceMeasureAugmentationPoint");
  private final static QName _MissionName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionName");
  private final static QName _DocumentSubmissionAmount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSubmissionAmount");
  private final static QName _InsuranceCarrierIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCarrierIdentification");
  private final static QName _InsuranceActiveIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceActiveIndicator");
  private final static QName _CrisisDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisDescriptionText");
  private final static QName _MapPageID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapPageID");
  private final static QName _LocationSurroundingAreaDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationSurroundingAreaDescriptionText");
  private final static QName _ContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformation");
  private final static QName _LocationFloorNumberText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationFloorNumberText");
  private final static QName _ContactMailingAddress_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactMailingAddress");
  private final static QName _ItemModelName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemModelName");
  private final static QName _PublicServiceAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceAugmentationPoint");
  private final static QName _CrisisStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisStatus");
  private final static QName _MachineryCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MachineryCategoryCode");
  private final static QName _CapabilityIsLimitationIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityIsLimitationIndicator");
  private final static QName _BinaryHashFunctionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHashFunctionAbstract");
  private final static QName _AssessmentScoreText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentScoreText");
  private final static QName _InsuranceEffectiveDateRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceEffectiveDateRange");
  private final static QName _StreetName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetName");
  private final static QName _DocumentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentAssociation");
  private final static QName _EmployeeOccupationCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeOccupationCode");
  private final static QName _VehicleCurrentWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleCurrentWeightMeasure");
  private final static QName _MeasureIntegerValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureIntegerValue");
  private final static QName _VehicleOdometerReadingMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleOdometerReadingMeasure");
  private final static QName _ActivityAdministratorOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityAdministratorOrganizationAssociation");
  private final static QName _CurrencyAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CurrencyAbstract");
  private final static QName _MeasureDecimalRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDecimalRange");
  private final static QName _PersonLivingIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonLivingIndicator");
  private final static QName _DocumentLanguageAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentLanguageAbstract");
  private final static QName _ItemReceiptIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemReceiptIdentification");
  private final static QName _DocumentFileControlID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFileControlID");
  private final static QName _ItemDispositionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDispositionAbstract");
  private final static QName _PersonCitizenshipISO3166Alpha2Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCitizenshipISO3166Alpha2Code");
  private final static QName _ElectronicAddressAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicAddressAugmentationPoint");
  private final static QName _PersonHairColorAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairColorAbstract");
  private final static QName _Securities_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Securities");
  private final static QName _PassportStolenLostIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportStolenLostIndicator");
  private final static QName _BinaryID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryID");
  private final static QName _PersonDisunionPendingIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisunionPendingIndicator");
  private final static QName _QuarterID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "QuarterID");
  private final static QName _SubFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubFacility");
  private final static QName _PersonJewelryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonJewelryDescriptionText");
  private final static QName _ConditionViolationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionViolationDate");
  private final static QName _DeviceCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceCategoryText");
  private final static QName _OrganizationIncorporationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationIncorporationDate");
  private final static QName _SubstanceFormText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceFormText");
  private final static QName _EncounterCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EncounterCategoryText");
  private final static QName _ItemImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemImage");
  private final static QName _TelecommunicationDeviceSIMCardAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelecommunicationDeviceSIMCardAssociationAugmentationPoint");
  private final static QName _Referral_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Referral");
  private final static QName _ExpirationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ExpirationDate");
  private final static QName _MessageReferenceID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageReferenceID");
  private final static QName _DocumentContentListText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentContentListText");
  private final static QName _AzimuthValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AzimuthValue");
  private final static QName _OrganizationEveningContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationEveningContactInformation");
  private final static QName _CaseDispositionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionAugmentationPoint");
  private final static QName _LocaleFireJurisdictionID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleFireJurisdictionID");
  private final static QName _ActivityDisposition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityDisposition");
  private final static QName _DepartureDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DepartureDate");
  private final static QName _ItemStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemStatus");
  private final static QName _ActivityBillRecipientOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityBillRecipientOrganizationAssociation");
  private final static QName _ProgramPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramPerson");
  private final static QName _AreaGeographicAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaGeographicAbstract");
  private final static QName _FinancialAccountAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountAugmentationPoint");
  private final static QName _HexBinaryObject_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HexBinaryObject");
  private final static QName _ItemAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemAugmentationPoint");
  private final static QName _DirectDialTelephoneNumberAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DirectDialTelephoneNumberAugmentationPoint");
  private final static QName _ConveyanceFuelCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceFuelCategoryAbstract");
  private final static QName _PersonOrganDonatorIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganDonatorIndicator");
  private final static QName _ActivityFacilityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityFacilityAssociationAugmentationPoint");
  private final static QName _LanguageName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LanguageName");
  private final static QName _FacilitySystemIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySystemIdentification");
  private final static QName _FacilityUsageLevel1Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityUsageLevel1Code");
  private final static QName _PersonAssignedUnitAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAssignedUnitAssociation");
  private final static QName _InsuranceCoverageCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCoverageCategoryAbstract");
  private final static QName _DirectDialTelephoneNetworkText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DirectDialTelephoneNetworkText");
  private final static QName _CaseGeneralCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseGeneralCategoryText");
  private final static QName _LocationCountyName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountyName");
  private final static QName _DeviceAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceAugmentationPoint");
  private final static QName _IntellectualProperty_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualProperty");
  private final static QName _ConveyanceCargoText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceCargoText");
  private final static QName _PublicServiceLanguageAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceLanguageAbstract");
  private final static QName _IdentityCharacteristics_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityCharacteristics");
  private final static QName _ItemLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemLocationAssociation");
  private final static QName _PersonIdentityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonIdentityAssociation");
  private final static QName _AngleUnitAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngleUnitAbstract");
  private final static QName _IdentificationStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationStatus");
  private final static QName _FinancialAccountNumberID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountNumberID");
  private final static QName _MilitaryExperienceIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryExperienceIndicator");
  private final static QName _ItemOwnerAppliedID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOwnerAppliedID");
  private final static QName _AddressAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressAugmentationPoint");
  private final static QName _ItemLeaseIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemLeaseIndicator");
  private final static QName _ReleaseSupervisor_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseSupervisor");
  private final static QName _PersonUnionStatusAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionStatusAbstract");
  private final static QName _VehicleMakeAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleMakeAbstract");
  private final static QName _LocationHeightAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationHeightAbstract");
  private final static QName _TimeMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TimeMeasure");
  private final static QName _VehicleCMVIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleCMVIndicator");
  private final static QName _PaymentAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PaymentAugmentationPoint");
  private final static QName _ItemStyleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemStyleText");
  private final static QName _DocumentExpirationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentExpirationDate");
  private final static QName _ObligationComplianceIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationComplianceIndicator");
  private final static QName _InsuranceCancellationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCancellationDate");
  private final static QName _ObligationRecipient_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationRecipient");
  private final static QName _PersonOtherIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOtherIdentification");
  private final static QName _DocumentDisputedReasonText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentDisputedReasonText");
  private final static QName _PersonAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAssociation");
  private final static QName _ActivitySiteAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivitySiteAssociation");
  private final static QName _ReportingPersonRoleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReportingPersonRoleText");
  private final static QName _HazmatAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HazmatAbstract");
  private final static QName _Attachment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Attachment");
  private final static QName _BinaryHashAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHashAugmentationPoint");
  private final static QName _PersonNationalityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNationalityText");
  private final static QName _DeviceStoredInformationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredInformationAbstract");
  private final static QName _DocumentSensitivityAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSensitivityAbstract");
  private final static QName _LocaleCommunityName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleCommunityName");
  private final static QName _ActivityIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityIdentification");
  private final static QName _Area_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Area");
  private final static QName _MilitarySummaryAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitarySummaryAugmentationPoint");
  private final static QName _PublisherName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublisherName");
  private final static QName _MeasureErrorAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureErrorAbstract");
  private final static QName _LocationElevation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationElevation");
  private final static QName _ItemCurrentResaleValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemCurrentResaleValue");
  private final static QName _ProgressAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgressAugmentationPoint");
  private final static QName _TelephoneLineID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneLineID");
  private final static QName _ActivityPersonAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityPersonAssociationAugmentationPoint");
  private final static QName _HighwayID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HighwayID");
  private final static QName _ContactTelephoneNumber_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactTelephoneNumber");
  private final static QName _JurisdictionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "JurisdictionText");
  private final static QName _PersonDisunion_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisunion");
  private final static QName _OrganizationSupervisesFacilityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationSupervisesFacilityAssociation");
  private final static QName _IntangibleItemCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntangibleItemCategoryAbstract");
  private final static QName _AreaAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaAugmentationPoint");
  private final static QName _AirportAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AirportAugmentationPoint");
  private final static QName _ElectronicEquipment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicEquipment");
  private final static QName _LocaleJudicialDistrictName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleJudicialDistrictName");
  private final static QName _PersonUnionLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionLocation");
  private final static QName _DocumentSummaryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSummaryText");
  private final static QName _ObligationTotalAmount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationTotalAmount");
  private final static QName _ActivityDocumentAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityDocumentAssociationAugmentationPoint");
  private final static QName _DispositionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionText");
  private final static QName _DepartureLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DepartureLocation");
  private final static QName _RelativeLocationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationAugmentationPoint");
  private final static QName _MilitarySummary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitarySummary");
  private final static QName _TelephoneAreaCodeID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneAreaCodeID");
  private final static QName _DocumentIssuanceDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIssuanceDate");
  private final static QName _VesselMakeAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselMakeAbstract");
  private final static QName _StateISO3166Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StateISO3166Code");
  private final static QName _RequestStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestStatus");
  private final static QName _Decal_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Decal");
  private final static QName _Location3DGeospatialCoordinateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Location3DGeospatialCoordinateAugmentationPoint");
  private final static QName _ReferralEntity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralEntity");
  private final static QName _ActivityReasonText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityReasonText");
  private final static QName _ItemCurrentLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemCurrentLocationAssociation");
  private final static QName _ManifestAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ManifestAugmentationPoint");
  private final static QName _AngularDegreeValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularDegreeValue");
  private final static QName _SupervisionSupervisor_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionSupervisor");
  private final static QName _ItemDisposition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDisposition");
  private final static QName _MessageRecipientAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageRecipientAbstract");
  private final static QName _SupervisionPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionPerson");
  private final static QName _RangeMinimumIntegerValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMinimumIntegerValue");
  private final static QName _WeaponIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponIndicator");
  private final static QName _LocationStreet_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationStreet");
  private final static QName _IdentityCreationEventText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityCreationEventText");
  private final static QName _IdentificationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationCategoryText");
  private final static QName _LocalePoliceGridText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocalePoliceGridText");
  private final static QName _PaymentAmount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PaymentAmount");
  private final static QName _ContactRadioChannelText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactRadioChannelText");
  private final static QName _Weapon_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Weapon");
  private final static QName _PersonBuildAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBuildAbstract");
  private final static QName _Chemical_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Chemical");
  private final static QName _DocumentCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCategoryAbstract");
  private final static QName _ObligationPaidDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationPaidDate");
  private final static QName _SpeedMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SpeedMeasureAugmentationPoint");
  private final static QName _TaskStartDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskStartDate");
  private final static QName _PersonDependentQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDependentQuantity");
  private final static QName _CaveatText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaveatText");
  private final static QName _AngularSecondValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularSecondValue");
  private final static QName _PersonBirthLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBirthLocation");
  private final static QName _OrganizationFacilityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationFacilityAssociationAugmentationPoint");
  private final static QName _ProbabilityPercent_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProbabilityPercent");
  private final static QName _AreaCircularRegion_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaCircularRegion");
  private final static QName _DisciplinaryActionProgram_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionProgram");
  private final static QName _ItemMoverAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemMoverAssociation");
  private final static QName _PublicServiceAvailabilitySchedule_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceAvailabilitySchedule");
  private final static QName _PaymentMethodCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PaymentMethodCode");
  private final static QName _TaskDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskDescriptionText");
  private final static QName _RequestDecisionDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestDecisionDate");
  private final static QName _FiscalYearDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FiscalYearDate");
  private final static QName _TaskEndDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskEndDate");
  private final static QName _PersonUnionStatusCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionStatusCode");
  private final static QName _DeviceStoredDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredDocument");
  private final static QName _EmployeePositionName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeePositionName");
  private final static QName _DisciplinaryActionPerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionPerson");
  private final static QName _ScheduleDayStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayStatus");
  private final static QName _InsuranceCarrierName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCarrierName");
  private final static QName _MeasureValueAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureValueAbstract");
  private final static QName _MilitaryStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryStatus");
  private final static QName _BinaryCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryCategoryText");
  private final static QName _StatusCommentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusCommentText");
  private final static QName _ConditionDisciplinaryAction_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionDisciplinaryAction");
  private final static QName _IncidentAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentAugmentationPoint");
  private final static QName _SupervisionPersonStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionPersonStatus");
  private final static QName _InjuryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryDescriptionText");
  private final static QName _PersonDetainmentLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDetainmentLocationAssociation");
  private final static QName _StatusAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusAbstract");
  private final static QName _InsuranceCertifiedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCertifiedDate");
  private final static QName _SiteLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteLocation");
  private final static QName _AddressGridText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressGridText");
  private final static QName _ConditionMandatoryIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionMandatoryIndicator");
  private final static QName _ItemValueDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueDate");
  private final static QName _FacilityDocumentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityDocumentAssociation");
  private final static QName _ItemFirstSoldYearDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemFirstSoldYearDate");
  private final static QName _ProgramAdministrator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramAdministrator");
  private final static QName _VehicleTowerAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleTowerAssociation");
  private final static QName _DrugCoverageExceptionReasonText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugCoverageExceptionReasonText");
  private final static QName _AssessmentAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentAugmentationPoint");
  private final static QName _SecuritiesDenominationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesDenominationAbstract");
  private final static QName _AddressBuildingName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressBuildingName");
  private final static QName _ActivityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityDescriptionText");
  private final static QName _TimeMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TimeMeasureAugmentationPoint");
  private final static QName _BeginTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BeginTime");
  private final static QName _OrganizationLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationLocation");
  private final static QName _ActivityAdministratorPersonAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityAdministratorPersonAssociation");
  private final static QName _PersonHomeContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHomeContactInformation");
  private final static QName _OrganizationParentAffiliate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationParentAffiliate");
  private final static QName _DocumentPermanentRecordIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentPermanentRecordIndicator");
  private final static QName _Base64BinaryObject_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Base64BinaryObject");
  private final static QName _FacilitySubFacilityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySubFacilityAssociationAugmentationPoint");
  private final static QName _AddressCrossStreet_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressCrossStreet");
  private final static QName _ItemSeller_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemSeller");
  private final static QName _StatusIssuerIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusIssuerIdentification");
  private final static QName _EmploymentStatus_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmploymentStatus");
  private final static QName _MeasureDecimalValueList_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDecimalValueList");
  private final static QName _SupervisionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionAugmentationPoint");
  private final static QName _DocumentIssuanceLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIssuanceLocation");
  private final static QName _ObligationDueAmount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationDueAmount");
  private final static QName _StreetFullText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetFullText");
  private final static QName _ObligationDueDuration_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationDueDuration");
  private final static QName _SupervisionRelease_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionRelease");
  private final static QName _DrugDaysSupplyQuantity_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugDaysSupplyQuantity");
  private final static QName _PersonMedicalCondition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMedicalCondition");
  private final static QName _AnomalyCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyCategoryAbstract");
  private final static QName _PassportAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportAugmentationPoint");
  private final static QName _VolumeMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VolumeMeasureAugmentationPoint");
  private final static QName _MeasureDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDate");
  private final static QName _AngularMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularMeasureAugmentationPoint");
  private final static QName _PassportTransmissionTrackingID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportTransmissionTrackingID");
  private final static QName _SystemOperatingModeAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemOperatingModeAbstract");
  private final static QName _ItemRFIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemRFIdentification");
  private final static QName _CommentTitleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommentTitleText");
  private final static QName _ItemBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemBinary");
  private final static QName _JurisdictionIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "JurisdictionIdentification");
  private final static QName _DeviceReceivedInformationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceReceivedInformationAbstract");
  private final static QName _LocationRelativeLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationRelativeLocation");
  private final static QName _SiteAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteAugmentationPoint");
  private final static QName _AddressPrivateMailboxText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressPrivateMailboxText");
  private final static QName _ConveyanceCategoryCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceCategoryCode");
  private final static QName _DocumentStatusDetails_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentStatusDetails");
  private final static QName _ParentFacility_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ParentFacility");
  private final static QName _InjurySeverityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjurySeverityText");
  private final static QName _CircularRegionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CircularRegionAugmentationPoint");
  private final static QName _PersonResidesAtFacilityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonResidesAtFacilityAssociation");
  private final static QName _ScheduleNonStopIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleNonStopIndicator");
  private final static QName _MedicalConditionDateRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionDateRange");
  private final static QName _FinancialAccountListedName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountListedName");
  private final static QName _MessageAttachmentDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageAttachmentDocument");
  private final static QName _PersonConveyanceAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonConveyanceAssociationAugmentationPoint");
  private final static QName _SubstanceAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceAugmentationPoint");
  private final static QName _AddressGridID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressGridID");
  private final static QName _DocumentSubjectText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSubjectText");
  private final static QName _PersonDentalCharacteristicAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDentalCharacteristicAbstract");
  private final static QName _ConsumptionRateMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConsumptionRateMeasure");
  private final static QName _DateRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateRepresentation");
  private final static QName _FinancialAccount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccount");
  private final static QName _DEAClassScheduleCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DEAClassScheduleCode");
  private final static QName _AnomalyLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyLocation");
  private final static QName _InclinationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InclinationAbstract");
  private final static QName _PersonWritesLanguageIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWritesLanguageIndicator");
  private final static QName _InjuryTreatment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryTreatment");
  private final static QName _AddressDeliveryPointText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressDeliveryPointText");
  private final static QName _StreetCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetCategoryText");
  private final static QName _CaseYearDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseYearDate");
  private final static QName _LocationContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationContactInformation");
  private final static QName _HighwayName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HighwayName");
  private final static QName _ActivityInformationAbstracterOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityInformationAbstracterOrganizationAssociation");
  private final static QName _PersonIssuedDocumentAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonIssuedDocumentAssociation");
  private final static QName _OrganizationForeignAffiliate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationForeignAffiliate");
  private final static QName _DocumentIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIdentification");
  private final static QName _Location3DGeospatialCoordinate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Location3DGeospatialCoordinate");
  private final static QName _PersonUnionAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionAssociation");
  private final static QName _SecuritiesAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesAugmentationPoint");
  private final static QName _SubstanceCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceCategoryText");
  private final static QName _Bearing_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Bearing");
  private final static QName _AmountAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AmountAugmentationPoint");
  private final static QName _MeasureTextList_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureTextList");
  private final static QName _RequestCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestCategoryAbstract");
  private final static QName _EmployeeOccupationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeOccupationCategoryText");
  private final static QName _PersonFacialHairAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonFacialHairAbstract");
  private final static QName _LocationGeospatialCoordinateAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationGeospatialCoordinateAbstract");
  private final static QName _InjurySustainer_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjurySustainer");
  private final static QName _CaseDocketID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDocketID");
  private final static QName _FinancialObligationExemptionAmount_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialObligationExemptionAmount");
  private final static QName _EncounterCommentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EncounterCommentText");
  private final static QName _InsuranceCoveredItem_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsuranceCoveredItem");
  private final static QName _LongitudeCoordinateAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LongitudeCoordinateAugmentationPoint");
  private final static QName _ScheduleDayEndTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayEndTime");
  private final static QName _MACAddressID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MACAddressID");
  private final static QName _MessageText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageText");
  private final static QName _OrganizationDoingBusinessAsName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationDoingBusinessAsName");
  private final static QName _PermitIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitIdentification");
  private final static QName _PersonPassportIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPassportIdentification");
  private final static QName _PersonUnionCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionCategoryText");
  private final static QName _RecommendationDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationDescriptionText");
  private final static QName _AreaPolygonRegion_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaPolygonRegion");
  private final static QName _ItemConditionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemConditionText");
  private final static QName _LocalePoliceJurisdictionID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocalePoliceJurisdictionID");
  private final static QName _DirectDialTelephoneNumberID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DirectDialTelephoneNumberID");
  private final static QName _InsurancePolicyHolder_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsurancePolicyHolder");
  private final static QName _CapabilityIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityIdentification");
  private final static QName _DocumentPublicationDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentPublicationDate");
  private final static QName _ContactRadioAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactRadioAugmentationPoint");
  private final static QName _DeviceStoredText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredText");
  private final static QName _OrganizationPrincipalOfficialAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationPrincipalOfficialAssociation");
  private final static QName _MeasureUnitText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureUnitText");
  private final static QName _DeviceStoredImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredImage");
  private final static QName _LocationCountryISO3166Alpha3Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountryISO3166Alpha3Code");
  private final static QName _VesselHullMaterialAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselHullMaterialAbstract");
  private final static QName _PersonEmploymentAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEmploymentAssociationAugmentationPoint");
  private final static QName _AngularRateMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularRateMeasureAugmentationPoint");
  private final static QName _Association_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Association");
  private final static QName _OrganizationIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationIdentification");
  private final static QName _LatitudeCoordinate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LatitudeCoordinate");
  private final static QName _MeasureUnsignedIntegerValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureUnsignedIntegerValue");
  private final static QName _RoleOfAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RoleOfAbstract");
  private final static QName _ItemDispositionLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDispositionLocationAssociation");
  private final static QName _LocationDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationDescriptionText");
  private final static QName _ContactRadioCallSignID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactRadioCallSignID");
  private final static QName _EquipmentName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EquipmentName");
  private final static QName _BinaryLocationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryLocationText");
  private final static QName _PersonGivenName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonGivenName");
  private final static QName _LanguageAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LanguageAbstract");
  private final static QName _PersonReligionAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonReligionAbstract");
  private final static QName _DocumentFileName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFileName");
  private final static QName _MeasureRangeAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureRangeAbstract");
  private final static QName _BinaryURI_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryURI");
  private final static QName _PersonHumanResourceIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHumanResourceIdentification");
  private final static QName _ActivitySupervisorOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivitySupervisorOrganizationAssociation");
  private final static QName _CaseCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseCategoryText");
  private final static QName _DeviceStoredAudioBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceStoredAudioBinary");
  private final static QName _PublicServiceRequiredService_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceRequiredService");
  private final static QName _ScheduleDayAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayAbstract");
  private final static QName _IntellectualPropertyRegistrationIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyRegistrationIdentification");
  private final static QName _CoordinatingAgency_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CoordinatingAgency");
  private final static QName _PersonFraudulentIdentificationIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonFraudulentIdentificationIndicator");
  private final static QName _LatitudeMinuteValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LatitudeMinuteValue");
  private final static QName _DeviceElectronicAddress_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceElectronicAddress");
  private final static QName _BinaryFormatText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryFormatText");
  private final static QName _ItemOwnershipCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOwnershipCategoryText");
  private final static QName _DeviceUser_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceUser");
  private final static QName _DispositionDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionDescriptionText");
  private final static QName _Obligation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Obligation");
  private final static QName _LengthMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LengthMeasure");
  private final static QName _PersonMiddleName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMiddleName");
  private final static QName _ItemHeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemHeightMeasure");
  private final static QName _RecommendationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationText");
  private final static QName _FacilityUsageCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityUsageCode");
  private final static QName _CapabilityAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityAugmentationPoint");
  private final static QName _PersonKnownPreviousLocationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonKnownPreviousLocationAssociation");
  private final static QName _MessageAttachmentImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageAttachmentImage");
  private final static QName _PersonRaceText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonRaceText");
  private final static QName _LastVerifiedDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LastVerifiedDate");
  private final static QName _CaseDisposition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDisposition");
  private final static QName _MessageSenderName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSenderName");
  private final static QName _ConsumptionRateMeasureAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConsumptionRateMeasureAugmentationPoint");
  private final static QName _FacilityIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityIdentification");
  private final static QName _MeasureErrorText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureErrorText");
  private final static QName _PersonWorkPlaceAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorkPlaceAbstract");
  private final static QName _EntityItem_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityItem");
  private final static QName _PassportCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportCategoryText");
  private final static QName _Release_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Release");
  private final static QName _PersonComplexionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonComplexionText");
  private final static QName _FacilitySubFacilityAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySubFacilityAssociation");
  private final static QName _ObligationCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationCategoryText");
  private final static QName _InjuryDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryDate");
  private final static QName _VesselHullMaterialText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselHullMaterialText");
  private final static QName _DispositionInstrument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionInstrument");
  private final static QName _StreetExtensionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetExtensionText");
  private final static QName _Treatment_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Treatment");
  private final static QName _SIMCard_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SIMCard");
  private final static QName _ActivityInformationClearerOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityInformationClearerOrganizationAssociation");
  private final static QName _ProgramPurposeText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramPurposeText");
  private final static QName _ObligationRecurrence_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationRecurrence");
  private final static QName _TemperatureUnitAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TemperatureUnitAbstract");
  private final static QName _OrganizationParentOrganization_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationParentOrganization");
  private final static QName _TelephoneExchangeID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneExchangeID");
  private final static QName _MedicalCondition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalCondition");
  private final static QName _SecuritiesCollectionDateRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesCollectionDateRange");
  private final static QName _CrisisImage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisImage");
  private final static QName _MapLocationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapLocationAugmentationPoint");
  private final static QName _DocumentDispositionInstructionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentDispositionInstructionText");
  private final static QName _LocationCountryName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountryName");
  private final static QName _PublicServiceCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceCategoryAbstract");
  private final static QName _Mission_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Mission");
  private final static QName _ConveyanceColorPrimaryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceColorPrimaryText");
  private final static QName _GeographicCoordinateLatitude_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "GeographicCoordinateLatitude");
  private final static QName _FullTelephoneNumber_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FullTelephoneNumber");
  private final static QName _CapabilityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityDescriptionText");
  private final static QName _LocationCountyCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountyCode");
  private final static QName _CrossStreetDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrossStreetDescriptionText");
  private final static QName _ObligationPeriodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationPeriodText");
  private final static QName _AnomalyDateTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyDateTime");
  private final static QName _PersonBloodTypeAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBloodTypeAbstract");
  private final static QName _PrimaryDocument_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PrimaryDocument");
  private final static QName _ItemDispositionAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDispositionAugmentationPoint");
  private final static QName _FacilityCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityCategoryText");
  private final static QName _PermitCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitCategoryText");
  private final static QName _FacilityUsageAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityUsageAbstract");
  private final static QName _PersonHandednessAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHandednessAbstract");
  private final static QName _TemperatureUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TemperatureUnitCode");
  private final static QName _ReleasePerson_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleasePerson");
  private final static QName _SensitivityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SensitivityText");
  private final static QName _FacilitySiteAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySiteAssociation");
  private final static QName _ItemActionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemActionText");
  private final static QName _PreviousActivityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PreviousActivityAssociationAugmentationPoint");
  private final static QName _MessageSubjectText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSubjectText");
  private final static QName _AngularRateMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularRateMeasure");
  private final static QName _ItemEntityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemEntityAssociationAugmentationPoint");
  private final static QName _ConveyanceMotorizedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceMotorizedIndicator");
  private final static QName _MeasureCommentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureCommentText");
  private final static QName _ItemPossessorAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemPossessorAssociation");
  private final static QName _OrganizationNightContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationNightContactInformation");
  private final static QName _EntityName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityName");
  private final static QName _RequestDecisionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestDecisionText");
  private final static QName _IncidentJurisdictionalOrganization_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentJurisdictionalOrganization");
  private final static QName _MedicalConditionPresentIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionPresentIndicator");
  private final static QName _PersonUnionSeparation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionSeparation");
  private final static QName _OrganizationPrimaryContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationPrimaryContactInformation");
  private final static QName _LocaleEmergencyServicesJurisdictionID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleEmergencyServicesJurisdictionID");
  private final static QName _CoworkerAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CoworkerAssociation");
  private final static QName _PersonOrganizationAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganizationAssociation");
  private final static QName _LocationCountryISO3166NumericCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCountryISO3166NumericCode");
  private final static QName _DeviceSentInformationAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceSentInformationAbstract");
  private final static QName _RangeMinimumDoubleValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMinimumDoubleValue");
  private final static QName _RequestDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestDescriptionText");
  private final static QName _PersonUnionSeparationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionSeparationAugmentationPoint");
  private final static QName _ConveyanceTowedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceTowedIndicator");
  private final static QName _RelatedCaseAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelatedCaseAssociation");
  private final static QName _ItemCategoryAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemCategoryAbstract");
  private final static QName _MeasureDoubleRange_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDoubleRange");
  private final static QName _PersonFullName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonFullName");
  private final static QName _PersonSkinToneAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSkinToneAbstract");
  private final static QName _AnomalyAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyAugmentationPoint");
  private final static QName _PersonEthnicityAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEthnicityAbstract");
  private final static QName _PersonAccentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAccentText");
  private final static QName _TimeUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "TimeUnitCode");
  private final static QName _StatusAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusAugmentationPoint");
  private final static QName _MissionStagingLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionStagingLocation");
  private final static QName _PersonEthnicityText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEthnicityText");
  private final static QName _MeasureMethodText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureMethodText");
  private final static QName _MessageRecipientAddressID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageRecipientAddressID");
  private final static QName _MapVersionID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapVersionID");
  private final static QName _PaymentMethodAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PaymentMethodAbstract");
  private final static QName _StatusDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusDescriptionText");
  private final static QName _PassportElectronicIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportElectronicIndicator");
  private final static QName _CommentText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommentText");
  private final static QName _DateMarginOfErrorDuration_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateMarginOfErrorDuration");
  private final static QName _EntityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityDescriptionText");
  private final static QName _StreetNumberText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetNumberText");
  private final static QName _MapName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapName");
  private final static QName _BinaryCapturer_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryCapturer");
  private final static QName _BinarySizeValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinarySizeValue");
  private final static QName _ItemVisibleID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemVisibleID");
  private final static QName _Condition_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Condition");
  private final static QName _ProgramSupervisedIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramSupervisedIndicator");
  private final static QName _SubstanceUnitAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceUnitAbstract");
  private final static QName _VehicleAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleAugmentationPoint");
  private final static QName _LocationRouteName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationRouteName");
  private final static QName _OrganizationSubsidiaryAssociation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationSubsidiaryAssociation");
  private final static QName _EntityContactInformation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityContactInformation");
  private final static QName _RealEstateBoundaryDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RealEstateBoundaryDescriptionText");
  private final static QName _RelativeLocationDistanceMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationDistanceMeasure");
  private final static QName _Email_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Email");
  private final static QName _ScheduleDay_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDay");
  private final static QName _ActivityCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityCategoryText");
  private final static QName _ActivityConveyanceAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityConveyanceAssociationAugmentationPoint");
  private final static QName _WeaponUser_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponUser");
  private final static QName _HighwayAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HighwayAugmentationPoint");
  private final static QName _MessageAttachmentBinary_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageAttachmentBinary");
  private final static QName _PersonMedicalFileIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMedicalFileIndicator");
  private final static QName _RelatedActivityAssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelatedActivityAssociationAugmentationPoint");
  private final static QName _CapabilityName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityName");
  private final static QName _EmployeeID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeID");
  private final static QName _CreatorName_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CreatorName");
  private final static QName _DecalMonthDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalMonthDate");
  private final static QName _Conveyance_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Conveyance");
  private final static QName _CrisisAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisAugmentationPoint");
  private final static QName _HazardousMaterial_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "HazardousMaterial");
  private final static QName _IntellectualPropertyTerminationEventText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyTerminationEventText");
  private final static QName _PersonSecondaryLanguage_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSecondaryLanguage");
  private final static QName _DocumentCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCategoryText");
  private final static QName _WeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeightMeasure");
  private final static QName _LongitudeCoordinate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LongitudeCoordinate");
  private final static QName _LocaleCensusTractID_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleCensusTractID");
  private final static QName _ReleaseFromLocation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseFromLocation");
  private final static QName _SpeedUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SpeedUnitCode");
  private final static QName _DocumentInformationCutOffDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentInformationCutOffDate");
  private final static QName _GeographicDatumAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "GeographicDatumAbstract");
  private final static QName _CapabilityCategoryText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityCategoryText");
  private final static QName _PersonSurNamePrefixText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSurNamePrefixText");
  private final static QName _LocalePoliceBeatText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocalePoliceBeatText");
  private final static QName _Supervision_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "Supervision");
  private final static QName _CaseTitleText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseTitleText");
  private final static QName _OrientationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrientationAugmentationPoint");
  private final static QName _BinaryObjectAbstract_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryObjectAbstract");
  private final static QName _InsurancePolicyIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsurancePolicyIdentification");
  private final static QName _SecuritiesDenominationText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesDenominationText");
  private final static QName _CountryRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "CountryRepresentation");
  private final static QName _ContactEntityDescriptionText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactEntityDescriptionText");
  private final static QName _MilitaryServiceActiveIndicator_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryServiceActiveIndicator");
  private final static QName _PublicServiceChannelText_QNAME = new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceChannelText");

  public ObjectFactory() {
  }

  public DocumentType createDocumentType() {
    return new DocumentType();
  }

  public PersonEncounterType createPersonEncounterType() {
    return new PersonEncounterType();
  }

  public PersonType createPersonType() {
    return new PersonType();
  }

  public WeightMeasureType createWeightMeasureType() {
    return new WeightMeasureType();
  }

  public TextType createTextType() {
    return new TextType();
  }

  public PersonConveyanceAssociationType createPersonConveyanceAssociationType() {
    return new PersonConveyanceAssociationType();
  }

  public ContactInformationType createContactInformationType() {
    return new ContactInformationType();
  }

  public EntityType createEntityType() {
    return new EntityType();
  }

  public HighwayType createHighwayType() {
    return new HighwayType();
  }

  public Degree180PlusMinusType createDegree180PlusMinusType() {
    return new Degree180PlusMinusType();
  }

  public DateType createDateType() {
    return new DateType();
  }

  public PersonLanguageType createPersonLanguageType() {
    return new PersonLanguageType();
  }

  public UTMCoordinateType createUTMCoordinateType() {
    return new UTMCoordinateType();
  }

  public FinancialAccountHolderType createFinancialAccountHolderType() {
    return new FinancialAccountHolderType();
  }

  public AreaType createAreaType() {
    return new AreaType();
  }

  public ActivityConveyanceAssociationType createActivityConveyanceAssociationType() {
    return new ActivityConveyanceAssociationType();
  }

  public LocationType createLocationType() {
    return new LocationType();
  }

  public OrganizationUnitAssociationType createOrganizationUnitAssociationType() {
    return new OrganizationUnitAssociationType();
  }

  public ItemLocationAssociationType createItemLocationAssociationType() {
    return new ItemLocationAssociationType();
  }

  public ObligationType createObligationType() {
    return new ObligationType();
  }

  public PersonNameTextType createPersonNameTextType() {
    return new PersonNameTextType();
  }

  public IdentificationType createIdentificationType() {
    return new IdentificationType();
  }

  public PersonNameType createPersonNameType() {
    return new PersonNameType();
  }

  public LatitudeDegreeType createLatitudeDegreeType() {
    return new LatitudeDegreeType();
  }

  public VehicleType createVehicleType() {
    return new VehicleType();
  }

  public TelecommunicationDeviceSIMCardAssociationType createTelecommunicationDeviceSIMCardAssociationType() {
    return new TelecommunicationDeviceSIMCardAssociationType();
  }

  public ActivityOrganizationAssociationType createActivityOrganizationAssociationType() {
    return new ActivityOrganizationAssociationType();
  }

  public ProgramType createProgramType() {
    return new ProgramType();
  }

  public TelephoneNumberType createTelephoneNumberType() {
    return new TelephoneNumberType();
  }

  public StatusType createStatusType() {
    return new StatusType();
  }

  public EncounterClassificationType createEncounterClassificationType() {
    return new EncounterClassificationType();
  }

  public ItemValueType createItemValueType() {
    return new ItemValueType();
  }

  public LocationHeightMeasureType createLocationHeightMeasureType() {
    return new LocationHeightMeasureType();
  }

  public VolumeMeasureType createVolumeMeasureType() {
    return new VolumeMeasureType();
  }

  public AddressCategoryCodeType createAddressCategoryCodeType() {
    return new AddressCategoryCodeType();
  }

  public ActivityScheduleAssociationType createActivityScheduleAssociationType() {
    return new ActivityScheduleAssociationType();
  }

  public OrganizationType createOrganizationType() {
    return new OrganizationType();
  }

  public InjuryType createInjuryType() {
    return new InjuryType();
  }

  public ConditionType createConditionType() {
    return new ConditionType();
  }

  public CaseDispositionDecisionType createCaseDispositionDecisionType() {
    return new CaseDispositionDecisionType();
  }

  public Location2DGeospatialCoordinateType createLocation2DGeospatialCoordinateType() {
    return new Location2DGeospatialCoordinateType();
  }

  public ProperNameTextType createProperNameTextType() {
    return new ProperNameTextType();
  }

  public LocaleType createLocaleType() {
    return new LocaleType();
  }

  public DirectionCodeType createDirectionCodeType() {
    return new DirectionCodeType();
  }

  public PersonEmploymentAssociationType createPersonEmploymentAssociationType() {
    return new PersonEmploymentAssociationType();
  }

  public BinaryType createBinaryType() {
    return new BinaryType();
  }

  public LocationContactInformationAssociationType createLocationContactInformationAssociationType() {
    return new LocationContactInformationAssociationType();
  }

  public AirportType createAirportType() {
    return new AirportType();
  }

  public DispositionType createDispositionType() {
    return new DispositionType();
  }

  public TimeMeasureType createTimeMeasureType() {
    return new TimeMeasureType();
  }

  public FacilityType createFacilityType() {
    return new FacilityType();
  }

  public DateRangeType createDateRangeType() {
    return new DateRangeType();
  }

  public ImageType createImageType() {
    return new ImageType();
  }

  public LengthMeasureType createLengthMeasureType() {
    return new LengthMeasureType();
  }

  public PersonWorkerAssociationType createPersonWorkerAssociationType() {
    return new PersonWorkerAssociationType();
  }

  public ActivityPersonAssociationType createActivityPersonAssociationType() {
    return new ActivityPersonAssociationType();
  }

  public GenericEntityType createGenericEntityType() {
    return new GenericEntityType();
  }

  public IncidentType createIncidentType() {
    return new IncidentType();
  }

  public AircraftType createAircraftType() {
    return new AircraftType();
  }

  public SubstanceType createSubstanceType() {
    return new SubstanceType();
  }

  public QuantityType createQuantityType() {
    return new QuantityType();
  }

  public PassportCategoryCodeType createPassportCategoryCodeType() {
    return new PassportCategoryCodeType();
  }

  public SpeedMeasureType createSpeedMeasureType() {
    return new SpeedMeasureType();
  }

  public ItemType createItemType() {
    return new ItemType();
  }

  public InternationalTelephoneNumberType createInternationalTelephoneNumberType() {
    return new InternationalTelephoneNumberType();
  }

  public PhysicalFeatureType createPhysicalFeatureType() {
    return new PhysicalFeatureType();
  }

  public PublicServiceType createPublicServiceType() {
    return new PublicServiceType();
  }

  public PreviousActivityAssociationType createPreviousActivityAssociationType() {
    return new PreviousActivityAssociationType();
  }

  public UnsignedIntegerRangeType createUnsignedIntegerRangeType() {
    return new UnsignedIntegerRangeType();
  }

  public OrganizationFacilityAssociationType createOrganizationFacilityAssociationType() {
    return new OrganizationFacilityAssociationType();
  }

  public ActivityType createActivityType() {
    return new ActivityType();
  }

  public ContactRadioType createContactRadioType() {
    return new ContactRadioType();
  }

  public EquipmentType createEquipmentType() {
    return new EquipmentType();
  }

  public NANPTelephoneNumberType createNANPTelephoneNumberType() {
    return new NANPTelephoneNumberType();
  }

  public DeviceType createDeviceType() {
    return new DeviceType();
  }

  public IntegerListType createIntegerListType() {
    return new IntegerListType();
  }

  public RelativeLocationHeadingType createRelativeLocationHeadingType() {
    return new RelativeLocationHeadingType();
  }

  public RelativeLocationType createRelativeLocationType() {
    return new RelativeLocationType();
  }

  public PersonDocumentAssociationType createPersonDocumentAssociationType() {
    return new PersonDocumentAssociationType();
  }

  public SiteType createSiteType() {
    return new SiteType();
  }

  public MessageType createMessageType() {
    return new MessageType();
  }

  public IntangibleItemType createIntangibleItemType() {
    return new IntangibleItemType();
  }

  public TransportationAssociationType createTransportationAssociationType() {
    return new TransportationAssociationType();
  }

  public PersonLocationAssociationType createPersonLocationAssociationType() {
    return new PersonLocationAssociationType();
  }

  public AngularMinuteType createAngularMinuteType() {
    return new AngularMinuteType();
  }

  public OrganizationLocationAssociationType createOrganizationLocationAssociationType() {
    return new OrganizationLocationAssociationType();
  }

  public ActivityDocumentAssociationType createActivityDocumentAssociationType() {
    return new ActivityDocumentAssociationType();
  }

  public PersonAssociationType createPersonAssociationType() {
    return new PersonAssociationType();
  }

  public CircularRegionType createCircularRegionType() {
    return new CircularRegionType();
  }

  public PersonUnionCategoryCodeType createPersonUnionCategoryCodeType() {
    return new PersonUnionCategoryCodeType();
  }

  public DrugType createDrugType() {
    return new DrugType();
  }

  public MilitarySummaryType createMilitarySummaryType() {
    return new MilitarySummaryType();
  }

  public AmountType createAmountType() {
    return new AmountType();
  }

  public WeaponType createWeaponType() {
    return new WeaponType();
  }

  public ItemDispositionType createItemDispositionType() {
    return new ItemDispositionType();
  }

  public StreetType createStreetType() {
    return new StreetType();
  }

  public ItemEntityAssociationType createItemEntityAssociationType() {
    return new ItemEntityAssociationType();
  }

  public ScheduleType createScheduleType() {
    return new ScheduleType();
  }

  public PaymentMethodCodeType createPaymentMethodCodeType() {
    return new PaymentMethodCodeType();
  }

  public AngularSecondType createAngularSecondType() {
    return new AngularSecondType();
  }

  public DecalType createDecalType() {
    return new DecalType();
  }

  public ActivitySiteAssociationType createActivitySiteAssociationType() {
    return new ActivitySiteAssociationType();
  }

  public PersonDisunionType createPersonDisunionType() {
    return new PersonDisunionType();
  }

  public PersonIdentityAssociationType createPersonIdentityAssociationType() {
    return new PersonIdentityAssociationType();
  }

  public IntellectualPropertyType createIntellectualPropertyType() {
    return new IntellectualPropertyType();
  }

  public DocumentStatusDetailsType createDocumentStatusDetailsType() {
    return new DocumentStatusDetailsType();
  }

  public FacilityPersonAssociationType createFacilityPersonAssociationType() {
    return new FacilityPersonAssociationType();
  }

  public TreatmentType createTreatmentType() {
    return new TreatmentType();
  }

  public FinancialAccountType createFinancialAccountType() {
    return new FinancialAccountType();
  }

  public ConsumptionRateMeasureType createConsumptionRateMeasureType() {
    return new ConsumptionRateMeasureType();
  }

  public ReleaseType createReleaseType() {
    return new ReleaseType();
  }

  public MedicalConditionType createMedicalConditionType() {
    return new MedicalConditionType();
  }

  public FacilityDocumentAssociationType createFacilityDocumentAssociationType() {
    return new FacilityDocumentAssociationType();
  }

  public CrossStreetType createCrossStreetType() {
    return new CrossStreetType();
  }

  public DecimalListType createDecimalListType() {
    return new DecimalListType();
  }

  public FiscalYearDateType createFiscalYearDateType() {
    return new FiscalYearDateType();
  }

  public PersonUnionStatusCodeType createPersonUnionStatusCodeType() {
    return new PersonUnionStatusCodeType();
  }

  public DisciplinaryActionType createDisciplinaryActionType() {
    return new DisciplinaryActionType();
  }

  public ReferralType createReferralType() {
    return new ReferralType();
  }

  public DepartureType createDepartureType() {
    return new DepartureType();
  }

  public MeasureType createMeasureType() {
    return new MeasureType();
  }

  public MetadataType createMetadataType() {
    return new MetadataType();
  }

  public FacilityImageAssociationType createFacilityImageAssociationType() {
    return new FacilityImageAssociationType();
  }

  public SubstanceMeasureType createSubstanceMeasureType() {
    return new SubstanceMeasureType();
  }

  public SystemAuditEventType createSystemAuditEventType() {
    return new SystemAuditEventType();
  }

  public AnomalyType createAnomalyType() {
    return new AnomalyType();
  }

  public BinaryHashType createBinaryHashType() {
    return new BinaryHashType();
  }

  public FinancialAccountNumberCategoryCodeType createFinancialAccountNumberCategoryCodeType() {
    return new FinancialAccountNumberCategoryCodeType();
  }

  public FacilityAssociationType createFacilityAssociationType() {
    return new FacilityAssociationType();
  }

  public VesselType createVesselType() {
    return new VesselType();
  }

  public ItemTransactionType createItemTransactionType() {
    return new ItemTransactionType();
  }

  public DayOfWeekCodeType createDayOfWeekCodeType() {
    return new DayOfWeekCodeType();
  }

  public RealEstateType createRealEstateType() {
    return new RealEstateType();
  }

  public PersonOrganizationAssociationType createPersonOrganizationAssociationType() {
    return new PersonOrganizationAssociationType();
  }

  public SystemIdentificationType createSystemIdentificationType() {
    return new SystemIdentificationType();
  }

  public QuarterIDType createQuarterIDType() {
    return new QuarterIDType();
  }

  public SecuritiesType createSecuritiesType() {
    return new SecuritiesType();
  }

  public Degree360Type createDegree360Type() {
    return new Degree360Type();
  }

  public DocumentAssociationType createDocumentAssociationType() {
    return new DocumentAssociationType();
  }

  public AddressType createAddressType() {
    return new AddressType();
  }

  public DecimalRangeType createDecimalRangeType() {
    return new DecimalRangeType();
  }

  public AssessmentType createAssessmentType() {
    return new AssessmentType();
  }

  public CountryType createCountryType() {
    return new CountryType();
  }

  public SoftwareNameType createSoftwareNameType() {
    return new SoftwareNameType();
  }

  public PersonResidenceAssociationType createPersonResidenceAssociationType() {
    return new PersonResidenceAssociationType();
  }

  public DoubleListType createDoubleListType() {
    return new DoubleListType();
  }

  public CrisisType createCrisisType() {
    return new CrisisType();
  }

  public LongitudeCoordinateType createLongitudeCoordinateType() {
    return new LongitudeCoordinateType();
  }

  public SupervisionType createSupervisionType() {
    return new SupervisionType();
  }

  public ElectronicAddressType createElectronicAddressType() {
    return new ElectronicAddressType();
  }

  public JurisdictionType createJurisdictionType() {
    return new JurisdictionType();
  }

  public AddressGridType createAddressGridType() {
    return new AddressGridType();
  }

  public ScheduleDayType createScheduleDayType() {
    return new ScheduleDayType();
  }

  public ConveyanceType createConveyanceType() {
    return new ConveyanceType();
  }

  public NonNegativeDecimalType createNonNegativeDecimalType() {
    return new NonNegativeDecimalType();
  }

  public PersonNameCategoryCodeType createPersonNameCategoryCodeType() {
    return new PersonNameCategoryCodeType();
  }

  public CapabilityType createCapabilityType() {
    return new CapabilityType();
  }

  public ActivityFacilityAssociationType createActivityFacilityAssociationType() {
    return new ActivityFacilityAssociationType();
  }

  public ItemContainerAssociationType createItemContainerAssociationType() {
    return new ItemContainerAssociationType();
  }

  public TaskType createTaskType() {
    return new TaskType();
  }

  public SeparationCategoryCodeType createSeparationCategoryCodeType() {
    return new SeparationCategoryCodeType();
  }

  public BinaryHashFunctionCodeType createBinaryHashFunctionCodeType() {
    return new BinaryHashFunctionCodeType();
  }

  public ManifestType createManifestType() {
    return new ManifestType();
  }

  public AssociationType createAssociationType() {
    return new AssociationType();
  }

  public LatitudeCoordinateType createLatitudeCoordinateType() {
    return new LatitudeCoordinateType();
  }

  public PolygonRegionType createPolygonRegionType() {
    return new PolygonRegionType();
  }

  public Location3DGeospatialCoordinateType createLocation3DGeospatialCoordinateType() {
    return new Location3DGeospatialCoordinateType();
  }

  public PersonUnionAssociationType createPersonUnionAssociationType() {
    return new PersonUnionAssociationType();
  }

  public BearingType createBearingType() {
    return new BearingType();
  }

  public StringListType createStringListType() {
    return new StringListType();
  }

  public DoubleRangeType createDoubleRangeType() {
    return new DoubleRangeType();
  }

  public RelatedActivityAssociationType createRelatedActivityAssociationType() {
    return new RelatedActivityAssociationType();
  }

  public FacilitySiteAssociationType createFacilitySiteAssociationType() {
    return new FacilitySiteAssociationType();
  }

  public AngularRateMeasureType createAngularRateMeasureType() {
    return new AngularRateMeasureType();
  }

  public PersonUnionSeparationType createPersonUnionSeparationType() {
    return new PersonUnionSeparationType();
  }

  public FullTelephoneNumberType createFullTelephoneNumberType() {
    return new FullTelephoneNumberType();
  }

  public MissionType createMissionType() {
    return new MissionType();
  }

  public FacilitySubFacilityAssociationType createFacilitySubFacilityAssociationType() {
    return new FacilitySubFacilityAssociationType();
  }

  public CaseDispositionType createCaseDispositionType() {
    return new CaseDispositionType();
  }

  public ObligationRecurrenceType createObligationRecurrenceType() {
    return new ObligationRecurrenceType();
  }

  public ZuluDateTimeType createZuluDateTimeType() {
    return new ZuluDateTimeType();
  }

  public PassportType createPassportType() {
    return new PassportType();
  }

  public OrganizationAssociationType createOrganizationAssociationType() {
    return new OrganizationAssociationType();
  }

  public TemperatureMeasureType createTemperatureMeasureType() {
    return new TemperatureMeasureType();
  }

  public ArrivalType createArrivalType() {
    return new ArrivalType();
  }

  public TimeRangeType createTimeRangeType() {
    return new TimeRangeType();
  }

  public ActivityItemAssociationType createActivityItemAssociationType() {
    return new ActivityItemAssociationType();
  }

  public Degree90Type createDegree90Type() {
    return new Degree90Type();
  }

  public RecommendationType createRecommendationType() {
    return new RecommendationType();
  }

  public FinancialAccountHolderCodeType createFinancialAccountHolderCodeType() {
    return new FinancialAccountHolderCodeType();
  }

  public InsuranceType createInsuranceType() {
    return new InsuranceType();
  }

  public PaymentType createPaymentType() {
    return new PaymentType();
  }

  public AngularMeasureType createAngularMeasureType() {
    return new AngularMeasureType();
  }

  public CodeType createCodeType() {
    return new CodeType();
  }

  public CommentType createCommentType() {
    return new CommentType();
  }

  public CaseType createCaseType() {
    return new CaseType();
  }

  public VelocityMeasureType createVelocityMeasureType() {
    return new VelocityMeasureType();
  }

  public MapLocationType createMapLocationType() {
    return new MapLocationType();
  }

  public MilitaryDischargeCategoryCodeType createMilitaryDischargeCategoryCodeType() {
    return new MilitaryDischargeCategoryCodeType();
  }

  public ProgressType createProgressType() {
    return new ProgressType();
  }

  public StateType createStateType() {
    return new StateType();
  }

  public PermitType createPermitType() {
    return new PermitType();
  }

  public Degree90PlusMinusType createDegree90PlusMinusType() {
    return new Degree90PlusMinusType();
  }

  public LongitudeDegreeType createLongitudeDegreeType() {
    return new LongitudeDegreeType();
  }

  public ObligationExemptionType createObligationExemptionType() {
    return new ObligationExemptionType();
  }

  public IntegerRangeType createIntegerRangeType() {
    return new IntegerRangeType();
  }

  public AngleMeasureType createAngleMeasureType() {
    return new AngleMeasureType();
  }

  public RequestType createRequestType() {
    return new RequestType();
  }

  public IdentityType createIdentityType() {
    return new IdentityType();
  }

  public MessageCategoryFATCACodeType createMessageCategoryFATCACodeType() {
    return new MessageCategoryFATCACodeType();
  }

  public DirectDialTelephoneNumberType createDirectDialTelephoneNumberType() {
    return new DirectDialTelephoneNumberType();
  }

  public ItemInsuranceAssociationType createItemInsuranceAssociationType() {
    return new ItemInsuranceAssociationType();
  }

  public ContactInformationAvailabilityCodeType createContactInformationAvailabilityCodeType() {
    return new ContactInformationAvailabilityCodeType();
  }

  public InstantMessengerType createInstantMessengerType() {
    return new InstantMessengerType();
  }

  public DeviceInformationAssociationType createDeviceInformationAssociationType() {
    return new DeviceInformationAssociationType();
  }

  public OffenseLevelCodeType createOffenseLevelCodeType() {
    return new OffenseLevelCodeType();
  }

  public BooleanListType createBooleanListType() {
    return new BooleanListType();
  }

  public NumericType createNumericType() {
    return new NumericType();
  }

  public SupervisionLevelCodeType createSupervisionLevelCodeType() {
    return new SupervisionLevelCodeType();
  }

  public PositiveIntegerListType createPositiveIntegerListType() {
    return new PositiveIntegerListType();
  }

  public OrientationType createOrientationType() {
    return new OrientationType();
  }

  public StatuteCategoryCodeType createStatuteCategoryCodeType() {
    return new StatuteCategoryCodeType();
  }

  public TokenListType createTokenListType() {
    return new TokenListType();
  }

  public PleaCategoryCodeType createPleaCategoryCodeType() {
    return new PleaCategoryCodeType();
  }

  public ImagePoseCodeType createImagePoseCodeType() {
    return new ImagePoseCodeType();
  }

  public SupervisionRestrictionCodeType createSupervisionRestrictionCodeType() {
    return new SupervisionRestrictionCodeType();
  }

  public NonNegativeIntegerListType createNonNegativeIntegerListType() {
    return new NonNegativeIntegerListType();
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorker")
  public JAXBElement<PersonType> createPersonWorker(PersonType value) {
    return new JAXBElement<PersonType>(_PersonWorker_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RiskReductionFacility")
  public JAXBElement<FacilityType> createRiskReductionFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_RiskReductionFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageID")
  public JAXBElement<String> createMessageID(String value) {
    return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDigitalImage")
  public JAXBElement<ImageType> createPersonDigitalImage(ImageType value) {
    return new JAXBElement<ImageType>(_PersonDigitalImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestAugmentationPoint")
  public JAXBElement<Object> createRequestAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_RequestAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AzimuthDecimalValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AzimuthAbstract")
  public JAXBElement<Decimal> createAzimuthDecimalValue(Decimal value) {
    return new JAXBElement<Decimal>(_AzimuthDecimalValue_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureUnsignedIntegerRange", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureRangeAbstract")
  public JAXBElement<UnsignedIntegerRangeType> createMeasureUnsignedIntegerRange(UnsignedIntegerRangeType value) {
    return new JAXBElement<UnsignedIntegerRangeType>(_MeasureUnsignedIntegerRange_QNAME, UnsignedIntegerRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LengthMeasureAugmentationPoint")
  public JAXBElement<Object> createLengthMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_LengthMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentStatusCategoryAbstract")
  public JAXBElement<Object> createDocumentStatusCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_DocumentStatusCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationOperatesFacilityAssociation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "OrganizationFacilityAssociation")
  public JAXBElement<OrganizationFacilityAssociationType> createOrganizationOperatesFacilityAssociation(OrganizationFacilityAssociationType value) {
    return new JAXBElement<OrganizationFacilityAssociationType>(_OrganizationOperatesFacilityAssociation_QNAME, OrganizationFacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLicenseIdentification")
  public JAXBElement<IdentificationType> createPersonLicenseIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonLicenseIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySiteDiagram")
  public JAXBElement<ImageType> createFacilitySiteDiagram(ImageType value) {
    return new JAXBElement<ImageType>(_FacilitySiteDiagram_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Equipment")
  public JAXBElement<EquipmentType> createEquipment(EquipmentType value) {
    return new JAXBElement<EquipmentType>(_Equipment_QNAME, EquipmentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "NANPTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberAbstract")
  public JAXBElement<NANPTelephoneNumberType> createNANPTelephoneNumber(NANPTelephoneNumberType value) {
    return new JAXBElement<NANPTelephoneNumberType>(_NANPTelephoneNumber_QNAME, NANPTelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SeparationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SeparationCategoryAbstract")
  public JAXBElement<TextType> createSeparationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_SeparationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameSuffixText")
  public JAXBElement<TextType> createPersonNameSuffixText(TextType value) {
    return new JAXBElement<TextType>(_PersonNameSuffixText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelatedActivity")
  public JAXBElement<ActivityType> createRelatedActivity(ActivityType value) {
    return new JAXBElement<ActivityType>(_RelatedActivity_QNAME, ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityInvolvementText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ActivityInvolvementAbstract")
  public JAXBElement<TextType> createActivityInvolvementText(TextType value) {
    return new JAXBElement<TextType>(_ActivityInvolvementText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSensitivityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentSensitivityAbstract")
  public JAXBElement<TextType> createDocumentSensitivityText(TextType value) {
    return new JAXBElement<TextType>(_DocumentSensitivityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionAugmentationPoint")
  public JAXBElement<Object> createMissionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_MissionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationSubUnitName")
  public JAXBElement<TextType> createOrganizationSubUnitName(TextType value) {
    return new JAXBElement<TextType>(_OrganizationSubUnitName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactRadio", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<ContactRadioType> createContactRadio(ContactRadioType value) {
    return new JAXBElement<ContactRadioType>(_ContactRadio_QNAME, ContactRadioType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselPropulsionAbstract")
  public JAXBElement<Object> createVesselPropulsionAbstract(Object value) {
    return new JAXBElement<Object>(_VesselPropulsionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Container")
  public JAXBElement<ItemType> createContainer(ItemType value) {
    return new JAXBElement<ItemType>(_Container_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InternationalTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberAbstract")
  public JAXBElement<InternationalTelephoneNumberType> createInternationalTelephoneNumber(InternationalTelephoneNumberType value) {
    return new JAXBElement<InternationalTelephoneNumberType>(_InternationalTelephoneNumber_QNAME, InternationalTelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLocationAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonLocationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonLocationAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonRaceAbstract")
  public JAXBElement<Object> createPersonRaceAbstract(Object value) {
    return new JAXBElement<Object>(_PersonRaceAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeature")
  public JAXBElement<PhysicalFeatureType> createPhysicalFeature(PhysicalFeatureType value) {
    return new JAXBElement<PhysicalFeatureType>(_PhysicalFeature_QNAME, PhysicalFeatureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemHoldingOrganization")
  public JAXBElement<OrganizationType> createItemHoldingOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_ItemHoldingOrganization_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleGrossLadenUnitWeightMeasure")
  public JAXBElement<WeightMeasureType> createVehicleGrossLadenUnitWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_VehicleGrossLadenUnitWeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleRegionName")
  public JAXBElement<TextType> createLocaleRegionName(TextType value) {
    return new JAXBElement<TextType>(_LocaleRegionName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SpeedMeasure")
  public JAXBElement<SpeedMeasureType> createSpeedMeasure(SpeedMeasureType value) {
    return new JAXBElement<SpeedMeasureType>(_SpeedMeasure_QNAME, SpeedMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentDispositionAuthorityName")
  public JAXBElement<TextType> createDocumentDispositionAuthorityName(TextType value) {
    return new JAXBElement<TextType>(_DocumentDispositionAuthorityName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLanguageEnglishIndicator")
  public JAXBElement<Boolean> createPersonLanguageEnglishIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonLanguageEnglishIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationCategoryAbstract")
  public JAXBElement<TextType> createLocationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_LocationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PreviousActivityAssociation")
  public JAXBElement<PreviousActivityAssociationType> createPreviousActivityAssociation(PreviousActivityAssociationType value) {
    return new JAXBElement<PreviousActivityAssociationType>(_PreviousActivityAssociation_QNAME, PreviousActivityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationIncorporationLocation")
  public JAXBElement<LocationType> createOrganizationIncorporationLocation(LocationType value) {
    return new JAXBElement<LocationType>(_OrganizationIncorporationLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentAlternativeTitleText")
  public JAXBElement<TextType> createDocumentAlternativeTitleText(TextType value) {
    return new JAXBElement<TextType>(_DocumentAlternativeTitleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryBranchName")
  public JAXBElement<TextType> createMilitaryBranchName(TextType value) {
    return new JAXBElement<TextType>(_MilitaryBranchName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLanguageAugmentationPoint")
  public JAXBElement<Object> createPersonLanguageAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonLanguageAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramCapacityQuantity")
  public JAXBElement<NonNegativeInteger> createProgramCapacityQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(_ProgramCapacityQuantity_QNAME, NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicService")
  public JAXBElement<PublicServiceType> createPublicService(PublicServiceType value) {
    return new JAXBElement<PublicServiceType>(_PublicService_QNAME, PublicServiceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSenderAddressID")
  public JAXBElement<String> createMessageSenderAddressID(String value) {
    return new JAXBElement<String>(_MessageSenderAddressID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryCategoryAbstract")
  public JAXBElement<Object> createInjuryCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_InjuryCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityResponsibleOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityResponsibleOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityResponsibleOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HazardousMaterialCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "HazmatAbstract")
  public JAXBElement<HazmatUNCodeType> createHazardousMaterialCode(HazmatUNCodeType value) {
    return new JAXBElement<HazmatUNCodeType>(_HazardousMaterialCode_QNAME, HazmatUNCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Substance")
  public JAXBElement<SubstanceType> createSubstance(SubstanceType value) {
    return new JAXBElement<SubstanceType>(_Substance_QNAME, SubstanceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCategoryAbstract")
  public JAXBElement<Object> createLocationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_LocationCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyancePassengerQuantity")
  public JAXBElement<QuantityType> createConveyancePassengerQuantity(QuantityType value) {
    return new JAXBElement<QuantityType>(_ConveyancePassengerQuantity_QNAME, QuantityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Identification")
  public JAXBElement<IdentificationType> createIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_Identification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountyAbstract")
  public JAXBElement<Object> createLocationCountyAbstract(Object value) {
    return new JAXBElement<Object>(_LocationCountyAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteMobileDescriptionText")
  public JAXBElement<TextType> createSiteMobileDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_SiteMobileDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationDirectionAbstract")
  public JAXBElement<Object> createRelativeLocationDirectionAbstract(Object value) {
    return new JAXBElement<Object>(_RelativeLocationDirectionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationEntity")
  public JAXBElement<EntityType> createObligationEntity(EntityType value) {
    return new JAXBElement<EntityType>(_ObligationEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesDateSeriesAbstract")
  public JAXBElement<Object> createSecuritiesDateSeriesAbstract(Object value) {
    return new JAXBElement<Object>(_SecuritiesDateSeriesAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorkLocation")
  public JAXBElement<LocationType> createPersonWorkLocation(LocationType value) {
    return new JAXBElement<LocationType>(_PersonWorkLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleUnladenWeightMeasure")
  public JAXBElement<WeightMeasureType> createVehicleUnladenWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_VehicleUnladenWeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PassportCategoryAbstract")
  public JAXBElement<PassportCategoryCodeType> createPassportCategoryCode(PassportCategoryCodeType value) {
    return new JAXBElement<PassportCategoryCodeType>(_PassportCategoryCode_QNAME, PassportCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceFuelCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ConveyanceFuelCategoryAbstract")
  public JAXBElement<TextType> createConveyanceFuelCategoryText(TextType value) {
    return new JAXBElement<TextType>(_ConveyanceFuelCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEmergencyContactInformation")
  public JAXBElement<ContactInformationType> createPersonEmergencyContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_PersonEmergencyContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalPeriodText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DecalPeriodAbstract")
  public JAXBElement<TextType> createDecalPeriodText(TextType value) {
    return new JAXBElement<TextType>(_DecalPeriodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityAugmentationPoint")
  public JAXBElement<Object> createEntityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_EntityAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageAugmentationPoint")
  public JAXBElement<Object> createMessageAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_MessageAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageReceivedDate")
  public JAXBElement<DateType> createMessageReceivedDate(DateType value) {
    return new JAXBElement<DateType>(_MessageReceivedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Document")
  public JAXBElement<DocumentType> createDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentLocation")
  public JAXBElement<LocationType> createDocumentLocation(LocationType value) {
    return new JAXBElement<LocationType>(_DocumentLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationIncorporatedIndicator")
  public JAXBElement<Boolean> createOrganizationIncorporatedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_OrganizationIncorporatedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSubmitter")
  public JAXBElement<EntityType> createDocumentSubmitter(EntityType value) {
    return new JAXBElement<EntityType>(_DocumentSubmitter_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TimeRangeAugmentationPoint")
  public JAXBElement<Object> createTimeRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_TimeRangeAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemInsuranceAssociationAugmentationPoint")
  public JAXBElement<Object> createItemInsuranceAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemInsuranceAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationHeightVerticalDatumAbstract")
  public JAXBElement<Object> createLocationHeightVerticalDatumAbstract(Object value) {
    return new JAXBElement<Object>(_LocationHeightVerticalDatumAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionCommencementNoLaterThanDate")
  public JAXBElement<DateType> createMissionCommencementNoLaterThanDate(DateType value) {
    return new JAXBElement<DateType>(_MissionCommencementNoLaterThanDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EquipmentAugmentationPoint")
  public JAXBElement<Object> createEquipmentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_EquipmentAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Location2DGeospatialCoordinateAugmentationPoint")
  public JAXBElement<Object> createLocation2DGeospatialCoordinateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_Location2DGeospatialCoordinateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureValueListAbstract", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueAbstract")
  public JAXBElement<Object> createMeasureValueListAbstract(Object value) {
    return new JAXBElement<Object>(_MeasureValueListAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBuildText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonBuildAbstract")
  public JAXBElement<TextType> createPersonBuildText(TextType value) {
    return new JAXBElement<TextType>(_PersonBuildText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountryISO3166Alpha2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CountryRepresentation")
  public JAXBElement<CountryAlpha2CodeType> createLocationCountryISO3166Alpha2Code(CountryAlpha2CodeType value) {
    return new JAXBElement<CountryAlpha2CodeType>(_LocationCountryISO3166Alpha2Code_QNAME, CountryAlpha2CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleDoorQuantity")
  public JAXBElement<NonNegativeInteger> createVehicleDoorQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(_VehicleDoorQuantity_QNAME, NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ResidentialFacility")
  public JAXBElement<FacilityType> createResidentialFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_ResidentialFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CircularRegion")
  public JAXBElement<CircularRegionType> createCircularRegion(CircularRegionType value) {
    return new JAXBElement<CircularRegionType>(_CircularRegion_QNAME, CircularRegionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationAugmentationPoint")
  public JAXBElement<Object> createRecommendationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_RecommendationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapHorizontalCoordinateText")
  public JAXBElement<TextType> createMapHorizontalCoordinateText(TextType value) {
    return new JAXBElement<TextType>(_MapHorizontalCoordinateText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonUnionCategoryAbstract")
  public JAXBElement<PersonUnionCategoryCodeType> createPersonUnionCategoryCode(PersonUnionCategoryCodeType value) {
    return new JAXBElement<PersonUnionCategoryCodeType>(_PersonUnionCategoryCode_QNAME, PersonUnionCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemUserNameAbstract")
  public JAXBElement<Object> createSystemUserNameAbstract(Object value) {
    return new JAXBElement<Object>(_SystemUserNameAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentVehicleAssociation")
  public JAXBElement<ActivityConveyanceAssociationType> createIncidentVehicleAssociation(ActivityConveyanceAssociationType value) {
    return new JAXBElement<ActivityConveyanceAssociationType>(_IncidentVehicleAssociation_QNAME, ActivityConveyanceAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairLengthText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonHairLengthAbstract")
  public JAXBElement<TextType> createPersonHairLengthText(TextType value) {
    return new JAXBElement<TextType>(_PersonHairLengthText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationContainsOrganizationAssociation")
  public JAXBElement<OrganizationLocationAssociationType> createLocationContainsOrganizationAssociation(OrganizationLocationAssociationType value) {
    return new JAXBElement<OrganizationLocationAssociationType>(_LocationContainsOrganizationAssociation_QNAME, OrganizationLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "UserLogonID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SystemUserNameAbstract")
  public JAXBElement<String> createUserLogonID(String value) {
    return new JAXBElement<String>(_UserLogonID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityDocumentAssociation")
  public JAXBElement<ActivityDocumentAssociationType> createActivityDocumentAssociation(ActivityDocumentAssociationType value) {
    return new JAXBElement<ActivityDocumentAssociationType>(_ActivityDocumentAssociation_QNAME, ActivityDocumentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFileExtensionText")
  public JAXBElement<TextType> createDocumentFileExtensionText(TextType value) {
    return new JAXBElement<TextType>(_DocumentFileExtensionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestText")
  public JAXBElement<TextType> createRequestText(TextType value) {
    return new JAXBElement<TextType>(_RequestText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentRelatedResourceText")
  public JAXBElement<TextType> createDocumentRelatedResourceText(TextType value) {
    return new JAXBElement<TextType>(_DocumentRelatedResourceText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceLanguageCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PublicServiceLanguageAbstract")
  public JAXBElement<LanguageCodeType> createPublicServiceLanguageCode(LanguageCodeType value) {
    return new JAXBElement<LanguageCodeType>(_PublicServiceLanguageCode_QNAME, LanguageCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecondaryDocument")
  public JAXBElement<DocumentType> createSecondaryDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_SecondaryDocument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StrangerAssociation")
  public JAXBElement<PersonAssociationType> createStrangerAssociation(PersonAssociationType value) {
    return new JAXBElement<PersonAssociationType>(_StrangerAssociation_QNAME, PersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FingerprintTakenIndicator")
  public JAXBElement<Boolean> createFingerprintTakenIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_FingerprintTakenIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonJuvenileClaimedIndicator")
  public JAXBElement<Boolean> createPersonJuvenileClaimedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonJuvenileClaimedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentDayPeriodText")
  public JAXBElement<TextType> createIncidentDayPeriodText(TextType value) {
    return new JAXBElement<TextType>(_IncidentDayPeriodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralSupervisor")
  public JAXBElement<EntityType> createReferralSupervisor(EntityType value) {
    return new JAXBElement<EntityType>(_ReferralSupervisor_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMilitarySummary")
  public JAXBElement<MilitarySummaryType> createPersonMilitarySummary(MilitarySummaryType value) {
    return new JAXBElement<MilitarySummaryType>(_PersonMilitarySummary_QNAME, MilitarySummaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Drug")
  public JAXBElement<DrugType> createDrug(DrugType value) {
    return new JAXBElement<DrugType>(_Drug_QNAME, DrugType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LengthUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LengthUnitAbstract")
  public JAXBElement<LengthCodeType> createLengthUnitCode(LengthCodeType value) {
    return new JAXBElement<LengthCodeType>(_LengthUnitCode_QNAME, LengthCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageRecipientEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageRecipientAbstract")
  public JAXBElement<EntityType> createMessageRecipientEntity(EntityType value) {
    return new JAXBElement<EntityType>(_MessageRecipientEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationUTMCoordinateValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationGeospatialCoordinateAbstract")
  public JAXBElement<UTMCoordinateType> createLocationUTMCoordinateValue(UTMCoordinateType value) {
    return new JAXBElement<UTMCoordinateType>(_LocationUTMCoordinateValue_QNAME, UTMCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySecurityLevelText")
  public JAXBElement<TextType> createFacilitySecurityLevelText(TextType value) {
    return new JAXBElement<TextType>(_FacilitySecurityLevelText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeightMeasureAugmentationPoint")
  public JAXBElement<Object> createWeightMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_WeightMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Date", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<Date> createDate(Date value) {
    return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(_PersonLocationAssociation_QNAME, PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformationDescriptionText")
  public JAXBElement<TextType> createContactInformationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ContactInformationDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "YearMonthDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<GYearMonth> createYearMonthDate(GYearMonth value) {
    return new JAXBElement<GYearMonth>(_YearMonthDate_QNAME, GYearMonth.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionReportedAuthorityText")
  public JAXBElement<TextType> createDispositionReportedAuthorityText(TextType value) {
    return new JAXBElement<TextType>(_DispositionReportedAuthorityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseItem")
  public JAXBElement<ItemType> createReleaseItem(ItemType value) {
    return new JAXBElement<ItemType>(_ReleaseItem_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseAugmentationPoint")
  public JAXBElement<Object> createCaseAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CaseAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryDischargeCategoryAbstract")
  public JAXBElement<Object> createMilitaryDischargeCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_MilitaryDischargeCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBodyXRaysAvailableText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonBodyXRaysAvailableAbstract")
  public JAXBElement<TextType> createPersonBodyXRaysAvailableText(TextType value) {
    return new JAXBElement<TextType>(_PersonBodyXRaysAvailableText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularMinuteValue")
  public JAXBElement<AngularMinuteType> createAngularMinuteValue(AngularMinuteType value) {
    return new JAXBElement<AngularMinuteType>(_AngularMinuteValue_QNAME, AngularMinuteType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramAugmentationPoint")
  public JAXBElement<Object> createProgramAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ProgramAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOwnerPurchasedValue")
  public JAXBElement<ItemValueType> createItemOwnerPurchasedValue(ItemValueType value) {
    return new JAXBElement<ItemValueType>(_ItemOwnerPurchasedValue_QNAME, ItemValueType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceInputResourceDocument")
  public JAXBElement<DocumentType> createPublicServiceInputResourceDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_PublicServiceInputResourceDocument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationPrincipalOfficial")
  public JAXBElement<PersonType> createOrganizationPrincipalOfficial(PersonType value) {
    return new JAXBElement<PersonType>(_OrganizationPrincipalOfficial_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SourceContactPersonText")
  public JAXBElement<TextType> createSourceContactPersonText(TextType value) {
    return new JAXBElement<TextType>(_SourceContactPersonText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HighwayFullText")
  public JAXBElement<TextType> createHighwayFullText(TextType value) {
    return new JAXBElement<TextType>(_HighwayFullText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Measurer")
  public JAXBElement<EntityType> createMeasurer(EntityType value) {
    return new JAXBElement<EntityType>(_Measurer_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Site")
  public JAXBElement<SiteType> createSite(SiteType value) {
    return new JAXBElement<SiteType>(_Site_QNAME, SiteType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSourceText")
  public JAXBElement<TextType> createDocumentSourceText(TextType value) {
    return new JAXBElement<TextType>(_DocumentSourceText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionCertificateIndicator")
  public JAXBElement<Boolean> createPersonUnionCertificateIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonUnionCertificateIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonTaxIdentification")
  public JAXBElement<IdentificationType> createPersonTaxIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonTaxIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairCategoryText")
  public JAXBElement<TextType> createPersonHairCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PersonHairCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeDepartmentName")
  public JAXBElement<TextType> createEmployeeDepartmentName(TextType value) {
    return new JAXBElement<TextType>(_EmployeeDepartmentName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLearningDisabilityText")
  public JAXBElement<TextType> createPersonLearningDisabilityText(TextType value) {
    return new JAXBElement<TextType>(_PersonLearningDisabilityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMaximumIntegerValue")
  public JAXBElement<Integer> createRangeMaximumIntegerValue(Integer value) {
    return new JAXBElement<Integer>(_RangeMaximumIntegerValue_QNAME, Integer.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityUsageText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityUsageAbstract")
  public JAXBElement<TextType> createFacilityUsageText(TextType value) {
    return new JAXBElement<TextType>(_FacilityUsageText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemAuditEventAugmentationPoint")
  public JAXBElement<Object> createSystemAuditEventAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SystemAuditEventAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceIncomingTextMessage", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceReceivedInformationAbstract")
  public JAXBElement<MessageType> createDeviceIncomingTextMessage(MessageType value) {
    return new JAXBElement<MessageType>(_DeviceIncomingTextMessage_QNAME, MessageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusDate")
  public JAXBElement<DateType> createStatusDate(DateType value) {
    return new JAXBElement<DateType>(_StatusDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TransportationAssociation")
  public JAXBElement<TransportationAssociationType> createTransportationAssociation(TransportationAssociationType value) {
    return new JAXBElement<TransportationAssociationType>(_TransportationAssociation_QNAME, TransportationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntangibleItem")
  public JAXBElement<IntangibleItemType> createIntangibleItem(IntangibleItemType value) {
    return new JAXBElement<IntangibleItemType>(_IntangibleItem_QNAME, IntangibleItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonStateIdentification")
  public JAXBElement<IdentificationType> createPersonStateIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonStateIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VelocityMeasureAugmentationPoint")
  public JAXBElement<Object> createVelocityMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_VelocityMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ImageHeightValue")
  public JAXBElement<NonNegativeInteger> createImageHeightValue(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(_ImageHeightValue_QNAME, NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Facility")
  public JAXBElement<FacilityType> createFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_Facility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentEvent")
  public JAXBElement<ActivityType> createIncidentEvent(ActivityType value) {
    return new JAXBElement<ActivityType>(_IncidentEvent_QNAME, ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponAugmentationPoint")
  public JAXBElement<Object> createWeaponAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_WeaponAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganDonorAbstract")
  public JAXBElement<Object> createPersonOrganDonorAbstract(Object value) {
    return new JAXBElement<Object>(_PersonOrganDonorAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityMaxOccupancyQuantity")
  public JAXBElement<NonNegativeInteger> createFacilityMaxOccupancyQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(_FacilityMaxOccupancyQuantity_QNAME, NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryCategoryAbstract")
  public JAXBElement<Object> createBinaryCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_BinaryCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Fee")
  public JAXBElement<ObligationType> createFee(ObligationType value) {
    return new JAXBElement<ObligationType>(_Fee_QNAME, ObligationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationDirectionsText")
  public JAXBElement<TextType> createLocationDirectionsText(TextType value) {
    return new JAXBElement<TextType>(_LocationDirectionsText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConfidencePercent")
  public JAXBElement<Decimal> createConfidencePercent(Decimal value) {
    return new JAXBElement<Decimal>(_ConfidencePercent_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFormatText")
  public JAXBElement<TextType> createDocumentFormatText(TextType value) {
    return new JAXBElement<TextType>(_DocumentFormatText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivitySupervisorPersonAssociation")
  public JAXBElement<ActivityPersonAssociationType> createActivitySupervisorPersonAssociation(ActivityPersonAssociationType value) {
    return new JAXBElement<ActivityPersonAssociationType>(_ActivitySupervisorPersonAssociation_QNAME, ActivityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationTotalDuration", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationTotalAbstract")
  public JAXBElement<Duration> createObligationTotalDuration(Duration value) {
    return new JAXBElement<Duration>(_ObligationTotalDuration_QNAME, Duration.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationDayContactInformation")
  public JAXBElement<ContactInformationType> createOrganizationDayContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_OrganizationDayContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Computer")
  public JAXBElement<DeviceType> createComputer(DeviceType value) {
    return new JAXBElement<DeviceType>(_Computer_QNAME, DeviceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RiskReductionProgram")
  public JAXBElement<ProgramType> createRiskReductionProgram(ProgramType value) {
    return new JAXBElement<ProgramType>(_RiskReductionProgram_QNAME, ProgramType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationHeadingValue")
  public JAXBElement<RelativeLocationHeadingType> createRelativeLocationHeadingValue(RelativeLocationHeadingType value) {
    return new JAXBElement<RelativeLocationHeadingType>(_RelativeLocationHeadingValue_QNAME, RelativeLocationHeadingType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureIntegerValueList", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueListAbstract")
  public JAXBElement<IntegerListType> createMeasureIntegerValueList(IntegerListType value) {
    return new JAXBElement<IntegerListType>(_MeasureIntegerValueList_QNAME, IntegerListType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityRepresentation")
  public JAXBElement<Object> createEntityRepresentation(Object value) {
    return new JAXBElement<Object>(_EntityRepresentation_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSentDate")
  public JAXBElement<DateType> createMessageSentDate(DateType value) {
    return new JAXBElement<DateType>(_MessageSentDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemPossessionDescriptionText")
  public JAXBElement<TextType> createItemPossessionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ItemPossessionDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemStateIdentification")
  public JAXBElement<IdentificationType> createItemStateIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_ItemStateIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCitizenshipAbstract")
  public JAXBElement<Object> createPersonCitizenshipAbstract(Object value) {
    return new JAXBElement<Object>(_PersonCitizenshipAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationCategoryDescriptionText")
  public JAXBElement<TextType> createIdentificationCategoryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_IdentificationCategoryDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleTransmissionCategoryAbstract")
  public JAXBElement<Object> createVehicleTransmissionCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_VehicleTransmissionCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrossStreetRelativeLocation")
  public JAXBElement<RelativeLocationType> createCrossStreetRelativeLocation(RelativeLocationType value) {
    return new JAXBElement<RelativeLocationType>(_CrossStreetRelativeLocation_QNAME, RelativeLocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemSizeDescriptionText")
  public JAXBElement<TextType> createItemSizeDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ItemSizeDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageCategoryAbstract")
  public JAXBElement<TextType> createMessageCategoryText(TextType value) {
    return new JAXBElement<TextType>(_MessageCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDocumentAssociation")
  public JAXBElement<PersonDocumentAssociationType> createPersonDocumentAssociation(PersonDocumentAssociationType value) {
    return new JAXBElement<PersonDocumentAssociationType>(_PersonDocumentAssociation_QNAME, PersonDocumentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationHeightMeasureAugmentationPoint")
  public JAXBElement<Object> createLocationHeightMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_LocationHeightMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactWebsiteURI", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<AnyURI> createContactWebsiteURI(AnyURI value) {
    return new JAXBElement<AnyURI>(_ContactWebsiteURI_QNAME, AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityBillRecipientPersonAssociation")
  public JAXBElement<ActivityPersonAssociationType> createActivityBillRecipientPersonAssociation(ActivityPersonAssociationType value) {
    return new JAXBElement<ActivityPersonAssociationType>(_ActivityBillRecipientPersonAssociation_QNAME, ActivityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemStyleAbstract")
  public JAXBElement<Object> createItemStyleAbstract(Object value) {
    return new JAXBElement<Object>(_ItemStyleAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationSubUnit")
  public JAXBElement<OrganizationType> createOrganizationSubUnit(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_OrganizationSubUnit_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationProgressDescriptionText")
  public JAXBElement<TextType> createObligationProgressDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ObligationProgressDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyedPerson")
  public JAXBElement<PersonType> createConveyedPerson(PersonType value) {
    return new JAXBElement<PersonType>(_ConveyedPerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleCensusBlockID")
  public JAXBElement<String> createLocaleCensusBlockID(String value) {
    return new JAXBElement<String>(_LocaleCensusBlockID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyContactInformation")
  public JAXBElement<ContactInformationType> createAnomalyContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_AnomalyContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberDescriptionText")
  public JAXBElement<TextType> createTelephoneNumberDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_TelephoneNumberDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentLocationURI")
  public JAXBElement<AnyURI> createDocumentLocationURI(AnyURI value) {
    return new JAXBElement<AnyURI>(_DocumentLocationURI_QNAME, AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ManifestTransmittedDate")
  public JAXBElement<DateType> createManifestTransmittedDate(DateType value) {
    return new JAXBElement<DateType>(_ManifestTransmittedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<TelephoneNumberType> createDeviceStoredTelephoneNumber(TelephoneNumberType value) {
    return new JAXBElement<TelephoneNumberType>(_DeviceStoredTelephoneNumber_QNAME, TelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationStatus")
  public JAXBElement<StatusType> createOrganizationStatus(StatusType value) {
    return new JAXBElement<StatusType>(_OrganizationStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EncounterClassification")
  public JAXBElement<EncounterClassificationType> createEncounterClassification(EncounterClassificationType value) {
    return new JAXBElement<EncounterClassificationType>(_EncounterClassification_QNAME, EncounterClassificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentOtherRecipient")
  public JAXBElement<EntityType> createDocumentOtherRecipient(EntityType value) {
    return new JAXBElement<EntityType>(_DocumentOtherRecipient_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReportedDate")
  public JAXBElement<DateType> createReportedDate(DateType value) {
    return new JAXBElement<DateType>(_ReportedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseResolutionText")
  public JAXBElement<TextType> createCaseResolutionText(TextType value) {
    return new JAXBElement<TextType>(_CaseResolutionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceLanguageName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PublicServiceLanguageAbstract")
  public JAXBElement<TextType> createPublicServiceLanguageName(TextType value) {
    return new JAXBElement<TextType>(_PublicServiceLanguageName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeSupervisor")
  public JAXBElement<PersonType> createEmployeeSupervisor(PersonType value) {
    return new JAXBElement<PersonType>(_EmployeeSupervisor_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredContactInformation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<ContactInformationType> createDeviceStoredContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_DeviceStoredContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMaximumUnsignedIntegerValue")
  public JAXBElement<UnsignedInt> createRangeMaximumUnsignedIntegerValue(UnsignedInt value) {
    return new JAXBElement<UnsignedInt>(_RangeMaximumUnsignedIntegerValue_QNAME, UnsignedInt.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VolumeMeasure")
  public JAXBElement<VolumeMeasureType> createVolumeMeasure(VolumeMeasureType value) {
    return new JAXBElement<VolumeMeasureType>(_VolumeMeasure_QNAME, VolumeMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftAugmentationPoint")
  public JAXBElement<Object> createAircraftAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AircraftAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationAugmentationPoint")
  public JAXBElement<Object> createOrganizationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_OrganizationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressDeliveryPointAbstract")
  public JAXBElement<Object> createAddressDeliveryPointAbstract(Object value) {
    return new JAXBElement<Object>(_AddressDeliveryPointAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasurePointAbstract", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueAbstract")
  public JAXBElement<Object> createMeasurePointAbstract(Object value) {
    return new JAXBElement<Object>(_MeasurePointAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityEndDate")
  public JAXBElement<DateType> createCapabilityEndDate(DateType value) {
    return new JAXBElement<DateType>(_CapabilityEndDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemRecoveredValue")
  public JAXBElement<ItemValueType> createItemRecoveredValue(ItemValueType value) {
    return new JAXBElement<ItemValueType>(_ItemRecoveredValue_QNAME, ItemValueType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationDepth", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationHeightAbstract")
  public JAXBElement<LocationHeightMeasureType> createLocationDepth(LocationHeightMeasureType value) {
    return new JAXBElement<LocationHeightMeasureType>(_LocationDepth_QNAME, LocationHeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCanadianProvinceCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<CanadianProvinceCodeType> createLocationCanadianProvinceCode(CanadianProvinceCodeType value) {
    return new JAXBElement<CanadianProvinceCodeType>(_LocationCanadianProvinceCode_QNAME, CanadianProvinceCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LanguageCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LanguageAbstract")
  public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
    return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisguiseDescriptionText")
  public JAXBElement<TextType> createPersonDisguiseDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_PersonDisguiseDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Vehicle")
  public JAXBElement<VehicleType> createVehicle(VehicleType value) {
    return new JAXBElement<VehicleType>(_Vehicle_QNAME, VehicleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CalendarDate")
  public JAXBElement<DateType> createCalendarDate(DateType value) {
    return new JAXBElement<DateType>(_CalendarDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitStartDate")
  public JAXBElement<DateType> createPermitStartDate(DateType value) {
    return new JAXBElement<DateType>(_PermitStartDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationExpirationDate")
  public JAXBElement<DateType> createIdentificationExpirationDate(DateType value) {
    return new JAXBElement<DateType>(_IdentificationExpirationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationTerminationDate")
  public JAXBElement<DateType> createOrganizationTerminationDate(DateType value) {
    return new JAXBElement<DateType>(_OrganizationTerminationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairStyleAbstract")
  public JAXBElement<Object> createPersonHairStyleAbstract(Object value) {
    return new JAXBElement<Object>(_PersonHairStyleAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemTransactionAugmentationPoint")
  public JAXBElement<Object> createItemTransactionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemTransactionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityStolenIndicator")
  public JAXBElement<Boolean> createIdentityStolenIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_IdentityStolenIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestContactInformation")
  public JAXBElement<ContactInformationType> createRequestContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_RequestContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPreferredName")
  public JAXBElement<TextType> createPersonPreferredName(TextType value) {
    return new JAXBElement<TextType>(_PersonPreferredName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemOperatingModeName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SystemOperatingModeAbstract")
  public JAXBElement<TextType> createSystemOperatingModeName(TextType value) {
    return new JAXBElement<TextType>(_SystemOperatingModeName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressSecondaryUnitText")
  public JAXBElement<TextType> createAddressSecondaryUnitText(TextType value) {
    return new JAXBElement<TextType>(_AddressSecondaryUnitText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LatitudeDegreeValue")
  public JAXBElement<LatitudeDegreeType> createLatitudeDegreeValue(LatitudeDegreeType value) {
    return new JAXBElement<LatitudeDegreeType>(_LatitudeDegreeValue_QNAME, LatitudeDegreeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonReligionCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonReligionAbstract")
  public JAXBElement<ReligionCodeType> createPersonReligionCode(ReligionCodeType value) {
    return new JAXBElement<ReligionCodeType>(_PersonReligionCode_QNAME, ReligionCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentProgram")
  public JAXBElement<ProgramType> createAssessmentProgram(ProgramType value) {
    return new JAXBElement<ProgramType>(_AssessmentProgram_QNAME, ProgramType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueDescriptionText")
  public JAXBElement<TextType> createItemValueDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ItemValueDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityInvolvementAbstract")
  public JAXBElement<Object> createActivityInvolvementAbstract(Object value) {
    return new JAXBElement<Object>(_ActivityInvolvementAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelecommunicationDeviceSIMCardAssociation")
  public JAXBElement<TelecommunicationDeviceSIMCardAssociationType> createTelecommunicationDeviceSIMCardAssociation(TelecommunicationDeviceSIMCardAssociationType value) {
    return new JAXBElement<TelecommunicationDeviceSIMCardAssociationType>(_TelecommunicationDeviceSIMCardAssociation_QNAME, TelecommunicationDeviceSIMCardAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentContributor")
  public JAXBElement<EntityType> createDocumentContributor(EntityType value) {
    return new JAXBElement<EntityType>(_DocumentContributor_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityInvolvedOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityInvolvedOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityInvolvedOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionDecisionAugmentationPoint")
  public JAXBElement<Object> createCaseDispositionDecisionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CaseDispositionDecisionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationParentAssociation")
  public JAXBElement<OrganizationUnitAssociationType> createOrganizationParentAssociation(OrganizationUnitAssociationType value) {
    return new JAXBElement<OrganizationUnitAssociationType>(_OrganizationParentAssociation_QNAME, OrganizationUnitAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmploymentLocation")
  public JAXBElement<LocationType> createEmploymentLocation(LocationType value) {
    return new JAXBElement<LocationType>(_EmploymentLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularRateUnitAbstract")
  public JAXBElement<Object> createAngularRateUnitAbstract(Object value) {
    return new JAXBElement<Object>(_AngularRateUnitAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ArrivalLocation")
  public JAXBElement<LocationType> createArrivalLocation(LocationType value) {
    return new JAXBElement<LocationType>(_ArrivalLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairStyleText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonHairStyleAbstract")
  public JAXBElement<TextType> createPersonHairStyleText(TextType value) {
    return new JAXBElement<TextType>(_PersonHairStyleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemName")
  public JAXBElement<TextType> createSystemName(TextType value) {
    return new JAXBElement<TextType>(_SystemName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleGarageLocationAssociation")
  public JAXBElement<ItemLocationAssociationType> createVehicleGarageLocationAssociation(ItemLocationAssociationType value) {
    return new JAXBElement<ItemLocationAssociationType>(_VehicleGarageLocationAssociation_QNAME, ItemLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberCategoryAbstract")
  public JAXBElement<Object> createTelephoneNumberCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_TelephoneNumberCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganizationAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonOrganizationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonOrganizationAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountHolder")
  public JAXBElement<FinancialAccountHolderType> createFinancialAccountHolder(FinancialAccountHolderType value) {
    return new JAXBElement<FinancialAccountHolderType>(_FinancialAccountHolder_QNAME, FinancialAccountHolderType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationArea")
  public JAXBElement<AreaType> createLocationArea(AreaType value) {
    return new JAXBElement<AreaType>(_LocationArea_QNAME, AreaType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityConveyanceAssociation")
  public JAXBElement<ActivityConveyanceAssociationType> createActivityConveyanceAssociation(ActivityConveyanceAssociationType value) {
    return new JAXBElement<ActivityConveyanceAssociationType>(_ActivityConveyanceAssociation_QNAME, ActivityConveyanceAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleJudicialDistrictAbstract")
  public JAXBElement<Object> createLocaleJudicialDistrictAbstract(Object value) {
    return new JAXBElement<Object>(_LocaleJudicialDistrictAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMentalStateText")
  public JAXBElement<TextType> createPersonMentalStateText(TextType value) {
    return new JAXBElement<TextType>(_PersonMentalStateText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ImageLocation")
  public JAXBElement<LocationType> createImageLocation(LocationType value) {
    return new JAXBElement<LocationType>(_ImageLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMaidenName")
  public JAXBElement<PersonNameTextType> createPersonMaidenName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(_PersonMaidenName_QNAME, PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationAugmentationPoint")
  public JAXBElement<Object> createObligationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ObligationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentApprovedIndicator")
  public JAXBElement<Boolean> createDocumentApprovedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_DocumentApprovedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSource")
  public JAXBElement<EntityType> createDocumentSource(EntityType value) {
    return new JAXBElement<EntityType>(_DocumentSource_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemBarCodeIdentification")
  public JAXBElement<IdentificationType> createItemBarCodeIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_ItemBarCodeIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "UserPersonName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SystemUserNameAbstract")
  public JAXBElement<PersonNameType> createUserPersonName(PersonNameType value) {
    return new JAXBElement<PersonNameType>(_UserPersonName_QNAME, PersonNameType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EncounterCategoryAbstract")
  public JAXBElement<Object> createEncounterCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_EncounterCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgressComplianceIndicator")
  public JAXBElement<Boolean> createProgressComplianceIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ProgressComplianceIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetAugmentationPoint")
  public JAXBElement<Object> createStreetAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_StreetAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactMeansAbstract")
  public JAXBElement<Object> createContactMeansAbstract(Object value) {
    return new JAXBElement<Object>(_ContactMeansAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityCategoryAbstract")
  public JAXBElement<FacilityUsageCodeType> createFacilityCategoryCode(FacilityUsageCodeType value) {
    return new JAXBElement<FacilityUsageCodeType>(_FacilityCategoryCode_QNAME, FacilityUsageCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionRestitution")
  public JAXBElement<ObligationType> createDisciplinaryActionRestitution(ObligationType value) {
    return new JAXBElement<ObligationType>(_DisciplinaryActionRestitution_QNAME, ObligationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUSCitizenIndicator")
  public JAXBElement<Boolean> createPersonUSCitizenIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonUSCitizenIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PhysicalFeatureCategoryAbstract")
  public JAXBElement<TextType> createPhysicalFeatureCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PhysicalFeatureCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CurrencyCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CurrencyAbstract")
  public JAXBElement<CurrencyCodeType> createCurrencyCode(CurrencyCodeType value) {
    return new JAXBElement<CurrencyCodeType>(_CurrencyCode_QNAME, CurrencyCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentLanguageCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentLanguageAbstract")
  public JAXBElement<LanguageCodeType> createDocumentLanguageCode(LanguageCodeType value) {
    return new JAXBElement<LanguageCodeType>(_DocumentLanguageCode_QNAME, LanguageCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonConveyanceAssociation")
  public JAXBElement<PersonConveyanceAssociationType> createPersonConveyanceAssociation(PersonConveyanceAssociationType value) {
    return new JAXBElement<PersonConveyanceAssociationType>(_PersonConveyanceAssociation_QNAME, PersonConveyanceAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesDateSeriesText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SecuritiesDateSeriesAbstract")
  public JAXBElement<TextType> createSecuritiesDateSeriesText(TextType value) {
    return new JAXBElement<TextType>(_SecuritiesDateSeriesText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberAugmentationPoint")
  public JAXBElement<Object> createTelephoneNumberAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_TelephoneNumberAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentReportedNarrative")
  public JAXBElement<DocumentType> createIncidentReportedNarrative(DocumentType value) {
    return new JAXBElement<DocumentType>(_IncidentReportedNarrative_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GenericEntityAugmentationPoint")
  public JAXBElement<Object> createGenericEntityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_GenericEntityAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEncounter")
  public JAXBElement<PersonEncounterType> createPersonEncounter(PersonEncounterType value) {
    return new JAXBElement<PersonEncounterType>(_PersonEncounter_QNAME, PersonEncounterType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountHolderAugmentationPoint")
  public JAXBElement<Object> createFinancialAccountHolderAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FinancialAccountHolderAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceOperator")
  public JAXBElement<PersonType> createConveyanceOperator(PersonType value) {
    return new JAXBElement<PersonType>(_ConveyanceOperator_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FullTelephoneNumberAugmentationPoint")
  public JAXBElement<Object> createFullTelephoneNumberAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FullTelephoneNumberAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWeightMeasure")
  public JAXBElement<WeightMeasureType> createPersonWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_PersonWeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIntelligenceCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentIntelligenceCategoryAbstract")
  public JAXBElement<DocumentIntelligenceCategoryCodeType> createDocumentIntelligenceCategoryCode(DocumentIntelligenceCategoryCodeType value) {
    return new JAXBElement<DocumentIntelligenceCategoryCodeType>(_DocumentIntelligenceCategoryCode_QNAME, DocumentIntelligenceCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RollValue")
  public JAXBElement<Degree180PlusMinusType> createRollValue(Degree180PlusMinusType value) {
    return new JAXBElement<Degree180PlusMinusType>(_RollValue_QNAME, Degree180PlusMinusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Employee")
  public JAXBElement<PersonType> createEmployee(PersonType value) {
    return new JAXBElement<PersonType>(_Employee_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeEarningsRateText")
  public JAXBElement<TextType> createEmployeeEarningsRateText(TextType value) {
    return new JAXBElement<TextType>(_EmployeeEarningsRateText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactAbstract")
  public JAXBElement<EntityType> createContactEntity(EntityType value) {
    return new JAXBElement<EntityType>(_ContactEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleActivityText")
  public JAXBElement<TextType> createScheduleActivityText(TextType value) {
    return new JAXBElement<TextType>(_ScheduleActivityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DepartureEstimatedDate")
  public JAXBElement<DateType> createDepartureEstimatedDate(DateType value) {
    return new JAXBElement<DateType>(_DepartureEstimatedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPrimaryLanguage")
  public JAXBElement<PersonLanguageType> createPersonPrimaryLanguage(PersonLanguageType value) {
    return new JAXBElement<PersonLanguageType>(_PersonPrimaryLanguage_QNAME, PersonLanguageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "UTMCoordinateValue")
  public JAXBElement<UTMCoordinateType> createUTMCoordinateValue(UTMCoordinateType value) {
    return new JAXBElement<UTMCoordinateType>(_UTMCoordinateValue_QNAME, UTMCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationEmergencyContactInformation")
  public JAXBElement<ContactInformationType> createOrganizationEmergencyContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_OrganizationEmergencyContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Highway")
  public JAXBElement<HighwayType> createHighway(HighwayType value) {
    return new JAXBElement<HighwayType>(_Highway_QNAME, HighwayType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Employer")
  public JAXBElement<EntityType> createEmployer(EntityType value) {
    return new JAXBElement<EntityType>(_Employer_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSpeechDescriptionText")
  public JAXBElement<TextType> createPersonSpeechDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_PersonSpeechDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonResidenceAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonResidenceAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonResidenceAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationReferencePoint")
  public JAXBElement<LocationType> createRelativeLocationReferencePoint(LocationType value) {
    return new JAXBElement<LocationType>(_RelativeLocationReferencePoint_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TimeUnitAbstract")
  public JAXBElement<Object> createTimeUnitAbstract(Object value) {
    return new JAXBElement<Object>(_TimeUnitAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateRange", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<DateRangeType> createDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(_DateRange_QNAME, DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDigitizedSignatureImage")
  public JAXBElement<ImageType> createPersonDigitizedSignatureImage(ImageType value) {
    return new JAXBElement<ImageType>(_PersonDigitizedSignatureImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyTerminationDate")
  public JAXBElement<DateType> createIntellectualPropertyTerminationDate(DateType value) {
    return new JAXBElement<DateType>(_IntellectualPropertyTerminationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemLengthMeasure")
  public JAXBElement<LengthMeasureType> createItemLengthMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(_ItemLengthMeasure_QNAME, LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationActivityText")
  public JAXBElement<TextType> createOrganizationActivityText(TextType value) {
    return new JAXBElement<TextType>(_OrganizationActivityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPrimaryWorkerAssociation")
  public JAXBElement<PersonWorkerAssociationType> createPersonPrimaryWorkerAssociation(PersonWorkerAssociationType value) {
    return new JAXBElement<PersonWorkerAssociationType>(_PersonPrimaryWorkerAssociation_QNAME, PersonWorkerAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommentCreationDate")
  public JAXBElement<DateType> createCommentCreationDate(DateType value) {
    return new JAXBElement<DateType>(_CommentCreationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskCriteriaForSuccessText")
  public JAXBElement<TextType> createTaskCriteriaForSuccessText(TextType value) {
    return new JAXBElement<TextType>(_TaskCriteriaForSuccessText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftTailIdentification")
  public JAXBElement<IdentificationType> createAircraftTailIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_AircraftTailIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ResidencePaymentPeriodText")
  public JAXBElement<TextType> createResidencePaymentPeriodText(TextType value) {
    return new JAXBElement<TextType>(_ResidencePaymentPeriodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityGeneralCategoryText")
  public JAXBElement<TextType> createCapabilityGeneralCategoryText(TextType value) {
    return new JAXBElement<TextType>(_CapabilityGeneralCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualItemBusinessAreaText")
  public JAXBElement<TextType> createIntellectualItemBusinessAreaText(TextType value) {
    return new JAXBElement<TextType>(_IntellectualItemBusinessAreaText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemAgeMeasure")
  public JAXBElement<TimeMeasureType> createItemAgeMeasure(TimeMeasureType value) {
    return new JAXBElement<TimeMeasureType>(_ItemAgeMeasure_QNAME, TimeMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSenderEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageSenderAbstract")
  public JAXBElement<EntityType> createMessageSenderEntity(EntityType value) {
    return new JAXBElement<EntityType>(_MessageSenderEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceIMEIIdentification")
  public JAXBElement<IdentificationType> createDeviceIMEIIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_DeviceIMEIIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionFacility")
  public JAXBElement<FacilityType> createSupervisionFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_SupervisionFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityPersonAssociation")
  public JAXBElement<ActivityPersonAssociationType> createActivityPersonAssociation(ActivityPersonAssociationType value) {
    return new JAXBElement<ActivityPersonAssociationType>(_ActivityPersonAssociation_QNAME, ActivityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GenericEntity", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EntityRepresentation")
  public JAXBElement<GenericEntityType> createGenericEntity(GenericEntityType value) {
    return new JAXBElement<GenericEntityType>(_GenericEntity_QNAME, GenericEntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleMaximumLoadWeightMeasure")
  public JAXBElement<WeightMeasureType> createVehicleMaximumLoadWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_VehicleMaximumLoadWeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Incident")
  public JAXBElement<IncidentType> createIncident(IncidentType value) {
    return new JAXBElement<IncidentType>(_Incident_QNAME, IncidentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonUnionAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonUnionAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Aircraft")
  public JAXBElement<AircraftType> createAircraft(AircraftType value) {
    return new JAXBElement<AircraftType>(_Aircraft_QNAME, AircraftType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleColorInteriorText")
  public JAXBElement<TextType> createVehicleColorInteriorText(TextType value) {
    return new JAXBElement<TextType>(_VehicleColorInteriorText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationAddressAbstract")
  public JAXBElement<Object> createLocationAddressAbstract(Object value) {
    return new JAXBElement<Object>(_LocationAddressAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameAugmentationPoint")
  public JAXBElement<Object> createPersonNameAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonNameAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonNameCategoryAbstract")
  public JAXBElement<TextType> createPersonNameCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PersonNameCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationLocalIdentification")
  public JAXBElement<IdentificationType> createOrganizationLocalIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_OrganizationLocalIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionMandatoryIndicator")
  public JAXBElement<Boolean> createSupervisionMandatoryIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_SupervisionMandatoryIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityRelationText")
  public JAXBElement<TextType> createActivityRelationText(TextType value) {
    return new JAXBElement<TextType>(_ActivityRelationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleZoneName")
  public JAXBElement<TextType> createLocaleZoneName(TextType value) {
    return new JAXBElement<TextType>(_LocaleZoneName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberCategoryAbstract")
  public JAXBElement<TextType> createTelephoneNumberCategoryText(TextType value) {
    return new JAXBElement<TextType>(_TelephoneNumberCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ArrivalEstimatedDate")
  public JAXBElement<DateType> createArrivalEstimatedDate(DateType value) {
    return new JAXBElement<DateType>(_ArrivalEstimatedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RealEstateAugmentationPoint")
  public JAXBElement<Object> createRealEstateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_RealEstateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemCategoryAbstract")
  public JAXBElement<TextType> createItemCategoryText(TextType value) {
    return new JAXBElement<TextType>(_ItemCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteOwnerEntity")
  public JAXBElement<EntityType> createSiteOwnerEntity(EntityType value) {
    return new JAXBElement<EntityType>(_SiteOwnerEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleNeighborhoodName")
  public JAXBElement<TextType> createLocaleNeighborhoodName(TextType value) {
    return new JAXBElement<TextType>(_LocaleNeighborhoodName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredVideoBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<BinaryType> createDeviceStoredVideoBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_DeviceStoredVideoBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjurySeverityAbstract")
  public JAXBElement<Object> createInjurySeverityAbstract(Object value) {
    return new JAXBElement<Object>(_InjurySeverityAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureValueText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueAbstract")
  public JAXBElement<TextType> createMeasureValueText(TextType value) {
    return new JAXBElement<TextType>(_MeasureValueText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityLocation")
  public JAXBElement<LocationType> createFacilityLocation(LocationType value) {
    return new JAXBElement<LocationType>(_FacilityLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateAugmentationPoint")
  public JAXBElement<Object> createDateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralMandatoryIndicator")
  public JAXBElement<Boolean> createReferralMandatoryIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ReferralMandatoryIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramPubliclyRunIndicator")
  public JAXBElement<Boolean> createProgramPubliclyRunIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ProgramPubliclyRunIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftBaseAirport")
  public JAXBElement<AirportType> createAircraftBaseAirport(AirportType value) {
    return new JAXBElement<AirportType>(_AircraftBaseAirport_QNAME, AirportType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyAugmentationPoint")
  public JAXBElement<Object> createIntellectualPropertyAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_IntellectualPropertyAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationUnitAssociationAugmentationPoint")
  public JAXBElement<Object> createOrganizationUnitAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_OrganizationUnitAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Disposition")
  public JAXBElement<DispositionType> createDisposition(DispositionType value) {
    return new JAXBElement<DispositionType>(_Disposition_QNAME, DispositionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "UnsignedIntegerRangeAugmentationPoint")
  public JAXBElement<Object> createUnsignedIntegerRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_UnsignedIntegerRangeAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseTrackingID")
  public JAXBElement<String> createCaseTrackingID(String value) {
    return new JAXBElement<String>(_CaseTrackingID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisLocation")
  public JAXBElement<LocationType> createCrisisLocation(LocationType value) {
    return new JAXBElement<LocationType>(_CrisisLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemColorDescriptionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemColorAbstract")
  public JAXBElement<TextType> createItemColorDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ItemColorDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgressComplianceText")
  public JAXBElement<TextType> createProgressComplianceText(TextType value) {
    return new JAXBElement<TextType>(_ProgressComplianceText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "YearDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<GYear> createYearDate(GYear value) {
    return new JAXBElement<GYear>(_YearDate_QNAME, GYear.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationContactInformationAssociation")
  public JAXBElement<LocationContactInformationAssociationType> createLocationContactInformationAssociation(LocationContactInformationAssociationType value) {
    return new JAXBElement<LocationContactInformationAssociationType>(_LocationContactInformationAssociation_QNAME, LocationContactInformationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityDate")
  public JAXBElement<DateType> createActivityDate(DateType value) {
    return new JAXBElement<DateType>(_ActivityDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportNumberIdentification")
  public JAXBElement<IdentificationType> createPassportNumberIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PassportNumberIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationDate")
  public JAXBElement<DateType> createRecommendationDate(DateType value) {
    return new JAXBElement<DateType>(_RecommendationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayStartTime")
  public JAXBElement<Time> createScheduleDayStartTime(Time value) {
    return new JAXBElement<Time>(_ScheduleDayStartTime_QNAME, Time.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureErrorValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureErrorAbstract")
  public JAXBElement<Decimal> createMeasureErrorValue(Decimal value) {
    return new JAXBElement<Decimal>(_MeasureErrorValue_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PolygonCoordinate")
  public JAXBElement<Location2DGeospatialCoordinateType> createPolygonCoordinate(Location2DGeospatialCoordinateType value) {
    return new JAXBElement<Location2DGeospatialCoordinateType>(_PolygonCoordinate_QNAME, Location2DGeospatialCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselPropulsionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "VesselPropulsionAbstract")
  public JAXBElement<TextType> createVesselPropulsionText(TextType value) {
    return new JAXBElement<TextType>(_VesselPropulsionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityStatus")
  public JAXBElement<StatusType> createActivityStatus(StatusType value) {
    return new JAXBElement<StatusType>(_ActivityStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteSpecialInformationText")
  public JAXBElement<TextType> createSiteSpecialInformationText(TextType value) {
    return new JAXBElement<TextType>(_SiteSpecialInformationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Organization")
  public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EndTime")
  public JAXBElement<Time> createEndTime(Time value) {
    return new JAXBElement<Time>(_EndTime_QNAME, Time.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StateAugmentationPoint")
  public JAXBElement<Object> createStateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_StateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentRelationText")
  public JAXBElement<TextType> createDocumentRelationText(TextType value) {
    return new JAXBElement<TextType>(_DocumentRelationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceAugmentationPoint")
  public JAXBElement<Object> createInsuranceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_InsuranceAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramCondition")
  public JAXBElement<ConditionType> createProgramCondition(ConditionType value) {
    return new JAXBElement<ConditionType>(_ProgramCondition_QNAME, ConditionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Injury")
  public JAXBElement<InjuryType> createInjury(InjuryType value) {
    return new JAXBElement<InjuryType>(_Injury_QNAME, InjuryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionDecision")
  public JAXBElement<CaseDispositionDecisionType> createCaseDispositionDecision(CaseDispositionDecisionType value) {
    return new JAXBElement<CaseDispositionDecisionType>(_CaseDispositionDecision_QNAME, CaseDispositionDecisionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TreatmentProvider")
  public JAXBElement<EntityType> createTreatmentProvider(EntityType value) {
    return new JAXBElement<EntityType>(_TreatmentProvider_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationDirectionCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RelativeLocationDirectionAbstract")
  public JAXBElement<DirectionCodeType> createRelativeLocationDirectionCode(DirectionCodeType value) {
    return new JAXBElement<DirectionCodeType>(_RelativeLocationDirectionCode_QNAME, DirectionCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationAugmentationPoint")
  public JAXBElement<Object> createIdentificationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_IdentificationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEmploymentAssociation")
  public JAXBElement<PersonEmploymentAssociationType> createPersonEmploymentAssociation(PersonEmploymentAssociationType value) {
    return new JAXBElement<PersonEmploymentAssociationType>(_PersonEmploymentAssociation_QNAME, PersonEmploymentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonResidentText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonResidentAbstract")
  public JAXBElement<TextType> createPersonResidentText(TextType value) {
    return new JAXBElement<TextType>(_PersonResidentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemBrandName")
  public JAXBElement<ProperNameTextType> createItemBrandName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_ItemBrandName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramResidentialIndicator")
  public JAXBElement<Boolean> createProgramResidentialIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ProgramResidentialIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationLocale")
  public JAXBElement<LocaleType> createLocationLocale(LocaleType value) {
    return new JAXBElement<LocaleType>(_LocationLocale_QNAME, LocaleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryCaptureDate")
  public JAXBElement<DateType> createBinaryCaptureDate(DateType value) {
    return new JAXBElement<DateType>(_BinaryCaptureDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationRequirementDescriptionText")
  public JAXBElement<TextType> createObligationRequirementDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ObligationRequirementDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityTerminationDate")
  public JAXBElement<DateType> createIdentityTerminationDate(DateType value) {
    return new JAXBElement<DateType>(_IdentityTerminationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftFuselageColorAbstract")
  public JAXBElement<Object> createAircraftFuselageColorAbstract(Object value) {
    return new JAXBElement<Object>(_AircraftFuselageColorAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionAugmentationPoint")
  public JAXBElement<Object> createDispositionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DispositionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalPeriodAbstract")
  public JAXBElement<Object> createDecalPeriodAbstract(Object value) {
    return new JAXBElement<Object>(_DecalPeriodAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationPaidAbstract")
  public JAXBElement<Object> createObligationPaidAbstract(Object value) {
    return new JAXBElement<Object>(_ObligationPaidAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionCustodyStatus")
  public JAXBElement<StatusType> createSupervisionCustodyStatus(StatusType value) {
    return new JAXBElement<StatusType>(_SupervisionCustodyStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionViolatedIndicator")
  public JAXBElement<Boolean> createConditionViolatedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ConditionViolatedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselHullIdentification")
  public JAXBElement<IdentificationType> createVesselHullIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_VesselHullIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionDecisionText")
  public JAXBElement<TextType> createCaseDispositionDecisionText(TextType value) {
    return new JAXBElement<TextType>(_CaseDispositionDecisionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressCategoryAbstract")
  public JAXBElement<AddressCategoryCodeType> createAddressCategoryCode(AddressCategoryCodeType value) {
    return new JAXBElement<AddressCategoryCodeType>(_AddressCategoryCode_QNAME, AddressCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseFiling")
  public JAXBElement<DocumentType> createCaseFiling(DocumentType value) {
    return new JAXBElement<DocumentType>(_CaseFiling_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityScheduleAssociation")
  public JAXBElement<ActivityScheduleAssociationType> createActivityScheduleAssociation(ActivityScheduleAssociationType value) {
    return new JAXBElement<ActivityScheduleAssociationType>(_ActivityScheduleAssociation_QNAME, ActivityScheduleAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "JurisdictionAbstract")
  public JAXBElement<Object> createJurisdictionAbstract(Object value) {
    return new JAXBElement<Object>(_JurisdictionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentManagementCyclePeriodText")
  public JAXBElement<TextType> createDocumentManagementCyclePeriodText(TextType value) {
    return new JAXBElement<TextType>(_DocumentManagementCyclePeriodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueAugmentationPoint")
  public JAXBElement<Object> createItemValueAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemValueAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssociationDescriptionText")
  public JAXBElement<TextType> createAssociationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_AssociationDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DoubleRangeAugmentationPoint")
  public JAXBElement<Object> createDoubleRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DoubleRangeAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountCategoryText")
  public JAXBElement<TextType> createFinancialAccountCategoryText(TextType value) {
    return new JAXBElement<TextType>(_FinancialAccountCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberFullID")
  public JAXBElement<String> createTelephoneNumberFullID(String value) {
    return new JAXBElement<String>(_TelephoneNumberFullID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapCoordinateFullText")
  public JAXBElement<TextType> createMapCoordinateFullText(TextType value) {
    return new JAXBElement<TextType>(_MapCoordinateFullText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentGroupID")
  public JAXBElement<String> createDocumentGroupID(String value) {
    return new JAXBElement<String>(_DocumentGroupID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RequestCategoryAbstract")
  public JAXBElement<TextType> createRequestCategoryText(TextType value) {
    return new JAXBElement<TextType>(_RequestCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Vessel")
  public JAXBElement<VesselType> createVessel(VesselType value) {
    return new JAXBElement<VesselType>(_Vessel_QNAME, VesselType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLastSeenLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonLastSeenLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(_PersonLastSeenLocationAssociation_QNAME, PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAugmentationPoint")
  public JAXBElement<Object> createPersonAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemTransaction")
  public JAXBElement<ItemTransactionType> createItemTransaction(ItemTransactionType value) {
    return new JAXBElement<ItemTransactionType>(_ItemTransaction_QNAME, ItemTransactionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayOfWeekCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ScheduleDayAbstract")
  public JAXBElement<DayOfWeekCodeType> createScheduleDayOfWeekCode(DayOfWeekCodeType value) {
    return new JAXBElement<DayOfWeekCodeType>(_ScheduleDayOfWeekCode_QNAME, DayOfWeekCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonJuvenileVerifiedIndicator")
  public JAXBElement<Boolean> createPersonJuvenileVerifiedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonJuvenileVerifiedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonFormerEmploymentAssociation")
  public JAXBElement<PersonEmploymentAssociationType> createPersonFormerEmploymentAssociation(PersonEmploymentAssociationType value) {
    return new JAXBElement<PersonEmploymentAssociationType>(_PersonFormerEmploymentAssociation_QNAME, PersonEmploymentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHashCode")
  public JAXBElement<String> createBinaryHashCode(String value) {
    return new JAXBElement<String>(_BinaryHashCode_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ImageAugmentationPoint")
  public JAXBElement<Object> createImageAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ImageAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationExemptionAugmentationPoint")
  public JAXBElement<Object> createObligationExemptionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ObligationExemptionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitUsageText")
  public JAXBElement<TextType> createPermitUsageText(TextType value) {
    return new JAXBElement<TextType>(_PermitUsageText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityAssociation")
  public JAXBElement<FacilityAssociationType> createFacilityAssociation(FacilityAssociationType value) {
    return new JAXBElement<FacilityAssociationType>(_FacilityAssociation_QNAME, FacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReportingOrganizationText")
  public JAXBElement<TextType> createReportingOrganizationText(TextType value) {
    return new JAXBElement<TextType>(_ReportingOrganizationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecimalRangeAugmentationPoint")
  public JAXBElement<Object> createDecimalRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DecimalRangeAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryDischargeCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MilitaryDischargeCategoryAbstract")
  public JAXBElement<TextType> createMilitaryDischargeCategoryText(TextType value) {
    return new JAXBElement<TextType>(_MilitaryDischargeCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicInstrument")
  public JAXBElement<ItemType> createElectronicInstrument(ItemType value) {
    return new JAXBElement<ItemType>(_ElectronicInstrument_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentBinary")
  public JAXBElement<BinaryType> createDocumentBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_DocumentBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Location")
  public JAXBElement<LocationType> createLocation(LocationType value) {
    return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationOrganizationAssociation")
  public JAXBElement<OrganizationLocationAssociationType> createLocationOrganizationAssociation(OrganizationLocationAssociationType value) {
    return new JAXBElement<OrganizationLocationAssociationType>(_LocationOrganizationAssociation_QNAME, OrganizationLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryLocationText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InjuryLocationAbstract")
  public JAXBElement<TextType> createInjuryLocationText(TextType value) {
    return new JAXBElement<TextType>(_InjuryLocationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionSetDate")
  public JAXBElement<DateType> createConditionSetDate(DateType value) {
    return new JAXBElement<DateType>(_ConditionSetDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Percent")
  public JAXBElement<Decimal> createPercent(Decimal value) {
    return new JAXBElement<Decimal>(_Percent_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityImageAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilityImageAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FacilityImageAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RealEstate")
  public JAXBElement<RealEstateType> createRealEstate(RealEstateType value) {
    return new JAXBElement<RealEstateType>(_RealEstate_QNAME, RealEstateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponUsageIndicator")
  public JAXBElement<Boolean> createWeaponUsageIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_WeaponUsageIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportCategoryAbstract")
  public JAXBElement<Object> createPassportCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_PassportCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceMeasure")
  public JAXBElement<SubstanceMeasureType> createSubstanceMeasure(SubstanceMeasureType value) {
    return new JAXBElement<SubstanceMeasureType>(_SubstanceMeasure_QNAME, SubstanceMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReportingPersonText")
  public JAXBElement<TextType> createReportingPersonText(TextType value) {
    return new JAXBElement<TextType>(_ReportingPersonText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemAuditEvent")
  public JAXBElement<SystemAuditEventType> createSystemAuditEvent(SystemAuditEventType value) {
    return new JAXBElement<SystemAuditEventType>(_SystemAuditEvent_QNAME, SystemAuditEventType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationExemptionIndicator")
  public JAXBElement<Boolean> createObligationExemptionIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ObligationExemptionIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Anomaly")
  public JAXBElement<AnomalyType> createAnomaly(AnomalyType value) {
    return new JAXBElement<AnomalyType>(_Anomaly_QNAME, AnomalyType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityPerson", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EntityRepresentation")
  public JAXBElement<PersonType> createEntityPerson(PersonType value) {
    return new JAXBElement<PersonType>(_EntityPerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHash")
  public JAXBElement<BinaryHashType> createBinaryHash(BinaryHashType value) {
    return new JAXBElement<BinaryHashType>(_BinaryHash_QNAME, BinaryHashType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEncounterLocation")
  public JAXBElement<LocationType> createPersonEncounterLocation(LocationType value) {
    return new JAXBElement<LocationType>(_PersonEncounterLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LastUpdatedDate")
  public JAXBElement<DateType> createLastUpdatedDate(DateType value) {
    return new JAXBElement<DateType>(_LastUpdatedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSexAbstract")
  public JAXBElement<Object> createPersonSexAbstract(Object value) {
    return new JAXBElement<Object>(_PersonSexAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonReadsLanguageIndicator")
  public JAXBElement<Boolean> createPersonReadsLanguageIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonReadsLanguageIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskName")
  public JAXBElement<String> createTaskName(String value) {
    return new JAXBElement<String>(_TaskName_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformationAvailabilityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactInformationAvailabilityAbstract")
  public JAXBElement<TextType> createContactInformationAvailabilityText(TextType value) {
    return new JAXBElement<TextType>(_ContactInformationAvailabilityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Kit")
  public JAXBElement<ItemType> createKit(ItemType value) {
    return new JAXBElement<ItemType>(_Kit_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisIdentification")
  public JAXBElement<IdentificationType> createCrisisIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_CrisisIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityDescriptionText")
  public JAXBElement<TextType> createFacilityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_FacilityDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityReportingOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityReportingOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityReportingOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceName")
  public JAXBElement<TextType> createPublicServiceName(TextType value) {
    return new JAXBElement<TextType>(_PublicServiceName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationTaxIdentification")
  public JAXBElement<IdentificationType> createOrganizationTaxIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_OrganizationTaxIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Program")
  public JAXBElement<ProgramType> createProgram(ProgramType value) {
    return new JAXBElement<ProgramType>(_Program_QNAME, ProgramType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySiteAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilitySiteAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FacilitySiteAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InjuryCategoryAbstract")
  public JAXBElement<TextType> createInjuryCategoryText(TextType value) {
    return new JAXBElement<TextType>(_InjuryCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOwnerAssociation")
  public JAXBElement<ItemEntityAssociationType> createItemOwnerAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(_ItemOwnerAssociation_QNAME, ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCoverageCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InsuranceCoverageCategoryAbstract")
  public JAXBElement<TextType> createInsuranceCoverageCategoryText(TextType value) {
    return new JAXBElement<TextType>(_InsuranceCoverageCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityCategoryAbstract")
  public JAXBElement<Object> createFacilityCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_FacilityCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountNumberCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "IdentificationCategoryAbstract")
  public JAXBElement<FinancialAccountNumberCategoryCodeType> createFinancialAccountNumberCategoryCode(FinancialAccountNumberCategoryCodeType value) {
    return new JAXBElement<FinancialAccountNumberCategoryCodeType>(_FinancialAccountNumberCategoryCode_QNAME, FinancialAccountNumberCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMoodDescriptionText")
  public JAXBElement<TextType> createPersonMoodDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_PersonMoodDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemLocationAssociationAugmentationPoint")
  public JAXBElement<Object> createItemLocationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemLocationAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceInformationAssociationAugmentationPoint")
  public JAXBElement<Object> createDeviceInformationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DeviceInformationAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityPersonAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilityPersonAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FacilityPersonAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RoleOfItem", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RoleOfAbstract")
  public JAXBElement<ItemType> createRoleOfItem(ItemType value) {
    return new JAXBElement<ItemType>(_RoleOfItem_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgressTimeQuantityText")
  public JAXBElement<TextType> createProgressTimeQuantityText(TextType value) {
    return new JAXBElement<TextType>(_ProgressTimeQuantityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleTransmissionCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "VehicleTransmissionCategoryAbstract")
  public JAXBElement<TextType> createVehicleTransmissionCategoryText(TextType value) {
    return new JAXBElement<TextType>(_VehicleTransmissionCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemName")
  public JAXBElement<TextType> createItemName(TextType value) {
    return new JAXBElement<TextType>(_ItemName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDocumentAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonDocumentAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonDocumentAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageRecipientName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageRecipientAbstract")
  public JAXBElement<TextType> createMessageRecipientName(TextType value) {
    return new JAXBElement<TextType>(_MessageRecipientName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHashFunctionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "BinaryHashFunctionAbstract")
  public JAXBElement<TextType> createBinaryHashFunctionText(TextType value) {
    return new JAXBElement<TextType>(_BinaryHashFunctionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleIdentification")
  public JAXBElement<IdentificationType> createVehicleIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_VehicleIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentDescriptionText")
  public JAXBElement<TextType> createDocumentDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_DocumentDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionAugmentationPoint")
  public JAXBElement<Object> createConditionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ConditionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Metadata")
  public JAXBElement<MetadataType> createMetadata(MetadataType value) {
    return new JAXBElement<MetadataType>(_Metadata_QNAME, MetadataType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationName")
  public JAXBElement<ProperNameTextType> createLocationName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_LocationName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityImageAssociation")
  public JAXBElement<FacilityImageAssociationType> createFacilityImageAssociation(FacilityImageAssociationType value) {
    return new JAXBElement<FacilityImageAssociationType>(_FacilityImageAssociation_QNAME, FacilityImageAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEyewearAbstract")
  public JAXBElement<Object> createPersonEyewearAbstract(Object value) {
    return new JAXBElement<Object>(_PersonEyewearAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityPrimaryOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityPrimaryOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityPrimaryOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSexText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonSexAbstract")
  public JAXBElement<TextType> createPersonSexText(TextType value) {
    return new JAXBElement<TextType>(_PersonSexText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemQuantity")
  public JAXBElement<QuantityType> createItemQuantity(QuantityType value) {
    return new JAXBElement<QuantityType>(_ItemQuantity_QNAME, QuantityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<BinaryType> createDeviceStoredBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_DeviceStoredBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleStatus")
  public JAXBElement<StatusType> createScheduleStatus(StatusType value) {
    return new JAXBElement<StatusType>(_ScheduleStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ServiceDeliveryNGO")
  public JAXBElement<OrganizationType> createServiceDeliveryNGO(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_ServiceDeliveryNGO_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentRightsText")
  public JAXBElement<TextType> createDocumentRightsText(TextType value) {
    return new JAXBElement<TextType>(_DocumentRightsText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueAssigningMethodAbstract")
  public JAXBElement<Object> createItemValueAssigningMethodAbstract(Object value) {
    return new JAXBElement<Object>(_ItemValueAssigningMethodAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairColorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonHairColorAbstract")
  public JAXBElement<TextType> createPersonHairColorText(TextType value) {
    return new JAXBElement<TextType>(_PersonHairColorText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionID")
  public JAXBElement<String> createMissionID(String value) {
    return new JAXBElement<String>(_MissionID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Departure")
  public JAXBElement<DepartureType> createDeparture(DepartureType value) {
    return new JAXBElement<DepartureType>(_Departure_QNAME, DepartureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFiledDate")
  public JAXBElement<DateType> createDocumentFiledDate(DateType value) {
    return new JAXBElement<DateType>(_DocumentFiledDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramReferral")
  public JAXBElement<ReferralType> createProgramReferral(ReferralType value) {
    return new JAXBElement<ReferralType>(_ProgramReferral_QNAME, ReferralType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PolygonRegionAugmentationPoint")
  public JAXBElement<Object> createPolygonRegionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PolygonRegionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Measure")
  public JAXBElement<MeasureType> createMeasure(MeasureType value) {
    return new JAXBElement<MeasureType>(_Measure_QNAME, MeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapDate")
  public JAXBElement<DateType> createMapDate(DateType value) {
    return new JAXBElement<DateType>(_MapDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SubstanceAbstract")
  public JAXBElement<DrugCodeType> createDrugCode(DrugCodeType value) {
    return new JAXBElement<DrugCodeType>(_DrugCode_QNAME, DrugCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationExemptionDescriptionText")
  public JAXBElement<TextType> createObligationExemptionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ObligationExemptionDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AzimuthAbstract")
  public JAXBElement<Object> createAzimuthAbstract(Object value) {
    return new JAXBElement<Object>(_AzimuthAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Activity")
  public JAXBElement<ActivityType> createActivity(ActivityType value) {
    return new JAXBElement<ActivityType>(_Activity_QNAME, ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommercialFacility")
  public JAXBElement<FacilityType> createCommercialFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_CommercialFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformationAugmentationPoint")
  public JAXBElement<Object> createContactInformationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ContactInformationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceRelatedService")
  public JAXBElement<PublicServiceType> createPublicServiceRelatedService(PublicServiceType value) {
    return new JAXBElement<PublicServiceType>(_PublicServiceRelatedService_QNAME, PublicServiceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InclinationDecimalValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InclinationAbstract")
  public JAXBElement<Decimal> createInclinationDecimalValue(Decimal value) {
    return new JAXBElement<Decimal>(_InclinationDecimalValue_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCopyrightIndicator")
  public JAXBElement<Boolean> createDocumentCopyrightIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_DocumentCopyrightIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSecurityClearanceAbstract")
  public JAXBElement<Object> createPersonSecurityClearanceAbstract(Object value) {
    return new JAXBElement<Object>(_PersonSecurityClearanceAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TowingCompany")
  public JAXBElement<OrganizationType> createTowingCompany(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_TowingCompany_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleAugmentationPoint")
  public JAXBElement<Object> createScheduleAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ScheduleAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehiclePassengerSafeQuantity")
  public JAXBElement<NonNegativeInteger> createVehiclePassengerSafeQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(_VehiclePassengerSafeQuantity_QNAME, NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeOccupationAbstract")
  public JAXBElement<Object> createEmployeeOccupationAbstract(Object value) {
    return new JAXBElement<Object>(_EmployeeOccupationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicAddressDescriptionText")
  public JAXBElement<TextType> createElectronicAddressDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ElectronicAddressDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselAugmentationPoint")
  public JAXBElement<Object> createVesselAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_VesselAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DistributionText")
  public JAXBElement<TextType> createDistributionText(TextType value) {
    return new JAXBElement<TextType>(_DistributionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCoverageText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCoverageAbstract")
  public JAXBElement<TextType> createDocumentCoverageText(TextType value) {
    return new JAXBElement<TextType>(_DocumentCoverageText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleSubdivisionName")
  public JAXBElement<TextType> createLocaleSubdivisionName(TextType value) {
    return new JAXBElement<TextType>(_LocaleSubdivisionName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationID")
  public JAXBElement<String> createIdentificationID(String value) {
    return new JAXBElement<String>(_IdentificationID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberID")
  public JAXBElement<String> createTelephoneNumberID(String value) {
    return new JAXBElement<String>(_TelephoneNumberID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganizationAffiliationAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createPersonOrganizationAffiliationAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(_PersonOrganizationAffiliationAssociation_QNAME, PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyCreationEventText")
  public JAXBElement<TextType> createIntellectualPropertyCreationEventText(TextType value) {
    return new JAXBElement<TextType>(_IntellectualPropertyCreationEventText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusIssuerText")
  public JAXBElement<TextType> createStatusIssuerText(TextType value) {
    return new JAXBElement<TextType>(_StatusIssuerText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceFoundDescriptionText")
  public JAXBElement<TextType> createSubstanceFoundDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_SubstanceFoundDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftWingColorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AircraftWingColorAbstract")
  public JAXBElement<TextType> createAircraftWingColorText(TextType value) {
    return new JAXBElement<TextType>(_AircraftWingColorText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SoftwareName")
  public JAXBElement<SoftwareNameType> createSoftwareName(SoftwareNameType value) {
    return new JAXBElement<SoftwareNameType>(_SoftwareName_QNAME, SoftwareNameType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationHeightVerticalDatumCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationHeightVerticalDatumAbstract")
  public JAXBElement<VerticalDatumCodeType> createLocationHeightVerticalDatumCode(VerticalDatumCodeType value) {
    return new JAXBElement<VerticalDatumCodeType>(_LocationHeightVerticalDatumCode_QNAME, VerticalDatumCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngleMeasureAugmentationPoint")
  public JAXBElement<Object> createAngleMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AngleMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapLocationDescriptionText")
  public JAXBElement<TextType> createMapLocationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_MapLocationDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Assessment")
  public JAXBElement<AssessmentType> createAssessment(AssessmentType value) {
    return new JAXBElement<AssessmentType>(_Assessment_QNAME, AssessmentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountry")
  public JAXBElement<CountryType> createLocationCountry(CountryType value) {
    return new JAXBElement<CountryType>(_LocationCountry_QNAME, CountryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RecommendationCategoryAbstract")
  public JAXBElement<TextType> createRecommendationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_RecommendationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntegerRangeAugmentationPoint")
  public JAXBElement<Object> createIntegerRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_IntegerRangeAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceCategoryAbstract")
  public JAXBElement<Object> createDeviceCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_DeviceCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceMeasureAugmentationPoint")
  public JAXBElement<Object> createSubstanceMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SubstanceMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionName")
  public JAXBElement<String> createMissionName(String value) {
    return new JAXBElement<String>(_MissionName_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSubmissionAmount")
  public JAXBElement<AmountType> createDocumentSubmissionAmount(AmountType value) {
    return new JAXBElement<AmountType>(_DocumentSubmissionAmount_QNAME, AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCarrierIdentification")
  public JAXBElement<IdentificationType> createInsuranceCarrierIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_InsuranceCarrierIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceActiveIndicator")
  public JAXBElement<Boolean> createInsuranceActiveIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_InsuranceActiveIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisDescriptionText")
  public JAXBElement<TextType> createCrisisDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_CrisisDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapPageID")
  public JAXBElement<String> createMapPageID(String value) {
    return new JAXBElement<String>(_MapPageID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationSurroundingAreaDescriptionText")
  public JAXBElement<TextType> createLocationSurroundingAreaDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_LocationSurroundingAreaDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformation")
  public JAXBElement<ContactInformationType> createContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_ContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationFloorNumberText")
  public JAXBElement<TextType> createLocationFloorNumberText(TextType value) {
    return new JAXBElement<TextType>(_LocationFloorNumberText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactMailingAddress", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<AddressType> createContactMailingAddress(AddressType value) {
    return new JAXBElement<AddressType>(_ContactMailingAddress_QNAME, AddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemModelName")
  public JAXBElement<ProperNameTextType> createItemModelName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_ItemModelName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceAugmentationPoint")
  public JAXBElement<Object> createPublicServiceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PublicServiceAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisStatus")
  public JAXBElement<StatusType> createCrisisStatus(StatusType value) {
    return new JAXBElement<StatusType>(_CrisisStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MachineryCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemCategoryAbstract")
  public JAXBElement<MachineryCategoryCodeType> createMachineryCategoryCode(MachineryCategoryCodeType value) {
    return new JAXBElement<MachineryCategoryCodeType>(_MachineryCategoryCode_QNAME, MachineryCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityIsLimitationIndicator")
  public JAXBElement<Boolean> createCapabilityIsLimitationIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_CapabilityIsLimitationIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHashFunctionAbstract")
  public JAXBElement<Object> createBinaryHashFunctionAbstract(Object value) {
    return new JAXBElement<Object>(_BinaryHashFunctionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentScoreText")
  public JAXBElement<TextType> createAssessmentScoreText(TextType value) {
    return new JAXBElement<TextType>(_AssessmentScoreText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceEffectiveDateRange")
  public JAXBElement<DateRangeType> createInsuranceEffectiveDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(_InsuranceEffectiveDateRange_QNAME, DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetName")
  public JAXBElement<ProperNameTextType> createStreetName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_StreetName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentAssociation")
  public JAXBElement<DocumentAssociationType> createDocumentAssociation(DocumentAssociationType value) {
    return new JAXBElement<DocumentAssociationType>(_DocumentAssociation_QNAME, DocumentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeOccupationCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EmployeeOccupationAbstract")
  public JAXBElement<OccupationCodeType> createEmployeeOccupationCode(OccupationCodeType value) {
    return new JAXBElement<OccupationCodeType>(_EmployeeOccupationCode_QNAME, OccupationCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleCurrentWeightMeasure")
  public JAXBElement<WeightMeasureType> createVehicleCurrentWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_VehicleCurrentWeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureIntegerValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasurePointAbstract")
  public JAXBElement<Integer> createMeasureIntegerValue(Integer value) {
    return new JAXBElement<Integer>(_MeasureIntegerValue_QNAME, Integer.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleOdometerReadingMeasure")
  public JAXBElement<LengthMeasureType> createVehicleOdometerReadingMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(_VehicleOdometerReadingMeasure_QNAME, LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityAdministratorOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityAdministratorOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityAdministratorOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CurrencyAbstract")
  public JAXBElement<Object> createCurrencyAbstract(Object value) {
    return new JAXBElement<Object>(_CurrencyAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDecimalRange", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureRangeAbstract")
  public JAXBElement<DecimalRangeType> createMeasureDecimalRange(DecimalRangeType value) {
    return new JAXBElement<DecimalRangeType>(_MeasureDecimalRange_QNAME, DecimalRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonLivingIndicator")
  public JAXBElement<Boolean> createPersonLivingIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonLivingIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentLanguageAbstract")
  public JAXBElement<Object> createDocumentLanguageAbstract(Object value) {
    return new JAXBElement<Object>(_DocumentLanguageAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemReceiptIdentification")
  public JAXBElement<IdentificationType> createItemReceiptIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_ItemReceiptIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFileControlID")
  public JAXBElement<String> createDocumentFileControlID(String value) {
    return new JAXBElement<String>(_DocumentFileControlID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDispositionAbstract")
  public JAXBElement<Object> createItemDispositionAbstract(Object value) {
    return new JAXBElement<Object>(_ItemDispositionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCitizenshipISO3166Alpha2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonCitizenshipAbstract")
  public JAXBElement<CountryAlpha2CodeType> createPersonCitizenshipISO3166Alpha2Code(CountryAlpha2CodeType value) {
    return new JAXBElement<CountryAlpha2CodeType>(_PersonCitizenshipISO3166Alpha2Code_QNAME, CountryAlpha2CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicAddressAugmentationPoint")
  public JAXBElement<Object> createElectronicAddressAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ElectronicAddressAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairColorAbstract")
  public JAXBElement<Object> createPersonHairColorAbstract(Object value) {
    return new JAXBElement<Object>(_PersonHairColorAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Securities")
  public JAXBElement<SecuritiesType> createSecurities(SecuritiesType value) {
    return new JAXBElement<SecuritiesType>(_Securities_QNAME, SecuritiesType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportStolenLostIndicator")
  public JAXBElement<Boolean> createPassportStolenLostIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PassportStolenLostIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryID")
  public JAXBElement<String> createBinaryID(String value) {
    return new JAXBElement<String>(_BinaryID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisunionPendingIndicator")
  public JAXBElement<Boolean> createPersonDisunionPendingIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonDisunionPendingIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "QuarterID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<QuarterIDType> createQuarterID(QuarterIDType value) {
    return new JAXBElement<QuarterIDType>(_QuarterID_QNAME, QuarterIDType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubFacility")
  public JAXBElement<FacilityType> createSubFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_SubFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonJewelryDescriptionText")
  public JAXBElement<TextType> createPersonJewelryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_PersonJewelryDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionViolationDate")
  public JAXBElement<DateType> createConditionViolationDate(DateType value) {
    return new JAXBElement<DateType>(_ConditionViolationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceCategoryAbstract")
  public JAXBElement<TextType> createDeviceCategoryText(TextType value) {
    return new JAXBElement<TextType>(_DeviceCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationIncorporationDate")
  public JAXBElement<DateType> createOrganizationIncorporationDate(DateType value) {
    return new JAXBElement<DateType>(_OrganizationIncorporationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceFormText")
  public JAXBElement<TextType> createSubstanceFormText(TextType value) {
    return new JAXBElement<TextType>(_SubstanceFormText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EncounterCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EncounterCategoryAbstract")
  public JAXBElement<TextType> createEncounterCategoryText(TextType value) {
    return new JAXBElement<TextType>(_EncounterCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemImage")
  public JAXBElement<ImageType> createItemImage(ImageType value) {
    return new JAXBElement<ImageType>(_ItemImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelecommunicationDeviceSIMCardAssociationAugmentationPoint")
  public JAXBElement<Object> createTelecommunicationDeviceSIMCardAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_TelecommunicationDeviceSIMCardAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Referral")
  public JAXBElement<ReferralType> createReferral(ReferralType value) {
    return new JAXBElement<ReferralType>(_Referral_QNAME, ReferralType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ExpirationDate")
  public JAXBElement<DateType> createExpirationDate(DateType value) {
    return new JAXBElement<DateType>(_ExpirationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageReferenceID")
  public JAXBElement<String> createMessageReferenceID(String value) {
    return new JAXBElement<String>(_MessageReferenceID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentContentListText")
  public JAXBElement<TextType> createDocumentContentListText(TextType value) {
    return new JAXBElement<TextType>(_DocumentContentListText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AzimuthValue")
  public JAXBElement<Degree360Type> createAzimuthValue(Degree360Type value) {
    return new JAXBElement<Degree360Type>(_AzimuthValue_QNAME, Degree360Type.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationEveningContactInformation")
  public JAXBElement<ContactInformationType> createOrganizationEveningContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_OrganizationEveningContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionAugmentationPoint")
  public JAXBElement<Object> createCaseDispositionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CaseDispositionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleFireJurisdictionID")
  public JAXBElement<String> createLocaleFireJurisdictionID(String value) {
    return new JAXBElement<String>(_LocaleFireJurisdictionID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityDisposition")
  public JAXBElement<DispositionType> createActivityDisposition(DispositionType value) {
    return new JAXBElement<DispositionType>(_ActivityDisposition_QNAME, DispositionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DepartureDate")
  public JAXBElement<DateType> createDepartureDate(DateType value) {
    return new JAXBElement<DateType>(_DepartureDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemStatus")
  public JAXBElement<StatusType> createItemStatus(StatusType value) {
    return new JAXBElement<StatusType>(_ItemStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityBillRecipientOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityBillRecipientOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityBillRecipientOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramPerson")
  public JAXBElement<PersonType> createProgramPerson(PersonType value) {
    return new JAXBElement<PersonType>(_ProgramPerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaGeographicAbstract")
  public JAXBElement<Object> createAreaGeographicAbstract(Object value) {
    return new JAXBElement<Object>(_AreaGeographicAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountAugmentationPoint")
  public JAXBElement<Object> createFinancialAccountAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FinancialAccountAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HexBinaryObject", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "BinaryObjectAbstract")
  public JAXBElement<HexBinary> createHexBinaryObject(HexBinary value) {
    return new JAXBElement<HexBinary>(_HexBinaryObject_QNAME, HexBinary.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemAugmentationPoint")
  public JAXBElement<Object> createItemAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DirectDialTelephoneNumberAugmentationPoint")
  public JAXBElement<Object> createDirectDialTelephoneNumberAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DirectDialTelephoneNumberAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceFuelCategoryAbstract")
  public JAXBElement<Object> createConveyanceFuelCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_ConveyanceFuelCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganDonatorIndicator")
  public JAXBElement<Boolean> createPersonOrganDonatorIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonOrganDonatorIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityFacilityAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityFacilityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ActivityFacilityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LanguageName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LanguageAbstract")
  public JAXBElement<TextType> createLanguageName(TextType value) {
    return new JAXBElement<TextType>(_LanguageName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySystemIdentification")
  public JAXBElement<SystemIdentificationType> createFacilitySystemIdentification(SystemIdentificationType value) {
    return new JAXBElement<SystemIdentificationType>(_FacilitySystemIdentification_QNAME, SystemIdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityUsageLevel1Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityUsageAbstract")
  public JAXBElement<FacilityUsageLevel1CodeType> createFacilityUsageLevel1Code(FacilityUsageLevel1CodeType value) {
    return new JAXBElement<FacilityUsageLevel1CodeType>(_FacilityUsageLevel1Code_QNAME, FacilityUsageLevel1CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAssignedUnitAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createPersonAssignedUnitAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(_PersonAssignedUnitAssociation_QNAME, PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCoverageCategoryAbstract")
  public JAXBElement<Object> createInsuranceCoverageCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_InsuranceCoverageCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DirectDialTelephoneNetworkText")
  public JAXBElement<TextType> createDirectDialTelephoneNetworkText(TextType value) {
    return new JAXBElement<TextType>(_DirectDialTelephoneNetworkText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseGeneralCategoryText")
  public JAXBElement<TextType> createCaseGeneralCategoryText(TextType value) {
    return new JAXBElement<TextType>(_CaseGeneralCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountyName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationCountyAbstract")
  public JAXBElement<ProperNameTextType> createLocationCountyName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_LocationCountyName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceAugmentationPoint")
  public JAXBElement<Object> createDeviceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_DeviceAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualProperty")
  public JAXBElement<IntellectualPropertyType> createIntellectualProperty(IntellectualPropertyType value) {
    return new JAXBElement<IntellectualPropertyType>(_IntellectualProperty_QNAME, IntellectualPropertyType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceCargoText")
  public JAXBElement<TextType> createConveyanceCargoText(TextType value) {
    return new JAXBElement<TextType>(_ConveyanceCargoText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceLanguageAbstract")
  public JAXBElement<Object> createPublicServiceLanguageAbstract(Object value) {
    return new JAXBElement<Object>(_PublicServiceLanguageAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityCharacteristics")
  public JAXBElement<PersonType> createIdentityCharacteristics(PersonType value) {
    return new JAXBElement<PersonType>(_IdentityCharacteristics_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemLocationAssociation")
  public JAXBElement<ItemLocationAssociationType> createItemLocationAssociation(ItemLocationAssociationType value) {
    return new JAXBElement<ItemLocationAssociationType>(_ItemLocationAssociation_QNAME, ItemLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonIdentityAssociation")
  public JAXBElement<PersonIdentityAssociationType> createPersonIdentityAssociation(PersonIdentityAssociationType value) {
    return new JAXBElement<PersonIdentityAssociationType>(_PersonIdentityAssociation_QNAME, PersonIdentityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngleUnitAbstract")
  public JAXBElement<Object> createAngleUnitAbstract(Object value) {
    return new JAXBElement<Object>(_AngleUnitAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationStatus")
  public JAXBElement<StatusType> createIdentificationStatus(StatusType value) {
    return new JAXBElement<StatusType>(_IdentificationStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountNumberID")
  public JAXBElement<String> createFinancialAccountNumberID(String value) {
    return new JAXBElement<String>(_FinancialAccountNumberID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryExperienceIndicator")
  public JAXBElement<Boolean> createMilitaryExperienceIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_MilitaryExperienceIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOwnerAppliedID")
  public JAXBElement<String> createItemOwnerAppliedID(String value) {
    return new JAXBElement<String>(_ItemOwnerAppliedID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressAugmentationPoint")
  public JAXBElement<Object> createAddressAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AddressAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemLeaseIndicator")
  public JAXBElement<Boolean> createItemLeaseIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ItemLeaseIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseSupervisor")
  public JAXBElement<EntityType> createReleaseSupervisor(EntityType value) {
    return new JAXBElement<EntityType>(_ReleaseSupervisor_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionStatusAbstract")
  public JAXBElement<Object> createPersonUnionStatusAbstract(Object value) {
    return new JAXBElement<Object>(_PersonUnionStatusAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleMakeAbstract")
  public JAXBElement<Object> createVehicleMakeAbstract(Object value) {
    return new JAXBElement<Object>(_VehicleMakeAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationHeightAbstract")
  public JAXBElement<Object> createLocationHeightAbstract(Object value) {
    return new JAXBElement<Object>(_LocationHeightAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TimeMeasure")
  public JAXBElement<TimeMeasureType> createTimeMeasure(TimeMeasureType value) {
    return new JAXBElement<TimeMeasureType>(_TimeMeasure_QNAME, TimeMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleCMVIndicator")
  public JAXBElement<Boolean> createVehicleCMVIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_VehicleCMVIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PaymentAugmentationPoint")
  public JAXBElement<Object> createPaymentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PaymentAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemStyleText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemStyleAbstract")
  public JAXBElement<TextType> createItemStyleText(TextType value) {
    return new JAXBElement<TextType>(_ItemStyleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentExpirationDate")
  public JAXBElement<DateType> createDocumentExpirationDate(DateType value) {
    return new JAXBElement<DateType>(_DocumentExpirationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationComplianceIndicator")
  public JAXBElement<Boolean> createObligationComplianceIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ObligationComplianceIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCancellationDate")
  public JAXBElement<DateType> createInsuranceCancellationDate(DateType value) {
    return new JAXBElement<DateType>(_InsuranceCancellationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationRecipient")
  public JAXBElement<EntityType> createObligationRecipient(EntityType value) {
    return new JAXBElement<EntityType>(_ObligationRecipient_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOtherIdentification")
  public JAXBElement<IdentificationType> createPersonOtherIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonOtherIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentDisputedReasonText")
  public JAXBElement<TextType> createDocumentDisputedReasonText(TextType value) {
    return new JAXBElement<TextType>(_DocumentDisputedReasonText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAssociation")
  public JAXBElement<PersonAssociationType> createPersonAssociation(PersonAssociationType value) {
    return new JAXBElement<PersonAssociationType>(_PersonAssociation_QNAME, PersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivitySiteAssociation")
  public JAXBElement<ActivitySiteAssociationType> createActivitySiteAssociation(ActivitySiteAssociationType value) {
    return new JAXBElement<ActivitySiteAssociationType>(_ActivitySiteAssociation_QNAME, ActivitySiteAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReportingPersonRoleText")
  public JAXBElement<TextType> createReportingPersonRoleText(TextType value) {
    return new JAXBElement<TextType>(_ReportingPersonRoleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HazmatAbstract")
  public JAXBElement<Object> createHazmatAbstract(Object value) {
    return new JAXBElement<Object>(_HazmatAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Attachment")
  public JAXBElement<BinaryType> createAttachment(BinaryType value) {
    return new JAXBElement<BinaryType>(_Attachment_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHashAugmentationPoint")
  public JAXBElement<Object> createBinaryHashAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_BinaryHashAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNationalityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonNationalityAbstract")
  public JAXBElement<TextType> createPersonNationalityText(TextType value) {
    return new JAXBElement<TextType>(_PersonNationalityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredInformationAbstract")
  public JAXBElement<Object> createDeviceStoredInformationAbstract(Object value) {
    return new JAXBElement<Object>(_DeviceStoredInformationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSensitivityAbstract")
  public JAXBElement<Object> createDocumentSensitivityAbstract(Object value) {
    return new JAXBElement<Object>(_DocumentSensitivityAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleCommunityName")
  public JAXBElement<TextType> createLocaleCommunityName(TextType value) {
    return new JAXBElement<TextType>(_LocaleCommunityName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityIdentification")
  public JAXBElement<IdentificationType> createActivityIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_ActivityIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Area")
  public JAXBElement<AreaType> createArea(AreaType value) {
    return new JAXBElement<AreaType>(_Area_QNAME, AreaType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitarySummaryAugmentationPoint")
  public JAXBElement<Object> createMilitarySummaryAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_MilitarySummaryAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublisherName")
  public JAXBElement<TextType> createPublisherName(TextType value) {
    return new JAXBElement<TextType>(_PublisherName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureErrorAbstract")
  public JAXBElement<Object> createMeasureErrorAbstract(Object value) {
    return new JAXBElement<Object>(_MeasureErrorAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationElevation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationHeightAbstract")
  public JAXBElement<LocationHeightMeasureType> createLocationElevation(LocationHeightMeasureType value) {
    return new JAXBElement<LocationHeightMeasureType>(_LocationElevation_QNAME, LocationHeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemCurrentResaleValue")
  public JAXBElement<ItemValueType> createItemCurrentResaleValue(ItemValueType value) {
    return new JAXBElement<ItemValueType>(_ItemCurrentResaleValue_QNAME, ItemValueType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgressAugmentationPoint")
  public JAXBElement<Object> createProgressAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ProgressAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneLineID")
  public JAXBElement<String> createTelephoneLineID(String value) {
    return new JAXBElement<String>(_TelephoneLineID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityPersonAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityPersonAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ActivityPersonAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HighwayID")
  public JAXBElement<String> createHighwayID(String value) {
    return new JAXBElement<String>(_HighwayID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<TelephoneNumberType> createContactTelephoneNumber(TelephoneNumberType value) {
    return new JAXBElement<TelephoneNumberType>(_ContactTelephoneNumber_QNAME, TelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "JurisdictionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "JurisdictionAbstract")
  public JAXBElement<TextType> createJurisdictionText(TextType value) {
    return new JAXBElement<TextType>(_JurisdictionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisunion")
  public JAXBElement<PersonDisunionType> createPersonDisunion(PersonDisunionType value) {
    return new JAXBElement<PersonDisunionType>(_PersonDisunion_QNAME, PersonDisunionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationSupervisesFacilityAssociation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "OrganizationFacilityAssociation")
  public JAXBElement<OrganizationFacilityAssociationType> createOrganizationSupervisesFacilityAssociation(OrganizationFacilityAssociationType value) {
    return new JAXBElement<OrganizationFacilityAssociationType>(_OrganizationSupervisesFacilityAssociation_QNAME, OrganizationFacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntangibleItemCategoryAbstract")
  public JAXBElement<Object> createIntangibleItemCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_IntangibleItemCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaAugmentationPoint")
  public JAXBElement<Object> createAreaAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AreaAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AirportAugmentationPoint")
  public JAXBElement<Object> createAirportAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AirportAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicEquipment")
  public JAXBElement<ItemType> createElectronicEquipment(ItemType value) {
    return new JAXBElement<ItemType>(_ElectronicEquipment_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleJudicialDistrictName")
  public JAXBElement<TextType> createLocaleJudicialDistrictName(TextType value) {
    return new JAXBElement<TextType>(_LocaleJudicialDistrictName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionLocation")
  public JAXBElement<LocationType> createPersonUnionLocation(LocationType value) {
    return new JAXBElement<LocationType>(_PersonUnionLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSummaryText")
  public JAXBElement<TextType> createDocumentSummaryText(TextType value) {
    return new JAXBElement<TextType>(_DocumentSummaryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationTotalAmount", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationTotalAbstract")
  public JAXBElement<AmountType> createObligationTotalAmount(AmountType value) {
    return new JAXBElement<AmountType>(_ObligationTotalAmount_QNAME, AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityDocumentAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityDocumentAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ActivityDocumentAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionText")
  public JAXBElement<TextType> createDispositionText(TextType value) {
    return new JAXBElement<TextType>(_DispositionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DepartureLocation")
  public JAXBElement<LocationType> createDepartureLocation(LocationType value) {
    return new JAXBElement<LocationType>(_DepartureLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationAugmentationPoint")
  public JAXBElement<Object> createRelativeLocationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_RelativeLocationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitarySummary")
  public JAXBElement<MilitarySummaryType> createMilitarySummary(MilitarySummaryType value) {
    return new JAXBElement<MilitarySummaryType>(_MilitarySummary_QNAME, MilitarySummaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneAreaCodeID")
  public JAXBElement<String> createTelephoneAreaCodeID(String value) {
    return new JAXBElement<String>(_TelephoneAreaCodeID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIssuanceDate")
  public JAXBElement<DateType> createDocumentIssuanceDate(DateType value) {
    return new JAXBElement<DateType>(_DocumentIssuanceDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselMakeAbstract")
  public JAXBElement<Object> createVesselMakeAbstract(Object value) {
    return new JAXBElement<Object>(_VesselMakeAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StateISO3166Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<CountrySubdivisionCodeType> createStateISO3166Code(CountrySubdivisionCodeType value) {
    return new JAXBElement<CountrySubdivisionCodeType>(_StateISO3166Code_QNAME, CountrySubdivisionCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestStatus")
  public JAXBElement<StatusType> createRequestStatus(StatusType value) {
    return new JAXBElement<StatusType>(_RequestStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Decal")
  public JAXBElement<DecalType> createDecal(DecalType value) {
    return new JAXBElement<DecalType>(_Decal_QNAME, DecalType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Location3DGeospatialCoordinateAugmentationPoint")
  public JAXBElement<Object> createLocation3DGeospatialCoordinateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_Location3DGeospatialCoordinateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralEntity")
  public JAXBElement<EntityType> createReferralEntity(EntityType value) {
    return new JAXBElement<EntityType>(_ReferralEntity_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityReasonText")
  public JAXBElement<TextType> createActivityReasonText(TextType value) {
    return new JAXBElement<TextType>(_ActivityReasonText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemCurrentLocationAssociation")
  public JAXBElement<ItemLocationAssociationType> createItemCurrentLocationAssociation(ItemLocationAssociationType value) {
    return new JAXBElement<ItemLocationAssociationType>(_ItemCurrentLocationAssociation_QNAME, ItemLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ManifestAugmentationPoint")
  public JAXBElement<Object> createManifestAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ManifestAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularDegreeValue")
  public JAXBElement<Decimal> createAngularDegreeValue(Decimal value) {
    return new JAXBElement<Decimal>(_AngularDegreeValue_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionSupervisor")
  public JAXBElement<EntityType> createSupervisionSupervisor(EntityType value) {
    return new JAXBElement<EntityType>(_SupervisionSupervisor_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDisposition")
  public JAXBElement<ItemDispositionType> createItemDisposition(ItemDispositionType value) {
    return new JAXBElement<ItemDispositionType>(_ItemDisposition_QNAME, ItemDispositionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageRecipientAbstract")
  public JAXBElement<Object> createMessageRecipientAbstract(Object value) {
    return new JAXBElement<Object>(_MessageRecipientAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionPerson")
  public JAXBElement<PersonType> createSupervisionPerson(PersonType value) {
    return new JAXBElement<PersonType>(_SupervisionPerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMinimumIntegerValue")
  public JAXBElement<Integer> createRangeMinimumIntegerValue(Integer value) {
    return new JAXBElement<Integer>(_RangeMinimumIntegerValue_QNAME, Integer.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponIndicator")
  public JAXBElement<Boolean> createWeaponIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_WeaponIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationStreet", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressDeliveryPointAbstract")
  public JAXBElement<StreetType> createLocationStreet(StreetType value) {
    return new JAXBElement<StreetType>(_LocationStreet_QNAME, StreetType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityCreationEventText")
  public JAXBElement<TextType> createIdentityCreationEventText(TextType value) {
    return new JAXBElement<TextType>(_IdentityCreationEventText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "IdentificationCategoryAbstract")
  public JAXBElement<TextType> createIdentificationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_IdentificationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocalePoliceGridText")
  public JAXBElement<TextType> createLocalePoliceGridText(TextType value) {
    return new JAXBElement<TextType>(_LocalePoliceGridText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PaymentAmount")
  public JAXBElement<AmountType> createPaymentAmount(AmountType value) {
    return new JAXBElement<AmountType>(_PaymentAmount_QNAME, AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactRadioChannelText")
  public JAXBElement<TextType> createContactRadioChannelText(TextType value) {
    return new JAXBElement<TextType>(_ContactRadioChannelText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Weapon")
  public JAXBElement<WeaponType> createWeapon(WeaponType value) {
    return new JAXBElement<WeaponType>(_Weapon_QNAME, WeaponType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBuildAbstract")
  public JAXBElement<Object> createPersonBuildAbstract(Object value) {
    return new JAXBElement<Object>(_PersonBuildAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Chemical")
  public JAXBElement<SubstanceType> createChemical(SubstanceType value) {
    return new JAXBElement<SubstanceType>(_Chemical_QNAME, SubstanceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCategoryAbstract")
  public JAXBElement<Object> createDocumentCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_DocumentCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationPaidDate")
  public JAXBElement<DateType> createObligationPaidDate(DateType value) {
    return new JAXBElement<DateType>(_ObligationPaidDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SpeedMeasureAugmentationPoint")
  public JAXBElement<Object> createSpeedMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SpeedMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskStartDate")
  public JAXBElement<DateType> createTaskStartDate(DateType value) {
    return new JAXBElement<DateType>(_TaskStartDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDependentQuantity")
  public JAXBElement<QuantityType> createPersonDependentQuantity(QuantityType value) {
    return new JAXBElement<QuantityType>(_PersonDependentQuantity_QNAME, QuantityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaveatText")
  public JAXBElement<TextType> createCaveatText(TextType value) {
    return new JAXBElement<TextType>(_CaveatText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularSecondValue")
  public JAXBElement<AngularSecondType> createAngularSecondValue(AngularSecondType value) {
    return new JAXBElement<AngularSecondType>(_AngularSecondValue_QNAME, AngularSecondType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBirthLocation")
  public JAXBElement<LocationType> createPersonBirthLocation(LocationType value) {
    return new JAXBElement<LocationType>(_PersonBirthLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationFacilityAssociationAugmentationPoint")
  public JAXBElement<Object> createOrganizationFacilityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_OrganizationFacilityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProbabilityPercent")
  public JAXBElement<Decimal> createProbabilityPercent(Decimal value) {
    return new JAXBElement<Decimal>(_ProbabilityPercent_QNAME, Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaCircularRegion", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AreaRegionAbstract")
  public JAXBElement<CircularRegionType> createAreaCircularRegion(CircularRegionType value) {
    return new JAXBElement<CircularRegionType>(_AreaCircularRegion_QNAME, CircularRegionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionProgram")
  public JAXBElement<ProgramType> createDisciplinaryActionProgram(ProgramType value) {
    return new JAXBElement<ProgramType>(_DisciplinaryActionProgram_QNAME, ProgramType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemMoverAssociation")
  public JAXBElement<ItemEntityAssociationType> createItemMoverAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(_ItemMoverAssociation_QNAME, ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceAvailabilitySchedule")
  public JAXBElement<ScheduleType> createPublicServiceAvailabilitySchedule(ScheduleType value) {
    return new JAXBElement<ScheduleType>(_PublicServiceAvailabilitySchedule_QNAME, ScheduleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PaymentMethodCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PaymentMethodAbstract")
  public JAXBElement<PaymentMethodCodeType> createPaymentMethodCode(PaymentMethodCodeType value) {
    return new JAXBElement<PaymentMethodCodeType>(_PaymentMethodCode_QNAME, PaymentMethodCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskDescriptionText")
  public JAXBElement<String> createTaskDescriptionText(String value) {
    return new JAXBElement<String>(_TaskDescriptionText_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestDecisionDate")
  public JAXBElement<DateType> createRequestDecisionDate(DateType value) {
    return new JAXBElement<DateType>(_RequestDecisionDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FiscalYearDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<FiscalYearDateType> createFiscalYearDate(FiscalYearDateType value) {
    return new JAXBElement<FiscalYearDateType>(_FiscalYearDate_QNAME, FiscalYearDateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskEndDate")
  public JAXBElement<DateType> createTaskEndDate(DateType value) {
    return new JAXBElement<DateType>(_TaskEndDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionStatusCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonUnionStatusAbstract")
  public JAXBElement<PersonUnionStatusCodeType> createPersonUnionStatusCode(PersonUnionStatusCodeType value) {
    return new JAXBElement<PersonUnionStatusCodeType>(_PersonUnionStatusCode_QNAME, PersonUnionStatusCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredDocument", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<DocumentType> createDeviceStoredDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_DeviceStoredDocument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeePositionName")
  public JAXBElement<TextType> createEmployeePositionName(TextType value) {
    return new JAXBElement<TextType>(_EmployeePositionName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionPerson")
  public JAXBElement<PersonType> createDisciplinaryActionPerson(PersonType value) {
    return new JAXBElement<PersonType>(_DisciplinaryActionPerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayStatus")
  public JAXBElement<StatusType> createScheduleDayStatus(StatusType value) {
    return new JAXBElement<StatusType>(_ScheduleDayStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCarrierName")
  public JAXBElement<TextType> createInsuranceCarrierName(TextType value) {
    return new JAXBElement<TextType>(_InsuranceCarrierName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureValueAbstract")
  public JAXBElement<Object> createMeasureValueAbstract(Object value) {
    return new JAXBElement<Object>(_MeasureValueAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryStatus")
  public JAXBElement<StatusType> createMilitaryStatus(StatusType value) {
    return new JAXBElement<StatusType>(_MilitaryStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "BinaryCategoryAbstract")
  public JAXBElement<TextType> createBinaryCategoryText(TextType value) {
    return new JAXBElement<TextType>(_BinaryCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusCommentText")
  public JAXBElement<TextType> createStatusCommentText(TextType value) {
    return new JAXBElement<TextType>(_StatusCommentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionDisciplinaryAction")
  public JAXBElement<DisciplinaryActionType> createConditionDisciplinaryAction(DisciplinaryActionType value) {
    return new JAXBElement<DisciplinaryActionType>(_ConditionDisciplinaryAction_QNAME, DisciplinaryActionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentAugmentationPoint")
  public JAXBElement<Object> createIncidentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_IncidentAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionPersonStatus")
  public JAXBElement<StatusType> createSupervisionPersonStatus(StatusType value) {
    return new JAXBElement<StatusType>(_SupervisionPersonStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryDescriptionText")
  public JAXBElement<TextType> createInjuryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_InjuryDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDetainmentLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonDetainmentLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(_PersonDetainmentLocationAssociation_QNAME, PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusAbstract")
  public JAXBElement<Object> createStatusAbstract(Object value) {
    return new JAXBElement<Object>(_StatusAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCertifiedDate")
  public JAXBElement<DateType> createInsuranceCertifiedDate(DateType value) {
    return new JAXBElement<DateType>(_InsuranceCertifiedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteLocation")
  public JAXBElement<LocationType> createSiteLocation(LocationType value) {
    return new JAXBElement<LocationType>(_SiteLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressGridText")
  public JAXBElement<TextType> createAddressGridText(TextType value) {
    return new JAXBElement<TextType>(_AddressGridText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionMandatoryIndicator")
  public JAXBElement<Boolean> createConditionMandatoryIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ConditionMandatoryIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueDate")
  public JAXBElement<DateType> createItemValueDate(DateType value) {
    return new JAXBElement<DateType>(_ItemValueDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityDocumentAssociation")
  public JAXBElement<FacilityDocumentAssociationType> createFacilityDocumentAssociation(FacilityDocumentAssociationType value) {
    return new JAXBElement<FacilityDocumentAssociationType>(_FacilityDocumentAssociation_QNAME, FacilityDocumentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemFirstSoldYearDate")
  public JAXBElement<GYear> createItemFirstSoldYearDate(GYear value) {
    return new JAXBElement<GYear>(_ItemFirstSoldYearDate_QNAME, GYear.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramAdministrator")
  public JAXBElement<EntityType> createProgramAdministrator(EntityType value) {
    return new JAXBElement<EntityType>(_ProgramAdministrator_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleTowerAssociation")
  public JAXBElement<ItemEntityAssociationType> createVehicleTowerAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(_VehicleTowerAssociation_QNAME, ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugCoverageExceptionReasonText")
  public JAXBElement<TextType> createDrugCoverageExceptionReasonText(TextType value) {
    return new JAXBElement<TextType>(_DrugCoverageExceptionReasonText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentAugmentationPoint")
  public JAXBElement<Object> createAssessmentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AssessmentAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesDenominationAbstract")
  public JAXBElement<Object> createSecuritiesDenominationAbstract(Object value) {
    return new JAXBElement<Object>(_SecuritiesDenominationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressBuildingName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressDeliveryPointAbstract")
  public JAXBElement<TextType> createAddressBuildingName(TextType value) {
    return new JAXBElement<TextType>(_AddressBuildingName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityDescriptionText")
  public JAXBElement<TextType> createActivityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ActivityDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TimeMeasureAugmentationPoint")
  public JAXBElement<Object> createTimeMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_TimeMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BeginTime")
  public JAXBElement<Time> createBeginTime(Time value) {
    return new JAXBElement<Time>(_BeginTime_QNAME, Time.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationLocation")
  public JAXBElement<LocationType> createOrganizationLocation(LocationType value) {
    return new JAXBElement<LocationType>(_OrganizationLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityAdministratorPersonAssociation")
  public JAXBElement<ActivityPersonAssociationType> createActivityAdministratorPersonAssociation(ActivityPersonAssociationType value) {
    return new JAXBElement<ActivityPersonAssociationType>(_ActivityAdministratorPersonAssociation_QNAME, ActivityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHomeContactInformation")
  public JAXBElement<ContactInformationType> createPersonHomeContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_PersonHomeContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationParentAffiliate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "OrganizationParentAbstract")
  public JAXBElement<OrganizationType> createOrganizationParentAffiliate(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_OrganizationParentAffiliate_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentPermanentRecordIndicator")
  public JAXBElement<Boolean> createDocumentPermanentRecordIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_DocumentPermanentRecordIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Base64BinaryObject", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "BinaryObjectAbstract")
  public JAXBElement<Base64Binary> createBase64BinaryObject(Base64Binary value) {
    return new JAXBElement<Base64Binary>(_Base64BinaryObject_QNAME, Base64Binary.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySubFacilityAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilitySubFacilityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_FacilitySubFacilityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressCrossStreet", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationAddressAbstract")
  public JAXBElement<CrossStreetType> createAddressCrossStreet(CrossStreetType value) {
    return new JAXBElement<CrossStreetType>(_AddressCrossStreet_QNAME, CrossStreetType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemSeller")
  public JAXBElement<EntityType> createItemSeller(EntityType value) {
    return new JAXBElement<EntityType>(_ItemSeller_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusIssuerIdentification")
  public JAXBElement<IdentificationType> createStatusIssuerIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_StatusIssuerIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmploymentStatus")
  public JAXBElement<StatusType> createEmploymentStatus(StatusType value) {
    return new JAXBElement<StatusType>(_EmploymentStatus_QNAME, StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDecimalValueList", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueListAbstract")
  public JAXBElement<DecimalListType> createMeasureDecimalValueList(DecimalListType value) {
    return new JAXBElement<DecimalListType>(_MeasureDecimalValueList_QNAME, DecimalListType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionAugmentationPoint")
  public JAXBElement<Object> createSupervisionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SupervisionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIssuanceLocation")
  public JAXBElement<LocationType> createDocumentIssuanceLocation(LocationType value) {
    return new JAXBElement<LocationType>(_DocumentIssuanceLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationDueAmount", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationDueAbstract")
  public JAXBElement<AmountType> createObligationDueAmount(AmountType value) {
    return new JAXBElement<AmountType>(_ObligationDueAmount_QNAME, AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetFullText")
  public JAXBElement<TextType> createStreetFullText(TextType value) {
    return new JAXBElement<TextType>(_StreetFullText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationDueDuration", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationDueAbstract")
  public JAXBElement<Duration> createObligationDueDuration(Duration value) {
    return new JAXBElement<Duration>(_ObligationDueDuration_QNAME, Duration.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionRelease")
  public JAXBElement<ReleaseType> createSupervisionRelease(ReleaseType value) {
    return new JAXBElement<ReleaseType>(_SupervisionRelease_QNAME, ReleaseType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugDaysSupplyQuantity")
  public JAXBElement<QuantityType> createDrugDaysSupplyQuantity(QuantityType value) {
    return new JAXBElement<QuantityType>(_DrugDaysSupplyQuantity_QNAME, QuantityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMedicalCondition")
  public JAXBElement<MedicalConditionType> createPersonMedicalCondition(MedicalConditionType value) {
    return new JAXBElement<MedicalConditionType>(_PersonMedicalCondition_QNAME, MedicalConditionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyCategoryAbstract")
  public JAXBElement<Object> createAnomalyCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_AnomalyCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportAugmentationPoint")
  public JAXBElement<Object> createPassportAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PassportAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VolumeMeasureAugmentationPoint")
  public JAXBElement<Object> createVolumeMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_VolumeMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDate")
  public JAXBElement<DateType> createMeasureDate(DateType value) {
    return new JAXBElement<DateType>(_MeasureDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularMeasureAugmentationPoint")
  public JAXBElement<Object> createAngularMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AngularMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportTransmissionTrackingID")
  public JAXBElement<String> createPassportTransmissionTrackingID(String value) {
    return new JAXBElement<String>(_PassportTransmissionTrackingID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemOperatingModeAbstract")
  public JAXBElement<Object> createSystemOperatingModeAbstract(Object value) {
    return new JAXBElement<Object>(_SystemOperatingModeAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemRFIdentification")
  public JAXBElement<IdentificationType> createItemRFIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_ItemRFIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommentTitleText")
  public JAXBElement<TextType> createCommentTitleText(TextType value) {
    return new JAXBElement<TextType>(_CommentTitleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemBinary")
  public JAXBElement<BinaryType> createItemBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_ItemBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "JurisdictionIdentification")
  public JAXBElement<IdentificationType> createJurisdictionIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_JurisdictionIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceReceivedInformationAbstract")
  public JAXBElement<Object> createDeviceReceivedInformationAbstract(Object value) {
    return new JAXBElement<Object>(_DeviceReceivedInformationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationRelativeLocation")
  public JAXBElement<RelativeLocationType> createLocationRelativeLocation(RelativeLocationType value) {
    return new JAXBElement<RelativeLocationType>(_LocationRelativeLocation_QNAME, RelativeLocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteAugmentationPoint")
  public JAXBElement<Object> createSiteAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SiteAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressPrivateMailboxText")
  public JAXBElement<TextType> createAddressPrivateMailboxText(TextType value) {
    return new JAXBElement<TextType>(_AddressPrivateMailboxText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemCategoryAbstract")
  public JAXBElement<ConveyanceCategoryCodeType> createConveyanceCategoryCode(ConveyanceCategoryCodeType value) {
    return new JAXBElement<ConveyanceCategoryCodeType>(_ConveyanceCategoryCode_QNAME, ConveyanceCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentStatusDetails")
  public JAXBElement<DocumentStatusDetailsType> createDocumentStatusDetails(DocumentStatusDetailsType value) {
    return new JAXBElement<DocumentStatusDetailsType>(_DocumentStatusDetails_QNAME, DocumentStatusDetailsType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ParentFacility")
  public JAXBElement<FacilityType> createParentFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(_ParentFacility_QNAME, FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjurySeverityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InjurySeverityAbstract")
  public JAXBElement<TextType> createInjurySeverityText(TextType value) {
    return new JAXBElement<TextType>(_InjurySeverityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CircularRegionAugmentationPoint")
  public JAXBElement<Object> createCircularRegionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CircularRegionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonResidesAtFacilityAssociation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityPersonAssociation")
  public JAXBElement<FacilityPersonAssociationType> createPersonResidesAtFacilityAssociation(FacilityPersonAssociationType value) {
    return new JAXBElement<FacilityPersonAssociationType>(_PersonResidesAtFacilityAssociation_QNAME, FacilityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleNonStopIndicator")
  public JAXBElement<Boolean> createScheduleNonStopIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ScheduleNonStopIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionDateRange")
  public JAXBElement<DateRangeType> createMedicalConditionDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(_MedicalConditionDateRange_QNAME, DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountListedName")
  public JAXBElement<TextType> createFinancialAccountListedName(TextType value) {
    return new JAXBElement<TextType>(_FinancialAccountListedName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageAttachmentDocument", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageAttachmentAbstract")
  public JAXBElement<DocumentType> createMessageAttachmentDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_MessageAttachmentDocument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonConveyanceAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonConveyanceAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonConveyanceAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceAugmentationPoint")
  public JAXBElement<Object> createSubstanceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SubstanceAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressGridID")
  public JAXBElement<String> createAddressGridID(String value) {
    return new JAXBElement<String>(_AddressGridID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSubjectText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentSubjectAbstract")
  public JAXBElement<TextType> createDocumentSubjectText(TextType value) {
    return new JAXBElement<TextType>(_DocumentSubjectText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDentalCharacteristicAbstract")
  public JAXBElement<Object> createPersonDentalCharacteristicAbstract(Object value) {
    return new JAXBElement<Object>(_PersonDentalCharacteristicAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConsumptionRateMeasure")
  public JAXBElement<ConsumptionRateMeasureType> createConsumptionRateMeasure(ConsumptionRateMeasureType value) {
    return new JAXBElement<ConsumptionRateMeasureType>(_ConsumptionRateMeasure_QNAME, ConsumptionRateMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateRepresentation")
  public JAXBElement<Object> createDateRepresentation(Object value) {
    return new JAXBElement<Object>(_DateRepresentation_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccount")
  public JAXBElement<FinancialAccountType> createFinancialAccount(FinancialAccountType value) {
    return new JAXBElement<FinancialAccountType>(_FinancialAccount_QNAME, FinancialAccountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DEAClassScheduleCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DEAClassScheduleAbstract")
  public JAXBElement<DEAClassScheduleCodeCodeType> createDEAClassScheduleCode(DEAClassScheduleCodeCodeType value) {
    return new JAXBElement<DEAClassScheduleCodeCodeType>(_DEAClassScheduleCode_QNAME, DEAClassScheduleCodeCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyLocation")
  public JAXBElement<LocationType> createAnomalyLocation(LocationType value) {
    return new JAXBElement<LocationType>(_AnomalyLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InclinationAbstract")
  public JAXBElement<Object> createInclinationAbstract(Object value) {
    return new JAXBElement<Object>(_InclinationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWritesLanguageIndicator")
  public JAXBElement<Boolean> createPersonWritesLanguageIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonWritesLanguageIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryTreatment")
  public JAXBElement<TreatmentType> createInjuryTreatment(TreatmentType value) {
    return new JAXBElement<TreatmentType>(_InjuryTreatment_QNAME, TreatmentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressDeliveryPointText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressDeliveryPointAbstract")
  public JAXBElement<TextType> createAddressDeliveryPointText(TextType value) {
    return new JAXBElement<TextType>(_AddressDeliveryPointText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetCategoryText")
  public JAXBElement<TextType> createStreetCategoryText(TextType value) {
    return new JAXBElement<TextType>(_StreetCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseYearDate")
  public JAXBElement<GYear> createCaseYearDate(GYear value) {
    return new JAXBElement<GYear>(_CaseYearDate_QNAME, GYear.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationContactInformation")
  public JAXBElement<ContactInformationType> createLocationContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_LocationContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HighwayName")
  public JAXBElement<TextType> createHighwayName(TextType value) {
    return new JAXBElement<TextType>(_HighwayName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityInformationAbstracterOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityInformationAbstracterOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityInformationAbstracterOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonIssuedDocumentAssociation")
  public JAXBElement<PersonDocumentAssociationType> createPersonIssuedDocumentAssociation(PersonDocumentAssociationType value) {
    return new JAXBElement<PersonDocumentAssociationType>(_PersonIssuedDocumentAssociation_QNAME, PersonDocumentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationForeignAffiliate")
  public JAXBElement<OrganizationType> createOrganizationForeignAffiliate(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_OrganizationForeignAffiliate_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIdentification")
  public JAXBElement<IdentificationType> createDocumentIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_DocumentIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Location3DGeospatialCoordinate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationGeospatialCoordinateAbstract")
  public JAXBElement<Location3DGeospatialCoordinateType> createLocation3DGeospatialCoordinate(Location3DGeospatialCoordinateType value) {
    return new JAXBElement<Location3DGeospatialCoordinateType>(_Location3DGeospatialCoordinate_QNAME, Location3DGeospatialCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionAssociation")
  public JAXBElement<PersonUnionAssociationType> createPersonUnionAssociation(PersonUnionAssociationType value) {
    return new JAXBElement<PersonUnionAssociationType>(_PersonUnionAssociation_QNAME, PersonUnionAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesAugmentationPoint")
  public JAXBElement<Object> createSecuritiesAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_SecuritiesAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SubstanceCategoryAbstract")
  public JAXBElement<TextType> createSubstanceCategoryText(TextType value) {
    return new JAXBElement<TextType>(_SubstanceCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Bearing")
  public JAXBElement<BearingType> createBearing(BearingType value) {
    return new JAXBElement<BearingType>(_Bearing_QNAME, BearingType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AmountAugmentationPoint")
  public JAXBElement<Object> createAmountAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AmountAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureTextList", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueListAbstract")
  public JAXBElement<StringListType> createMeasureTextList(StringListType value) {
    return new JAXBElement<StringListType>(_MeasureTextList_QNAME, StringListType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestCategoryAbstract")
  public JAXBElement<Object> createRequestCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_RequestCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeOccupationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EmployeeOccupationCategoryAbstract")
  public JAXBElement<TextType> createEmployeeOccupationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_EmployeeOccupationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonFacialHairAbstract")
  public JAXBElement<Object> createPersonFacialHairAbstract(Object value) {
    return new JAXBElement<Object>(_PersonFacialHairAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationGeospatialCoordinateAbstract")
  public JAXBElement<Object> createLocationGeospatialCoordinateAbstract(Object value) {
    return new JAXBElement<Object>(_LocationGeospatialCoordinateAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjurySustainer")
  public JAXBElement<PersonType> createInjurySustainer(PersonType value) {
    return new JAXBElement<PersonType>(_InjurySustainer_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDocketID")
  public JAXBElement<String> createCaseDocketID(String value) {
    return new JAXBElement<String>(_CaseDocketID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialObligationExemptionAmount")
  public JAXBElement<AmountType> createFinancialObligationExemptionAmount(AmountType value) {
    return new JAXBElement<AmountType>(_FinancialObligationExemptionAmount_QNAME, AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EncounterCommentText")
  public JAXBElement<TextType> createEncounterCommentText(TextType value) {
    return new JAXBElement<TextType>(_EncounterCommentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsuranceCoveredItem")
  public JAXBElement<ItemType> createInsuranceCoveredItem(ItemType value) {
    return new JAXBElement<ItemType>(_InsuranceCoveredItem_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LongitudeCoordinateAugmentationPoint")
  public JAXBElement<Object> createLongitudeCoordinateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_LongitudeCoordinateAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayEndTime")
  public JAXBElement<Time> createScheduleDayEndTime(Time value) {
    return new JAXBElement<Time>(_ScheduleDayEndTime_QNAME, Time.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MACAddressID")
  public JAXBElement<String> createMACAddressID(String value) {
    return new JAXBElement<String>(_MACAddressID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageText")
  public JAXBElement<TextType> createMessageText(TextType value) {
    return new JAXBElement<TextType>(_MessageText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationDoingBusinessAsName")
  public JAXBElement<TextType> createOrganizationDoingBusinessAsName(TextType value) {
    return new JAXBElement<TextType>(_OrganizationDoingBusinessAsName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitIdentification")
  public JAXBElement<IdentificationType> createPermitIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PermitIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPassportIdentification")
  public JAXBElement<IdentificationType> createPersonPassportIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonPassportIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonUnionCategoryAbstract")
  public JAXBElement<TextType> createPersonUnionCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PersonUnionCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationDescriptionText")
  public JAXBElement<TextType> createRecommendationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_RecommendationDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaPolygonRegion", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AreaRegionAbstract")
  public JAXBElement<PolygonRegionType> createAreaPolygonRegion(PolygonRegionType value) {
    return new JAXBElement<PolygonRegionType>(_AreaPolygonRegion_QNAME, PolygonRegionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemConditionText")
  public JAXBElement<TextType> createItemConditionText(TextType value) {
    return new JAXBElement<TextType>(_ItemConditionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocalePoliceJurisdictionID")
  public JAXBElement<String> createLocalePoliceJurisdictionID(String value) {
    return new JAXBElement<String>(_LocalePoliceJurisdictionID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DirectDialTelephoneNumberID")
  public JAXBElement<String> createDirectDialTelephoneNumberID(String value) {
    return new JAXBElement<String>(_DirectDialTelephoneNumberID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsurancePolicyHolder")
  public JAXBElement<EntityType> createInsurancePolicyHolder(EntityType value) {
    return new JAXBElement<EntityType>(_InsurancePolicyHolder_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityIdentification")
  public JAXBElement<IdentificationType> createCapabilityIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_CapabilityIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentPublicationDate")
  public JAXBElement<DateType> createDocumentPublicationDate(DateType value) {
    return new JAXBElement<DateType>(_DocumentPublicationDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactRadioAugmentationPoint")
  public JAXBElement<Object> createContactRadioAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ContactRadioAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<TextType> createDeviceStoredText(TextType value) {
    return new JAXBElement<TextType>(_DeviceStoredText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationPrincipalOfficialAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createOrganizationPrincipalOfficialAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(_OrganizationPrincipalOfficialAssociation_QNAME, PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureUnitText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureUnitAbstract")
  public JAXBElement<TextType> createMeasureUnitText(TextType value) {
    return new JAXBElement<TextType>(_MeasureUnitText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredImage", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<ImageType> createDeviceStoredImage(ImageType value) {
    return new JAXBElement<ImageType>(_DeviceStoredImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountryISO3166Alpha3Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CountryRepresentation")
  public JAXBElement<CountryAlpha3CodeType> createLocationCountryISO3166Alpha3Code(CountryAlpha3CodeType value) {
    return new JAXBElement<CountryAlpha3CodeType>(_LocationCountryISO3166Alpha3Code_QNAME, CountryAlpha3CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselHullMaterialAbstract")
  public JAXBElement<Object> createVesselHullMaterialAbstract(Object value) {
    return new JAXBElement<Object>(_VesselHullMaterialAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEmploymentAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonEmploymentAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonEmploymentAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularRateMeasureAugmentationPoint")
  public JAXBElement<Object> createAngularRateMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AngularRateMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Association")
  public JAXBElement<AssociationType> createAssociation(AssociationType value) {
    return new JAXBElement<AssociationType>(_Association_QNAME, AssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationIdentification")
  public JAXBElement<IdentificationType> createOrganizationIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_OrganizationIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LatitudeCoordinate")
  public JAXBElement<LatitudeCoordinateType> createLatitudeCoordinate(LatitudeCoordinateType value) {
    return new JAXBElement<LatitudeCoordinateType>(_LatitudeCoordinate_QNAME, LatitudeCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureUnsignedIntegerValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasurePointAbstract")
  public JAXBElement<UnsignedInt> createMeasureUnsignedIntegerValue(UnsignedInt value) {
    return new JAXBElement<UnsignedInt>(_MeasureUnsignedIntegerValue_QNAME, UnsignedInt.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RoleOfAbstract")
  public JAXBElement<Object> createRoleOfAbstract(Object value) {
    return new JAXBElement<Object>(_RoleOfAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDispositionLocationAssociation")
  public JAXBElement<ItemLocationAssociationType> createItemDispositionLocationAssociation(ItemLocationAssociationType value) {
    return new JAXBElement<ItemLocationAssociationType>(_ItemDispositionLocationAssociation_QNAME, ItemLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationDescriptionText")
  public JAXBElement<TextType> createLocationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_LocationDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactRadioCallSignID")
  public JAXBElement<String> createContactRadioCallSignID(String value) {
    return new JAXBElement<String>(_ContactRadioCallSignID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EquipmentName")
  public JAXBElement<String> createEquipmentName(String value) {
    return new JAXBElement<String>(_EquipmentName_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryLocationText")
  public JAXBElement<TextType> createBinaryLocationText(TextType value) {
    return new JAXBElement<TextType>(_BinaryLocationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonGivenName")
  public JAXBElement<PersonNameTextType> createPersonGivenName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(_PersonGivenName_QNAME, PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LanguageAbstract")
  public JAXBElement<Object> createLanguageAbstract(Object value) {
    return new JAXBElement<Object>(_LanguageAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonReligionAbstract")
  public JAXBElement<Object> createPersonReligionAbstract(Object value) {
    return new JAXBElement<Object>(_PersonReligionAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFileName")
  public JAXBElement<TextType> createDocumentFileName(TextType value) {
    return new JAXBElement<TextType>(_DocumentFileName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureRangeAbstract", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueAbstract")
  public JAXBElement<Object> createMeasureRangeAbstract(Object value) {
    return new JAXBElement<Object>(_MeasureRangeAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryURI")
  public JAXBElement<AnyURI> createBinaryURI(AnyURI value) {
    return new JAXBElement<AnyURI>(_BinaryURI_QNAME, AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHumanResourceIdentification")
  public JAXBElement<IdentificationType> createPersonHumanResourceIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_PersonHumanResourceIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivitySupervisorOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivitySupervisorOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivitySupervisorOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseCategoryText")
  public JAXBElement<TextType> createCaseCategoryText(TextType value) {
    return new JAXBElement<TextType>(_CaseCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceStoredAudioBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceStoredInformationAbstract")
  public JAXBElement<BinaryType> createDeviceStoredAudioBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_DeviceStoredAudioBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceRequiredService")
  public JAXBElement<PublicServiceType> createPublicServiceRequiredService(PublicServiceType value) {
    return new JAXBElement<PublicServiceType>(_PublicServiceRequiredService_QNAME, PublicServiceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayAbstract")
  public JAXBElement<Object> createScheduleDayAbstract(Object value) {
    return new JAXBElement<Object>(_ScheduleDayAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyRegistrationIdentification")
  public JAXBElement<IdentificationType> createIntellectualPropertyRegistrationIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_IntellectualPropertyRegistrationIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CoordinatingAgency")
  public JAXBElement<OrganizationType> createCoordinatingAgency(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_CoordinatingAgency_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonFraudulentIdentificationIndicator")
  public JAXBElement<Boolean> createPersonFraudulentIdentificationIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonFraudulentIdentificationIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LatitudeMinuteValue")
  public JAXBElement<AngularMinuteType> createLatitudeMinuteValue(AngularMinuteType value) {
    return new JAXBElement<AngularMinuteType>(_LatitudeMinuteValue_QNAME, AngularMinuteType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceElectronicAddress")
  public JAXBElement<ElectronicAddressType> createDeviceElectronicAddress(ElectronicAddressType value) {
    return new JAXBElement<ElectronicAddressType>(_DeviceElectronicAddress_QNAME, ElectronicAddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryFormatText")
  public JAXBElement<TextType> createBinaryFormatText(TextType value) {
    return new JAXBElement<TextType>(_BinaryFormatText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOwnershipCategoryText")
  public JAXBElement<TextType> createItemOwnershipCategoryText(TextType value) {
    return new JAXBElement<TextType>(_ItemOwnershipCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceUser")
  public JAXBElement<PersonType> createDeviceUser(PersonType value) {
    return new JAXBElement<PersonType>(_DeviceUser_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionDescriptionText")
  public JAXBElement<TextType> createDispositionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_DispositionDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Obligation")
  public JAXBElement<ObligationType> createObligation(ObligationType value) {
    return new JAXBElement<ObligationType>(_Obligation_QNAME, ObligationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LengthMeasure")
  public JAXBElement<LengthMeasureType> createLengthMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(_LengthMeasure_QNAME, LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMiddleName")
  public JAXBElement<PersonNameTextType> createPersonMiddleName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(_PersonMiddleName_QNAME, PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemHeightMeasure")
  public JAXBElement<LengthMeasureType> createItemHeightMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(_ItemHeightMeasure_QNAME, LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationText")
  public JAXBElement<TextType> createRecommendationText(TextType value) {
    return new JAXBElement<TextType>(_RecommendationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityUsageCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityUsageAbstract")
  public JAXBElement<FacilityUsageCodeType> createFacilityUsageCode(FacilityUsageCodeType value) {
    return new JAXBElement<FacilityUsageCodeType>(_FacilityUsageCode_QNAME, FacilityUsageCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityAugmentationPoint")
  public JAXBElement<Object> createCapabilityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CapabilityAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonKnownPreviousLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonKnownPreviousLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(_PersonKnownPreviousLocationAssociation_QNAME, PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageAttachmentImage", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageAttachmentAbstract")
  public JAXBElement<ImageType> createMessageAttachmentImage(ImageType value) {
    return new JAXBElement<ImageType>(_MessageAttachmentImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonRaceText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonRaceAbstract")
  public JAXBElement<TextType> createPersonRaceText(TextType value) {
    return new JAXBElement<TextType>(_PersonRaceText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LastVerifiedDate")
  public JAXBElement<DateType> createLastVerifiedDate(DateType value) {
    return new JAXBElement<DateType>(_LastVerifiedDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDisposition", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ActivityDisposition")
  public JAXBElement<CaseDispositionType> createCaseDisposition(CaseDispositionType value) {
    return new JAXBElement<CaseDispositionType>(_CaseDisposition_QNAME, CaseDispositionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSenderName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageSenderAbstract")
  public JAXBElement<TextType> createMessageSenderName(TextType value) {
    return new JAXBElement<TextType>(_MessageSenderName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConsumptionRateMeasureAugmentationPoint")
  public JAXBElement<Object> createConsumptionRateMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ConsumptionRateMeasureAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityIdentification")
  public JAXBElement<IdentificationType> createFacilityIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_FacilityIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureErrorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureErrorAbstract")
  public JAXBElement<TextType> createMeasureErrorText(TextType value) {
    return new JAXBElement<TextType>(_MeasureErrorText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorkPlaceAbstract")
  public JAXBElement<Object> createPersonWorkPlaceAbstract(Object value) {
    return new JAXBElement<Object>(_PersonWorkPlaceAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityItem", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EntityRepresentation")
  public JAXBElement<ItemType> createEntityItem(ItemType value) {
    return new JAXBElement<ItemType>(_EntityItem_QNAME, ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PassportCategoryAbstract")
  public JAXBElement<TextType> createPassportCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PassportCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Release")
  public JAXBElement<ReleaseType> createRelease(ReleaseType value) {
    return new JAXBElement<ReleaseType>(_Release_QNAME, ReleaseType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonComplexionText")
  public JAXBElement<TextType> createPersonComplexionText(TextType value) {
    return new JAXBElement<TextType>(_PersonComplexionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySubFacilityAssociation")
  public JAXBElement<FacilitySubFacilityAssociationType> createFacilitySubFacilityAssociation(FacilitySubFacilityAssociationType value) {
    return new JAXBElement<FacilitySubFacilityAssociationType>(_FacilitySubFacilityAssociation_QNAME, FacilitySubFacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationCategoryText")
  public JAXBElement<TextType> createObligationCategoryText(TextType value) {
    return new JAXBElement<TextType>(_ObligationCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryDate")
  public JAXBElement<DateType> createInjuryDate(DateType value) {
    return new JAXBElement<DateType>(_InjuryDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselHullMaterialText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "VesselHullMaterialAbstract")
  public JAXBElement<TextType> createVesselHullMaterialText(TextType value) {
    return new JAXBElement<TextType>(_VesselHullMaterialText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionInstrument")
  public JAXBElement<DocumentType> createDispositionInstrument(DocumentType value) {
    return new JAXBElement<DocumentType>(_DispositionInstrument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetExtensionText")
  public JAXBElement<TextType> createStreetExtensionText(TextType value) {
    return new JAXBElement<TextType>(_StreetExtensionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Treatment")
  public JAXBElement<TreatmentType> createTreatment(TreatmentType value) {
    return new JAXBElement<TreatmentType>(_Treatment_QNAME, TreatmentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SIMCard")
  public JAXBElement<DeviceType> createSIMCard(DeviceType value) {
    return new JAXBElement<DeviceType>(_SIMCard_QNAME, DeviceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityInformationClearerOrganizationAssociation")
  public JAXBElement<ActivityOrganizationAssociationType> createActivityInformationClearerOrganizationAssociation(ActivityOrganizationAssociationType value) {
    return new JAXBElement<ActivityOrganizationAssociationType>(_ActivityInformationClearerOrganizationAssociation_QNAME, ActivityOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramPurposeText")
  public JAXBElement<TextType> createProgramPurposeText(TextType value) {
    return new JAXBElement<TextType>(_ProgramPurposeText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationRecurrence")
  public JAXBElement<ObligationRecurrenceType> createObligationRecurrence(ObligationRecurrenceType value) {
    return new JAXBElement<ObligationRecurrenceType>(_ObligationRecurrence_QNAME, ObligationRecurrenceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TemperatureUnitAbstract")
  public JAXBElement<Object> createTemperatureUnitAbstract(Object value) {
    return new JAXBElement<Object>(_TemperatureUnitAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationParentOrganization", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "OrganizationParentAbstract")
  public JAXBElement<OrganizationType> createOrganizationParentOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_OrganizationParentOrganization_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneExchangeID")
  public JAXBElement<String> createTelephoneExchangeID(String value) {
    return new JAXBElement<String>(_TelephoneExchangeID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalCondition")
  public JAXBElement<MedicalConditionType> createMedicalCondition(MedicalConditionType value) {
    return new JAXBElement<MedicalConditionType>(_MedicalCondition_QNAME, MedicalConditionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesCollectionDateRange")
  public JAXBElement<DateRangeType> createSecuritiesCollectionDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(_SecuritiesCollectionDateRange_QNAME, DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisImage")
  public JAXBElement<ImageType> createCrisisImage(ImageType value) {
    return new JAXBElement<ImageType>(_CrisisImage_QNAME, ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapLocationAugmentationPoint")
  public JAXBElement<Object> createMapLocationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_MapLocationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentDispositionInstructionText")
  public JAXBElement<TextType> createDocumentDispositionInstructionText(TextType value) {
    return new JAXBElement<TextType>(_DocumentDispositionInstructionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountryName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CountryRepresentation")
  public JAXBElement<ProperNameTextType> createLocationCountryName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(_LocationCountryName_QNAME, ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceCategoryAbstract")
  public JAXBElement<Object> createPublicServiceCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_PublicServiceCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Mission")
  public JAXBElement<MissionType> createMission(MissionType value) {
    return new JAXBElement<MissionType>(_Mission_QNAME, MissionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceColorPrimaryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemColorAbstract")
  public JAXBElement<TextType> createConveyanceColorPrimaryText(TextType value) {
    return new JAXBElement<TextType>(_ConveyanceColorPrimaryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GeographicCoordinateLatitude")
  public JAXBElement<LatitudeCoordinateType> createGeographicCoordinateLatitude(LatitudeCoordinateType value) {
    return new JAXBElement<LatitudeCoordinateType>(_GeographicCoordinateLatitude_QNAME, LatitudeCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FullTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberAbstract")
  public JAXBElement<FullTelephoneNumberType> createFullTelephoneNumber(FullTelephoneNumberType value) {
    return new JAXBElement<FullTelephoneNumberType>(_FullTelephoneNumber_QNAME, FullTelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityDescriptionText")
  public JAXBElement<TextType> createCapabilityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_CapabilityDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountyCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationCountyAbstract")
  public JAXBElement<USCountyCodeType> createLocationCountyCode(USCountyCodeType value) {
    return new JAXBElement<USCountyCodeType>(_LocationCountyCode_QNAME, USCountyCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrossStreetDescriptionText")
  public JAXBElement<TextType> createCrossStreetDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_CrossStreetDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationPeriodText")
  public JAXBElement<TextType> createObligationPeriodText(TextType value) {
    return new JAXBElement<TextType>(_ObligationPeriodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyDateTime")
  public JAXBElement<DateType> createAnomalyDateTime(DateType value) {
    return new JAXBElement<DateType>(_AnomalyDateTime_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBloodTypeAbstract")
  public JAXBElement<Object> createPersonBloodTypeAbstract(Object value) {
    return new JAXBElement<Object>(_PersonBloodTypeAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PrimaryDocument")
  public JAXBElement<DocumentType> createPrimaryDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(_PrimaryDocument_QNAME, DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDispositionAugmentationPoint")
  public JAXBElement<Object> createItemDispositionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemDispositionAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityCategoryAbstract")
  public JAXBElement<TextType> createFacilityCategoryText(TextType value) {
    return new JAXBElement<TextType>(_FacilityCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PermitCategoryAbstract")
  public JAXBElement<TextType> createPermitCategoryText(TextType value) {
    return new JAXBElement<TextType>(_PermitCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityUsageAbstract")
  public JAXBElement<Object> createFacilityUsageAbstract(Object value) {
    return new JAXBElement<Object>(_FacilityUsageAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHandednessAbstract")
  public JAXBElement<Object> createPersonHandednessAbstract(Object value) {
    return new JAXBElement<Object>(_PersonHandednessAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TemperatureUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TemperatureUnitAbstract")
  public JAXBElement<TemperatureUnitCodeType> createTemperatureUnitCode(TemperatureUnitCodeType value) {
    return new JAXBElement<TemperatureUnitCodeType>(_TemperatureUnitCode_QNAME, TemperatureUnitCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleasePerson")
  public JAXBElement<PersonType> createReleasePerson(PersonType value) {
    return new JAXBElement<PersonType>(_ReleasePerson_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SensitivityText")
  public JAXBElement<TextType> createSensitivityText(TextType value) {
    return new JAXBElement<TextType>(_SensitivityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySiteAssociation")
  public JAXBElement<FacilitySiteAssociationType> createFacilitySiteAssociation(FacilitySiteAssociationType value) {
    return new JAXBElement<FacilitySiteAssociationType>(_FacilitySiteAssociation_QNAME, FacilitySiteAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemActionText")
  public JAXBElement<TextType> createItemActionText(TextType value) {
    return new JAXBElement<TextType>(_ItemActionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PreviousActivityAssociationAugmentationPoint")
  public JAXBElement<Object> createPreviousActivityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PreviousActivityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSubjectText")
  public JAXBElement<TextType> createMessageSubjectText(TextType value) {
    return new JAXBElement<TextType>(_MessageSubjectText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularRateMeasure")
  public JAXBElement<AngularRateMeasureType> createAngularRateMeasure(AngularRateMeasureType value) {
    return new JAXBElement<AngularRateMeasureType>(_AngularRateMeasure_QNAME, AngularRateMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemEntityAssociationAugmentationPoint")
  public JAXBElement<Object> createItemEntityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ItemEntityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceMotorizedIndicator")
  public JAXBElement<Boolean> createConveyanceMotorizedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ConveyanceMotorizedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureCommentText")
  public JAXBElement<TextType> createMeasureCommentText(TextType value) {
    return new JAXBElement<TextType>(_MeasureCommentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemPossessorAssociation")
  public JAXBElement<ItemEntityAssociationType> createItemPossessorAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(_ItemPossessorAssociation_QNAME, ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationNightContactInformation")
  public JAXBElement<ContactInformationType> createOrganizationNightContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_OrganizationNightContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityName")
  public JAXBElement<TextType> createEntityName(TextType value) {
    return new JAXBElement<TextType>(_EntityName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestDecisionText")
  public JAXBElement<TextType> createRequestDecisionText(TextType value) {
    return new JAXBElement<TextType>(_RequestDecisionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentJurisdictionalOrganization")
  public JAXBElement<OrganizationType> createIncidentJurisdictionalOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(_IncidentJurisdictionalOrganization_QNAME, OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionPresentIndicator")
  public JAXBElement<Boolean> createMedicalConditionPresentIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_MedicalConditionPresentIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionSeparation")
  public JAXBElement<PersonUnionSeparationType> createPersonUnionSeparation(PersonUnionSeparationType value) {
    return new JAXBElement<PersonUnionSeparationType>(_PersonUnionSeparation_QNAME, PersonUnionSeparationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationPrimaryContactInformation")
  public JAXBElement<ContactInformationType> createOrganizationPrimaryContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_OrganizationPrimaryContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleEmergencyServicesJurisdictionID")
  public JAXBElement<String> createLocaleEmergencyServicesJurisdictionID(String value) {
    return new JAXBElement<String>(_LocaleEmergencyServicesJurisdictionID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CoworkerAssociation")
  public JAXBElement<PersonAssociationType> createCoworkerAssociation(PersonAssociationType value) {
    return new JAXBElement<PersonAssociationType>(_CoworkerAssociation_QNAME, PersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganizationAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createPersonOrganizationAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(_PersonOrganizationAssociation_QNAME, PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCountryISO3166NumericCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CountryRepresentation")
  public JAXBElement<CountryNumericCodeType> createLocationCountryISO3166NumericCode(CountryNumericCodeType value) {
    return new JAXBElement<CountryNumericCodeType>(_LocationCountryISO3166NumericCode_QNAME, CountryNumericCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceSentInformationAbstract")
  public JAXBElement<Object> createDeviceSentInformationAbstract(Object value) {
    return new JAXBElement<Object>(_DeviceSentInformationAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMinimumDoubleValue")
  public JAXBElement<Double> createRangeMinimumDoubleValue(Double value) {
    return new JAXBElement<Double>(_RangeMinimumDoubleValue_QNAME, Double.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestDescriptionText")
  public JAXBElement<TextType> createRequestDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_RequestDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionSeparationAugmentationPoint")
  public JAXBElement<Object> createPersonUnionSeparationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_PersonUnionSeparationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceTowedIndicator")
  public JAXBElement<Boolean> createConveyanceTowedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ConveyanceTowedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelatedCaseAssociation")
  public JAXBElement<RelatedActivityAssociationType> createRelatedCaseAssociation(RelatedActivityAssociationType value) {
    return new JAXBElement<RelatedActivityAssociationType>(_RelatedCaseAssociation_QNAME, RelatedActivityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemCategoryAbstract")
  public JAXBElement<Object> createItemCategoryAbstract(Object value) {
    return new JAXBElement<Object>(_ItemCategoryAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDoubleRange", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureRangeAbstract")
  public JAXBElement<DoubleRangeType> createMeasureDoubleRange(DoubleRangeType value) {
    return new JAXBElement<DoubleRangeType>(_MeasureDoubleRange_QNAME, DoubleRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonFullName")
  public JAXBElement<PersonNameTextType> createPersonFullName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(_PersonFullName_QNAME, PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSkinToneAbstract")
  public JAXBElement<Object> createPersonSkinToneAbstract(Object value) {
    return new JAXBElement<Object>(_PersonSkinToneAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyAugmentationPoint")
  public JAXBElement<Object> createAnomalyAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AnomalyAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEthnicityAbstract")
  public JAXBElement<Object> createPersonEthnicityAbstract(Object value) {
    return new JAXBElement<Object>(_PersonEthnicityAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAccentText")
  public JAXBElement<TextType> createPersonAccentText(TextType value) {
    return new JAXBElement<TextType>(_PersonAccentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TimeUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TimeUnitAbstract")
  public JAXBElement<TimeCodeType> createTimeUnitCode(TimeCodeType value) {
    return new JAXBElement<TimeCodeType>(_TimeUnitCode_QNAME, TimeCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusAugmentationPoint")
  public JAXBElement<Object> createStatusAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_StatusAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionStagingLocation")
  public JAXBElement<LocationType> createMissionStagingLocation(LocationType value) {
    return new JAXBElement<LocationType>(_MissionStagingLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEthnicityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonEthnicityAbstract")
  public JAXBElement<TextType> createPersonEthnicityText(TextType value) {
    return new JAXBElement<TextType>(_PersonEthnicityText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureMethodText")
  public JAXBElement<TextType> createMeasureMethodText(TextType value) {
    return new JAXBElement<TextType>(_MeasureMethodText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageRecipientAddressID")
  public JAXBElement<String> createMessageRecipientAddressID(String value) {
    return new JAXBElement<String>(_MessageRecipientAddressID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapVersionID")
  public JAXBElement<String> createMapVersionID(String value) {
    return new JAXBElement<String>(_MapVersionID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PaymentMethodAbstract")
  public JAXBElement<Object> createPaymentMethodAbstract(Object value) {
    return new JAXBElement<Object>(_PaymentMethodAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusDescriptionText")
  public JAXBElement<TextType> createStatusDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_StatusDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportElectronicIndicator")
  public JAXBElement<Boolean> createPassportElectronicIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PassportElectronicIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommentText")
  public JAXBElement<TextType> createCommentText(TextType value) {
    return new JAXBElement<TextType>(_CommentText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateMarginOfErrorDuration")
  public JAXBElement<Duration> createDateMarginOfErrorDuration(Duration value) {
    return new JAXBElement<Duration>(_DateMarginOfErrorDuration_QNAME, Duration.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityDescriptionText")
  public JAXBElement<TextType> createEntityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_EntityDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetNumberText")
  public JAXBElement<TextType> createStreetNumberText(TextType value) {
    return new JAXBElement<TextType>(_StreetNumberText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapName")
  public JAXBElement<TextType> createMapName(TextType value) {
    return new JAXBElement<TextType>(_MapName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryCapturer")
  public JAXBElement<EntityType> createBinaryCapturer(EntityType value) {
    return new JAXBElement<EntityType>(_BinaryCapturer_QNAME, EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinarySizeValue")
  public JAXBElement<NonNegativeDecimalType> createBinarySizeValue(NonNegativeDecimalType value) {
    return new JAXBElement<NonNegativeDecimalType>(_BinarySizeValue_QNAME, NonNegativeDecimalType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemVisibleID")
  public JAXBElement<String> createItemVisibleID(String value) {
    return new JAXBElement<String>(_ItemVisibleID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Condition")
  public JAXBElement<ConditionType> createCondition(ConditionType value) {
    return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramSupervisedIndicator")
  public JAXBElement<Boolean> createProgramSupervisedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_ProgramSupervisedIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceUnitAbstract")
  public JAXBElement<Object> createSubstanceUnitAbstract(Object value) {
    return new JAXBElement<Object>(_SubstanceUnitAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleAugmentationPoint")
  public JAXBElement<Object> createVehicleAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_VehicleAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationRouteName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressDeliveryPointAbstract")
  public JAXBElement<TextType> createLocationRouteName(TextType value) {
    return new JAXBElement<TextType>(_LocationRouteName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationSubsidiaryAssociation")
  public JAXBElement<OrganizationUnitAssociationType> createOrganizationSubsidiaryAssociation(OrganizationUnitAssociationType value) {
    return new JAXBElement<OrganizationUnitAssociationType>(_OrganizationSubsidiaryAssociation_QNAME, OrganizationUnitAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityContactInformation")
  public JAXBElement<ContactInformationType> createEntityContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(_EntityContactInformation_QNAME, ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RealEstateBoundaryDescriptionText")
  public JAXBElement<TextType> createRealEstateBoundaryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_RealEstateBoundaryDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationDistanceMeasure")
  public JAXBElement<LengthMeasureType> createRelativeLocationDistanceMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(_RelativeLocationDistanceMeasure_QNAME, LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Email")
  public JAXBElement<MessageType> createEmail(MessageType value) {
    return new JAXBElement<MessageType>(_Email_QNAME, MessageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDay")
  public JAXBElement<ScheduleDayType> createScheduleDay(ScheduleDayType value) {
    return new JAXBElement<ScheduleDayType>(_ScheduleDay_QNAME, ScheduleDayType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityCategoryText")
  public JAXBElement<TextType> createActivityCategoryText(TextType value) {
    return new JAXBElement<TextType>(_ActivityCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityConveyanceAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityConveyanceAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ActivityConveyanceAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponUser")
  public JAXBElement<PersonType> createWeaponUser(PersonType value) {
    return new JAXBElement<PersonType>(_WeaponUser_QNAME, PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HighwayAugmentationPoint")
  public JAXBElement<Object> createHighwayAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_HighwayAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageAttachmentBinary", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageAttachmentAbstract")
  public JAXBElement<BinaryType> createMessageAttachmentBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(_MessageAttachmentBinary_QNAME, BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMedicalFileIndicator")
  public JAXBElement<Boolean> createPersonMedicalFileIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_PersonMedicalFileIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelatedActivityAssociationAugmentationPoint")
  public JAXBElement<Object> createRelatedActivityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_RelatedActivityAssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityName")
  public JAXBElement<TextType> createCapabilityName(TextType value) {
    return new JAXBElement<TextType>(_CapabilityName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SystemUserNameAbstract")
  public JAXBElement<String> createEmployeeID(String value) {
    return new JAXBElement<String>(_EmployeeID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CreatorName")
  public JAXBElement<TextType> createCreatorName(TextType value) {
    return new JAXBElement<TextType>(_CreatorName_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalMonthDate")
  public JAXBElement<GMonth> createDecalMonthDate(GMonth value) {
    return new JAXBElement<GMonth>(_DecalMonthDate_QNAME, GMonth.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Conveyance")
  public JAXBElement<ConveyanceType> createConveyance(ConveyanceType value) {
    return new JAXBElement<ConveyanceType>(_Conveyance_QNAME, ConveyanceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisAugmentationPoint")
  public JAXBElement<Object> createCrisisAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_CrisisAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HazardousMaterial")
  public JAXBElement<SubstanceType> createHazardousMaterial(SubstanceType value) {
    return new JAXBElement<SubstanceType>(_HazardousMaterial_QNAME, SubstanceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyTerminationEventText")
  public JAXBElement<TextType> createIntellectualPropertyTerminationEventText(TextType value) {
    return new JAXBElement<TextType>(_IntellectualPropertyTerminationEventText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSecondaryLanguage")
  public JAXBElement<PersonLanguageType> createPersonSecondaryLanguage(PersonLanguageType value) {
    return new JAXBElement<PersonLanguageType>(_PersonSecondaryLanguage_QNAME, PersonLanguageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCategoryAbstract")
  public JAXBElement<TextType> createDocumentCategoryText(TextType value) {
    return new JAXBElement<TextType>(_DocumentCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeightMeasure")
  public JAXBElement<WeightMeasureType> createWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(_WeightMeasure_QNAME, WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LongitudeCoordinate")
  public JAXBElement<LongitudeCoordinateType> createLongitudeCoordinate(LongitudeCoordinateType value) {
    return new JAXBElement<LongitudeCoordinateType>(_LongitudeCoordinate_QNAME, LongitudeCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleCensusTractID")
  public JAXBElement<String> createLocaleCensusTractID(String value) {
    return new JAXBElement<String>(_LocaleCensusTractID_QNAME, String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseFromLocation")
  public JAXBElement<LocationType> createReleaseFromLocation(LocationType value) {
    return new JAXBElement<LocationType>(_ReleaseFromLocation_QNAME, LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SpeedUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SpeedUnitAbstract")
  public JAXBElement<VelocityCodeType> createSpeedUnitCode(VelocityCodeType value) {
    return new JAXBElement<VelocityCodeType>(_SpeedUnitCode_QNAME, VelocityCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentInformationCutOffDate")
  public JAXBElement<DateType> createDocumentInformationCutOffDate(DateType value) {
    return new JAXBElement<DateType>(_DocumentInformationCutOffDate_QNAME, DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GeographicDatumAbstract")
  public JAXBElement<Object> createGeographicDatumAbstract(Object value) {
    return new JAXBElement<Object>(_GeographicDatumAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityCategoryText")
  public JAXBElement<TextType> createCapabilityCategoryText(TextType value) {
    return new JAXBElement<TextType>(_CapabilityCategoryText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSurNamePrefixText")
  public JAXBElement<TextType> createPersonSurNamePrefixText(TextType value) {
    return new JAXBElement<TextType>(_PersonSurNamePrefixText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocalePoliceBeatText")
  public JAXBElement<TextType> createLocalePoliceBeatText(TextType value) {
    return new JAXBElement<TextType>(_LocalePoliceBeatText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Supervision")
  public JAXBElement<SupervisionType> createSupervision(SupervisionType value) {
    return new JAXBElement<SupervisionType>(_Supervision_QNAME, SupervisionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseTitleText")
  public JAXBElement<TextType> createCaseTitleText(TextType value) {
    return new JAXBElement<TextType>(_CaseTitleText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrientationAugmentationPoint")
  public JAXBElement<Object> createOrientationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_OrientationAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryObjectAbstract")
  public JAXBElement<Object> createBinaryObjectAbstract(Object value) {
    return new JAXBElement<Object>(_BinaryObjectAbstract_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsurancePolicyIdentification")
  public JAXBElement<IdentificationType> createInsurancePolicyIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(_InsurancePolicyIdentification_QNAME, IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesDenominationText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SecuritiesDenominationAbstract")
  public JAXBElement<TextType> createSecuritiesDenominationText(TextType value) {
    return new JAXBElement<TextType>(_SecuritiesDenominationText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CountryRepresentation")
  public JAXBElement<Object> createCountryRepresentation(Object value) {
    return new JAXBElement<Object>(_CountryRepresentation_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactEntityDescriptionText")
  public JAXBElement<TextType> createContactEntityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(_ContactEntityDescriptionText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryServiceActiveIndicator")
  public JAXBElement<Boolean> createMilitaryServiceActiveIndicator(Boolean value) {
    return new JAXBElement<Boolean>(_MilitaryServiceActiveIndicator_QNAME, Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceChannelText")
  public JAXBElement<TextType> createPublicServiceChannelText(TextType value) {
    return new JAXBElement<TextType>(_PublicServiceChannelText_QNAME, TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemContainerAssociationAugmentationPoint")
  public JAXBElement<Object> createItemContainerAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemContainerAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationJurisdiction")
  public JAXBElement<JurisdictionType> createIdentificationJurisdiction(JurisdictionType value) {
    return new JAXBElement<JurisdictionType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationJurisdiction"), JurisdictionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionReasonText")
  public JAXBElement<TextType> createDispositionReasonText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionReasonText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentStatus")
  public JAXBElement<StatusType> createDocumentStatus(StatusType value) {
    return new JAXBElement<StatusType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentStatus"), StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationDescriptionText")
  public JAXBElement<TextType> createRelativeLocationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceAugmentationPoint")
  public JAXBElement<Object> createConveyanceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressGrid", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationAddressAbstract")
  public JAXBElement<AddressGridType> createAddressGrid(AddressGridType value) {
    return new JAXBElement<AddressGridType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressGrid"), AddressGridType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeOccupationText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EmployeeOccupationAbstract")
  public JAXBElement<TextType> createEmployeeOccupationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeOccupationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentAuthor")
  public JAXBElement<EntityType> createDocumentAuthor(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentAuthor"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseAugmentationPoint")
  public JAXBElement<Object> createReleaseAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationTotalAbstract")
  public JAXBElement<Object> createObligationTotalAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationTotalAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DescriptionText")
  public JAXBElement<TextType> createDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonReligionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonReligionAbstract")
  public JAXBElement<TextType> createPersonReligionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonReligionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SupervisionCurrentIndicator")
  public JAXBElement<Boolean> createSupervisionCurrentIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SupervisionCurrentIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMaximumDecimalValue")
  public JAXBElement<Decimal> createRangeMaximumDecimalValue(Decimal value) {
    return new JAXBElement<Decimal>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMaximumDecimalValue"), Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicAddress")
  public JAXBElement<ElectronicAddressType> createElectronicAddress(ElectronicAddressType value) {
    return new JAXBElement<ElectronicAddressType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicAddress"), ElectronicAddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonIdentityAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonIdentityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonIdentityAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHeightMeasure")
  public JAXBElement<LengthMeasureType> createPersonHeightMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHeightMeasure"), LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentFee")
  public JAXBElement<ObligationType> createAssessmentFee(ObligationType value) {
    return new JAXBElement<ObligationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentFee"), ObligationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseRecipient")
  public JAXBElement<EntityType> createReleaseRecipient(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseRecipient"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HazmatCodeText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "HazmatAbstract")
  public JAXBElement<TextType> createHazmatCodeText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "HazmatCodeText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionAugmentationPoint")
  public JAXBElement<Object> createDisciplinaryActionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceColorSecondaryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemColorAbstract")
  public JAXBElement<TextType> createConveyanceColorSecondaryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceColorSecondaryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramFacility")
  public JAXBElement<FacilityType> createProgramFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramFacility"), FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonResidenceAssociation")
  public JAXBElement<PersonResidenceAssociationType> createPersonResidenceAssociation(PersonResidenceAssociationType value) {
    return new JAXBElement<PersonResidenceAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonResidenceAssociation"), PersonResidenceAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ScheduleDayAbstract")
  public JAXBElement<DateType> createScheduleDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityName")
  public JAXBElement<ProperNameTextType> createFacilityName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityName"), ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionViolationText")
  public JAXBElement<TextType> createConditionViolationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionViolationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageAttachmentAbstract")
  public JAXBElement<Object> createMessageAttachmentAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageAttachmentAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemPossessor")
  public JAXBElement<EntityType> createItemPossessor(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemPossessor"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionDoctor")
  public JAXBElement<PersonType> createMedicalConditionDoctor(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionDoctor"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationDueDate")
  public JAXBElement<DateType> createObligationDueDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationDueDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DayDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<GDay> createDayDate(GDay value) {
    return new JAXBElement<GDay>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DayDate"), GDay.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationDateRange")
  public JAXBElement<DateRangeType> createObligationDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationDateRange"), DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueAmount")
  public JAXBElement<AmountType> createItemValueAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDoubleValueList", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureValueListAbstract")
  public JAXBElement<DoubleListType> createMeasureDoubleValueList(DoubleListType value) {
    return new JAXBElement<DoubleListType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDoubleValueList"), DoubleListType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Status")
  public JAXBElement<StatusType> createStatus(StatusType value) {
    return new JAXBElement<StatusType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Status"), StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentDisputedIndicator")
  public JAXBElement<Boolean> createDocumentDisputedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentDisputedIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeRankText")
  public JAXBElement<TextType> createEmployeeRankText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeRankText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationStateFIPS5-2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<USStateNumericCodeType> createLocationStateFIPS52Code(USStateNumericCodeType value) {
    return new JAXBElement<USStateNumericCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationStateFIPS5-2Code"), USStateNumericCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TemperatureMeasureAugmentationPoint")
  public JAXBElement<Object> createTemperatureMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TemperatureMeasureAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureImage")
  public JAXBElement<ImageType> createPhysicalFeatureImage(ImageType value) {
    return new JAXBElement<ImageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureImage"), ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseDate")
  public JAXBElement<DateType> createReleaseDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Crisis")
  public JAXBElement<CrisisType> createCrisis(CrisisType value) {
    return new JAXBElement<CrisisType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Crisis"), CrisisType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisName")
  public JAXBElement<TextType> createCrisisName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralPerson")
  public JAXBElement<PersonType> createReferralPerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralPerson"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactAbstract")
  public JAXBElement<Object> createContactAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationDueAbstract")
  public JAXBElement<Object> createObligationDueAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationDueAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSoftwareName")
  public JAXBElement<SoftwareNameType> createDocumentSoftwareName(SoftwareNameType value) {
    return new JAXBElement<SoftwareNameType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSoftwareName"), SoftwareNameType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemHolderAssociation")
  public JAXBElement<ItemEntityAssociationType> createItemHolderAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemHolderAssociation"), ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StatusText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StatusAbstract")
  public JAXBElement<TextType> createStatusText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StatusText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBodyXRaysAvailableAbstract")
  public JAXBElement<Object> createPersonBodyXRaysAvailableAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBodyXRaysAvailableAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSurName")
  public JAXBElement<PersonNameTextType> createPersonSurName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSurName"), PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageFATCAUsageRestrictionText")
  public JAXBElement<TextType> createMessageFATCAUsageRestrictionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageFATCAUsageRestrictionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralAugmentationPoint")
  public JAXBElement<Object> createReferralAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleSeatingQuantity")
  public JAXBElement<NonNegativeInteger> createVehicleSeatingQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleSeatingQuantity"), NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityOperatingSchedule")
  public JAXBElement<ScheduleType> createFacilityOperatingSchedule(ScheduleType value) {
    return new JAXBElement<ScheduleType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityOperatingSchedule"), ScheduleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RepositoryID")
  public JAXBElement<String> createRepositoryID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RepositoryID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocationDirectionText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RelativeLocationDirectionAbstract")
  public JAXBElement<TextType> createRelativeLocationDirectionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocationDirectionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageCategoryAbstract")
  public JAXBElement<Object> createMessageCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateAccuracyAbstract")
  public JAXBElement<Object> createDateAccuracyAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateAccuracyAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationEffectiveDate")
  public JAXBElement<DateType> createIdentificationEffectiveDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationEffectiveDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemColorAbstract")
  public JAXBElement<Object> createItemColorAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemColorAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InternationalTelephoneNumberAugmentationPoint")
  public JAXBElement<Object> createInternationalTelephoneNumberAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InternationalTelephoneNumberAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameCategoryAbstract")
  public JAXBElement<Object> createPersonNameCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EffectiveDate")
  public JAXBElement<DateType> createEffectiveDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EffectiveDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentKeywordText")
  public JAXBElement<TextType> createDocumentKeywordText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentKeywordText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrisisURLID")
  public JAXBElement<AnyURI> createCrisisURLID(AnyURI value) {
    return new JAXBElement<AnyURI>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrisisURLID"), AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DispositionCategoryAbstract")
  public JAXBElement<TextType> createDispositionCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationCompleteIndicator")
  public JAXBElement<Boolean> createObligationCompleteIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationCompleteIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RealEstateAcreageText")
  public JAXBElement<TextType> createRealEstateAcreageText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RealEstateAcreageText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemSerialIdentification")
  public JAXBElement<IdentificationType> createItemSerialIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemSerialIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselHullShapeText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "VesselHullShapeAbstract")
  public JAXBElement<TextType> createVesselHullShapeText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselHullShapeText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PreviousActivity")
  public JAXBElement<ActivityType> createPreviousActivity(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PreviousActivity"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Manifest")
  public JAXBElement<ManifestType> createManifest(ManifestType value) {
    return new JAXBElement<ManifestType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Manifest"), ManifestType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressCategoryAbstract")
  public JAXBElement<TextType> createAddressCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisunionReasonText")
  public JAXBElement<TextType> createPersonDisunionReasonText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisunionReasonText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationSourceText")
  public JAXBElement<TextType> createIdentificationSourceText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationSourceText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramAction")
  public JAXBElement<ActivityType> createProgramAction(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramAction"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityMemberCategoryText")
  public JAXBElement<TextType> createFacilityMemberCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityMemberCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InstantMessengerScreenID")
  public JAXBElement<String> createInstantMessengerScreenID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InstantMessengerScreenID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryHashFunctionCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "BinaryHashFunctionAbstract")
  public JAXBElement<BinaryHashFunctionCodeType> createBinaryHashFunctionCode(BinaryHashFunctionCodeType value) {
    return new JAXBElement<BinaryHashFunctionCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryHashFunctionCode"), BinaryHashFunctionCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueTaxIncludedIndicator")
  public JAXBElement<Boolean> createItemValueTaxIncludedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueTaxIncludedIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SeparationDateRange")
  public JAXBElement<DateRangeType> createSeparationDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SeparationDateRange"), DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCoverageAbstract")
  public JAXBElement<Object> createDocumentCoverageAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCoverageAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Task")
  public JAXBElement<TaskType> createTask(TaskType value) {
    return new JAXBElement<TaskType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Task"), TaskType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCreationDate")
  public JAXBElement<DateType> createDocumentCreationDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCreationDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationPaidAmount", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationPaidAbstract")
  public JAXBElement<AmountType> createObligationPaidAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationPaidAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumber")
  public JAXBElement<TelephoneNumberType> createTelephoneNumber(TelephoneNumberType value) {
    return new JAXBElement<TelephoneNumberType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumber"), TelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SeparationCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "SeparationCategoryAbstract")
  public JAXBElement<SeparationCategoryCodeType> createSeparationCategoryCode(SeparationCategoryCodeType value) {
    return new JAXBElement<SeparationCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SeparationCategoryCode"), SeparationCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCountry")
  public JAXBElement<CountryType> createDocumentCountry(CountryType value) {
    return new JAXBElement<CountryType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCountry"), CountryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapElevationCoordinateText")
  public JAXBElement<TextType> createMapElevationCoordinateText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapElevationCoordinateText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionFee")
  public JAXBElement<ObligationType> createDisciplinaryActionFee(ObligationType value) {
    return new JAXBElement<ObligationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionFee"), ObligationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceCategoryAbstract")
  public JAXBElement<Object> createSubstanceCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateRangeAugmentationPoint")
  public JAXBElement<Object> createDateRangeAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateRangeAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "HighwayPositionText")
  public JAXBElement<TextType> createHighwayPositionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "HighwayPositionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemPurchasePriceValue")
  public JAXBElement<ItemValueType> createItemPurchasePriceValue(ItemValueType value) {
    return new JAXBElement<ItemValueType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemPurchasePriceValue"), ItemValueType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ManifestCategoryAbstract")
  public JAXBElement<Object> createManifestCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ManifestCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemContainerAssociation")
  public JAXBElement<ItemContainerAssociationType> createItemContainerAssociation(ItemContainerAssociationType value) {
    return new JAXBElement<ItemContainerAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemContainerAssociation"), ItemContainerAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestDate")
  public JAXBElement<DateType> createRequestDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivitySiteAssociationAugmentationPoint")
  public JAXBElement<Object> createActivitySiteAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivitySiteAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CircularRegionCenterCoordinate")
  public JAXBElement<Location2DGeospatialCoordinateType> createCircularRegionCenterCoordinate(Location2DGeospatialCoordinateType value) {
    return new JAXBElement<Location2DGeospatialCoordinateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CircularRegionCenterCoordinate"), Location2DGeospatialCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LatitudeSecondValue")
  public JAXBElement<AngularSecondType> createLatitudeSecondValue(AngularSecondType value) {
    return new JAXBElement<AngularSecondType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LatitudeSecondValue"), AngularSecondType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSupplementalMarkingText")
  public JAXBElement<TextType> createDocumentSupplementalMarkingText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSupplementalMarkingText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberCategoryAbstract")
  public JAXBElement<TelephoneCategoryCodeType> createTelephoneNumberCategoryCode(TelephoneCategoryCodeType value) {
    return new JAXBElement<TelephoneCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberCategoryCode"), TelephoneCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ManifestCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ManifestCategoryAbstract")
  public JAXBElement<TextType> createManifestCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ManifestCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCapability")
  public JAXBElement<CapabilityType> createPersonCapability(CapabilityType value) {
    return new JAXBElement<CapabilityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCapability"), CapabilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CurrencyText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CurrencyAbstract")
  public JAXBElement<TextType> createCurrencyText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CurrencyText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryAvailableIndicator")
  public JAXBElement<Boolean> createBinaryAvailableIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryAvailableIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceRelatedLocation")
  public JAXBElement<LocationType> createPublicServiceRelatedLocation(LocationType value) {
    return new JAXBElement<LocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceRelatedLocation"), LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceVisitedInformationAbstract")
  public JAXBElement<Object> createDeviceVisitedInformationAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceVisitedInformationAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureEstimatedIndicator")
  public JAXBElement<Boolean> createMeasureEstimatedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureEstimatedIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleModelAbstract")
  public JAXBElement<Object> createVehicleModelAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleModelAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommentAuthorText")
  public JAXBElement<TextType> createCommentAuthorText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommentAuthorText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceReceivedEmail", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceReceivedInformationAbstract")
  public JAXBElement<MessageType> createDeviceReceivedEmail(MessageType value) {
    return new JAXBElement<MessageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceReceivedEmail"), MessageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEmploymentLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonEmploymentLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEmploymentLocationAssociation"), PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityDocumentAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilityDocumentAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityDocumentAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationAbbreviationText")
  public JAXBElement<TextType> createOrganizationAbbreviationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationAbbreviationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskID")
  public JAXBElement<String> createTaskID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IPv4AddressID")
  public JAXBElement<String> createIPv4AddressID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IPv4AddressID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityCapacityDescriptionText")
  public JAXBElement<TextType> createFacilityCapacityDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityCapacityDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Amount")
  public JAXBElement<Decimal> createAmount(Decimal value) {
    return new JAXBElement<Decimal>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Amount"), Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryFormatStandardName")
  public JAXBElement<TextType> createBinaryFormatStandardName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryFormatStandardName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceUseAbstract")
  public JAXBElement<Object> createConveyanceUseAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceUseAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryAction")
  public JAXBElement<DisciplinaryActionType> createDisciplinaryAction(DisciplinaryActionType value) {
    return new JAXBElement<DisciplinaryActionType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryAction"), DisciplinaryActionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonNameCategoryAbstract")
  public JAXBElement<PersonNameCategoryCodeType> createPersonNameCategoryCode(PersonNameCategoryCodeType value) {
    return new JAXBElement<PersonNameCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameCategoryCode"), PersonNameCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SiteMobileIndicator")
  public JAXBElement<Boolean> createSiteMobileIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SiteMobileIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DEAClassScheduleAbstract")
  public JAXBElement<Object> createDEAClassScheduleAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DEAClassScheduleAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisunionAugmentationPoint")
  public JAXBElement<Object> createPersonDisunionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisunionAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNamePrefixText")
  public JAXBElement<TextType> createPersonNamePrefixText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNamePrefixText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaDescriptionText")
  public JAXBElement<TextType> createAreaDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleUseText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ConveyanceUseAbstract")
  public JAXBElement<TextType> createVehicleUseText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleUseText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceVisitedWebsiteURI", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceVisitedInformationAbstract")
  public JAXBElement<AnyURI> createDeviceVisitedWebsiteURI(AnyURI value) {
    return new JAXBElement<AnyURI>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceVisitedWebsiteURI"), AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationCityName")
  public JAXBElement<ProperNameTextType> createLocationCityName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationCityName"), ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityFacilityAssociation")
  public JAXBElement<ActivityFacilityAssociationType> createActivityFacilityAssociation(ActivityFacilityAssociationType value) {
    return new JAXBElement<ActivityFacilityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityFacilityAssociation"), ActivityFacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Azimuth360Value", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AzimuthAbstract")
  public JAXBElement<Degree360Type> createAzimuth360Value(Degree360Type value) {
    return new JAXBElement<Degree360Type>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Azimuth360Value"), Degree360Type.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentEntrySubmitter")
  public JAXBElement<PersonType> createDocumentEntrySubmitter(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentEntrySubmitter"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityContainsItem")
  public JAXBElement<ItemType> createFacilityContainsItem(ItemType value) {
    return new JAXBElement<ItemType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityContainsItem"), ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityContactEntity")
  public JAXBElement<EntityType> createActivityContactEntity(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityContactEntity"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AirportCodeText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AirportCodeAbstract")
  public JAXBElement<TextType> createAirportCodeText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AirportCodeText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StateRepresentation")
  public JAXBElement<Object> createStateRepresentation(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StateRepresentation"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyedItem")
  public JAXBElement<ItemType> createConveyedItem(ItemType value) {
    return new JAXBElement<ItemType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyedItem"), ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Person")
  public JAXBElement<PersonType> createPerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Person"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressCategoryAbstract")
  public JAXBElement<Object> createAddressCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Capability")
  public JAXBElement<CapabilityType> createCapability(CapabilityType value) {
    return new JAXBElement<CapabilityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Capability"), CapabilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalYearDate")
  public JAXBElement<GYear> createDecalYearDate(GYear value) {
    return new JAXBElement<GYear>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalYearDate"), GYear.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalAugmentationPoint")
  public JAXBElement<Object> createDecalAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOrganDonorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonOrganDonorAbstract")
  public JAXBElement<TextType> createPersonOrganDonorText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOrganDonorText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureDescriptionText")
  public JAXBElement<TextType> createPhysicalFeatureDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressRecipientName")
  public JAXBElement<TextType> createAddressRecipientName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressRecipientName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssociationDateRange")
  public JAXBElement<DateRangeType> createAssociationDateRange(DateRangeType value) {
    return new JAXBElement<DateRangeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssociationDateRange"), DateRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionCategoryAbstract")
  public JAXBElement<Object> createDispositionCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonInjury")
  public JAXBElement<InjuryType> createPersonInjury(InjuryType value) {
    return new JAXBElement<InjuryType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonInjury"), InjuryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationName")
  public JAXBElement<TextType> createOrganizationName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureCategoryAbstract")
  public JAXBElement<Object> createPhysicalFeatureCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "QualityComment")
  public JAXBElement<CommentType> createQualityComment(CommentType value) {
    return new JAXBElement<CommentType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "QualityComment"), CommentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeightUnitAbstract")
  public JAXBElement<Object> createWeightUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeightUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugAugmentationPoint")
  public JAXBElement<Object> createDrugAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramSupervisor")
  public JAXBElement<EntityType> createProgramSupervisor(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramSupervisor"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionDate")
  public JAXBElement<DateType> createDispositionDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressUrbanizationName")
  public JAXBElement<TextType> createAddressUrbanizationName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressUrbanizationName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SchedulePerson")
  public JAXBElement<PersonType> createSchedulePerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SchedulePerson"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngleMeasure")
  public JAXBElement<AngleMeasureType> createAngleMeasure(AngleMeasureType value) {
    return new JAXBElement<AngleMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngleMeasure"), AngleMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionCauseText")
  public JAXBElement<TextType> createMedicalConditionCauseText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionCauseText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Request")
  public JAXBElement<RequestType> createRequest(RequestType value) {
    return new JAXBElement<RequestType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Request"), RequestType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StateCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<CodeType> createStateCode(CodeType value) {
    return new JAXBElement<CodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StateCode"), CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMinimumUnsignedIntegerValue")
  public JAXBElement<UnsignedInt> createRangeMinimumUnsignedIntegerValue(UnsignedInt value) {
    return new JAXBElement<UnsignedInt>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMinimumUnsignedIntegerValue"), UnsignedInt.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactRadioCategoryText")
  public JAXBElement<TextType> createContactRadioCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactRadioCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemMovingOrganization")
  public JAXBElement<OrganizationType> createItemMovingOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemMovingOrganization"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryReleaseDate")
  public JAXBElement<DateType> createMilitaryReleaseDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryReleaseDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityContactInformation")
  public JAXBElement<ContactInformationType> createFacilityContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityContactInformation"), ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LongitudeDegreeValue")
  public JAXBElement<LongitudeDegreeType> createLongitudeDegreeValue(LongitudeDegreeType value) {
    return new JAXBElement<LongitudeDegreeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LongitudeDegreeValue"), LongitudeDegreeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDayAugmentationPoint")
  public JAXBElement<Object> createScheduleDayAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDayAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemUsageText")
  public JAXBElement<TextType> createItemUsageText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemUsageText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorksAtFacilityAssociation", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityPersonAssociation")
  public JAXBElement<FacilityPersonAssociationType> createPersonWorksAtFacilityAssociation(FacilityPersonAssociationType value) {
    return new JAXBElement<FacilityPersonAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorksAtFacilityAssociation"), FacilityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleAugmentationPoint")
  public JAXBElement<Object> createLocaleAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IPv6AddressID")
  public JAXBElement<String> createIPv6AddressID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IPv6AddressID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDescriptionText")
  public JAXBElement<TextType> createItemDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValue")
  public JAXBElement<ItemValueType> createItemValue(ItemValueType value) {
    return new JAXBElement<ItemValueType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValue"), ItemValueType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LatitudeCoordinateAugmentationPoint")
  public JAXBElement<Object> createLatitudeCoordinateAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LatitudeCoordinateAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureIntegerRange", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureRangeAbstract")
  public JAXBElement<IntegerRangeType> createMeasureIntegerRange(IntegerRangeType value) {
    return new JAXBElement<IntegerRangeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureIntegerRange"), IntegerRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Binary")
  public JAXBElement<BinaryType> createBinary(BinaryType value) {
    return new JAXBElement<BinaryType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Binary"), BinaryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DispositionEntity")
  public JAXBElement<EntityType> createDispositionEntity(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DispositionEntity"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentObservationText")
  public JAXBElement<TextType> createIncidentObservationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentObservationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationEmergencyServicesAssociation")
  public JAXBElement<OrganizationLocationAssociationType> createLocationEmergencyServicesAssociation(OrganizationLocationAssociationType value) {
    return new JAXBElement<OrganizationLocationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationEmergencyServicesAssociation"), OrganizationLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceCompositionDescriptionText")
  public JAXBElement<TextType> createSubstanceCompositionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceCompositionDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNameSalutationText")
  public JAXBElement<TextType> createPersonNameSalutationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNameSalutationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyRegistrationDate")
  public JAXBElement<DateType> createIntellectualPropertyRegistrationDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyRegistrationDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionDecisionCategoryText")
  public JAXBElement<TextType> createCaseDispositionDecisionCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionDecisionCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselCategoryAbstract")
  public JAXBElement<Object> createVesselCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapLocation")
  public JAXBElement<MapLocationType> createMapLocation(MapLocationType value) {
    return new JAXBElement<MapLocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapLocation"), MapLocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationExemption")
  public JAXBElement<ObligationExemptionType> createObligationExemption(ObligationExemptionType value) {
    return new JAXBElement<ObligationExemptionType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationExemption"), ObligationExemptionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCoverageAddress", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCoverageAbstract")
  public JAXBElement<AddressType> createDocumentCoverageAddress(AddressType value) {
    return new JAXBElement<AddressType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCoverageAddress"), AddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceOutputResourceDocument")
  public JAXBElement<DocumentType> createPublicServiceOutputResourceDocument(DocumentType value) {
    return new JAXBElement<DocumentType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceOutputResourceDocument"), DocumentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceSentEmail", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceSentInformationAbstract")
  public JAXBElement<MessageType> createDeviceSentEmail(MessageType value) {
    return new JAXBElement<MessageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceSentEmail"), MessageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationLandmarkText")
  public JAXBElement<TextType> createLocationLandmarkText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationLandmarkText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DEAClassScheduleText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DEAClassScheduleAbstract")
  public JAXBElement<TextType> createDEAClassScheduleText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DEAClassScheduleText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmploymentContactInformation")
  public JAXBElement<ContactInformationType> createEmploymentContactInformation(ContactInformationType value) {
    return new JAXBElement<ContactInformationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmploymentContactInformation"), ContactInformationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityScheduleAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityScheduleAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityScheduleAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemWidthMeasure")
  public JAXBElement<LengthMeasureType> createItemWidthMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemWidthMeasure"), LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionCounseling")
  public JAXBElement<ActivityType> createDisciplinaryActionCounseling(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionCounseling"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBloodTypeText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonBloodTypeAbstract")
  public JAXBElement<TextType> createPersonBloodTypeText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBloodTypeText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportIssuingOrganization")
  public JAXBElement<OrganizationType> createPassportIssuingOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportIssuingOrganization"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalID")
  public JAXBElement<String> createDecalID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InsurancePersonalIndicator")
  public JAXBElement<Boolean> createInsurancePersonalIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InsurancePersonalIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEyeColorAbstract")
  public JAXBElement<Object> createPersonEyeColorAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEyeColorAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RoleOfPerson", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RoleOfAbstract")
  public JAXBElement<PersonType> createRoleOfPerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RoleOfPerson"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCategoryID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCategoryAbstract")
  public JAXBElement<String> createDocumentCategoryID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCategoryID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Permit")
  public JAXBElement<PermitType> createPermit(PermitType value) {
    return new JAXBElement<PermitType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Permit"), PermitType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetPredirectionalText")
  public JAXBElement<TextType> createStreetPredirectionalText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetPredirectionalText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountPresentBalanceAmount")
  public JAXBElement<AmountType> createFinancialAccountPresentBalanceAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountPresentBalanceAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InclinationValue")
  public JAXBElement<Degree90PlusMinusType> createInclinationValue(Degree90PlusMinusType value) {
    return new JAXBElement<Degree90PlusMinusType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InclinationValue"), Degree90PlusMinusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "URLID")
  public JAXBElement<AnyURI> createURLID(AnyURI value) {
    return new JAXBElement<AnyURI>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "URLID"), AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationState")
  public JAXBElement<StateType> createLocationState(StateType value) {
    return new JAXBElement<StateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationState"), StateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionDescriptionText")
  public JAXBElement<TextType> createMedicalConditionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonGeneralAppearanceDescriptionText")
  public JAXBElement<TextType> createPersonGeneralAppearanceDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonGeneralAppearanceDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Progress")
  public JAXBElement<ProgressType> createProgress(ProgressType value) {
    return new JAXBElement<ProgressType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Progress"), ProgressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MissionCommencementNoEarlierThanDate")
  public JAXBElement<DateType> createMissionCommencementNoEarlierThanDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MissionCommencementNoEarlierThanDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentAugmentationPoint")
  public JAXBElement<Object> createDocumentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AdministrativeID")
  public JAXBElement<String> createAdministrativeID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AdministrativeID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentLastModifiedDate")
  public JAXBElement<DateType> createDocumentLastModifiedDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentLastModifiedDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgramRelease")
  public JAXBElement<ReleaseType> createProgramRelease(ReleaseType value) {
    return new JAXBElement<ReleaseType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgramRelease"), ReleaseType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityAugmentationPoint")
  public JAXBElement<Object> createIdentityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationMapLocation")
  public JAXBElement<MapLocationType> createLocationMapLocation(MapLocationType value) {
    return new JAXBElement<MapLocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationMapLocation"), MapLocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationAddress")
  public JAXBElement<AddressType> createLocationAddress(AddressType value) {
    return new JAXBElement<AddressType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationAddress"), AddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceLocation")
  public JAXBElement<LocationType> createPublicServiceLocation(LocationType value) {
    return new JAXBElement<LocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceLocation"), LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCircumcisionIndicator")
  public JAXBElement<Boolean> createPersonCircumcisionIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCircumcisionIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEyeColorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonEyeColorAbstract")
  public JAXBElement<TextType> createPersonEyeColorText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEyeColorText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugMeasure")
  public JAXBElement<SubstanceMeasureType> createDrugMeasure(SubstanceMeasureType value) {
    return new JAXBElement<SubstanceMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugMeasure"), SubstanceMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHandednessText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonHandednessAbstract")
  public JAXBElement<TextType> createPersonHandednessText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHandednessText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VelocityMeasure")
  public JAXBElement<VelocityMeasureType> createVelocityMeasure(VelocityMeasureType value) {
    return new JAXBElement<VelocityMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VelocityMeasure"), VelocityMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationBranchName")
  public JAXBElement<TextType> createOrganizationBranchName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationBranchName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSecurityClearanceText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonSecurityClearanceAbstract")
  public JAXBElement<TextType> createPersonSecurityClearanceText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSecurityClearanceText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEncounterAugmentationPoint")
  public JAXBElement<Object> createPersonEncounterAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEncounterAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleDistrictName")
  public JAXBElement<TextType> createLocaleDistrictName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleDistrictName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureQualityText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasureErrorAbstract")
  public JAXBElement<TextType> createMeasureQualityText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureQualityText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Location2DGeospatialCoordinate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationGeospatialCoordinateAbstract")
  public JAXBElement<Location2DGeospatialCoordinateType> createLocation2DGeospatialCoordinate(Location2DGeospatialCoordinateType value) {
    return new JAXBElement<Location2DGeospatialCoordinateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Location2DGeospatialCoordinate"), Location2DGeospatialCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselHullShapeAbstract")
  public JAXBElement<Object> createVesselHullShapeAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselHullShapeAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesCategoryAbstract")
  public JAXBElement<Object> createSecuritiesCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ResidencePaymentAmount")
  public JAXBElement<AmountType> createResidencePaymentAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ResidencePaymentAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemWeightMeasure")
  public JAXBElement<WeightMeasureType> createItemWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemWeightMeasure"), WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceIncomingTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceReceivedInformationAbstract")
  public JAXBElement<TelephoneNumberType> createDeviceIncomingTelephoneNumber(TelephoneNumberType value) {
    return new JAXBElement<TelephoneNumberType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceIncomingTelephoneNumber"), TelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryDischargeCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MilitaryDischargeCategoryAbstract")
  public JAXBElement<MilitaryDischargeCategoryCodeType> createMilitaryDischargeCategoryCode(MilitaryDischargeCategoryCodeType value) {
    return new JAXBElement<MilitaryDischargeCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryDischargeCategoryCode"), MilitaryDischargeCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AirportCodeAbstract")
  public JAXBElement<Object> createAirportCodeAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AirportCodeAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactEmailID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<String> createContactEmailID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactEmailID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicEquipmentCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemCategoryAbstract")
  public JAXBElement<ElectronicEquipmentCategoryCodeType> createElectronicEquipmentCategoryCode(ElectronicEquipmentCategoryCodeType value) {
    return new JAXBElement<ElectronicEquipmentCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicEquipmentCategoryCode"), ElectronicEquipmentCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryAugmentationPoint")
  public JAXBElement<Object> createInjuryAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPhysicalFeature")
  public JAXBElement<PhysicalFeatureType> createPersonPhysicalFeature(PhysicalFeatureType value) {
    return new JAXBElement<PhysicalFeatureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPhysicalFeature"), PhysicalFeatureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCategoryDescriptionText")
  public JAXBElement<TextType> createDocumentCategoryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCategoryDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RoleOfOrganization", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "RoleOfAbstract")
  public JAXBElement<OrganizationType> createRoleOfOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RoleOfOrganization"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftStyleAbstract")
  public JAXBElement<Object> createAircraftStyleAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftStyleAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionCommunityService")
  public JAXBElement<ActivityType> createDisciplinaryActionCommunityService(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionCommunityService"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationEstablishedDate")
  public JAXBElement<DateType> createOrganizationEstablishedDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationEstablishedDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceSalesTaxPercent")
  public JAXBElement<Decimal> createConveyanceSalesTaxPercent(Decimal value) {
    return new JAXBElement<Decimal>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceSalesTaxPercent"), Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MonthDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<GMonth> createMonthDate(GMonth value) {
    return new JAXBElement<GMonth>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MonthDate"), GMonth.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInstantMessenger", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactMeansAbstract")
  public JAXBElement<InstantMessengerType> createContactInstantMessenger(InstantMessengerType value) {
    return new JAXBElement<InstantMessengerType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInstantMessenger"), InstantMessengerType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationFacilityAssociation")
  public JAXBElement<OrganizationFacilityAssociationType> createOrganizationFacilityAssociation(OrganizationFacilityAssociationType value) {
    return new JAXBElement<OrganizationFacilityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationFacilityAssociation"), OrganizationFacilityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapQuadrantText")
  public JAXBElement<TextType> createMapQuadrantText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapQuadrantText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceDescriptionText")
  public JAXBElement<TextType> createPublicServiceDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CommentAugmentationPoint")
  public JAXBElement<Object> createCommentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CommentAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceESNIdentification")
  public JAXBElement<IdentificationType> createDeviceESNIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceESNIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIntelligenceCategoryAbstract")
  public JAXBElement<Object> createDocumentIntelligenceCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIntelligenceCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentPerson")
  public JAXBElement<PersonType> createAssessmentPerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentPerson"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformationAvailabilityCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ContactInformationAvailabilityAbstract")
  public JAXBElement<ContactInformationAvailabilityCodeType> createContactInformationAvailabilityCode(ContactInformationAvailabilityCodeType value) {
    return new JAXBElement<ContactInformationAvailabilityCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformationAvailabilityCode"), ContactInformationAvailabilityCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentStatusDescriptionText")
  public JAXBElement<TextType> createDocumentStatusDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentStatusDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SystemIdentificationAugmentationPoint")
  public JAXBElement<Object> createSystemIdentificationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SystemIdentificationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonArmedIndicator")
  public JAXBElement<Boolean> createPersonArmedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonArmedIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentFormatCategoryText")
  public JAXBElement<TextType> createDocumentFormatCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentFormatCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceInformationAssociation")
  public JAXBElement<DeviceInformationAssociationType> createDeviceInformationAssociation(DeviceInformationAssociationType value) {
    return new JAXBElement<DeviceInformationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceInformationAssociation"), DeviceInformationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentPrivacyActIndicator")
  public JAXBElement<Boolean> createDocumentPrivacyActIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentPrivacyActIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorkerAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonWorkerAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorkerAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ImageWidthValue")
  public JAXBElement<NonNegativeInteger> createImageWidthValue(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ImageWidthValue"), NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StartDate")
  public JAXBElement<DateType> createStartDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StartDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemRentalIndicator")
  public JAXBElement<Boolean> createItemRentalIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemRentalIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationComment")
  public JAXBElement<CommentType> createRecommendationComment(CommentType value) {
    return new JAXBElement<CommentType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationComment"), CommentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VesselTrailer")
  public JAXBElement<VehicleType> createVesselTrailer(VehicleType value) {
    return new JAXBElement<VehicleType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VesselTrailer"), VehicleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageCategoryFATCACode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MessageCategoryAbstract")
  public JAXBElement<MessageCategoryFATCACodeType> createMessageCategoryFATCACode(MessageCategoryFATCACodeType value) {
    return new JAXBElement<MessageCategoryFATCACodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageCategoryFATCACode"), MessageCategoryFATCACodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "StreetPostdirectionalText")
  public JAXBElement<TextType> createStreetPostdirectionalText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "StreetPostdirectionalText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DirectDialTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "TelephoneNumberAbstract")
  public JAXBElement<DirectDialTelephoneNumberType> createDirectDialTelephoneNumber(DirectDialTelephoneNumberType value) {
    return new JAXBElement<DirectDialTelephoneNumberType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DirectDialTelephoneNumber"), DirectDialTelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilitySystemIPAddressID")
  public JAXBElement<String> createFacilitySystemIPAddressID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilitySystemIPAddressID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationIdentification")
  public JAXBElement<IdentificationType> createLocationIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionAssigner")
  public JAXBElement<EntityType> createDisciplinaryActionAssigner(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionAssigner"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAssaultedOfficerIndicator")
  public JAXBElement<Boolean> createPersonAssaultedOfficerIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAssaultedOfficerIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PublicServiceCategoryAbstract")
  public JAXBElement<TextType> createPublicServiceCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleAxleQuantity")
  public JAXBElement<NonNegativeInteger> createVehicleAxleQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleAxleQuantity"), NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHeightDescriptionText")
  public JAXBElement<TextType> createPersonHeightDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHeightDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDeathDate")
  public JAXBElement<DateType> createPersonDeathDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDeathDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionSeverityText")
  public JAXBElement<TextType> createMedicalConditionSeverityText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionSeverityText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionCategoryAbstract")
  public JAXBElement<Object> createPersonUnionCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "JurisdictionAugmentationPoint")
  public JAXBElement<Object> createJurisdictionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "JurisdictionAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskCurrentStatus")
  public JAXBElement<StatusType> createTaskCurrentStatus(StatusType value) {
    return new JAXBElement<StatusType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskCurrentStatus"), StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemInsuranceAssociation")
  public JAXBElement<ItemInsuranceAssociationType> createItemInsuranceAssociation(ItemInsuranceAssociationType value) {
    return new JAXBElement<ItemInsuranceAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemInsuranceAssociation"), ItemInsuranceAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDisunionDecreeIndicator")
  public JAXBElement<Boolean> createPersonDisunionDecreeIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDisunionDecreeIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSSNIdentification")
  public JAXBElement<IdentificationType> createPersonSSNIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSSNIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMinimumDecimalValue")
  public JAXBElement<Decimal> createRangeMinimumDecimalValue(Decimal value) {
    return new JAXBElement<Decimal>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMinimumDecimalValue"), Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GeographicCoordinateLongitude")
  public JAXBElement<LongitudeCoordinateType> createGeographicCoordinateLongitude(LongitudeCoordinateType value) {
    return new JAXBElement<LongitudeCoordinateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "GeographicCoordinateLongitude"), LongitudeCoordinateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryCauserAbstract")
  public JAXBElement<Object> createInjuryCauserAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryCauserAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RealEstateAttachedFacility")
  public JAXBElement<FacilityType> createRealEstateAttachedFacility(FacilityType value) {
    return new JAXBElement<FacilityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RealEstateAttachedFacility"), FacilityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityUsageLevel2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "FacilityUsageAbstract")
  public JAXBElement<FacilityUsageLevel2CodeType> createFacilityUsageLevel2Code(FacilityUsageLevel2CodeType value) {
    return new JAXBElement<FacilityUsageLevel2CodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityUsageLevel2Code"), FacilityUsageLevel2CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSpeaksLanguageIndicator")
  public JAXBElement<Boolean> createPersonSpeaksLanguageIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSpeaksLanguageIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseSubCategoryText")
  public JAXBElement<String> createCaseSubCategoryText(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseSubCategoryText"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemModelYearDate")
  public JAXBElement<GYear> createItemModelYearDate(GYear value) {
    return new JAXBElement<GYear>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemModelYearDate"), GYear.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DecalColorText")
  public JAXBElement<TextType> createDecalColorText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DecalColorText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentEffectiveDate")
  public JAXBElement<DateType> createDocumentEffectiveDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentEffectiveDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MessageSenderAbstract")
  public JAXBElement<Object> createMessageSenderAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MessageSenderAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleEmergencyServicesName")
  public JAXBElement<TextType> createLocaleEmergencyServicesName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleEmergencyServicesName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonBirthDate")
  public JAXBElement<DateType> createPersonBirthDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonBirthDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDecimalValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasurePointAbstract")
  public JAXBElement<Decimal> createMeasureDecimalValue(Decimal value) {
    return new JAXBElement<Decimal>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDecimalValue"), Decimal.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDealerIdentification")
  public JAXBElement<IdentificationType> createItemDealerIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDealerIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentIssueDate")
  public JAXBElement<DateType> createDocumentIssueDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentIssueDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TaskAugmentationPoint")
  public JAXBElement<Object> createTaskAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TaskAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EquipmentIdentification")
  public JAXBElement<IdentificationType> createEquipmentIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EquipmentIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleExceptionsDescriptionText")
  public JAXBElement<TextType> createScheduleExceptionsDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleExceptionsDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentRecipient")
  public JAXBElement<EntityType> createDocumentRecipient(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentRecipient"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNationalityISO3166Alpha2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonNationalityAbstract")
  public JAXBElement<CountryAlpha2CodeType> createPersonNationalityISO3166Alpha2Code(CountryAlpha2CodeType value) {
    return new JAXBElement<CountryAlpha2CodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNationalityISO3166Alpha2Code"), CountryAlpha2CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DisciplinaryActionEnforcer")
  public JAXBElement<EntityType> createDisciplinaryActionEnforcer(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DisciplinaryActionEnforcer"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueAssigner")
  public JAXBElement<EntityType> createItemValueAssigner(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueAssigner"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Case")
  public JAXBElement<CaseType> createCase(CaseType value) {
    return new JAXBElement<CaseType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Case"), CaseType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SecuritiesIssuer")
  public JAXBElement<EntityType> createSecuritiesIssuer(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SecuritiesIssuer"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BearingAugmentationPoint")
  public JAXBElement<Object> createBearingAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BearingAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RangeMaximumDoubleValue")
  public JAXBElement<Double> createRangeMaximumDoubleValue(Double value) {
    return new JAXBElement<Double>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RangeMaximumDoubleValue"), Double.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyDescriptionText")
  public JAXBElement<TextType> createAnomalyDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationStateUSPostalServiceCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<USStateCodeType> createLocationStateUSPostalServiceCode(USStateCodeType value) {
    return new JAXBElement<USStateCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationStateUSPostalServiceCode"), USStateCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeightUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "WeightUnitAbstract")
  public JAXBElement<MassCodeType> createWeightUnitCode(MassCodeType value) {
    return new JAXBElement<MassCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeightUnitCode"), MassCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LengthUnitAbstract")
  public JAXBElement<Object> createLengthUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LengthUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAgeDescriptionText")
  public JAXBElement<TextType> createPersonAgeDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAgeDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Item")
  public JAXBElement<ItemType> createItem(ItemType value) {
    return new JAXBElement<ItemType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Item"), ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelativeLocation")
  public JAXBElement<RelativeLocationType> createRelativeLocation(RelativeLocationType value) {
    return new JAXBElement<RelativeLocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelativeLocation"), RelativeLocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ResidenceDescriptionText")
  public JAXBElement<TextType> createResidenceDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ResidenceDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNationalIdentification")
  public JAXBElement<IdentificationType> createPersonNationalIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNationalIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressDeliveryPointID", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AddressDeliveryPointAbstract")
  public JAXBElement<String> createAddressDeliveryPointID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressDeliveryPointID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Identity")
  public JAXBElement<IdentityType> createIdentity(IdentityType value) {
    return new JAXBElement<IdentityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Identity"), IdentityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSkinToneText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonSkinToneAbstract")
  public JAXBElement<TextType> createPersonSkinToneText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSkinToneText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationAugmentationPoint")
  public JAXBElement<Object> createLocationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseIssuer")
  public JAXBElement<EntityType> createReleaseIssuer(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseIssuer"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityAugmentationPoint")
  public JAXBElement<Object> createFacilityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationContactInformationAssociationAugmentationPoint")
  public JAXBElement<Object> createLocationContactInformationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationContactInformationAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationAltitude", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationHeightAbstract")
  public JAXBElement<LocationHeightMeasureType> createLocationAltitude(LocationHeightMeasureType value) {
    return new JAXBElement<LocationHeightMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationAltitude"), LocationHeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentReceivedDate")
  public JAXBElement<DateType> createDocumentReceivedDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentReceivedDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitAugmentationPoint")
  public JAXBElement<Object> createPermitAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryExemptionDescriptionText")
  public JAXBElement<TextType> createMilitaryExemptionDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryExemptionDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityCreationDate")
  public JAXBElement<DateType> createIdentityCreationDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityCreationDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressGridAugmentationPoint")
  public JAXBElement<Object> createAddressGridAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressGridAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWeightDescriptionText")
  public JAXBElement<TextType> createPersonWeightDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWeightDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocaleDescriptionText")
  public JAXBElement<TextType> createLocaleDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocaleDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryLocationAbstract")
  public JAXBElement<Object> createInjuryLocationAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryLocationAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonWorkerAssociation")
  public JAXBElement<PersonWorkerAssociationType> createPersonWorkerAssociation(PersonWorkerAssociationType value) {
    return new JAXBElement<PersonWorkerAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonWorkerAssociation"), PersonWorkerAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureUnitAbstract")
  public JAXBElement<Object> createMeasureUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryDescriptionText")
  public JAXBElement<TextType> createBinaryDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConditionGroupID")
  public JAXBElement<String> createConditionGroupID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConditionGroupID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PaymentMethodText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PaymentMethodAbstract")
  public JAXBElement<TextType> createPaymentMethodText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PaymentMethodText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonResidentAbstract")
  public JAXBElement<Object> createPersonResidentAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonResidentAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityItemAssociation")
  public JAXBElement<ActivityItemAssociationType> createActivityItemAssociation(ActivityItemAssociationType value) {
    return new JAXBElement<ActivityItemAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityItemAssociation"), ActivityItemAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationRecurrenceAugmentationPoint")
  public JAXBElement<Object> createObligationRecurrenceAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationRecurrenceAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityAugmentationPoint")
  public JAXBElement<Object> createActivityAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSubjectAbstract")
  public JAXBElement<Object> createDocumentSubjectAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSubjectAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RequestIdentification")
  public JAXBElement<IdentificationType> createRequestIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RequestIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "BinaryAugmentationPoint")
  public JAXBElement<Object> createBinaryAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "BinaryAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralActivity")
  public JAXBElement<ActivityType> createReferralActivity(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralActivity"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMedicationRequiredText")
  public JAXBElement<TextType> createPersonMedicationRequiredText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMedicationRequiredText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftModelAbstract")
  public JAXBElement<Object> createAircraftModelAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftModelAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneCountryCodeID")
  public JAXBElement<String> createTelephoneCountryCodeID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneCountryCodeID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AcquaintanceAssociation")
  public JAXBElement<PersonAssociationType> createAcquaintanceAssociation(PersonAssociationType value) {
    return new JAXBElement<PersonAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AcquaintanceAssociation"), PersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ElectronicInstrumentCategoryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemCategoryAbstract")
  public JAXBElement<ElectronicInstrumentCategoryCodeType> createElectronicInstrumentCategoryCode(ElectronicInstrumentCategoryCodeType value) {
    return new JAXBElement<ElectronicInstrumentCategoryCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ElectronicInstrumentCategoryCode"), ElectronicInstrumentCategoryCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Schedule")
  public JAXBElement<ScheduleType> createSchedule(ScheduleType value) {
    return new JAXBElement<ScheduleType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Schedule"), ScheduleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationStateName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "StateRepresentation")
  public JAXBElement<ProperNameTextType> createLocationStateName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationStateName"), ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressHighway", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationAddressAbstract")
  public JAXBElement<HighwayType> createAddressHighway(HighwayType value) {
    return new JAXBElement<HighwayType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressHighway"), HighwayType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentityTerminationEventText")
  public JAXBElement<TextType> createIdentityTerminationEventText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentityTerminationEventText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Inclination90Value", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InclinationAbstract")
  public JAXBElement<Degree90Type> createInclination90Value(Degree90Type value) {
    return new JAXBElement<Degree90Type>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Inclination90Value"), Degree90Type.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureDoubleValue", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "MeasurePointAbstract")
  public JAXBElement<Double> createMeasureDoubleValue(Double value) {
    return new JAXBElement<Double>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureDoubleValue"), Double.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Agency")
  public JAXBElement<OrganizationType> createAgency(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Agency"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonName")
  public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
    return new JAXBElement<PersonNameType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonName"), PersonNameType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftMakeAbstract")
  public JAXBElement<Object> createAircraftMakeAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftMakeAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentEUDataPrivacyIndicator")
  public JAXBElement<Boolean> createDocumentEUDataPrivacyIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentEUDataPrivacyIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TreatmentAugmentationPoint")
  public JAXBElement<Object> createTreatmentAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TreatmentAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OdometerReadingMeasure")
  public JAXBElement<LengthMeasureType> createOdometerReadingMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OdometerReadingMeasure"), LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionText")
  public JAXBElement<TextType> createMedicalConditionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PublicServiceWebsiteURI")
  public JAXBElement<AnyURI> createPublicServiceWebsiteURI(AnyURI value) {
    return new JAXBElement<AnyURI>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PublicServiceWebsiteURI"), AnyURI.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureGeneralCategoryText")
  public JAXBElement<TextType> createPhysicalFeatureGeneralCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureGeneralCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationAssociation")
  public JAXBElement<OrganizationAssociationType> createOrganizationAssociation(OrganizationAssociationType value) {
    return new JAXBElement<OrganizationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationAssociation"), OrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AddressFullText")
  public JAXBElement<TextType> createAddressFullText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AddressFullText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeIdentification")
  public JAXBElement<IdentificationType> createEmployeeIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SourceText")
  public JAXBElement<TextType> createSourceText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SourceText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentAssociationAugmentationPoint")
  public JAXBElement<Object> createDocumentAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationHeightVerticalDatumText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationHeightVerticalDatumAbstract")
  public JAXBElement<TextType> createLocationHeightVerticalDatumText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationHeightVerticalDatumText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityName")
  public JAXBElement<TextType> createActivityName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCurrentEmploymentAssociation")
  public JAXBElement<PersonEmploymentAssociationType> createPersonCurrentEmploymentAssociation(PersonEmploymentAssociationType value) {
    return new JAXBElement<PersonEmploymentAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCurrentEmploymentAssociation"), PersonEmploymentAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAgeMeasure")
  public JAXBElement<TimeMeasureType> createPersonAgeMeasure(TimeMeasureType value) {
    return new JAXBElement<TimeMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAgeMeasure"), TimeMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationPostalExtensionCode")
  public JAXBElement<String> createLocationPostalExtensionCode(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationPostalExtensionCode"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentTitleText")
  public JAXBElement<TextType> createDocumentTitleText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentTitleText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentAssessor")
  public JAXBElement<EntityType> createAssessmentAssessor(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentAssessor"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationPostalCode")
  public JAXBElement<String> createLocationPostalCode(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationPostalCode"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemValueAssigningMethodText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ItemValueAssigningMethodAbstract")
  public JAXBElement<TextType> createItemValueAssigningMethodText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemValueAssigningMethodText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Airport")
  public JAXBElement<AirportType> createAirport(AirportType value) {
    return new JAXBElement<AirportType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Airport"), AirportType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonOfficialGivenName")
  public JAXBElement<PersonNameTextType> createPersonOfficialGivenName(PersonNameTextType value) {
    return new JAXBElement<PersonNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonOfficialGivenName"), PersonNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TreatmentText")
  public JAXBElement<TextType> createTreatmentText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TreatmentText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityAssociationAugmentationPoint")
  public JAXBElement<Object> createFacilityAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponInvolvedInActivity")
  public JAXBElement<ActivityType> createWeaponInvolvedInActivity(ActivityType value) {
    return new JAXBElement<ActivityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponInvolvedInActivity"), ActivityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelecommunicationDevice")
  public JAXBElement<DeviceType> createTelecommunicationDevice(DeviceType value) {
    return new JAXBElement<DeviceType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelecommunicationDevice"), DeviceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryDischargeDate")
  public JAXBElement<DateType> createMilitaryDischargeDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryDischargeDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TemperatureMeasure")
  public JAXBElement<TemperatureMeasureType> createTemperatureMeasure(TemperatureMeasureType value) {
    return new JAXBElement<TemperatureMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TemperatureMeasure"), TemperatureMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InstantMessengerServiceName")
  public JAXBElement<TextType> createInstantMessengerServiceName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InstantMessengerServiceName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentMediumText")
  public JAXBElement<TextType> createDocumentMediumText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentMediumText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PatientMedicalFacility")
  public JAXBElement<OrganizationType> createPatientMedicalFacility(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PatientMedicalFacility"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Arrival")
  public JAXBElement<ArrivalType> createArrival(ArrivalType value) {
    return new JAXBElement<ArrivalType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Arrival"), ArrivalType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityOperationalStatus")
  public JAXBElement<StatusType> createFacilityOperationalStatus(StatusType value) {
    return new JAXBElement<StatusType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityOperationalStatus"), StatusType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonDescriptionText")
  public JAXBElement<TextType> createPersonDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleTimeRange")
  public JAXBElement<TimeRangeType> createScheduleTimeRange(TimeRangeType value) {
    return new JAXBElement<TimeRangeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleTimeRange"), TimeRangeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Passport")
  public JAXBElement<PassportType> createPassport(PassportType value) {
    return new JAXBElement<PassportType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Passport"), PassportType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationLocationAssociationAugmentationPoint")
  public JAXBElement<Object> createOrganizationLocationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationLocationAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "OrganizationCategoryAbstract")
  public JAXBElement<TextType> createOrganizationCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityPersonAssociation")
  public JAXBElement<FacilityPersonAssociationType> createFacilityPersonAssociation(FacilityPersonAssociationType value) {
    return new JAXBElement<FacilityPersonAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityPersonAssociation"), FacilityPersonAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DrugStrengthText")
  public JAXBElement<TextType> createDrugStrengthText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DrugStrengthText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceAbstract")
  public JAXBElement<Object> createSubstanceAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemMakeName")
  public JAXBElement<ProperNameTextType> createItemMakeName(ProperNameTextType value) {
    return new JAXBElement<ProperNameTextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemMakeName"), ProperNameTextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationEntity")
  public JAXBElement<EntityType> createRecommendationEntity(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationEntity"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationUnitName")
  public JAXBElement<TextType> createOrganizationUnitName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationUnitName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IncidentLocation")
  public JAXBElement<LocationType> createIncidentLocation(LocationType value) {
    return new JAXBElement<LocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IncidentLocation"), LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemBuyer")
  public JAXBElement<EntityType> createItemBuyer(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemBuyer"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitCategoryAbstract")
  public JAXBElement<Object> createPermitCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CountryAugmentationPoint")
  public JAXBElement<Object> createCountryAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CountryAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EndDate")
  public JAXBElement<DateType> createEndDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EndDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryCountry")
  public JAXBElement<CountryType> createMilitaryCountry(CountryType value) {
    return new JAXBElement<CountryType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryCountry"), CountryType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftFuselageColorText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AircraftFuselageColorAbstract")
  public JAXBElement<TextType> createAircraftFuselageColorText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftFuselageColorText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCriminalOrganizationAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createPersonCriminalOrganizationAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCriminalOrganizationAssociation"), PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CaseDispositionFinalDate")
  public JAXBElement<DateType> createCaseDispositionFinalDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CaseDispositionFinalDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentMediaCategoryText")
  public JAXBElement<TextType> createDocumentMediaCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentMediaCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DirectionDatumCode")
  public JAXBElement<DirectionDatumCodeType> createDirectionDatumCode(DirectionDatumCodeType value) {
    return new JAXBElement<DirectionDatumCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DirectionDatumCode"), DirectionDatumCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ScheduleDescriptionText")
  public JAXBElement<TextType> createScheduleDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ScheduleDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceContainerDescriptionText")
  public JAXBElement<TextType> createSubstanceContainerDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceContainerDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityItemAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityItemAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityItemAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Entity")
  public JAXBElement<EntityType> createEntity(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Entity"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MeasureAugmentationPoint")
  public JAXBElement<Object> createMeasureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MeasureAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemEntityAssociation")
  public JAXBElement<ItemEntityAssociationType> createItemEntityAssociation(ItemEntityAssociationType value) {
    return new JAXBElement<ItemEntityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemEntityAssociation"), ItemEntityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPossessCreditCardIndicator")
  public JAXBElement<Boolean> createPersonPossessCreditCardIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPossessCreditCardIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LongitudeMinuteValue")
  public JAXBElement<AngularMinuteType> createLongitudeMinuteValue(AngularMinuteType value) {
    return new JAXBElement<AngularMinuteType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LongitudeMinuteValue"), AngularMinuteType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonSexualOrientationText")
  public JAXBElement<TextType> createPersonSexualOrientationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonSexualOrientationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonFacialHairText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonFacialHairAbstract")
  public JAXBElement<TextType> createPersonFacialHairText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonFacialHairText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Jurisdiction")
  public JAXBElement<JurisdictionType> createJurisdiction(JurisdictionType value) {
    return new JAXBElement<JurisdictionType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Jurisdiction"), JurisdictionType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCitizenshipText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonCitizenshipAbstract")
  public JAXBElement<TextType> createPersonCitizenshipText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCitizenshipText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAssociationAugmentationPoint")
  public JAXBElement<Object> createPersonAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationAssociationAugmentationPoint")
  public JAXBElement<Object> createOrganizationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonReferralWorkerAssociation")
  public JAXBElement<PersonWorkerAssociationType> createPersonReferralWorkerAssociation(PersonWorkerAssociationType value) {
    return new JAXBElement<PersonWorkerAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonReferralWorkerAssociation"), PersonWorkerAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureLocationText")
  public JAXBElement<TextType> createPhysicalFeatureLocationText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureLocationText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EncounterClassificationAugmentationPoint")
  public JAXBElement<Object> createEncounterClassificationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EncounterClassificationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonPhysicalDisabilityText")
  public JAXBElement<TextType> createPersonPhysicalDisabilityText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonPhysicalDisabilityText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "WeaponUsageText")
  public JAXBElement<TextType> createWeaponUsageText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "WeaponUsageText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntellectualPropertyCreationDate")
  public JAXBElement<DateType> createIntellectualPropertyCreationDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntellectualPropertyCreationDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ZuluDateTime", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<ZuluDateTimeType> createZuluDateTime(ZuluDateTimeType value) {
    return new JAXBElement<ZuluDateTimeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ZuluDateTime"), ZuluDateTimeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FacilityCapacityQuantity")
  public JAXBElement<NonNegativeInteger> createFacilityCapacityQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FacilityCapacityQuantity"), NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneNumberAbstract")
  public JAXBElement<Object> createTelephoneNumberAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneNumberAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonVisionPrescriptionText")
  public JAXBElement<TextType> createPersonVisionPrescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonVisionPrescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CountryCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "CountryRepresentation")
  public JAXBElement<CodeType> createCountryCode(CodeType value) {
    return new JAXBElement<CodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CountryCode"), CodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOtherIdentification")
  public JAXBElement<IdentificationType> createItemOtherIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOtherIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PassportBookIdentification")
  public JAXBElement<IdentificationType> createPassportBookIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PassportBookIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEducationLevelText")
  public JAXBElement<TextType> createPersonEducationLevelText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEducationLevelText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LongitudeSecondValue")
  public JAXBElement<AngularSecondType> createLongitudeSecondValue(AngularSecondType value) {
    return new JAXBElement<AngularSecondType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LongitudeSecondValue"), AngularSecondType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationOtherIdentification")
  public JAXBElement<IdentificationType> createOrganizationOtherIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationOtherIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Machinery")
  public JAXBElement<ItemType> createMachinery(ItemType value) {
    return new JAXBElement<ItemType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Machinery"), ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TransportationAssociationAugmentationPoint")
  public JAXBElement<Object> createTransportationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TransportationAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountClosedIndicator")
  public JAXBElement<Boolean> createFinancialAccountClosedIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountClosedIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AngularMeasure")
  public JAXBElement<AngularMeasureType> createAngularMeasure(AngularMeasureType value) {
    return new JAXBElement<AngularMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AngularMeasure"), AngularMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryReleaseCategoryText")
  public JAXBElement<TextType> createMilitaryReleaseCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryReleaseCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SourceIDText")
  public JAXBElement<TextType> createSourceIDText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SourceIDText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonAliasIdentityAssociation")
  public JAXBElement<PersonIdentityAssociationType> createPersonAliasIdentityAssociation(PersonIdentityAssociationType value) {
    return new JAXBElement<PersonIdentityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonAliasIdentityAssociation"), PersonIdentityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactInformationAvailabilityAbstract")
  public JAXBElement<Object> createContactInformationAvailabilityAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactInformationAvailabilityAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CourtCase")
  public JAXBElement<CaseType> createCourtCase(CaseType value) {
    return new JAXBElement<CaseType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CourtCase"), CaseType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCategoryName", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCategoryAbstract")
  public JAXBElement<TextType> createDocumentCategoryName(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCategoryName"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentStatusDetailsAugmentationPoint")
  public JAXBElement<Object> createDocumentStatusDetailsAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentStatusDetailsAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Comment")
  public JAXBElement<CommentType> createComment(CommentType value) {
    return new JAXBElement<CommentType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Comment"), CommentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleMSRPAmount")
  public JAXBElement<AmountType> createVehicleMSRPAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleMSRPAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SubstanceQuantityMeasure")
  public JAXBElement<SubstanceMeasureType> createSubstanceQuantityMeasure(SubstanceMeasureType value) {
    return new JAXBElement<SubstanceMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SubstanceQuantityMeasure"), SubstanceMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairAppearanceText")
  public JAXBElement<TextType> createPersonHairAppearanceText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairAppearanceText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssociationAugmentationPoint")
  public JAXBElement<Object> createAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ArrivalAugmentationPoint")
  public JAXBElement<Object> createArrivalAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ArrivalAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationCategoryAbstract")
  public JAXBElement<Object> createRecommendationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MapVerticalCoordinateText")
  public JAXBElement<TextType> createMapVerticalCoordinateText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MapVerticalCoordinateText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CircularRegionRadiusLengthMeasure")
  public JAXBElement<LengthMeasureType> createCircularRegionRadiusLengthMeasure(LengthMeasureType value) {
    return new JAXBElement<LengthMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CircularRegionRadiusLengthMeasure"), LengthMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationDescriptionText")
  public JAXBElement<TextType> createOrganizationDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentVitalIndicator")
  public JAXBElement<Boolean> createDocumentVitalIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentVitalIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VehicleGrossLadenSumWeightMeasure")
  public JAXBElement<WeightMeasureType> createVehicleGrossLadenSumWeightMeasure(WeightMeasureType value) {
    return new JAXBElement<WeightMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VehicleGrossLadenSumWeightMeasure"), WeightMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonCurrentLocationAssociation")
  public JAXBElement<PersonLocationAssociationType> createPersonCurrentLocationAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonCurrentLocationAssociation"), PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IdentificationCategoryAbstract")
  public JAXBElement<Object> createIdentificationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IdentificationCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "TelephoneSuffixID")
  public JAXBElement<String> createTelephoneSuffixID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "TelephoneSuffixID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeShiftText")
  public JAXBElement<TextType> createEmployeeShiftText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeShiftText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Locale")
  public JAXBElement<LocaleType> createLocale(LocaleType value) {
    return new JAXBElement<LocaleType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Locale"), LocaleType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ObligationPaidDuration", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "ObligationPaidAbstract")
  public JAXBElement<Duration> createObligationPaidDuration(Duration value) {
    return new JAXBElement<Duration>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ObligationPaidDuration"), Duration.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RelatedActivityAssociation")
  public JAXBElement<RelatedActivityAssociationType> createRelatedActivityAssociation(RelatedActivityAssociationType value) {
    return new JAXBElement<RelatedActivityAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RelatedActivityAssociation"), RelatedActivityAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AreaRegionAbstract")
  public JAXBElement<Object> createAreaRegionAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AreaRegionAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VolumeUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "VolumeUnitAbstract")
  public JAXBElement<VolumeUnitCodeType> createVolumeUnitCode(VolumeUnitCodeType value) {
    return new JAXBElement<VolumeUnitCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VolumeUnitCode"), VolumeUnitCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConveyanceEngineQuantity")
  public JAXBElement<NonNegativeInteger> createConveyanceEngineQuantity(NonNegativeInteger value) {
    return new JAXBElement<NonNegativeInteger>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConveyanceEngineQuantity"), NonNegativeInteger.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SeparationCategoryAbstract")
  public JAXBElement<Object> createSeparationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SeparationCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceOutgoingTextMessage", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceSentInformationAbstract")
  public JAXBElement<MessageType> createDeviceOutgoingTextMessage(MessageType value) {
    return new JAXBElement<MessageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceOutgoingTextMessage"), MessageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "NANPTelephoneNumberAugmentationPoint")
  public JAXBElement<Object> createNANPTelephoneNumberAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "NANPTelephoneNumberAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AircraftWingColorAbstract")
  public JAXBElement<Object> createAircraftWingColorAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AircraftWingColorAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemOwner")
  public JAXBElement<EntityType> createItemOwner(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemOwner"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Payment")
  public JAXBElement<PaymentType> createPayment(PaymentType value) {
    return new JAXBElement<PaymentType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Payment"), PaymentType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationUnit")
  public JAXBElement<OrganizationType> createOrganizationUnit(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationUnit"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralItem")
  public JAXBElement<ItemType> createReferralItem(ItemType value) {
    return new JAXBElement<ItemType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralItem"), ItemType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AssessmentReferral")
  public JAXBElement<ReferralType> createAssessmentReferral(ReferralType value) {
    return new JAXBElement<ReferralType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AssessmentReferral"), ReferralType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "IntangibleItemAugmentationPoint")
  public JAXBElement<Object> createIntangibleItemAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "IntangibleItemAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CapabilityStartDate")
  public JAXBElement<DateType> createCapabilityStartDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CapabilityStartDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonTemporaryAssignedUnitAssociation")
  public JAXBElement<PersonOrganizationAssociationType> createPersonTemporaryAssignedUnitAssociation(PersonOrganizationAssociationType value) {
    return new JAXBElement<PersonOrganizationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonTemporaryAssignedUnitAssociation"), PersonOrganizationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReferralIssuer")
  public JAXBElement<EntityType> createReferralIssuer(EntityType value) {
    return new JAXBElement<EntityType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReferralIssuer"), EntityType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ResidenceOccupancyCategoryText")
  public JAXBElement<TextType> createResidenceOccupancyCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ResidenceOccupancyCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonMedicalDescriptionText")
  public JAXBElement<TextType> createPersonMedicalDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonMedicalDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "GeographicDatumText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "GeographicDatumAbstract")
  public JAXBElement<TextType> createGeographicDatumText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "GeographicDatumText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationRangeDescriptionText")
  public JAXBElement<TextType> createLocationRangeDescriptionText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationRangeDescriptionText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonHairLengthAbstract")
  public JAXBElement<Object> createPersonHairLengthAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonHairLengthAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ContactResponder")
  public JAXBElement<PersonType> createContactResponder(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ContactResponder"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "AnomalyCategoryText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "AnomalyCategoryAbstract")
  public JAXBElement<TextType> createAnomalyCategoryText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "AnomalyCategoryText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "LocationNeighboringPersonAssociation")
  public JAXBElement<PersonLocationAssociationType> createLocationNeighboringPersonAssociation(PersonLocationAssociationType value) {
    return new JAXBElement<PersonLocationAssociationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "LocationNeighboringPersonAssociation"), PersonLocationAssociationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DeviceOutgoingTelephoneNumber", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DeviceSentInformationAbstract")
  public JAXBElement<TelephoneNumberType> createDeviceOutgoingTelephoneNumber(TelephoneNumberType value) {
    return new JAXBElement<TelephoneNumberType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DeviceOutgoingTelephoneNumber"), TelephoneNumberType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonXRayImage")
  public JAXBElement<ImageType> createPersonXRayImage(ImageType value) {
    return new JAXBElement<ImageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonXRayImage"), ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ArrivalDate")
  public JAXBElement<DateType> createArrivalDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ArrivalDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Insurance")
  public JAXBElement<InsuranceType> createInsurance(InsuranceType value) {
    return new JAXBElement<InsuranceType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Insurance"), InsuranceType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonComprehendsSpokenLanguageIndicator")
  public JAXBElement<Boolean> createPersonComprehendsSpokenLanguageIndicator(Boolean value) {
    return new JAXBElement<Boolean>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonComprehendsSpokenLanguageIndicator"), Boolean.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DepartureAugmentationPoint")
  public JAXBElement<Object> createDepartureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DepartureAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PhysicalFeatureAugmentationPoint")
  public JAXBElement<Object> createPhysicalFeatureAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PhysicalFeatureAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationCategoryAbstract")
  public JAXBElement<Object> createOrganizationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "FinancialAccountHolderCode")
  public JAXBElement<FinancialAccountHolderCodeType> createFinancialAccountHolderCode(FinancialAccountHolderCodeType value) {
    return new JAXBElement<FinancialAccountHolderCodeType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "FinancialAccountHolderCode"), FinancialAccountHolderCodeType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PermitRenewalDate")
  public JAXBElement<DateType> createPermitRenewalDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PermitRenewalDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonUnionStatusText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonUnionStatusAbstract")
  public JAXBElement<TextType> createPersonUnionStatusText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonUnionStatusText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ProgressPaymentAmount")
  public JAXBElement<AmountType> createProgressPaymentAmount(AmountType value) {
    return new JAXBElement<AmountType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ProgressPaymentAmount"), AmountType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ConsumptionRateUnitAbstract")
  public JAXBElement<Object> createConsumptionRateUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ConsumptionRateUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonNationalityAbstract")
  public JAXBElement<Object> createPersonNationalityAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonNationalityAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ActivityOrganizationAssociationAugmentationPoint")
  public JAXBElement<Object> createActivityOrganizationAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ActivityOrganizationAssociationAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "VolumeUnitAbstract")
  public JAXBElement<Object> createVolumeUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "VolumeUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InjuryCauserPerson", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "InjuryCauserAbstract")
  public JAXBElement<PersonType> createInjuryCauserPerson(PersonType value) {
    return new JAXBElement<PersonType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InjuryCauserPerson"), PersonType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Address", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "LocationAddressAbstract")
  public JAXBElement<AddressType> createAddress(AddressType value) {
    return new JAXBElement<AddressType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Address"), AddressType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentSequenceID")
  public JAXBElement<String> createDocumentSequenceID(String value) {
    return new JAXBElement<String>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentSequenceID"), String.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MedicalConditionAugmentationPoint")
  public JAXBElement<Object> createMedicalConditionAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MedicalConditionAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EmployeeOccupationCategoryAbstract")
  public JAXBElement<Object> createEmployeeOccupationCategoryAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EmployeeOccupationCategoryAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Image")
  public JAXBElement<ImageType> createImage(ImageType value) {
    return new JAXBElement<ImageType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Image"), ImageType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "CrossStreetAugmentationPoint")
  public JAXBElement<Object> createCrossStreetAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "CrossStreetAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DateTime", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DateRepresentation")
  public JAXBElement<DateTime> createDateTime(DateTime value) {
    return new JAXBElement<DateTime>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DateTime"), DateTime.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationLEIIdentification")
  public JAXBElement<IdentificationType> createOrganizationLEIIdentification(IdentificationType value) {
    return new JAXBElement<IdentificationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationLEIIdentification"), IdentificationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "OrganizationParentAbstract")
  public JAXBElement<Object> createOrganizationParentAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "OrganizationParentAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "EntityOrganization", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "EntityRepresentation")
  public JAXBElement<OrganizationType> createEntityOrganization(OrganizationType value) {
    return new JAXBElement<OrganizationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "EntityOrganization"), OrganizationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ReleaseToLocation")
  public JAXBElement<LocationType> createReleaseToLocation(LocationType value) {
    return new JAXBElement<LocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ReleaseToLocation"), LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "ItemDispositionLocation")
  public JAXBElement<LocationType> createItemDispositionLocation(LocationType value) {
    return new JAXBElement<LocationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "ItemDispositionLocation"), LocationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentPostDate")
  public JAXBElement<DateType> createDocumentPostDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentPostDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "PersonEyewearText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "PersonEyewearAbstract")
  public JAXBElement<TextType> createPersonEyewearText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "PersonEyewearText"), TextType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "SpeedUnitAbstract")
  public JAXBElement<Object> createSpeedUnitAbstract(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "SpeedUnitAbstract"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "DocumentCoverageDate", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/4.0/", substitutionHeadName = "DocumentCoverageAbstract")
  public JAXBElement<DateType> createDocumentCoverageDate(DateType value) {
    return new JAXBElement<DateType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "DocumentCoverageDate"), DateType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "MilitaryServiceTimeMeasure")
  public JAXBElement<TimeMeasureType> createMilitaryServiceTimeMeasure(TimeMeasureType value) {
    return new JAXBElement<TimeMeasureType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "MilitaryServiceTimeMeasure"), TimeMeasureType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "InstantMessengerAugmentationPoint")
  public JAXBElement<Object> createInstantMessengerAugmentationPoint(Object value) {
    return new JAXBElement<Object>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "InstantMessengerAugmentationPoint"), Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "Recommendation")
  public JAXBElement<RecommendationType> createRecommendation(RecommendationType value) {
    return new JAXBElement<RecommendationType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "Recommendation"), RecommendationType.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/4.0/", name = "RecommendationSubjectText")
  public JAXBElement<TextType> createRecommendationSubjectText(TextType value) {
    return new JAXBElement<TextType>(new QName("http://release.niem.gov/niem/niem-core/4.0/", "RecommendationSubjectText"), TextType.class, null, value);
  }

}
