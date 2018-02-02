package gov.niem.release.niem.structures;

import gov.niem.release.niem.niem_core.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", propOrder = {
  "objectAugmentationPoint"
})
@XmlSeeAlso({
  PersonType.class,
  ContactInformationType.class,
  HighwayType.class,
  DateType.class,
  PersonLanguageType.class,
  EntityType.class,
  AreaType.class,
  LocationType.class,
  ObligationType.class,
  PersonNameType.class,
  TelephoneNumberType.class,
  StatusType.class,
  EncounterClassificationType.class,
  ItemValueType.class,
  OrganizationType.class,
  InjuryType.class,
  CaseDispositionDecisionType.class,
  LocaleType.class,
  FacilityType.class,
  DateRangeType.class,
  BinaryType.class,
  GenericEntityType.class,
  InternationalTelephoneNumberType.class,
  PhysicalFeatureType.class,
  PublicServiceType.class,
  UnsignedIntegerRangeType.class,
  ContactRadioType.class,
  EquipmentType.class,
  NANPTelephoneNumberType.class,
  RelativeLocationType.class,
  SiteType.class,
  MessageType.class,
  CircularRegionType.class,
  MilitarySummaryType.class,
  AmountType.class,
  WeaponType.class,
  StreetType.class,
  ScheduleType.class,
  DecalType.class,
  DocumentStatusDetailsType.class,
  FinancialAccountType.class,
  MedicalConditionType.class,
  CrossStreetType.class,
  DepartureType.class,
  AnomalyType.class,
  BinaryHashType.class,
  IdentificationType.class,
  AddressType.class,
  DecimalRangeType.class,
  CountryType.class,
  CrisisType.class,
  LongitudeCoordinateType.class,
  ElectronicAddressType.class,
  JurisdictionType.class,
  AddressGridType.class,
  ScheduleDayType.class,
  ItemType.class,
  CapabilityType.class,
  TaskType.class,
  LatitudeCoordinateType.class,
  PolygonRegionType.class,
  Location2DGeospatialCoordinateType.class,
  BearingType.class,
  DoubleRangeType.class,
  FullTelephoneNumberType.class,
  MissionType.class,
  DispositionType.class,
  ObligationRecurrenceType.class,
  DocumentType.class,
  ArrivalType.class,
  TimeRangeType.class,
  RecommendationType.class,
  InsuranceType.class,
  PaymentType.class,
  AngularMeasureType.class,
  CommentType.class,
  MapLocationType.class,
  ActivityType.class,
  StateType.class,
  PermitType.class,
  ObligationExemptionType.class,
  IntegerRangeType.class,
  MeasureType.class,
  RequestType.class,
  IdentityType.class,
  DirectDialTelephoneNumberType.class,
  InstantMessengerType.class,
  OrientationType.class
})
public abstract class ObjectType {

  @XmlElement(name = "ObjectAugmentationPoint")
  protected List<Object> objectAugmentationPoint;
  @XmlAttribute(name = "id", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAttribute(name = "ref", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object ref;
  @XmlAttribute(name = "uri", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlSchemaType(name = "anyURI")
  protected String uri;
  @XmlAttribute(name = "metadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> metadata;
  @XmlAttribute(name = "relationshipMetadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> relationshipMetadata;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  public List<Object> getObjectAugmentationPoint() {
    if (objectAugmentationPoint == null) {
      objectAugmentationPoint = new ArrayList<Object>();
    }
    return this.objectAugmentationPoint;
  }

  public String getId() {
    return id;
  }

  public void setId(String value) {
    this.id = value;
  }

  public Object getRef() {
    return ref;
  }

  public void setRef(Object value) {
    this.ref = value;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String value) {
    this.uri = value;
  }

  public List<Object> getMetadata() {
    if (metadata == null) {
      metadata = new ArrayList<Object>();
    }
    return this.metadata;
  }

  public List<Object> getRelationshipMetadata() {
    if (relationshipMetadata == null) {
      relationshipMetadata = new ArrayList<Object>();
    }
    return this.relationshipMetadata;
  }

  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }

}
