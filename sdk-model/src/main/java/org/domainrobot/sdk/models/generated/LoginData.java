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
 * LoginData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class LoginData {
  @JsonProperty("context")
  private Integer context = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("user")
  private String user = null;

  public LoginData context(Integer context) {
    this.context = context;
    return this;
  }

   /**
   * The context.
   * @return context
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The context.")
  public Integer getContext() {
    return context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }

  public LoginData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password.
   * @return password
  **/
  @ApiModelProperty(value = "The password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginData token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The one time password in case of 2fa authentication.
   * @return token
  **/
  @ApiModelProperty(value = "The one time password in case of 2fa authentication.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public LoginData user(String user) {
    this.user = user;
    return this;
  }

   /**
   * The user name.
   * @return user
  **/
  @NotNull
 @Pattern(regexp="^[^_].*")  @ApiModelProperty(required = true, value = "The user name.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginData loginData = (LoginData) o;
    return Objects.equals(this.context, loginData.context) &&
        Objects.equals(this.password, loginData.password) &&
        Objects.equals(this.token, loginData.token) &&
        Objects.equals(this.user, loginData.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, password, token, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginData {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

