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
import com.voicebase.sample.v3client.model.VbClass;
import com.voicebase.sample.v3client.model.VbParameterDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbClassifierModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbClassifierModel {
  @JsonProperty("classifierId")
  private String classifierId = null;

  @JsonProperty("classifierName")
  private String classifierName = null;

  @JsonProperty("classifierVersion")
  private String classifierVersion = null;

  @JsonProperty("classifierDescription")
  private String classifierDescription = null;

  @JsonProperty("classifierType")
  private String classifierType = null;

  @JsonProperty("classes")
  private java.util.List<VbClass> classes = new java.util.ArrayList<VbClass>();

  @JsonProperty("parameters")
  private java.util.List<VbParameterDefinition> parameters = new java.util.ArrayList<VbParameterDefinition>();

  public VbClassifierModel classifierId(String classifierId) {
    this.classifierId = classifierId;
    return this;
  }

   /**
   * Get classifierId
   * @return classifierId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassifierId() {
    return classifierId;
  }

  public void setClassifierId(String classifierId) {
    this.classifierId = classifierId;
  }

  public VbClassifierModel classifierName(String classifierName) {
    this.classifierName = classifierName;
    return this;
  }

   /**
   * Use this name for referring to the classifier in a configuration provided with the media for processing
   * @return classifierName
  **/
  @ApiModelProperty(example = "null", value = "Use this name for referring to the classifier in a configuration provided with the media for processing")
  public String getClassifierName() {
    return classifierName;
  }

  public void setClassifierName(String classifierName) {
    this.classifierName = classifierName;
  }

  public VbClassifierModel classifierVersion(String classifierVersion) {
    this.classifierVersion = classifierVersion;
    return this;
  }

   /**
   * Use this version in conjuction with the classifier name for referring to this classifier in a configuration provided with the media for processing
   * @return classifierVersion
  **/
  @ApiModelProperty(example = "null", value = "Use this version in conjuction with the classifier name for referring to this classifier in a configuration provided with the media for processing")
  public String getClassifierVersion() {
    return classifierVersion;
  }

  public void setClassifierVersion(String classifierVersion) {
    this.classifierVersion = classifierVersion;
  }

  public VbClassifierModel classifierDescription(String classifierDescription) {
    this.classifierDescription = classifierDescription;
    return this;
  }

   /**
   * Get classifierDescription
   * @return classifierDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassifierDescription() {
    return classifierDescription;
  }

  public void setClassifierDescription(String classifierDescription) {
    this.classifierDescription = classifierDescription;
  }

  public VbClassifierModel classifierType(String classifierType) {
    this.classifierType = classifierType;
    return this;
  }

   /**
   * Get classifierType
   * @return classifierType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClassifierType() {
    return classifierType;
  }

  public void setClassifierType(String classifierType) {
    this.classifierType = classifierType;
  }

  public VbClassifierModel classes(java.util.List<VbClass> classes) {
    this.classes = classes;
    return this;
  }

  public VbClassifierModel addClassesItem(VbClass classesItem) {
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Set of possible classes identified by the classifier
   * @return classes
  **/
  @ApiModelProperty(example = "null", value = "Set of possible classes identified by the classifier")
  public java.util.List<VbClass> getClasses() {
    return classes;
  }

  public void setClasses(java.util.List<VbClass> classes) {
    this.classes = classes;
  }

  public VbClassifierModel parameters(java.util.List<VbParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VbClassifierModel addParametersItem(VbParameterDefinition parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Set of possible parameters for this classifier
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "Set of possible parameters for this classifier")
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
    VbClassifierModel vbClassifierModel = (VbClassifierModel) o;
    return Objects.equals(this.classifierId, vbClassifierModel.classifierId) &&
        Objects.equals(this.classifierName, vbClassifierModel.classifierName) &&
        Objects.equals(this.classifierVersion, vbClassifierModel.classifierVersion) &&
        Objects.equals(this.classifierDescription, vbClassifierModel.classifierDescription) &&
        Objects.equals(this.classifierType, vbClassifierModel.classifierType) &&
        Objects.equals(this.classes, vbClassifierModel.classes) &&
        Objects.equals(this.parameters, vbClassifierModel.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierId, classifierName, classifierVersion, classifierDescription, classifierType, classes, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbClassifierModel {\n");
    
    sb.append("    classifierId: ").append(toIndentedString(classifierId)).append("\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    classifierVersion: ").append(toIndentedString(classifierVersion)).append("\n");
    sb.append("    classifierDescription: ").append(toIndentedString(classifierDescription)).append("\n");
    sb.append("    classifierType: ").append(toIndentedString(classifierType)).append("\n");
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
