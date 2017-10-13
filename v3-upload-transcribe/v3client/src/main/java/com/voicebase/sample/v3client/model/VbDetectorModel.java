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
import com.voicebase.sample.v3client.model.VbClass;
import com.voicebase.sample.v3client.model.VbParameterDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbDetectorModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbDetectorModel {
  @JsonProperty("detectorId")
  private String detectorId = null;

  @JsonProperty("detectorName")
  private String detectorName = null;

  @JsonProperty("detectorVersion")
  private String detectorVersion = null;

  @JsonProperty("detectorDescription")
  private String detectorDescription = null;

  @JsonProperty("detectorType")
  private String detectorType = null;

  @JsonProperty("classes")
  private java.util.List<VbClass> classes = new java.util.ArrayList<VbClass>();

  @JsonProperty("parameters")
  private java.util.List<VbParameterDefinition> parameters = new java.util.ArrayList<VbParameterDefinition>();

  public VbDetectorModel detectorId(String detectorId) {
    this.detectorId = detectorId;
    return this;
  }

   /**
   * Get detectorId
   * @return detectorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDetectorId() {
    return detectorId;
  }

  public void setDetectorId(String detectorId) {
    this.detectorId = detectorId;
  }

  public VbDetectorModel detectorName(String detectorName) {
    this.detectorName = detectorName;
    return this;
  }

   /**
   * Use this detector name when refering to this detector in a configuration for media processing
   * @return detectorName
  **/
  @ApiModelProperty(example = "null", value = "Use this detector name when refering to this detector in a configuration for media processing")
  public String getDetectorName() {
    return detectorName;
  }

  public void setDetectorName(String detectorName) {
    this.detectorName = detectorName;
  }

  public VbDetectorModel detectorVersion(String detectorVersion) {
    this.detectorVersion = detectorVersion;
    return this;
  }

   /**
   * Use this version in conjuction with the detector name for referring to this detector in a configuration provided with the media for processing
   * @return detectorVersion
  **/
  @ApiModelProperty(example = "null", value = "Use this version in conjuction with the detector name for referring to this detector in a configuration provided with the media for processing")
  public String getDetectorVersion() {
    return detectorVersion;
  }

  public void setDetectorVersion(String detectorVersion) {
    this.detectorVersion = detectorVersion;
  }

  public VbDetectorModel detectorDescription(String detectorDescription) {
    this.detectorDescription = detectorDescription;
    return this;
  }

   /**
   * Describes the function of this detector and its restrictions
   * @return detectorDescription
  **/
  @ApiModelProperty(example = "null", value = "Describes the function of this detector and its restrictions")
  public String getDetectorDescription() {
    return detectorDescription;
  }

  public void setDetectorDescription(String detectorDescription) {
    this.detectorDescription = detectorDescription;
  }

  public VbDetectorModel detectorType(String detectorType) {
    this.detectorType = detectorType;
    return this;
  }

   /**
   * Detector type, one of ( 'binary', 'multiclass').  Binary detectors only report positive cases.
   * @return detectorType
  **/
  @ApiModelProperty(example = "null", value = "Detector type, one of ( 'binary', 'multiclass').  Binary detectors only report positive cases.")
  public String getDetectorType() {
    return detectorType;
  }

  public void setDetectorType(String detectorType) {
    this.detectorType = detectorType;
  }

  public VbDetectorModel classes(java.util.List<VbClass> classes) {
    this.classes = classes;
    return this;
  }

  public VbDetectorModel addClassesItem(VbClass classesItem) {
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Set of possible classes for segments identified by this detector
   * @return classes
  **/
  @ApiModelProperty(example = "null", value = "Set of possible classes for segments identified by this detector")
  public java.util.List<VbClass> getClasses() {
    return classes;
  }

  public void setClasses(java.util.List<VbClass> classes) {
    this.classes = classes;
  }

  public VbDetectorModel parameters(java.util.List<VbParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VbDetectorModel addParametersItem(VbParameterDefinition parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Set of possible parameters for this detector
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "Set of possible parameters for this detector")
  public java.util.List<VbParameterDefinition> getParameters() {
    return parameters;
  }

  public void setParameters(java.util.List<VbParameterDefinition> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbDetectorModel vbDetectorModel = (VbDetectorModel) o;
    return Objects.equals(this.detectorId, vbDetectorModel.detectorId) &&
        Objects.equals(this.detectorName, vbDetectorModel.detectorName) &&
        Objects.equals(this.detectorVersion, vbDetectorModel.detectorVersion) &&
        Objects.equals(this.detectorDescription, vbDetectorModel.detectorDescription) &&
        Objects.equals(this.detectorType, vbDetectorModel.detectorType) &&
        Objects.equals(this.classes, vbDetectorModel.classes) &&
        Objects.equals(this.parameters, vbDetectorModel.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectorId, detectorName, detectorVersion, detectorDescription, detectorType, classes, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbDetectorModel {\n");
    
    sb.append("    detectorId: ").append(toIndentedString(detectorId)).append("\n");
    sb.append("    detectorName: ").append(toIndentedString(detectorName)).append("\n");
    sb.append("    detectorVersion: ").append(toIndentedString(detectorVersion)).append("\n");
    sb.append("    detectorDescription: ").append(toIndentedString(detectorDescription)).append("\n");
    sb.append("    detectorType: ").append(toIndentedString(detectorType)).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

