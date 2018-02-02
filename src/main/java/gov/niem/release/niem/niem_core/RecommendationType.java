package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationType", propOrder = {
  "recommendationDescriptionText",
  "recommendationEntity",
  "recommendationSubjectText",
  "recommendationDate",
  "recommendationCategoryAbstract",
  "recommendationComment",
  "recommendationText",
  "recommendationAugmentationPoint"
})
public class RecommendationType
  extends ObjectType {

  @XmlElement(name = "RecommendationDescriptionText", nillable = true)
  protected List<TextType> recommendationDescriptionText;
  @XmlElement(name = "RecommendationEntity", nillable = true)
  protected List<EntityType> recommendationEntity;
  @XmlElement(name = "RecommendationSubjectText", nillable = true)
  protected List<TextType> recommendationSubjectText;
  @XmlElement(name = "RecommendationDate", nillable = true)
  protected List<DateType> recommendationDate;
  @XmlElementRef(name = "RecommendationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> recommendationCategoryAbstract;
  @XmlElement(name = "RecommendationComment", nillable = true)
  protected List<CommentType> recommendationComment;
  @XmlElement(name = "RecommendationText", nillable = true)
  protected List<TextType> recommendationText;
  @XmlElement(name = "RecommendationAugmentationPoint")
  protected List<Object> recommendationAugmentationPoint;

  public List<TextType> getRecommendationDescriptionText() {
    if (recommendationDescriptionText == null) {
      recommendationDescriptionText = new ArrayList<TextType>();
    }
    return this.recommendationDescriptionText;
  }

  public List<EntityType> getRecommendationEntity() {
    if (recommendationEntity == null) {
      recommendationEntity = new ArrayList<EntityType>();
    }
    return this.recommendationEntity;
  }

  public List<TextType> getRecommendationSubjectText() {
    if (recommendationSubjectText == null) {
      recommendationSubjectText = new ArrayList<TextType>();
    }
    return this.recommendationSubjectText;
  }

  public List<DateType> getRecommendationDate() {
    if (recommendationDate == null) {
      recommendationDate = new ArrayList<DateType>();
    }
    return this.recommendationDate;
  }

  public List<JAXBElement<?>> getRecommendationCategoryAbstract() {
    if (recommendationCategoryAbstract == null) {
      recommendationCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.recommendationCategoryAbstract;
  }

  public List<CommentType> getRecommendationComment() {
    if (recommendationComment == null) {
      recommendationComment = new ArrayList<CommentType>();
    }
    return this.recommendationComment;
  }

  public List<TextType> getRecommendationText() {
    if (recommendationText == null) {
      recommendationText = new ArrayList<TextType>();
    }
    return this.recommendationText;
  }

  public List<Object> getRecommendationAugmentationPoint() {
    if (recommendationAugmentationPoint == null) {
      recommendationAugmentationPoint = new ArrayList<Object>();
    }
    return this.recommendationAugmentationPoint;
  }

}
