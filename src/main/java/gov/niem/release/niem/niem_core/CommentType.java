package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {
  "commentAuthorText",
  "commentCreationDate",
  "commentText",
  "commentTitleText",
  "commentAugmentationPoint"
})
public class CommentType
  extends ObjectType {

  @XmlElement(name = "CommentAuthorText", nillable = true)
  protected List<TextType> commentAuthorText;
  @XmlElement(name = "CommentCreationDate", nillable = true)
  protected List<DateType> commentCreationDate;
  @XmlElement(name = "CommentText", nillable = true)
  protected List<TextType> commentText;
  @XmlElement(name = "CommentTitleText", nillable = true)
  protected List<TextType> commentTitleText;
  @XmlElement(name = "CommentAugmentationPoint")
  protected List<Object> commentAugmentationPoint;

  public List<TextType> getCommentAuthorText() {
    if (commentAuthorText == null) {
      commentAuthorText = new ArrayList<TextType>();
    }
    return this.commentAuthorText;
  }

  public List<DateType> getCommentCreationDate() {
    if (commentCreationDate == null) {
      commentCreationDate = new ArrayList<DateType>();
    }
    return this.commentCreationDate;
  }

  public List<TextType> getCommentText() {
    if (commentText == null) {
      commentText = new ArrayList<TextType>();
    }
    return this.commentText;
  }

  public List<TextType> getCommentTitleText() {
    if (commentTitleText == null) {
      commentTitleText = new ArrayList<TextType>();
    }
    return this.commentTitleText;
  }

  public List<Object> getCommentAugmentationPoint() {
    if (commentAugmentationPoint == null) {
      commentAugmentationPoint = new ArrayList<Object>();
    }
    return this.commentAugmentationPoint;
  }

}
