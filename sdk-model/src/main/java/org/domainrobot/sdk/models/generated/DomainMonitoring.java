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
import org.domainrobot.sdk.models.generated.DomainMonitoringSetup;
import org.domainrobot.sdk.models.generated.Phone;

import javax.validation.Valid;

/**
 * DomainMonitoring
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class DomainMonitoring {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("notificationMobiles")
  private List<Phone> notificationMobiles = null;

  @JsonProperty("ocval")
  private Boolean ocval = null;

  @JsonProperty("cancelation")
  private Boolean cancelation = null;

  @JsonProperty("removed")
  private Boolean removed = null;

  @JsonProperty("monitoringSetups")
  private List<DomainMonitoringSetup> monitoringSetups = null;

  @JsonProperty("notificationEmails")
  private List<String> notificationEmails = null;

  public DomainMonitoring created(Date created) {
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

  public DomainMonitoring updated(Date updated) {
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

  public DomainMonitoring owner(BasicUser owner) {
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

  public DomainMonitoring updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The updating user of the object.
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The updating user of the object.")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public DomainMonitoring name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the domain.
   * @return name
  **/
  @NotNull
  @ApiModelProperty(example = "domain.de", required = true, value = "The name of the domain.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomainMonitoring idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * The idn version of the domain.
   * @return idn
  **/
  @ApiModelProperty(value = "The idn version of the domain.")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public DomainMonitoring notificationMobiles(List<Phone> notificationMobiles) {
    this.notificationMobiles = notificationMobiles;
    return this;
  }

  public DomainMonitoring addNotificationMobilesItem(Phone notificationMobilesItem) {
    if (this.notificationMobiles == null) {
      this.notificationMobiles = new ArrayList<Phone>();
    }
    this.notificationMobiles.add(notificationMobilesItem);
    return this;
  }

   /**
   * The notification mobile phone numbers.
   * @return notificationMobiles
  **/
  @Valid
  @ApiModelProperty(value = "The notification mobile phone numbers.")
  public List<Phone> getNotificationMobiles() {
    return notificationMobiles;
  }

  public void setNotificationMobiles(List<Phone> notificationMobiles) {
    this.notificationMobiles = notificationMobiles;
  }

  public DomainMonitoring ocval(Boolean ocval) {
    this.ocval = ocval;
    return this;
  }

   /**
   * The ocval
   * @return ocval
  **/
  @ApiModelProperty(value = "The ocval")
  public Boolean isOcval() {
    return ocval;
  }

  public void setOcval(Boolean ocval) {
    this.ocval = ocval;
  }

  public DomainMonitoring cancelation(Boolean cancelation) {
    this.cancelation = cancelation;
    return this;
  }

   /**
   * The cancelation
   * @return cancelation
  **/
  @ApiModelProperty(value = "The cancelation")
  public Boolean isCancelation() {
    return cancelation;
  }

  public void setCancelation(Boolean cancelation) {
    this.cancelation = cancelation;
  }

  public DomainMonitoring removed(Boolean removed) {
    this.removed = removed;
    return this;
  }

   /**
   * The removed
   * @return removed
  **/
  @ApiModelProperty(value = "The removed")
  public Boolean isRemoved() {
    return removed;
  }

  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }

  public DomainMonitoring monitoringSetups(List<DomainMonitoringSetup> monitoringSetups) {
    this.monitoringSetups = monitoringSetups;
    return this;
  }

  public DomainMonitoring addMonitoringSetupsItem(DomainMonitoringSetup monitoringSetupsItem) {
    if (this.monitoringSetups == null) {
      this.monitoringSetups = new ArrayList<DomainMonitoringSetup>();
    }
    this.monitoringSetups.add(monitoringSetupsItem);
    return this;
  }

   /**
   * The monitoringSetups
   * @return monitoringSetups
  **/
  @Valid
  @ApiModelProperty(value = "The monitoringSetups")
  public List<DomainMonitoringSetup> getMonitoringSetups() {
    return monitoringSetups;
  }

  public void setMonitoringSetups(List<DomainMonitoringSetup> monitoringSetups) {
    this.monitoringSetups = monitoringSetups;
  }

  public DomainMonitoring notificationEmails(List<String> notificationEmails) {
    this.notificationEmails = notificationEmails;
    return this;
  }

  public DomainMonitoring addNotificationEmailsItem(String notificationEmailsItem) {
    if (this.notificationEmails == null) {
      this.notificationEmails = new ArrayList<String>();
    }
    this.notificationEmails.add(notificationEmailsItem);
    return this;
  }

   /**
   * The notification email-addresses.
   * @return notificationEmails
  **/
 @Size(min=1,max=2147483647)  @ApiModelProperty(value = "The notification email-addresses.")
  public List<String> getNotificationEmails() {
    return notificationEmails;
  }

  public void setNotificationEmails(List<String> notificationEmails) {
    this.notificationEmails = notificationEmails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainMonitoring domainMonitoring = (DomainMonitoring) o;
    return Objects.equals(this.created, domainMonitoring.created) &&
        Objects.equals(this.updated, domainMonitoring.updated) &&
        Objects.equals(this.owner, domainMonitoring.owner) &&
        Objects.equals(this.updater, domainMonitoring.updater) &&
        Objects.equals(this.name, domainMonitoring.name) &&
        Objects.equals(this.idn, domainMonitoring.idn) &&
        Objects.equals(this.notificationMobiles, domainMonitoring.notificationMobiles) &&
        Objects.equals(this.ocval, domainMonitoring.ocval) &&
        Objects.equals(this.cancelation, domainMonitoring.cancelation) &&
        Objects.equals(this.removed, domainMonitoring.removed) &&
        Objects.equals(this.monitoringSetups, domainMonitoring.monitoringSetups) &&
        Objects.equals(this.notificationEmails, domainMonitoring.notificationEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, owner, updater, name, idn, notificationMobiles, ocval, cancelation, removed, monitoringSetups, notificationEmails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainMonitoring {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    notificationMobiles: ").append(toIndentedString(notificationMobiles)).append("\n");
    sb.append("    ocval: ").append(toIndentedString(ocval)).append("\n");
    sb.append("    cancelation: ").append(toIndentedString(cancelation)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    monitoringSetups: ").append(toIndentedString(monitoringSetups)).append("\n");
    sb.append("    notificationEmails: ").append(toIndentedString(notificationEmails)).append("\n");
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
