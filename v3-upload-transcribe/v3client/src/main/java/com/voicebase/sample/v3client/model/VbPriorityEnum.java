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

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets VbPriorityEnum
 */
public enum VbPriorityEnum {
  
  HIGH("high"),
  
  NORMAL("normal"),
  
  LOW("low");

  private String value;

  VbPriorityEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static VbPriorityEnum fromValue(String text) {
    for (VbPriorityEnum b : VbPriorityEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

