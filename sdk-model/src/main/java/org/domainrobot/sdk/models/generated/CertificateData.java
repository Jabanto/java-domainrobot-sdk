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

import org.domainrobot.sdk.models.generated.CertAuthentication;
import org.domainrobot.sdk.models.generated.CertificateHistory;
import org.domainrobot.sdk.models.generated.CsrHashAlgorithmConstants;
import org.domainrobot.sdk.models.generated.SignatureHashAlgorithmConstants;

import javax.validation.Valid;

/**
 * CertificateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class CertificateData {
  @JsonProperty("plain")
  private String plain = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("san")
  private List<String> san = null;

  @JsonProperty("histories")
  private List<CertificateHistory> histories = null;

  @JsonProperty("keySize")
  private Integer keySize = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("challengePassword")
  private String challengePassword = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("organizationUnit")
  private String organizationUnit = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("authentication")
  private List<CertAuthentication> authentication = null;

  @JsonProperty("algorithm")
  private CsrHashAlgorithmConstants algorithm = null;

  @JsonProperty("signatureHashAlgorithm")
  private SignatureHashAlgorithmConstants signatureHashAlgorithm = null;

  @JsonProperty("idn")
  private String idn = null;

  @JsonProperty("checkCaa")
  private Boolean checkCaa = null;

  public CertificateData plain(String plain) {
    this.plain = plain;
    return this;
  }

   /**
   * The plain csr.
   * @return plain
  **/
  @ApiModelProperty(value = "The plain csr.")
  public String getPlain() {
    return plain;
  }

  public void setPlain(String plain) {
    this.plain = plain;
  }

  public CertificateData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The common name.
   * @return name
  **/
  @ApiModelProperty(value = "The common name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CertificateData san(List<String> san) {
    this.san = san;
    return this;
  }

  public CertificateData addSanItem(String sanItem) {
    if (this.san == null) {
      this.san = new ArrayList<String>();
    }
    this.san.add(sanItem);
    return this;
  }

   /**
   * The subject alternative names, listed in the csr.
   * @return san
  **/
  @ApiModelProperty(value = "The subject alternative names, listed in the csr.")
  public List<String> getSan() {
    return san;
  }

  public void setSan(List<String> san) {
    this.san = san;
  }

  public CertificateData histories(List<CertificateHistory> histories) {
    this.histories = histories;
    return this;
  }

  public CertificateData addHistoriesItem(CertificateHistory historiesItem) {
    if (this.histories == null) {
      this.histories = new ArrayList<CertificateHistory>();
    }
    this.histories.add(historiesItem);
    return this;
  }

   /**
   * The certificate history.
   * @return histories
  **/
  @Valid
  @ApiModelProperty(value = "The certificate history.")
  public List<CertificateHistory> getHistories() {
    return histories;
  }

  public void setHistories(List<CertificateHistory> histories) {
    this.histories = histories;
  }

  public CertificateData keySize(Integer keySize) {
    this.keySize = keySize;
    return this;
  }

   /**
   * The size of the csr key.
   * @return keySize
  **/
  @ApiModelProperty(value = "The size of the csr key.")
  public Integer getKeySize() {
    return keySize;
  }

  public void setKeySize(Integer keySize) {
    this.keySize = keySize;
  }

  public CertificateData countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code defined in the csr.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country code defined in the csr.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CertificateData challengePassword(String challengePassword) {
    this.challengePassword = challengePassword;
    return this;
  }

   /**
   * The password defined in the csr.
   * @return challengePassword
  **/
  @ApiModelProperty(value = "The password defined in the csr.")
  public String getChallengePassword() {
    return challengePassword;
  }

  public void setChallengePassword(String challengePassword) {
    this.challengePassword = challengePassword;
  }

  public CertificateData state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state defined in the csr.
   * @return state
  **/
  @ApiModelProperty(value = "The state defined in the csr.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CertificateData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city defined in the csr.
   * @return city
  **/
  @ApiModelProperty(value = "The city defined in the csr.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CertificateData organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * The organization defined in the csr.
   * @return organization
  **/
  @ApiModelProperty(value = "The organization defined in the csr.")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public CertificateData organizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
    return this;
  }

   /**
   * The organization unit defined in the csr.
   * @return organizationUnit
  **/
  @ApiModelProperty(value = "The organization unit defined in the csr.")
  public String getOrganizationUnit() {
    return organizationUnit;
  }

  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  public CertificateData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email defined in the csr.
   * @return email
  **/
  @ApiModelProperty(value = "The email defined in the csr.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CertificateData product(String product) {
    this.product = product;
    return this;
  }

   /**
   * The ssl product.
   * @return product
  **/
  @ApiModelProperty(value = "The ssl product.")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public CertificateData authentication(List<CertAuthentication> authentication) {
    this.authentication = authentication;
    return this;
  }

  public CertificateData addAuthenticationItem(CertAuthentication authenticationItem) {
    if (this.authentication == null) {
      this.authentication = new ArrayList<CertAuthentication>();
    }
    this.authentication.add(authenticationItem);
    return this;
  }

   /**
   * The authentication data.
   * @return authentication
  **/
  @Valid
  @ApiModelProperty(value = "The authentication data.")
  public List<CertAuthentication> getAuthentication() {
    return authentication;
  }

  public void setAuthentication(List<CertAuthentication> authentication) {
    this.authentication = authentication;
  }

  public CertificateData algorithm(CsrHashAlgorithmConstants algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * The csr algorithm.
   * @return algorithm
  **/
  @Valid
  @ApiModelProperty(value = "The csr algorithm.")
  public CsrHashAlgorithmConstants getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(CsrHashAlgorithmConstants algorithm) {
    this.algorithm = algorithm;
  }

  public CertificateData signatureHashAlgorithm(SignatureHashAlgorithmConstants signatureHashAlgorithm) {
    this.signatureHashAlgorithm = signatureHashAlgorithm;
    return this;
  }

   /**
   * The signature hash algorithm.
   * @return signatureHashAlgorithm
  **/
  @Valid
  @ApiModelProperty(value = "The signature hash algorithm.")
  public SignatureHashAlgorithmConstants getSignatureHashAlgorithm() {
    return signatureHashAlgorithm;
  }

  public void setSignatureHashAlgorithm(SignatureHashAlgorithmConstants signatureHashAlgorithm) {
    this.signatureHashAlgorithm = signatureHashAlgorithm;
  }

  public CertificateData idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * The idn version of the common name.
   * @return idn
  **/
  @ApiModelProperty(value = "The idn version of the common name.")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public CertificateData checkCaa(Boolean checkCaa) {
    this.checkCaa = checkCaa;
    return this;
  }

   /**
   * Activates the caa record check.
   * @return checkCaa
  **/
  @ApiModelProperty(value = "Activates the caa record check.")
  public Boolean isCheckCaa() {
    return checkCaa;
  }

  public void setCheckCaa(Boolean checkCaa) {
    this.checkCaa = checkCaa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateData certificateData = (CertificateData) o;
    return Objects.equals(this.plain, certificateData.plain) &&
        Objects.equals(this.name, certificateData.name) &&
        Objects.equals(this.san, certificateData.san) &&
        Objects.equals(this.histories, certificateData.histories) &&
        Objects.equals(this.keySize, certificateData.keySize) &&
        Objects.equals(this.countryCode, certificateData.countryCode) &&
        Objects.equals(this.challengePassword, certificateData.challengePassword) &&
        Objects.equals(this.state, certificateData.state) &&
        Objects.equals(this.city, certificateData.city) &&
        Objects.equals(this.organization, certificateData.organization) &&
        Objects.equals(this.organizationUnit, certificateData.organizationUnit) &&
        Objects.equals(this.email, certificateData.email) &&
        Objects.equals(this.product, certificateData.product) &&
        Objects.equals(this.authentication, certificateData.authentication) &&
        Objects.equals(this.algorithm, certificateData.algorithm) &&
        Objects.equals(this.signatureHashAlgorithm, certificateData.signatureHashAlgorithm) &&
        Objects.equals(this.idn, certificateData.idn) &&
        Objects.equals(this.checkCaa, certificateData.checkCaa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plain, name, san, histories, keySize, countryCode, challengePassword, state, city, organization, organizationUnit, email, product, authentication, algorithm, signatureHashAlgorithm, idn, checkCaa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateData {\n");
    
    sb.append("    plain: ").append(toIndentedString(plain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    san: ").append(toIndentedString(san)).append("\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    challengePassword: ").append(toIndentedString(challengePassword)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    signatureHashAlgorithm: ").append(toIndentedString(signatureHashAlgorithm)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    checkCaa: ").append(toIndentedString(checkCaa)).append("\n");
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

