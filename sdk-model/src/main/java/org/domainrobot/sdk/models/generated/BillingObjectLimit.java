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
 * BillingObjectLimit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class BillingObjectLimit {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("articleLabel")
  private String articleLabel = null;

  @JsonProperty("limitSelf")
  private Integer limitSelf = null;

  @JsonProperty("limitChildren")
  private Integer limitChildren = null;

  @JsonProperty("articleTypeLabel")
  private String articleTypeLabel = null;

  @JsonProperty("count")
  private Integer count = null;

  public BillingObjectLimit created(Date created) {
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

  public BillingObjectLimit updated(Date updated) {
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

  public BillingObjectLimit articleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return articleLabel
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public String getArticleLabel() {
    return articleLabel;
  }

  public void setArticleLabel(String articleLabel) {
    this.articleLabel = articleLabel;
  }

  public BillingObjectLimit limitSelf(Integer limitSelf) {
    this.limitSelf = limitSelf;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return limitSelf
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Integer getLimitSelf() {
    return limitSelf;
  }

  public void setLimitSelf(Integer limitSelf) {
    this.limitSelf = limitSelf;
  }

  public BillingObjectLimit limitChildren(Integer limitChildren) {
    this.limitChildren = limitChildren;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return limitChildren
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public Integer getLimitChildren() {
    return limitChildren;
  }

  public void setLimitChildren(Integer limitChildren) {
    this.limitChildren = limitChildren;
  }

  public BillingObjectLimit articleTypeLabel(String articleTypeLabel) {
    this.articleTypeLabel = articleTypeLabel;
    return this;
  }

   /**
   * Lorem Ipsum
   * @return articleTypeLabel
  **/
  @ApiModelProperty(value = "Lorem Ipsum")
  public String getArticleTypeLabel() {
    return articleTypeLabel;
  }

  public void setArticleTypeLabel(String articleTypeLabel) {
    this.articleTypeLabel = articleTypeLabel;
  }

  public BillingObjectLimit count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The current count if available
   * @return count
  **/
  @ApiModelProperty(value = "The current count if available")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingObjectLimit billingObjectLimit = (BillingObjectLimit) o;
    return Objects.equals(this.created, billingObjectLimit.created) &&
        Objects.equals(this.updated, billingObjectLimit.updated) &&
        Objects.equals(this.articleLabel, billingObjectLimit.articleLabel) &&
        Objects.equals(this.limitSelf, billingObjectLimit.limitSelf) &&
        Objects.equals(this.limitChildren, billingObjectLimit.limitChildren) &&
        Objects.equals(this.articleTypeLabel, billingObjectLimit.articleTypeLabel) &&
        Objects.equals(this.count, billingObjectLimit.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, articleLabel, limitSelf, limitChildren, articleTypeLabel, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingObjectLimit {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    articleLabel: ").append(toIndentedString(articleLabel)).append("\n");
    sb.append("    limitSelf: ").append(toIndentedString(limitSelf)).append("\n");
    sb.append("    limitChildren: ").append(toIndentedString(limitChildren)).append("\n");
    sb.append("    articleTypeLabel: ").append(toIndentedString(articleTypeLabel)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

