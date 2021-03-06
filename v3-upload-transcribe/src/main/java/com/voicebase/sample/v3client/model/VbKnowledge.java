/*
 * Voicebase V3 API
 * APIs for speech recognition and speech analytics, powering insights every business needs.
 *
 * OpenAPI spec version: 3.0.1
 * Contact: support@voicebase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.voicebase.sample.v3client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import com.voicebase.sample.v3client.model.VbKeyword;
import com.voicebase.sample.v3client.model.VbTopic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbKnowledge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbKnowledge {
  @JsonProperty("keywords")
  private java.util.List<VbKeyword> keywords = new java.util.ArrayList<VbKeyword>();

  @JsonProperty("topics")
  private java.util.List<VbTopic> topics = new java.util.ArrayList<VbTopic>();

  public VbKnowledge keywords(java.util.List<VbKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public VbKnowledge addKeywordsItem(VbKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(java.util.List<VbKeyword> keywords) {
    this.keywords = keywords;
  }

  public VbKnowledge topics(java.util.List<VbTopic> topics) {
    this.topics = topics;
    return this;
  }

  public VbKnowledge addTopicsItem(VbTopic topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbTopic> getTopics() {
    return topics;
  }

  public void setTopics(java.util.List<VbTopic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbKnowledge vbKnowledge = (VbKnowledge) o;
    return Objects.equals(this.keywords, vbKnowledge.keywords) &&
        Objects.equals(this.topics, vbKnowledge.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, topics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbKnowledge {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

