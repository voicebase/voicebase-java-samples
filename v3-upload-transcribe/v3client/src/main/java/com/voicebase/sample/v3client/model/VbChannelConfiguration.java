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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbChannelConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbChannelConfiguration {
  @JsonProperty("speakerName")
  private String speakerName = null;

  @JsonProperty("speakerRole")
  private String speakerRole = null;

  @JsonProperty("ignore")
  private Boolean ignore = null;

  public VbChannelConfiguration speakerName(String speakerName) {
    this.speakerName = speakerName;
    return this;
  }

   /**
   * Speaker name on this channel. Defaults to \"SpeakerN\" where N is the channel number.
   * @return speakerName
  **/
  @ApiModelProperty(example = "null", value = "Speaker name on this channel. Defaults to \"SpeakerN\" where N is the channel number.")
  public String getSpeakerName() {
    return speakerName;
  }

  public void setSpeakerName(String speakerName) {
    this.speakerName = speakerName;
  }

  public VbChannelConfiguration speakerRole(String speakerRole) {
    this.speakerRole = speakerRole;
    return this;
  }

   /**
   * A description of the speaker role. Only used as metadata.
   * @return speakerRole
  **/
  @ApiModelProperty(example = "null", value = "A description of the speaker role. Only used as metadata.")
  public String getSpeakerRole() {
    return speakerRole;
  }

  public void setSpeakerRole(String speakerRole) {
    this.speakerRole = speakerRole;
  }

  public VbChannelConfiguration ignore(Boolean ignore) {
    this.ignore = ignore;
    return this;
  }

   /**
   * Whether this channel should be ignored for all processing.
   * @return ignore
  **/
  @ApiModelProperty(example = "null", value = "Whether this channel should be ignored for all processing.")
  public Boolean getIgnore() {
    return ignore;
  }

  public void setIgnore(Boolean ignore) {
    this.ignore = ignore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbChannelConfiguration vbChannelConfiguration = (VbChannelConfiguration) o;
    return Objects.equals(this.speakerName, vbChannelConfiguration.speakerName) &&
        Objects.equals(this.speakerRole, vbChannelConfiguration.speakerRole) &&
        Objects.equals(this.ignore, vbChannelConfiguration.ignore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakerName, speakerRole, ignore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbChannelConfiguration {\n");
    
    sb.append("    speakerName: ").append(toIndentedString(speakerName)).append("\n");
    sb.append("    speakerRole: ").append(toIndentedString(speakerRole)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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

