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
import javax.validation.Valid;

/**
 * NameServer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class NameServer {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ttl")
  private Long ttl = null;

  @JsonProperty("ipAddresses")
  private List<String> ipAddresses = null;

  public NameServer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Host name of the nameserver.
   * @return name
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Host name of the nameserver.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameServer ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * The time to live.
   * @return ttl
  **/
  @ApiModelProperty(value = "The time to live.")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }

  public NameServer ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public NameServer addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * The ip addresses.
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "The ip addresses.")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameServer nameServer = (NameServer) o;
    return Objects.equals(this.name, nameServer.name) &&
        Objects.equals(this.ttl, nameServer.ttl) &&
        Objects.equals(this.ipAddresses, nameServer.ipAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ttl, ipAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameServer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
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
