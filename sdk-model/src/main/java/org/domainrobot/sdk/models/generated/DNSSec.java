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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DNSSec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class DNSSec {
  @JsonProperty("algorithm")
  private Integer algorithm = null;

  @JsonProperty("flags")
  private Integer flags = null;

  @JsonProperty("protocol")
  private Integer protocol = null;

  @JsonProperty("publicKey")
  private String publicKey = null;

  public DNSSec algorithm(Integer algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * The algorithm.
   * @return algorithm
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The algorithm.")
  public Integer getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(Integer algorithm) {
    this.algorithm = algorithm;
  }

  public DNSSec flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * The flags.
   * minimum: 256
   * maximum: 257
   * @return flags
  **/
  @NotNull
 @Min(256) @Max(257)  @ApiModelProperty(required = true, value = "The flags.")
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  public DNSSec protocol(Integer protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol.
   * @return protocol
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The protocol.")
  public Integer getProtocol() {
    return protocol;
  }

  public void setProtocol(Integer protocol) {
    this.protocol = protocol;
  }

  public DNSSec publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The public key.
   * @return publicKey
  **/
  @NotNull
 @Pattern(regexp="^[\\sA-Za-z0-9+/]+[=]*$")  @ApiModelProperty(required = true, value = "The public key.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSSec dnSSec = (DNSSec) o;
    return Objects.equals(this.algorithm, dnSSec.algorithm) &&
        Objects.equals(this.flags, dnSSec.flags) &&
        Objects.equals(this.protocol, dnSSec.protocol) &&
        Objects.equals(this.publicKey, dnSSec.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, flags, protocol, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSSec {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
