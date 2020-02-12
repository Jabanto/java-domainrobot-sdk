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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ContactAeroExtensions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class ContactAeroExtensions {
  @JsonProperty("ensAuthId")
  private String ensAuthId = null;

  @JsonProperty("ensKey")
  private String ensKey = null;

  public ContactAeroExtensions ensAuthId(String ensAuthId) {
    this.ensAuthId = ensAuthId;
    return this;
  }

   /**
   * Aero Authentication ID.
   * @return ensAuthId
  **/
  @ApiModelProperty(value = "Aero Authentication ID.")
  public String getEnsAuthId() {
    return ensAuthId;
  }

  public void setEnsAuthId(String ensAuthId) {
    this.ensAuthId = ensAuthId;
  }

  public ContactAeroExtensions ensKey(String ensKey) {
    this.ensKey = ensKey;
    return this;
  }

   /**
   * Aero ENS key.
   * @return ensKey
  **/
  @ApiModelProperty(value = "Aero ENS key.")
  public String getEnsKey() {
    return ensKey;
  }

  public void setEnsKey(String ensKey) {
    this.ensKey = ensKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAeroExtensions contactAeroExtensions = (ContactAeroExtensions) o;
    return Objects.equals(this.ensAuthId, contactAeroExtensions.ensAuthId) &&
        Objects.equals(this.ensKey, contactAeroExtensions.ensKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ensAuthId, ensKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAeroExtensions {\n");
    
    sb.append("    ensAuthId: ").append(toIndentedString(ensAuthId)).append("\n");
    sb.append("    ensKey: ").append(toIndentedString(ensKey)).append("\n");
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
