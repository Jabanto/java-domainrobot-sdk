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

import org.domainrobot.sdk.models.generated.ModifierConstants;

import javax.validation.Valid;

/**
 * Modifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class Modifier {
  @JsonProperty("search")
  private String search = null;

  @JsonProperty("replace")
  private String replace = null;

  @JsonProperty("type")
  private ModifierConstants type = null;

  public Modifier search(String search) {
    this.search = search;
    return this;
  }

   /**
   * The search pattern
   * @return search
  **/
  @ApiModelProperty(value = "The search pattern")
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public Modifier replace(String replace) {
    this.replace = replace;
    return this;
  }

   /**
   * The replacement value
   * @return replace
  **/
  @ApiModelProperty(value = "The replacement value")
  public String getReplace() {
    return replace;
  }

  public void setReplace(String replace) {
    this.replace = replace;
  }

  public Modifier type(ModifierConstants type) {
    this.type = type;
    return this;
  }

   /**
   * The modifiers type, e.g. NAME_SERVER
   * @return type
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "The modifiers type, e.g. NAME_SERVER")
  public ModifierConstants getType() {
    return type;
  }

  public void setType(ModifierConstants type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Modifier modifier = (Modifier) o;
    return Objects.equals(this.search, modifier.search) &&
        Objects.equals(this.replace, modifier.replace) &&
        Objects.equals(this.type, modifier.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, replace, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Modifier {\n");
    
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

