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

import org.domainrobot.sdk.models.generated.Domain;

import javax.validation.Valid;

/**
 * BulkDomainPostRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class BulkDomainPostRequest {
  @JsonProperty("objects")
  private List<Domain> objects = null;

  @JsonProperty("template")
  private Domain template = null;

  public BulkDomainPostRequest objects(List<Domain> objects) {
    this.objects = objects;
    return this;
  }

  public BulkDomainPostRequest addObjectsItem(Domain objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<Domain>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * The objects to process
   * @return objects
  **/
  @Valid
  @ApiModelProperty(value = "The objects to process")
  public List<Domain> getObjects() {
    return objects;
  }

  public void setObjects(List<Domain> objects) {
    this.objects = objects;
  }

  public BulkDomainPostRequest template(Domain template) {
    this.template = template;
    return this;
  }

   /**
   * The template for objects to process
   * @return template
  **/
  @Valid
  @ApiModelProperty(value = "The template for objects to process")
  public Domain getTemplate() {
    return template;
  }

  public void setTemplate(Domain template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDomainPostRequest bulkDomainPostRequest = (BulkDomainPostRequest) o;
    return Objects.equals(this.objects, bulkDomainPostRequest.objects) &&
        Objects.equals(this.template, bulkDomainPostRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDomainPostRequest {\n");
    
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

