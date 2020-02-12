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
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PhysicalNameServerGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class PhysicalNameServerGroup {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("articleLabel")
  private String articleLabel = null;

  @JsonProperty("dnssec")
  private Boolean dnssec = null;

  @JsonProperty("statistic")
  private Boolean statistic = null;

  public PhysicalNameServerGroup created(Date created) {
    this.created = created;
    return this;
  }

   /**
   * The created date.
   * @return created
  **/
  @Valid
  @ApiModelProperty(value = "The created date.")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public PhysicalNameServerGroup updated(Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The updated date.
   * @return updated
  **/
  @Valid
  @ApiModelProperty(value = "The updated date.")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public PhysicalNameServerGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The custom label for the group
   * @return name
  **/
  @ApiModelProperty(value = "The custom label for the group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhysicalNameServerGroup articleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
    return this;
  }

   /**
   * The article label of the name server group, will be used for each created zone using these group
   * @return articleLabel
  **/
  @ApiModelProperty(value = "The article label of the name server group, will be used for each created zone using these group")
  public String getArticleLabel() {
    return articleLabel;
  }

  public void setArticleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
  }

  public PhysicalNameServerGroup dnssec(Boolean dnssec) {
    this.dnssec = dnssec;
    return this;
  }

   /**
   * If the group supports dnssec
   * @return dnssec
  **/
  @ApiModelProperty(value = "If the group supports dnssec")
  public Boolean isDnssec() {
    return dnssec;
  }

  public void setDnssec(Boolean dnssec) {
    this.dnssec = dnssec;
  }

  public PhysicalNameServerGroup statistic(Boolean statistic) {
    this.statistic = statistic;
    return this;
  }

   /**
   * If the group contains statistical data for a zone
   * @return statistic
  **/
  @ApiModelProperty(value = "If the group contains statistical data for a zone")
  public Boolean isStatistic() {
    return statistic;
  }

  public void setStatistic(Boolean statistic) {
    this.statistic = statistic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalNameServerGroup physicalNameServerGroup = (PhysicalNameServerGroup) o;
    return Objects.equals(this.created, physicalNameServerGroup.created) &&
        Objects.equals(this.updated, physicalNameServerGroup.updated) &&
        Objects.equals(this.name, physicalNameServerGroup.name) &&
        Objects.equals(this.articleLabel, physicalNameServerGroup.articleLabel) &&
        Objects.equals(this.dnssec, physicalNameServerGroup.dnssec) &&
        Objects.equals(this.statistic, physicalNameServerGroup.statistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, name, articleLabel, dnssec, statistic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalNameServerGroup {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    articleLabel: ").append(toIndentedString(articleLabel)).append("\n");
    sb.append("    dnssec: ").append(toIndentedString(dnssec)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
