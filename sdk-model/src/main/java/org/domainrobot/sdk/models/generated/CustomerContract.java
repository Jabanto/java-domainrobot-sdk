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

import org.domainrobot.sdk.models.generated.GenericLabelEntity;

import javax.validation.Valid;

/**
 * CustomerContract
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class CustomerContract {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("contract")
  private GenericLabelEntity contract = null;

  @JsonProperty("notice")
  private String notice = null;

  @JsonProperty("ticketNumber")
  private String ticketNumber = null;

  public CustomerContract created(Date created) {
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

  public CustomerContract updated(Date updated) {
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

  public CustomerContract contract(GenericLabelEntity contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The contract.
   * @return contract
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The contract.")
  public GenericLabelEntity getContract() {
    return contract;
  }

  public void setContract(GenericLabelEntity contract) {
    this.contract = contract;
  }

  public CustomerContract notice(String notice) {
    this.notice = notice;
    return this;
  }

   /**
   * The notices.
   * @return notice
  **/
  @ApiModelProperty(value = "The notices.")
  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }

  public CustomerContract ticketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
    return this;
  }

   /**
   * The ticketing number if available.
   * @return ticketNumber
  **/
  @ApiModelProperty(value = "The ticketing number if available.")
  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContract customerContract = (CustomerContract) o;
    return Objects.equals(this.created, customerContract.created) &&
        Objects.equals(this.updated, customerContract.updated) &&
        Objects.equals(this.contract, customerContract.contract) &&
        Objects.equals(this.notice, customerContract.notice) &&
        Objects.equals(this.ticketNumber, customerContract.ticketNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, contract, notice, ticketNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContract {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
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

