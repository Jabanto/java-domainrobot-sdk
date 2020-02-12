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

import org.domainrobot.sdk.models.generated.ContactBirthExtensions;
import org.domainrobot.sdk.models.generated.ContactIdentificationExtensions;
import org.domainrobot.sdk.models.generated.ContactTrademarkExtensions;
import org.domainrobot.sdk.models.generated.GenderConstants;

import javax.validation.Valid;

/**
 * ContactGeneralExtensions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class ContactGeneralExtensions {
  @JsonProperty("birth")
  private ContactBirthExtensions birth = null;

  @JsonProperty("trademark")
  private ContactTrademarkExtensions trademark = null;

  @JsonProperty("identification")
  private ContactIdentificationExtensions identification = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("companyNumber")
  private String companyNumber = null;

  @JsonProperty("gender")
  private GenderConstants gender = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("citizenship")
  private String citizenship = null;

  @JsonProperty("mobilePhone")
  private String mobilePhone = null;

  public ContactGeneralExtensions birth(ContactBirthExtensions birth) {
    this.birth = birth;
    return this;
  }

   /**
   * The birth extensions.
   * @return birth
  **/
  @Valid
  @ApiModelProperty(value = "The birth extensions.")
  public ContactBirthExtensions getBirth() {
    return birth;
  }

  public void setBirth(ContactBirthExtensions birth) {
    this.birth = birth;
  }

  public ContactGeneralExtensions trademark(ContactTrademarkExtensions trademark) {
    this.trademark = trademark;
    return this;
  }

   /**
   * The trademark extensions.
   * @return trademark
  **/
  @Valid
  @ApiModelProperty(value = "The trademark extensions.")
  public ContactTrademarkExtensions getTrademark() {
    return trademark;
  }

  public void setTrademark(ContactTrademarkExtensions trademark) {
    this.trademark = trademark;
  }

  public ContactGeneralExtensions identification(ContactIdentificationExtensions identification) {
    this.identification = identification;
    return this;
  }

   /**
   * The identification extensions.
   * @return identification
  **/
  @Valid
  @ApiModelProperty(value = "The identification extensions.")
  public ContactIdentificationExtensions getIdentification() {
    return identification;
  }

  public void setIdentification(ContactIdentificationExtensions identification) {
    this.identification = identification;
  }

  public ContactGeneralExtensions language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language.
   * @return language
  **/
  @ApiModelProperty(value = "The language.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ContactGeneralExtensions companyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
    return this;
  }

   /**
   * The company number.
   * @return companyNumber
  **/
  @ApiModelProperty(value = "The company number.")
  public String getCompanyNumber() {
    return companyNumber;
  }

  public void setCompanyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
  }

  public ContactGeneralExtensions gender(GenderConstants gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender.
   * @return gender
  **/
  @Valid
  @ApiModelProperty(value = "The gender.")
  public GenderConstants getGender() {
    return gender;
  }

  public void setGender(GenderConstants gender) {
    this.gender = gender;
  }

  public ContactGeneralExtensions vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * The vatnumber.
   * @return vatNumber
  **/
  @ApiModelProperty(value = "The vatnumber.")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public ContactGeneralExtensions citizenship(String citizenship) {
    this.citizenship = citizenship;
    return this;
  }

   /**
   * The citizenship.
   * @return citizenship
  **/
  @ApiModelProperty(value = "The citizenship.")
  public String getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(String citizenship) {
    this.citizenship = citizenship;
  }

  public ContactGeneralExtensions mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * The mobile phonenumber.
   * @return mobilePhone
  **/
  @ApiModelProperty(value = "The mobile phonenumber.")
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactGeneralExtensions contactGeneralExtensions = (ContactGeneralExtensions) o;
    return Objects.equals(this.birth, contactGeneralExtensions.birth) &&
        Objects.equals(this.trademark, contactGeneralExtensions.trademark) &&
        Objects.equals(this.identification, contactGeneralExtensions.identification) &&
        Objects.equals(this.language, contactGeneralExtensions.language) &&
        Objects.equals(this.companyNumber, contactGeneralExtensions.companyNumber) &&
        Objects.equals(this.gender, contactGeneralExtensions.gender) &&
        Objects.equals(this.vatNumber, contactGeneralExtensions.vatNumber) &&
        Objects.equals(this.citizenship, contactGeneralExtensions.citizenship) &&
        Objects.equals(this.mobilePhone, contactGeneralExtensions.mobilePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birth, trademark, identification, language, companyNumber, gender, vatNumber, citizenship, mobilePhone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactGeneralExtensions {\n");
    
    sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
    sb.append("    trademark: ").append(toIndentedString(trademark)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    companyNumber: ").append(toIndentedString(companyNumber)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
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
