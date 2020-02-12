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
 * AddressClaim
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class AddressClaim {
  @JsonProperty("formatted")
  private String formatted = null;

  @JsonProperty("street_address")
  private String streetAddress = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("country")
  private String country = null;

  public AddressClaim formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * Full mailing address, formatted for display or use on a mailing label. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\&quot;\\r\\n\&quot;) or as a single line feed character (\&quot;\\n\&quot;)
   * @return formatted
  **/
  @ApiModelProperty(value = "Full mailing address, formatted for display or use on a mailing label. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\")")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public AddressClaim streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Full street address component, which MAY include house number, street name, Post Office Box, and multi-line extended street address information. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\&quot;\\r\\n\&quot;) or as a single line feed character (\&quot;\\n\&quot;)
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Full street address component, which MAY include house number, street name, Post Office Box, and multi-line extended street address information. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\")")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public AddressClaim locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City or locality component
   * @return locality
  **/
  @ApiModelProperty(value = "City or locality component")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public AddressClaim region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State, province, prefecture, or region component
   * @return region
  **/
  @ApiModelProperty(value = "State, province, prefecture, or region component")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AddressClaim postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip code or postal code component
   * @return postalCode
  **/
  @ApiModelProperty(value = "Zip code or postal code component")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressClaim country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country name component
   * @return country
  **/
  @ApiModelProperty(value = "Country name component")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressClaim addressClaim = (AddressClaim) o;
    return Objects.equals(this.formatted, addressClaim.formatted) &&
        Objects.equals(this.streetAddress, addressClaim.streetAddress) &&
        Objects.equals(this.locality, addressClaim.locality) &&
        Objects.equals(this.region, addressClaim.region) &&
        Objects.equals(this.postalCode, addressClaim.postalCode) &&
        Objects.equals(this.country, addressClaim.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted, streetAddress, locality, region, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressClaim {\n");
    
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
