package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.TroubleTicket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-29T18:35:10.093-02:00")
@Component("io.swagger.client.api.TroubleTicketApi")
public class TroubleTicketApi {
    private ApiClient apiClient;

    public TroubleTicketApi() {
        this(new ApiClient());
    }

    @Autowired
    public TroubleTicketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * troubleTicketCreate
     * 
     * <p><b>201</b> - TroubleTicket
     * @param troubleTicket The troubleTicket parameter
     * @return TroubleTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TroubleTicket troubleTicketCreate(TroubleTicket troubleTicket) throws RestClientException {
        Object postBody = troubleTicket;
        
        // verify the required parameter 'troubleTicket' is set
        if (troubleTicket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicket' when calling troubleTicketCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/troubleTicket").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TroubleTicket> returnType = new ParameterizedTypeReference<TroubleTicket>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * troubleTicketFind
     * 
     * <p><b>200</b> - List of TroubleTicket
     * @param fields 
     * @return List&lt;TroubleTicket&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TroubleTicket> troubleTicketFind(String fields) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/troubleTicket").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<TroubleTicket>> returnType = new ParameterizedTypeReference<List<TroubleTicket>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * troubleTicketGet
     * 
     * <p><b>200</b> - TroubleTicket
     * @param troubleTicketId The troubleTicketId parameter
     * @param fields 
     * @return TroubleTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TroubleTicket troubleTicketGet(String troubleTicketId, String fields) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'troubleTicketId' is set
        if (troubleTicketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicketId' when calling troubleTicketGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("troubleTicketId", troubleTicketId);
        String path = UriComponentsBuilder.fromPath("/troubleTicket/{troubleTicketId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TroubleTicket> returnType = new ParameterizedTypeReference<TroubleTicket>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * troubleTicketPatch
     * 
     * <p><b>200</b> - Success TroubleTicket
     * @param troubleTicketId The troubleTicketId parameter
     * @param troubleTicket The troubleTicket parameter
     * @return TroubleTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TroubleTicket troubleTicketPatch(String troubleTicketId, TroubleTicket troubleTicket) throws RestClientException {
        Object postBody = troubleTicket;
        
        // verify the required parameter 'troubleTicketId' is set
        if (troubleTicketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicketId' when calling troubleTicketPatch");
        }
        
        // verify the required parameter 'troubleTicket' is set
        if (troubleTicket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicket' when calling troubleTicketPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("troubleTicketId", troubleTicketId);
        String path = UriComponentsBuilder.fromPath("/troubleTicket/{troubleTicketId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TroubleTicket> returnType = new ParameterizedTypeReference<TroubleTicket>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * troubleTicketUpdate
     * 
     * <p><b>201</b> - Success TroubleTicket
     * @param troubleTicketId The troubleTicketId parameter
     * @param troubleTicket The troubleTicket parameter
     * @return TroubleTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TroubleTicket troubleTicketUpdate(String troubleTicketId, TroubleTicket troubleTicket) throws RestClientException {
        Object postBody = troubleTicket;
        
        // verify the required parameter 'troubleTicketId' is set
        if (troubleTicketId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicketId' when calling troubleTicketUpdate");
        }
        
        // verify the required parameter 'troubleTicket' is set
        if (troubleTicket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'troubleTicket' when calling troubleTicketUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("troubleTicketId", troubleTicketId);
        String path = UriComponentsBuilder.fromPath("/troubleTicket/{troubleTicketId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TroubleTicket> returnType = new ParameterizedTypeReference<TroubleTicket>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
