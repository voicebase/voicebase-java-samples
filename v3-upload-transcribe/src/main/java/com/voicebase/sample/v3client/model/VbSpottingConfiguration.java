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
import com.voicebase.sample.v3client.model.VbSpottingGroupConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbSpottingConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbSpottingConfiguration {
  @JsonProperty("groups")
  private java.util.List<VbSpottingGroupConfiguration> groups = new java.util.ArrayList<VbSpottingGroupConfiguration>();

  public VbSpottingConfiguration groups(java.util.List<VbSpottingGroupConfiguration> groups) {
    this.groups = groups;
    return this;
  }

  public VbSpottingConfiguration addGroupsItem(VbSpottingGroupConfiguration groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of keyword spotting groups
   * @return groups
  **/
  @ApiModelProperty(example = "null", value = "List of keyword spotting groups")
  public java.util.List<VbSpottingGroupConfiguration> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<VbSpottingGroupConfiguration> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbSpottingConfiguration vbSpottingConfiguration = (VbSpottingConfiguration) o;
    return Objects.equals(this.groups, vbSpottingConfiguration.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbSpottingConfiguration {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

