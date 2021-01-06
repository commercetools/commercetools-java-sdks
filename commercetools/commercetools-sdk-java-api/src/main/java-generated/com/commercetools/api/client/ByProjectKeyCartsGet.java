package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Query carts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsGet extends ApiMethod<ByProjectKeyCartsGet, com.commercetools.api.models.cart.CartPagedQueryResponse> implements com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyCartsGet, com.commercetools.api.models.cart.CartPagedQueryResponse>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartsGet>, com.commercetools.api.client.SortableTrait<ByProjectKeyCartsGet>, com.commercetools.api.client.PagingTrait<ByProjectKeyCartsGet>, com.commercetools.api.client.QueryTrait<ByProjectKeyCartsGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartsGet> {

    
    private String projectKey;
    

    public ByProjectKeyCartsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartsGet(ByProjectKeyCartsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.CartPagedQueryResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getCustomerId() {
        return this.getQueryParam("customerId");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyCartsGet withCustomerId(final String customerId){
        return copy().addQueryParam("customerId", customerId);
    }
    
    public ByProjectKeyCartsGet withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    public ByProjectKeyCartsGet withSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyCartsGet withLimit(final Integer limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyCartsGet withOffset(final Integer offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyCartsGet withWithTotal(final Boolean withTotal){
        return copy().addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyCartsGet withWhere(final String where){
        return copy().addQueryParam("where", where);
    }
    
    @Override
    protected ByProjectKeyCartsGet copy()
    {
        return new ByProjectKeyCartsGet(this);
    }
}
