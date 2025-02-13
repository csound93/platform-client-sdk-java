package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.Draft;
import com.mypurecloud.sdk.v2.model.DraftListing;
import com.mypurecloud.sdk.v2.model.MinerIntent;
import com.mypurecloud.sdk.v2.model.MinedIntentsListing;
import com.mypurecloud.sdk.v2.model.MinerListing;
import com.mypurecloud.sdk.v2.model.DraftRequest;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;
import com.mypurecloud.sdk.v2.model.MinerExecuteRequest;

public class GetLanguageunderstandingMinerIntentsRequest {
    
	private String minerId;
	public String getMinerId() {
		return this.minerId;
	}

	public void setMinerId(String minerId) {
		this.minerId = minerId;
	}

	public GetLanguageunderstandingMinerIntentsRequest withMinerId(String minerId) {
	    this.setMinerId(minerId);
	    return this;
	} 
	
	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetLanguageunderstandingMinerIntentsRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		PHRASES("phrases"), 
		UTTERANCES("utterances");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetLanguageunderstandingMinerIntentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'minerId' is set
        if (this.minerId == null) {
            throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerIntentsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/miners/{minerId}/intents")
                .withPathParameter("minerId", minerId)
        
                .withQueryParameters("expand", "", expand)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String minerId) {
	    return new Builder()
	            .withRequiredParams(minerId);
	}
	

	public static class Builder {
		private final GetLanguageunderstandingMinerIntentsRequest request;

		private Builder() {
			request = new GetLanguageunderstandingMinerIntentsRequest();
		}

		
		public Builder withMinerId(String minerId) {
			request.setMinerId(minerId);
			return this;
		}
		
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpand(expandValues expand) {
		    request.setExpand(expand.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String minerId) {
			request.setMinerId(minerId);
			
			return this;
		}
		

		public GetLanguageunderstandingMinerIntentsRequest build() {
            
            // verify the required parameter 'minerId' is set
            if (request.minerId == null) {
                throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerIntentsRequest.");
            }
            
			return request;
		}
	}
}
