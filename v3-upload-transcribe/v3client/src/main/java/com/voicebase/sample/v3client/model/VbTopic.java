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
import com.voicebase.sample.v3client.model.ArrayList;
import com.voicebase.sample.v3client.model.VbKeyword;
import com.voicebase.sample.v3client.model.VbReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbTopic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbTopic {
  @JsonProperty("topicName")
  private String topicName = null;

  @JsonProperty("relevance")
  private Double relevance = null;

  @JsonProperty("subTopics")
  private java.util.List<VbReference> subTopics = new java.util.ArrayList<VbReference>();

  @JsonProperty("keywords")
  private java.util.List<VbKeyword> keywords = new java.util.ArrayList<VbKeyword>();

  public VbTopic topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public VbTopic relevance(Double relevance) {
    this.relevance = relevance;
    return this;
  }

   /**
   * Get relevance
   * @return relevance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRelevance() {
    return relevance;
  }

  public void setRelevance(Double relevance) {
    this.relevance = relevance;
  }

  public VbTopic subTopics(java.util.List<VbReference> subTopics) {
    this.subTopics = subTopics;
    return this;
  }

  public VbTopic addSubTopicsItem(VbReference subTopicsItem) {
    this.subTopics.add(subTopicsItem);
    return this;
  }

   /**
   * Get subTopics
   * @return subTopics
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbReference> getSubTopics() {
    return subTopics;
  }

  public void setSubTopics(java.util.List<VbReference> subTopics) {
    this.subTopics = subTopics;
  }

  public VbTopic keywords(java.util.List<VbKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public VbTopic addKeywordsItem(VbKeyword keywordsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbTopic vbTopic = (VbTopic) o;
    return Objects.equals(this.topicName, vbTopic.topicName) &&
        Objects.equals(this.relevance, vbTopic.relevance) &&
        Objects.equals(this.subTopics, vbTopic.subTopics) &&
        Objects.equals(this.keywords, vbTopic.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicName, relevance, subTopics, keywords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbTopic {\n");
    
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    subTopics: ").append(toIndentedString(subTopics)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

