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

import org.domainrobot.sdk.models.generated.JsonResponseDataDomain;
import org.domainrobot.sdk.models.generated.Message;
import org.domainrobot.sdk.models.generated.ResponseObject;
import org.domainrobot.sdk.models.generated.ResponseStatus;

import javax.validation.Valid;

/**
 * JsonResponseDataListJsonResponseDataDomain
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-08T13:30:26.488+01:00")
public class JsonResponseDataListJsonResponseDataDomain {
  @JsonProperty("stid")
  private String stid = null;

  @JsonProperty("messages")
  private List<Message> messages = null;

  @JsonProperty("status")
  private ResponseStatus status = null;

  @JsonProperty("object")
  private ResponseObject object = null;

  @JsonProperty("data")
  private List<List<JsonResponseDataDomain>> data = null;

  @JsonProperty("ctid")
  private String ctid = null;

  public JsonResponseDataListJsonResponseDataDomain stid(String stid) {
    this.stid = stid;
    return this;
  }

   /**
   * The server transaction id for the response.
   * @return stid
  **/
  @ApiModelProperty(value = "The server transaction id for the response.")
  public String getStid() {
    return stid;
  }

  public void setStid(String stid) {
    this.stid = stid;
  }

  public JsonResponseDataListJsonResponseDataDomain messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public JsonResponseDataListJsonResponseDataDomain addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * The messages belonging to the response.
   * @return messages
  **/
  @Valid
  @ApiModelProperty(value = "The messages belonging to the response.")
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public JsonResponseDataListJsonResponseDataDomain status(ResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the response.
   * @return status
  **/
  @Valid
  @ApiModelProperty(value = "The status of the response.")
  public ResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ResponseStatus status) {
    this.status = status;
  }

  public JsonResponseDataListJsonResponseDataDomain object(ResponseObject object) {
    this.object = object;
    return this;
  }

   /**
   * The object of the response.
   * @return object
  **/
  @Valid
  @ApiModelProperty(value = "The object of the response.")
  public ResponseObject getObject() {
    return object;
  }

  public void setObject(ResponseObject object) {
    this.object = object;
  }

  public JsonResponseDataListJsonResponseDataDomain data(List<List<JsonResponseDataDomain>> data) {
    this.data = data;
    return this;
  }

  public JsonResponseDataListJsonResponseDataDomain addDataItem(List<JsonResponseDataDomain> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<List<JsonResponseDataDomain>>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The data for the response. The type of the objects are depending on the request and are also specified in the responseObject value of the response.
   * @return data
  **/
  @Valid
  @ApiModelProperty(value = "The data for the response. The type of the objects are depending on the request and are also specified in the responseObject value of the response.")
  public List<List<JsonResponseDataDomain>> getData() {
    return data;
  }

  public void setData(List<List<JsonResponseDataDomain>> data) {
    this.data = data;
  }

  public JsonResponseDataListJsonResponseDataDomain ctid(String ctid) {
    this.ctid = ctid;
    return this;
  }

   /**
   * The client transaction id for the response.
   * @return ctid
  **/
  @ApiModelProperty(value = "The client transaction id for the response.")
  public String getCtid() {
    return ctid;
  }

  public void setCtid(String ctid) {
    this.ctid = ctid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonResponseDataListJsonResponseDataDomain jsonResponseDataListJsonResponseDataDomain = (JsonResponseDataListJsonResponseDataDomain) o;
    return Objects.equals(this.stid, jsonResponseDataListJsonResponseDataDomain.stid) &&
        Objects.equals(this.messages, jsonResponseDataListJsonResponseDataDomain.messages) &&
        Objects.equals(this.status, jsonResponseDataListJsonResponseDataDomain.status) &&
        Objects.equals(this.object, jsonResponseDataListJsonResponseDataDomain.object) &&
        Objects.equals(this.data, jsonResponseDataListJsonResponseDataDomain.data) &&
        Objects.equals(this.ctid, jsonResponseDataListJsonResponseDataDomain.ctid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stid, messages, status, object, data, ctid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonResponseDataListJsonResponseDataDomain {\n");
    
    sb.append("    stid: ").append(toIndentedString(stid)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ctid: ").append(toIndentedString(ctid)).append("\n");
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

