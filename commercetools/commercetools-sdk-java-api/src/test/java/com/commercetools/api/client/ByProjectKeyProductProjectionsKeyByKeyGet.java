package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Gets the current or staged representation of a product found by Key.
*  When used with an API client that has the view_published_products:{projectKey} scope,
*  this endpoint only returns published (current) product projections.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsKeyByKeyGet extends ApiMethod<ByProjectKeyProductProjectionsKeyByKeyGet, com.commercetools.api.models.product.ProductProjection> implements com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductProjectionsKeyByKeyGet>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductProjectionsKeyByKeyGet>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsKeyByKeyGet>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductProjectionsKeyByKeyGet> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyProductProjectionsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet(ByProjectKeyProductProjectionsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjection> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product.ProductProjection.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }
    
    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }
    
    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }
    
    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }
    
    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }
    
    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }
    
    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyProductProjectionsKeyByKeyGet withStaged(final Boolean staged){
        return copy().withQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addStaged(final Boolean staged){
        return copy().addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCurrency(final String priceCurrency){
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCurrency(final String priceCurrency){
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCountry(final String priceCountry){
        return copy().withQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCountry(final String priceCountry){
        return copy().addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(final String priceCustomerGroup){
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(final String priceCustomerGroup){
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceChannel(final String priceChannel){
        return copy().withQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceChannel(final String priceChannel){
        return copy().addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withLocaleProjection(final String localeProjection){
        return copy().withQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addLocaleProjection(final String localeProjection){
        return copy().addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withStoreProjection(final String storeProjection){
        return copy().withQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addStoreProjection(final String storeProjection){
        return copy().addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyProductProjectionsKeyByKeyGet copy()
    {
        return new ByProjectKeyProductProjectionsKeyByKeyGet(this);
    }
}
