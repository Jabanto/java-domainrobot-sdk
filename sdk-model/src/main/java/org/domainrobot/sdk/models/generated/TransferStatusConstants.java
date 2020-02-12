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
 * Gets or Sets TransferStatusConstants
 */
public enum TransferStatusConstants {
  
  NOT_SET("NOT_SET"),
  
  START("START"),
  
  FAILED("FAILED"),
  
  NACK("NACK"),
  
  ACK("ACK"),
  
  FOA1_SENT("FOA1_SENT"),
  
  AUTOUPDATE_SUCCESS("AUTOUPDATE_SUCCESS"),
  
  AUTOUPDATE_FAILED("AUTOUPDATE_FAILED");

  private String value;

  TransferStatusConstants(String value) {
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
  public static TransferStatusConstants fromValue(String text) {
    for (TransferStatusConstants b : TransferStatusConstants.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

