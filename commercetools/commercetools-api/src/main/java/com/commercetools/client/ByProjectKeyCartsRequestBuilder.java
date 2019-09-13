package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCartsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCartsGet get() {
      return new ByProjectKeyCartsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyCartsPost post(com.commercetools.models.cart.CartDraft cartDraft) {
      return new ByProjectKeyCartsPost(apiHttpClient, projectKey, cartDraft);
   }
   
   public ByProjectKeyCartsReplicateRequestBuilder replicate() {
      return new ByProjectKeyCartsReplicateRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyCartsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
