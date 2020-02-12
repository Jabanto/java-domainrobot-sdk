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

import org.domainrobot.sdk.models.generated.DomainStudioSources;

import javax.validation.Valid;

/**
 * DomainEnvelopeSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class DomainEnvelopeSearchRequest {
  @JsonProperty("searchToken")
  private String searchToken = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("debug")
  private Boolean debug = null;

  @JsonProperty("checkPortfolio")
  private Boolean checkPortfolio = null;

  @JsonProperty("sources")
  private DomainStudioSources sources = null;

  @JsonProperty("clientIp")
  private String clientIp = null;

  public DomainEnvelopeSearchRequest searchToken(String searchToken) {
    this.searchToken = searchToken;
    return this;
  }

   /**
   * Domain search token
   * @return searchToken
  **/
  @ApiModelProperty(value = "Domain search token")
  public String getSearchToken() {
    return searchToken;
  }

  public void setSearchToken(String searchToken) {
    this.searchToken = searchToken;
  }

  public DomainEnvelopeSearchRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency for every price lookup
   * @return currency
  **/
  @ApiModelProperty(value = "The currency for every price lookup")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DomainEnvelopeSearchRequest debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Activates debugging
   * @return debug
  **/
  @ApiModelProperty(value = "Activates debugging")
  public Boolean isDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public DomainEnvelopeSearchRequest checkPortfolio(Boolean checkPortfolio) {
    this.checkPortfolio = checkPortfolio;
    return this;
  }

   /**
   * Activates the check for each domain whether the user already owns it.
   * @return checkPortfolio
  **/
  @ApiModelProperty(value = "Activates the check for each domain whether the user already owns it.")
  public Boolean isCheckPortfolio() {
    return checkPortfolio;
  }

  public void setCheckPortfolio(Boolean checkPortfolio) {
    this.checkPortfolio = checkPortfolio;
  }

  public DomainEnvelopeSearchRequest sources(DomainStudioSources sources) {
    this.sources = sources;
    return this;
  }

   /**
   * Wrapper for the configuration for each source
   * @return sources
  **/
  @Valid
  @ApiModelProperty(value = "Wrapper for the configuration for each source")
  public DomainStudioSources getSources() {
    return sources;
  }

  public void setSources(DomainStudioSources sources) {
    this.sources = sources;
  }

  public DomainEnvelopeSearchRequest clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * The ip of the client
   * @return clientIp
  **/
  @ApiModelProperty(value = "The ip of the client")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEnvelopeSearchRequest domainEnvelopeSearchRequest = (DomainEnvelopeSearchRequest) o;
    return Objects.equals(this.searchToken, domainEnvelopeSearchRequest.searchToken) &&
        Objects.equals(this.currency, domainEnvelopeSearchRequest.currency) &&
        Objects.equals(this.debug, domainEnvelopeSearchRequest.debug) &&
        Objects.equals(this.checkPortfolio, domainEnvelopeSearchRequest.checkPortfolio) &&
        Objects.equals(this.sources, domainEnvelopeSearchRequest.sources) &&
        Objects.equals(this.clientIp, domainEnvelopeSearchRequest.clientIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchToken, currency, debug, checkPortfolio, sources, clientIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEnvelopeSearchRequest {\n");
    
    sb.append("    searchToken: ").append(toIndentedString(searchToken)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    checkPortfolio: ").append(toIndentedString(checkPortfolio)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
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
