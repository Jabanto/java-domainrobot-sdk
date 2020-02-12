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
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import org.domainrobot.sdk.models.generated.InetAddress;
import org.domainrobot.sdk.models.generated.SEPAMandate;

import javax.validation.Valid;

/**
 * SEPAMandate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class SEPAMandate {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("confirmSignature")
  private Date confirmSignature = null;

  @JsonProperty("confirmIp")
  private InetAddress confirmIp = null;

  @JsonProperty("confirmUseragent")
  private String confirmUseragent = null;

  @JsonProperty("confirmChecked")
  private Boolean confirmChecked = null;

  @JsonProperty("expire")
  private Date expire = null;

  @JsonProperty("histories")
  private List<SEPAMandate> histories = null;

  @JsonProperty("accountHolder")
  private String accountHolder = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("bic")
  private String bic = null;

  public SEPAMandate created(Date created) {
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

  public SEPAMandate updated(Date updated) {
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

  public SEPAMandate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The sepa mandate reference
   * @return reference
  **/
  @ApiModelProperty(value = "The sepa mandate reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public SEPAMandate confirmSignature(Date confirmSignature) {
    this.confirmSignature = confirmSignature;
    return this;
  }

   /**
   * The date of the confirm signature
   * @return confirmSignature
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The date of the confirm signature")
  public Date getConfirmSignature() {
    return confirmSignature;
  }

  public void setConfirmSignature(Date confirmSignature) {
    this.confirmSignature = confirmSignature;
  }

  public SEPAMandate confirmIp(InetAddress confirmIp) {
    this.confirmIp = confirmIp;
    return this;
  }

   /**
   * The address of the confirm signature
   * @return confirmIp
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The address of the confirm signature")
  public InetAddress getConfirmIp() {
    return confirmIp;
  }

  public void setConfirmIp(InetAddress confirmIp) {
    this.confirmIp = confirmIp;
  }

  public SEPAMandate confirmUseragent(String confirmUseragent) {
    this.confirmUseragent = confirmUseragent;
    return this;
  }

   /**
   * The user agent of the confirm signature
   * @return confirmUseragent
  **/
  @ApiModelProperty(value = "The user agent of the confirm signature")
  public String getConfirmUseragent() {
    return confirmUseragent;
  }

  public void setConfirmUseragent(String confirmUseragent) {
    this.confirmUseragent = confirmUseragent;
  }

  public SEPAMandate confirmChecked(Boolean confirmChecked) {
    this.confirmChecked = confirmChecked;
    return this;
  }

   /**
   * Flag for indicating if the confirm data has been checked
   * @return confirmChecked
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Flag for indicating if the confirm data has been checked")
  public Boolean isConfirmChecked() {
    return confirmChecked;
  }

  public void setConfirmChecked(Boolean confirmChecked) {
    this.confirmChecked = confirmChecked;
  }

  public SEPAMandate expire(Date expire) {
    this.expire = expire;
    return this;
  }

   /**
   * Date after the mandate will be expired
   * @return expire
  **/
  @Valid
  @ApiModelProperty(value = "Date after the mandate will be expired")
  public Date getExpire() {
    return expire;
  }

  public void setExpire(Date expire) {
    this.expire = expire;
  }

  public SEPAMandate histories(List<SEPAMandate> histories) {
    this.histories = histories;
    return this;
  }

  public SEPAMandate addHistoriesItem(SEPAMandate historiesItem) {
    if (this.histories == null) {
      this.histories = new ArrayList<SEPAMandate>();
    }
    this.histories.add(historiesItem);
    return this;
  }

   /**
   * A list of historized sepa mandates
   * @return histories
  **/
  @Valid
  @ApiModelProperty(value = "A list of historized sepa mandates")
  public List<SEPAMandate> getHistories() {
    return histories;
  }

  public void setHistories(List<SEPAMandate> histories) {
    this.histories = histories;
  }

  public SEPAMandate accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * The holder of the bank account
   * @return accountHolder
  **/
  @ApiModelProperty(value = "The holder of the bank account")
  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public SEPAMandate iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * The bank iban
   * @return iban
  **/
  @ApiModelProperty(value = "The bank iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public SEPAMandate bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The bank bic
   * @return bic
  **/
  @ApiModelProperty(value = "The bank bic")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEPAMandate sePAMandate = (SEPAMandate) o;
    return Objects.equals(this.created, sePAMandate.created) &&
        Objects.equals(this.updated, sePAMandate.updated) &&
        Objects.equals(this.reference, sePAMandate.reference) &&
        Objects.equals(this.confirmSignature, sePAMandate.confirmSignature) &&
        Objects.equals(this.confirmIp, sePAMandate.confirmIp) &&
        Objects.equals(this.confirmUseragent, sePAMandate.confirmUseragent) &&
        Objects.equals(this.confirmChecked, sePAMandate.confirmChecked) &&
        Objects.equals(this.expire, sePAMandate.expire) &&
        Objects.equals(this.histories, sePAMandate.histories) &&
        Objects.equals(this.accountHolder, sePAMandate.accountHolder) &&
        Objects.equals(this.iban, sePAMandate.iban) &&
        Objects.equals(this.bic, sePAMandate.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, reference, confirmSignature, confirmIp, confirmUseragent, confirmChecked, expire, histories, accountHolder, iban, bic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEPAMandate {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    confirmSignature: ").append(toIndentedString(confirmSignature)).append("\n");
    sb.append("    confirmIp: ").append(toIndentedString(confirmIp)).append("\n");
    sb.append("    confirmUseragent: ").append(toIndentedString(confirmUseragent)).append("\n");
    sb.append("    confirmChecked: ").append(toIndentedString(confirmChecked)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

