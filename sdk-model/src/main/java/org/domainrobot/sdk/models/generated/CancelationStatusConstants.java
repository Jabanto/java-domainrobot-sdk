/*
 * Domainrobot JSON API
 * Domainrobot JSON API for managing: Domains, SSL            Certificates, DNS and            much more.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.domainrobot.sdk.models.generated;

import java.util.Objects;
import java.util.Arrays;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CancelationStatusConstants
 */
public enum CancelationStatusConstants {
  
  DELETE("DELETE"),
  
  DELETE_EXPIRE("DELETE_EXPIRE"),
  
  TRANSIT("TRANSIT"),
  
  TRANSIT_EXPIRE("TRANSIT_EXPIRE"),
  
  PREACK("PREACK"),
  
  PREACK_EXPIRE("PREACK_EXPIRE");

  private String value;

  CancelationStatusConstants(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CancelationStatusConstants fromValue(String text) {
    for (CancelationStatusConstants b : CancelationStatusConstants.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

