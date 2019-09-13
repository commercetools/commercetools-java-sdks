package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyReviewsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyReviewsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyReviewsKeyByKeyGet get() {
      return new ByProjectKeyReviewsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyReviewsKeyByKeyPost post(com.commercetools.models.review.ReviewUpdate reviewUpdate) {
      return new ByProjectKeyReviewsKeyByKeyPost(apiHttpClient, projectKey, key, reviewUpdate);
   }
   
   public ByProjectKeyReviewsKeyByKeyDelete delete() {
      return new ByProjectKeyReviewsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
