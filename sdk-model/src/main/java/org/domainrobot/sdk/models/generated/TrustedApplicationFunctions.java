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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TrustedApplicationFunctions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class TrustedApplicationFunctions {
  @JsonProperty("functionCodes")
  private List<String> functionCodes = null;

  public TrustedApplicationFunctions functionCodes(List<String> functionCodes) {
    this.functionCodes = functionCodes;
    return this;
  }

  public TrustedApplicationFunctions addFunctionCodesItem(String functionCodesItem) {
    if (this.functionCodes == null) {
      this.functionCodes = new ArrayList<String>();
    }
    this.functionCodes.add(functionCodesItem);
    return this;
  }

   /**
   * The allowed functions for the trusted application.
   * @return functionCodes
  **/
  @ApiModelProperty(value = "The allowed functions for the trusted application.")
  public List<String> getFunctionCodes() {
    return functionCodes;
  }

  public void setFunctionCodes(List<String> functionCodes) {
    this.functionCodes = functionCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedApplicationFunctions trustedApplicationFunctions = (TrustedApplicationFunctions) o;
    return Objects.equals(this.functionCodes, trustedApplicationFunctions.functionCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedApplicationFunctions {\n");
    
    sb.append("    functionCodes: ").append(toIndentedString(functionCodes)).append("\n");
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
