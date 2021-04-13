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
public class ByProjectKeyMeCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeCartsGet get() {
        return new ByProjectKeyMeCartsGet(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyMeCartsPost post(com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        return new ByProjectKeyMeCartsPost(apiHttpClient, projectKey, myCartDraft);
    }

    public ByProjectKeyMeCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
