package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;
import com.mypurecloud.sdk.v2.model.SupportedContent;


import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingSupportedcontentRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MessagingApi {
  private final ApiClient pcapiClient;

  public MessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingSupportedcontentSupportedContentId(String supportedContentId) throws IOException, ApiException {
     deleteMessagingSupportedcontentSupportedContentId(createDeleteMessagingSupportedcontentSupportedContentIdRequest(supportedContentId));
  }

  /**
   * Delete a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId) throws IOException {
    return deleteMessagingSupportedcontentSupportedContentId(createDeleteMessagingSupportedcontentSupportedContentIdRequest(supportedContentId).withHttpInfo());
  }

  private DeleteMessagingSupportedcontentSupportedContentIdRequest createDeleteMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId) {
    return DeleteMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Delete a supported content profile
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingSupportedcontentSupportedContentId(DeleteMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a supported content profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingSupportedcontentSupportedContentId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Supported Content profiles
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SupportedContentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContentListing getMessagingSupportedcontent(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingSupportedcontent(createGetMessagingSupportedcontentRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Supported Content profiles
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SupportedContentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContentListing> getMessagingSupportedcontentWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingSupportedcontent(createGetMessagingSupportedcontentRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingSupportedcontentRequest createGetMessagingSupportedcontentRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingSupportedcontentRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Supported Content profiles
   * 
   * @param request The request object
   * @return SupportedContentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContentListing getMessagingSupportedcontent(GetMessagingSupportedcontentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Supported Content profiles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContentListing> getMessagingSupportedcontent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent getMessagingSupportedcontentSupportedContentId(String supportedContentId) throws IOException, ApiException {
    return  getMessagingSupportedcontentSupportedContentId(createGetMessagingSupportedcontentSupportedContentIdRequest(supportedContentId));
  }

  /**
   * Get a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> getMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId) throws IOException {
    return getMessagingSupportedcontentSupportedContentId(createGetMessagingSupportedcontentSupportedContentIdRequest(supportedContentId).withHttpInfo());
  }

  private GetMessagingSupportedcontentSupportedContentIdRequest createGetMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId) {
    return GetMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)
    
            .build();
  }

  /**
   * Get a supported content profile
   * 
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent getMessagingSupportedcontentSupportedContentId(GetMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a supported content profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> getMessagingSupportedcontentSupportedContentId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent patchMessagingSupportedcontentSupportedContentId(String supportedContentId, SupportedContent body) throws IOException, ApiException {
    return  patchMessagingSupportedcontentSupportedContentId(createPatchMessagingSupportedcontentSupportedContentIdRequest(supportedContentId, body));
  }

  /**
   * Update a supported content profile
   * 
   * @param supportedContentId Supported Content ID (required)
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> patchMessagingSupportedcontentSupportedContentIdWithHttpInfo(String supportedContentId, SupportedContent body) throws IOException {
    return patchMessagingSupportedcontentSupportedContentId(createPatchMessagingSupportedcontentSupportedContentIdRequest(supportedContentId, body).withHttpInfo());
  }

  private PatchMessagingSupportedcontentSupportedContentIdRequest createPatchMessagingSupportedcontentSupportedContentIdRequest(String supportedContentId, SupportedContent body) {
    return PatchMessagingSupportedcontentSupportedContentIdRequest.builder()
            .withSupportedContentId(supportedContentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a supported content profile
   * 
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent patchMessagingSupportedcontentSupportedContentId(PatchMessagingSupportedcontentSupportedContentIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a supported content profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> patchMessagingSupportedcontentSupportedContentId(ApiRequest<SupportedContent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Supported Content profile
   * 
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent postMessagingSupportedcontent(SupportedContent body) throws IOException, ApiException {
    return  postMessagingSupportedcontent(createPostMessagingSupportedcontentRequest(body));
  }

  /**
   * Create a Supported Content profile
   * 
   * @param body SupportedContent (required)
   * @return SupportedContent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> postMessagingSupportedcontentWithHttpInfo(SupportedContent body) throws IOException {
    return postMessagingSupportedcontent(createPostMessagingSupportedcontentRequest(body).withHttpInfo());
  }

  private PostMessagingSupportedcontentRequest createPostMessagingSupportedcontentRequest(SupportedContent body) {
    return PostMessagingSupportedcontentRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Supported Content profile
   * 
   * @param request The request object
   * @return SupportedContent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SupportedContent postMessagingSupportedcontent(PostMessagingSupportedcontentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SupportedContent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SupportedContent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Supported Content profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SupportedContent> postMessagingSupportedcontent(ApiRequest<SupportedContent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SupportedContent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
