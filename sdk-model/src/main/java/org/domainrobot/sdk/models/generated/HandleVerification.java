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

import org.domainrobot.sdk.models.generated.BasicUser;
import org.domainrobot.sdk.models.generated.Contact;
import org.domainrobot.sdk.models.generated.ContactVerificationDomain;
import org.domainrobot.sdk.models.generated.ContactVerificationMessage;
import org.domainrobot.sdk.models.generated.InetAddress;

import javax.validation.Valid;

/**
 * HandleVerification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class HandleVerification {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("messageSend")
  private Date messageSend = null;

  @JsonProperty("confirmed")
  private Date confirmed = null;

  @JsonProperty("confirmIp")
  private InetAddress confirmIp = null;

  @JsonProperty("failed")
  private Date failed = null;

  @JsonProperty("domain")
  private List<ContactVerificationDomain> domain = null;

  @JsonProperty("verificationMail")
  private List<ContactVerificationMessage> verificationMail = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("handle")
  private Contact handle = null;

  public HandleVerification created(Date created) {
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

  public HandleVerification updated(Date updated) {
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

  public HandleVerification owner(BasicUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of the object.
   * @return owner
  **/
  @Valid
  @ApiModelProperty(value = "The owner of the object.")
  public BasicUser getOwner() {
    return owner;
  }

  public void setOwner(BasicUser owner) {
    this.owner = owner;
  }

  public HandleVerification updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The updater of the object.
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The updater of the object.")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public HandleVerification reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * the reference of the Verification
   * @return reference
  **/
  @ApiModelProperty(value = "the reference of the Verification")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public HandleVerification messageSend(Date messageSend) {
    this.messageSend = messageSend;
    return this;
  }

   /**
   * the messageSend date of the Verification
   * @return messageSend
  **/
  @Valid
  @ApiModelProperty(value = "the messageSend date of the Verification")
  public Date getMessageSend() {
    return messageSend;
  }

  public void setMessageSend(Date messageSend) {
    this.messageSend = messageSend;
  }

  public HandleVerification confirmed(Date confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * the confirmed date of the Verification
   * @return confirmed
  **/
  @Valid
  @ApiModelProperty(value = "the confirmed date of the Verification")
  public Date getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Date confirmed) {
    this.confirmed = confirmed;
  }

  public HandleVerification confirmIp(InetAddress confirmIp) {
    this.confirmIp = confirmIp;
    return this;
  }

   /**
   * the confirmIp of the Verification
   * @return confirmIp
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "the confirmIp of the Verification")
  public InetAddress getConfirmIp() {
    return confirmIp;
  }

  public void setConfirmIp(InetAddress confirmIp) {
    this.confirmIp = confirmIp;
  }

  public HandleVerification failed(Date failed) {
    this.failed = failed;
    return this;
  }

   /**
   * the failed date of the Verification
   * @return failed
  **/
  @Valid
  @ApiModelProperty(value = "the failed date of the Verification")
  public Date getFailed() {
    return failed;
  }

  public void setFailed(Date failed) {
    this.failed = failed;
  }

  public HandleVerification domain(List<ContactVerificationDomain> domain) {
    this.domain = domain;
    return this;
  }

  public HandleVerification addDomainItem(ContactVerificationDomain domainItem) {
    if (this.domain == null) {
      this.domain = new ArrayList<ContactVerificationDomain>();
    }
    this.domain.add(domainItem);
    return this;
  }

   /**
   * the domains of the Verification
   * @return domain
  **/
  @Valid
  @ApiModelProperty(value = "the domains of the Verification")
  public List<ContactVerificationDomain> getDomain() {
    return domain;
  }

  public void setDomain(List<ContactVerificationDomain> domain) {
    this.domain = domain;
  }

  public HandleVerification verificationMail(List<ContactVerificationMessage> verificationMail) {
    this.verificationMail = verificationMail;
    return this;
  }

  public HandleVerification addVerificationMailItem(ContactVerificationMessage verificationMailItem) {
    if (this.verificationMail == null) {
      this.verificationMail = new ArrayList<ContactVerificationMessage>();
    }
    this.verificationMail.add(verificationMailItem);
    return this;
  }

   /**
   * the messages of the Verification
   * @return verificationMail
  **/
  @Valid
  @ApiModelProperty(value = "the messages of the Verification")
  public List<ContactVerificationMessage> getVerificationMail() {
    return verificationMail;
  }

  public void setVerificationMail(List<ContactVerificationMessage> verificationMail) {
    this.verificationMail = verificationMail;
  }

  public HandleVerification comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * the comment of the Verification
   * @return comment
  **/
  @ApiModelProperty(value = "the comment of the Verification")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public HandleVerification action(String action) {
    this.action = action;
    return this;
  }

   /**
   * the action of the Verification
   * @return action
  **/
  @ApiModelProperty(value = "the action of the Verification")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public HandleVerification handle(Contact handle) {
    this.handle = handle;
    return this;
  }

   /**
   * the contact of the Verification
   * @return handle
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "the contact of the Verification")
  public Contact getHandle() {
    return handle;
  }

  public void setHandle(Contact handle) {
    this.handle = handle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandleVerification handleVerification = (HandleVerification) o;
    return Objects.equals(this.created, handleVerification.created) &&
        Objects.equals(this.updated, handleVerification.updated) &&
        Objects.equals(this.owner, handleVerification.owner) &&
        Objects.equals(this.updater, handleVerification.updater) &&
        Objects.equals(this.reference, handleVerification.reference) &&
        Objects.equals(this.messageSend, handleVerification.messageSend) &&
        Objects.equals(this.confirmed, handleVerification.confirmed) &&
        Objects.equals(this.confirmIp, handleVerification.confirmIp) &&
        Objects.equals(this.failed, handleVerification.failed) &&
        Objects.equals(this.domain, handleVerification.domain) &&
        Objects.equals(this.verificationMail, handleVerification.verificationMail) &&
        Objects.equals(this.comment, handleVerification.comment) &&
        Objects.equals(this.action, handleVerification.action) &&
        Objects.equals(this.handle, handleVerification.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, reference, messageSend, confirmed, confirmIp, failed, domain, verificationMail, comment, action, handle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandleVerification {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    messageSend: ").append(toIndentedString(messageSend)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    confirmIp: ").append(toIndentedString(confirmIp)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    verificationMail: ").append(toIndentedString(verificationMail)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
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
