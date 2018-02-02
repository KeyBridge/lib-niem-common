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
