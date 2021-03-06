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
import com.voicebase.sample.v3client.model.VbMention;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbKeyword
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbKeyword {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("relevance")
  private Double relevance = null;

  @JsonProperty("mentions")
  private java.util.List<VbMention> mentions = new java.util.ArrayList<VbMention>();

  public VbKeyword keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public VbKeyword relevance(Double relevance) {
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

  public VbKeyword mentions(java.util.List<VbMention> mentions) {
    this.mentions = mentions;
    return this;
  }

  public VbKeyword addMentionsItem(VbMention mentionsItem) {
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * Get mentions
   * @return mentions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbMention> getMentions() {
    return mentions;
  }

  public void setMentions(java.util.List<VbMention> mentions) {
    this.mentions = mentions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbKeyword vbKeyword = (VbKeyword) o;
    return Objects.equals(this.keyword, vbKeyword.keyword) &&
        Objects.equals(this.relevance, vbKeyword.relevance) &&
        Objects.equals(this.mentions, vbKeyword.mentions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, relevance, mentions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbKeyword {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
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

