package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DialerCampaignRuleConfigChangeCampaignRuleActionEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerCampaignRuleConfigChangeCampaignRuleAction
 */

public class DialerCampaignRuleConfigChangeCampaignRuleAction  implements Serializable {
  
  private String id = null;
  private Map<String, String> parameters = null;

  private static class ActionTypeEnumDeserializer extends StdDeserializer<ActionTypeEnum> {
    public ActionTypeEnumDeserializer() {
      super(ActionTypeEnumDeserializer.class);
    }

    @Override
    public ActionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of this action
   */
 @JsonDeserialize(using = ActionTypeEnumDeserializer.class)
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TURNONCAMPAIGN("turnOnCampaign"),
    TURNOFFCAMPAIGN("turnOffCampaign"),
    TURNONSEQUENCE("turnOnSequence"),
    TURNOFFSEQUENCE("turnOffSequence"),
    SETCAMPAIGNPRIORITY("setCampaignPriority"),
    RECYCLECAMPAIGN("recycleCampaign");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeEnum value : ActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeEnum actionType = null;
  private DialerCampaignRuleConfigChangeCampaignRuleActionEntities campaignRuleActionEntities = null;

  
  /**
   * The globally unique identifier for the action
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the action")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The parameters to match this action
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleAction parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The parameters to match this action")
  @JsonProperty("parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  
  /**
   * The type of this action
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of this action")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  
  /**
   **/
  public DialerCampaignRuleConfigChangeCampaignRuleAction campaignRuleActionEntities(DialerCampaignRuleConfigChangeCampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignRuleActionEntities")
  public DialerCampaignRuleConfigChangeCampaignRuleActionEntities getCampaignRuleActionEntities() {
    return campaignRuleActionEntities;
  }
  public void setCampaignRuleActionEntities(DialerCampaignRuleConfigChangeCampaignRuleActionEntities campaignRuleActionEntities) {
    this.campaignRuleActionEntities = campaignRuleActionEntities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignRuleConfigChangeCampaignRuleAction dialerCampaignRuleConfigChangeCampaignRuleAction = (DialerCampaignRuleConfigChangeCampaignRuleAction) o;
    return Objects.equals(this.id, dialerCampaignRuleConfigChangeCampaignRuleAction.id) &&
        Objects.equals(this.parameters, dialerCampaignRuleConfigChangeCampaignRuleAction.parameters) &&
        Objects.equals(this.actionType, dialerCampaignRuleConfigChangeCampaignRuleAction.actionType) &&
        Objects.equals(this.campaignRuleActionEntities, dialerCampaignRuleConfigChangeCampaignRuleAction.campaignRuleActionEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters, actionType, campaignRuleActionEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignRuleConfigChangeCampaignRuleAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    campaignRuleActionEntities: ").append(toIndentedString(campaignRuleActionEntities)).append("\n");
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

