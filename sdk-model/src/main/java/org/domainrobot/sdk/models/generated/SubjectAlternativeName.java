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
 * SubjectAlternativeName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class SubjectAlternativeName {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("approverEmail")
  private String approverEmail = null;

  @JsonProperty("orderId")
  private String orderId = null;

  public SubjectAlternativeName name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the san.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the san.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubjectAlternativeName approverEmail(String approverEmail) {
    this.approverEmail = approverEmail;
    return this;
  }

   /**
   * The approver email of the san.
   * @return approverEmail
  **/
  @ApiModelProperty(value = "The approver email of the san.")
  public String getApproverEmail() {
    return approverEmail;
  }

  public void setApproverEmail(String approverEmail) {
    this.approverEmail = approverEmail;
  }

  public SubjectAlternativeName orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The order id of the san.
   * @return orderId
  **/
  @ApiModelProperty(value = "The order id of the san.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectAlternativeName subjectAlternativeName = (SubjectAlternativeName) o;
    return Objects.equals(this.name, subjectAlternativeName.name) &&
        Objects.equals(this.approverEmail, subjectAlternativeName.approverEmail) &&
        Objects.equals(this.orderId, subjectAlternativeName.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, approverEmail, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectAlternativeName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    approverEmail: ").append(toIndentedString(approverEmail)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
