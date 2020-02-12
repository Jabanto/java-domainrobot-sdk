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

import org.domainrobot.sdk.models.generated.Query;
import org.domainrobot.sdk.models.generated.Zone;

import javax.validation.Valid;

/**
 * BulkZoneDeleteRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class BulkZoneDeleteRequest {
  @JsonProperty("objects")
  private List<Zone> objects = null;

  @JsonProperty("query")
  private Query query = null;

  public BulkZoneDeleteRequest objects(List<Zone> objects) {
    this.objects = objects;
    return this;
  }

  public BulkZoneDeleteRequest addObjectsItem(Zone objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<Zone>();
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
  public List<Zone> getObjects() {
    return objects;
  }

  public void setObjects(List<Zone> objects) {
    this.objects = objects;
  }

  public BulkZoneDeleteRequest query(Query query) {
    this.query = query;
    return this;
  }

   /**
   * The query to fetch the object instead of defined list
   * @return query
  **/
  @Valid
  @ApiModelProperty(value = "The query to fetch the object instead of defined list")
  public Query getQuery() {
    return query;
  }

  public void setQuery(Query query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkZoneDeleteRequest bulkZoneDeleteRequest = (BulkZoneDeleteRequest) o;
    return Objects.equals(this.objects, bulkZoneDeleteRequest.objects) &&
        Objects.equals(this.query, bulkZoneDeleteRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkZoneDeleteRequest {\n");
    
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

