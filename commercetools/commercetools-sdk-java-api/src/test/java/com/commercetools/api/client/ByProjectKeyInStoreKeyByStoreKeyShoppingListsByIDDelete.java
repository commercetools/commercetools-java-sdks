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
*  <p>Delete ShoppingList by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete, com.commercetools.api.models.shopping_list.ShoppingList> implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete>, com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete> {

    
    private String projectKey;
    private String storeKey;
    private String ID;
    

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete(ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/shopping-lists/%s", this.projectKey, this.storeKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}
    public String getID() {return this.ID;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete withDataErasure(final Boolean dataErasure){
        return copy().withQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete addDataErasure(final Boolean dataErasure){
        return copy().addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete withVersion(final Long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete addVersion(final Long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete copy()
    {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete(this);
    }
}
