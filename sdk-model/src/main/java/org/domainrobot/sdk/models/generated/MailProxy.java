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

import org.domainrobot.sdk.models.generated.BasicUser;
import org.domainrobot.sdk.models.generated.MailList;
import org.domainrobot.sdk.models.generated.ProtectionConstants;
import org.domainrobot.sdk.models.generated.SpamPolicy;

import javax.validation.Valid;

/**
 * MailProxy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class MailProxy {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("updated")
  private Date updated = null;

  @JsonProperty("owner")
  private BasicUser owner = null;

  @JsonProperty("updater")
  private BasicUser updater = null;

  @JsonProperty("target")
  private String target = null;

  @JsonProperty("admin")
  private String admin = null;

  @JsonProperty("protection")
  private ProtectionConstants protection = null;

  @JsonProperty("greylisting")
  private Boolean greylisting = null;

  /**
   * The virus options to use
   */
  public enum VirusEnum {
    DISABLED("DISABLED"),
    
    QUARANTINE("QUARANTINE"),
    
    DISCARD("DISCARD"),
    
    ACCEPT("ACCEPT");

    private String value;

    VirusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VirusEnum fromValue(String text) {
      for (VirusEnum b : VirusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("virus")
  private VirusEnum virus = null;

  /**
   * The banned files options to use
   */
  public enum BannedFilesEnum {
    DISABLED("DISABLED"),
    
    QUARANTINE("QUARANTINE"),
    
    DISCARD("DISCARD"),
    
    ACCEPT("ACCEPT");

    private String value;

    BannedFilesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BannedFilesEnum fromValue(String text) {
      for (BannedFilesEnum b : BannedFilesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("bannedFiles")
  private BannedFilesEnum bannedFiles = null;

  /**
   * The mail header options to use
   */
  public enum HeaderEnum {
    DISABLED("DISABLED"),
    
    QUARANTINE("QUARANTINE"),
    
    DISCARD("DISCARD"),
    
    ACCEPT("ACCEPT");

    private String value;

    HeaderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HeaderEnum fromValue(String text) {
      for (HeaderEnum b : HeaderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("header")
  private HeaderEnum header = null;

  @JsonProperty("spam")
  private SpamPolicy spam = null;

  @JsonProperty("whitelist")
  private MailList whitelist = null;

  @JsonProperty("blacklist")
  private MailList blacklist = null;

  @JsonProperty("excludelist")
  private MailList excludelist = null;

  public MailProxy domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the mail exchange to backup
   * @return domain
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The domain of the mail exchange to backup")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public MailProxy idn(String idn) {
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

  public MailProxy created(Date created) {
    this.created = created;
    return this;
  }

   /**
   * The date of the creation
   * @return created
  **/
  @Valid
  @ApiModelProperty(value = "The date of the creation")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public MailProxy updated(Date updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The date of the last updated
   * @return updated
  **/
  @Valid
  @ApiModelProperty(value = "The date of the last updated")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public MailProxy owner(BasicUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner of the entry
   * @return owner
  **/
  @Valid
  @ApiModelProperty(value = "The owner of the entry")
  public BasicUser getOwner() {
    return owner;
  }

  public void setOwner(BasicUser owner) {
    this.owner = owner;
  }

  public MailProxy updater(BasicUser updater) {
    this.updater = updater;
    return this;
  }

   /**
   * The last updater of the entry
   * @return updater
  **/
  @Valid
  @ApiModelProperty(value = "The last updater of the entry")
  public BasicUser getUpdater() {
    return updater;
  }

  public void setUpdater(BasicUser updater) {
    this.updater = updater;
  }

  public MailProxy target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The hostname of the target mailserver
   * @return target
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The hostname of the target mailserver")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public MailProxy admin(String admin) {
    this.admin = admin;
    return this;
  }

   /**
   * email address of the administrator
   * @return admin
  **/
  @ApiModelProperty(value = "email address of the administrator")
  public String getAdmin() {
    return admin;
  }

  public void setAdmin(String admin) {
    this.admin = admin;
  }

  public MailProxy protection(ProtectionConstants protection) {
    this.protection = protection;
    return this;
  }

   /**
   * The protection level
   * @return protection
  **/
  @Valid
  @ApiModelProperty(value = "The protection level")
  public ProtectionConstants getProtection() {
    return protection;
  }

  public void setProtection(ProtectionConstants protection) {
    this.protection = protection;
  }

  public MailProxy greylisting(Boolean greylisting) {
    this.greylisting = greylisting;
    return this;
  }

   /**
   * The grey listing policy
   * @return greylisting
  **/
  @ApiModelProperty(value = "The grey listing policy")
  public Boolean isGreylisting() {
    return greylisting;
  }

  public void setGreylisting(Boolean greylisting) {
    this.greylisting = greylisting;
  }

  public MailProxy virus(VirusEnum virus) {
    this.virus = virus;
    return this;
  }

   /**
   * The virus options to use
   * @return virus
  **/
  @ApiModelProperty(value = "The virus options to use")
  public VirusEnum getVirus() {
    return virus;
  }

  public void setVirus(VirusEnum virus) {
    this.virus = virus;
  }

  public MailProxy bannedFiles(BannedFilesEnum bannedFiles) {
    this.bannedFiles = bannedFiles;
    return this;
  }

   /**
   * The banned files options to use
   * @return bannedFiles
  **/
  @ApiModelProperty(value = "The banned files options to use")
  public BannedFilesEnum getBannedFiles() {
    return bannedFiles;
  }

  public void setBannedFiles(BannedFilesEnum bannedFiles) {
    this.bannedFiles = bannedFiles;
  }

  public MailProxy header(HeaderEnum header) {
    this.header = header;
    return this;
  }

   /**
   * The mail header options to use
   * @return header
  **/
  @ApiModelProperty(value = "The mail header options to use")
  public HeaderEnum getHeader() {
    return header;
  }

  public void setHeader(HeaderEnum header) {
    this.header = header;
  }

  public MailProxy spam(SpamPolicy spam) {
    this.spam = spam;
    return this;
  }

   /**
   * The spam policy options
   * @return spam
  **/
  @Valid
  @ApiModelProperty(value = "The spam policy options")
  public SpamPolicy getSpam() {
    return spam;
  }

  public void setSpam(SpamPolicy spam) {
    this.spam = spam;
  }

  public MailProxy whitelist(MailList whitelist) {
    this.whitelist = whitelist;
    return this;
  }

   /**
   * The white listed email addresses
   * @return whitelist
  **/
  @Valid
  @ApiModelProperty(value = "The white listed email addresses")
  public MailList getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(MailList whitelist) {
    this.whitelist = whitelist;
  }

  public MailProxy blacklist(MailList blacklist) {
    this.blacklist = blacklist;
    return this;
  }

   /**
   * The black listed email addresses
   * @return blacklist
  **/
  @Valid
  @ApiModelProperty(value = "The black listed email addresses")
  public MailList getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(MailList blacklist) {
    this.blacklist = blacklist;
  }

  public MailProxy excludelist(MailList excludelist) {
    this.excludelist = excludelist;
    return this;
  }

   /**
   * The exculded listed email addresses
   * @return excludelist
  **/
  @Valid
  @ApiModelProperty(value = "The exculded listed email addresses")
  public MailList getExcludelist() {
    return excludelist;
  }

  public void setExcludelist(MailList excludelist) {
    this.excludelist = excludelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailProxy mailProxy = (MailProxy) o;
    return Objects.equals(this.domain, mailProxy.domain) &&
        Objects.equals(this.idn, mailProxy.idn) &&
        Objects.equals(this.created, mailProxy.created) &&
        Objects.equals(this.updated, mailProxy.updated) &&
        Objects.equals(this.owner, mailProxy.owner) &&
        Objects.equals(this.updater, mailProxy.updater) &&
        Objects.equals(this.target, mailProxy.target) &&
        Objects.equals(this.admin, mailProxy.admin) &&
        Objects.equals(this.protection, mailProxy.protection) &&
        Objects.equals(this.greylisting, mailProxy.greylisting) &&
        Objects.equals(this.virus, mailProxy.virus) &&
        Objects.equals(this.bannedFiles, mailProxy.bannedFiles) &&
        Objects.equals(this.header, mailProxy.header) &&
        Objects.equals(this.spam, mailProxy.spam) &&
        Objects.equals(this.whitelist, mailProxy.whitelist) &&
        Objects.equals(this.blacklist, mailProxy.blacklist) &&
        Objects.equals(this.excludelist, mailProxy.excludelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, idn, created, updated, owner, updater, target, admin, protection, greylisting, virus, bannedFiles, header, spam, whitelist, blacklist, excludelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailProxy {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
    sb.append("    greylisting: ").append(toIndentedString(greylisting)).append("\n");
    sb.append("    virus: ").append(toIndentedString(virus)).append("\n");
    sb.append("    bannedFiles: ").append(toIndentedString(bannedFiles)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    excludelist: ").append(toIndentedString(excludelist)).append("\n");
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

