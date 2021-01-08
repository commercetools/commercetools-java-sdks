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
public class ByProjectKeyMeCartsGet extends ApiMethod<ByProjectKeyMeCartsGet, com.commercetools.api.models.cart.CartPagedQueryResponse> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsGet>, com.commercetools.api.client.SortableTrait<ByProjectKeyMeCartsGet>, com.commercetools.api.client.PagingTrait<ByProjectKeyMeCartsGet>, com.commercetools.api.client.QueryTrait<ByProjectKeyMeCartsGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeCartsGet> {

    
    private String projectKey;
    

    public ByProjectKeyMeCartsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeCartsGet(ByProjectKeyMeCartsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts", this.projectKey);
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

    public ByProjectKeyMeCartsGet withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    public ByProjectKeyMeCartsGet withSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyMeCartsGet withLimit(final Integer limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyMeCartsGet withOffset(final Integer offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyMeCartsGet withWithTotal(final Boolean withTotal){
        return copy().addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyMeCartsGet withWhere(final String where){
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyMeCartsGet withPredicateVar(final String varName, final String predicateVar){
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }
    
    @Override
    protected ByProjectKeyMeCartsGet copy()
    {
        return new ByProjectKeyMeCartsGet(this);
    }
}
