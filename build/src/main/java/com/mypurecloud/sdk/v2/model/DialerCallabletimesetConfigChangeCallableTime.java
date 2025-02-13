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
import com.mypurecloud.sdk.v2.model.DialerCallabletimesetConfigChangeTimeSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCallabletimesetConfigChangeCallableTime
 */

public class DialerCallabletimesetConfigChangeCallableTime  implements Serializable {
  
  private List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots = new ArrayList<DialerCallabletimesetConfigChangeTimeSlot>();
  private String timeZoneId = null;

  
  /**
   * The time slots
   **/
  public DialerCallabletimesetConfigChangeCallableTime timeSlots(List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time slots")
  @JsonProperty("timeSlots")
  public List<DialerCallabletimesetConfigChangeTimeSlot> getTimeSlots() {
    return timeSlots;
  }
  public void setTimeSlots(List<DialerCallabletimesetConfigChangeTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  
  /**
   * The ISO ID for the timezone
   **/
  public DialerCallabletimesetConfigChangeCallableTime timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ISO ID for the timezone")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCallabletimesetConfigChangeCallableTime dialerCallabletimesetConfigChangeCallableTime = (DialerCallabletimesetConfigChangeCallableTime) o;
    return Objects.equals(this.timeSlots, dialerCallabletimesetConfigChangeCallableTime.timeSlots) &&
        Objects.equals(this.timeZoneId, dialerCallabletimesetConfigChangeCallableTime.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlots, timeZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeCallableTime {\n");
    
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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

