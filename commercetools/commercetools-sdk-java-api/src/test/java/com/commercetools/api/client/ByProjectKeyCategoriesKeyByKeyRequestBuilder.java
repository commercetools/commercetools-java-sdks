package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCategoriesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyCategoriesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCategoriesKeyByKeyGet get() {
        return new ByProjectKeyCategoriesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyCategoriesKeyByKeyPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, update);
    }
    
    public ByProjectKeyCategoriesKeyByKeyDelete delete() {
        return new ByProjectKeyCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
