package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String importSinkKey;
   
   
   public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String importSinkKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.importSinkKey = importSinkKey;
   }
   
   public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyPost post(com.commercetools.importer.models.importrequests.ProductVariantImportRequest productVariantImportRequest) {
      return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyPost(apiHttpClient, projectKey, importSinkKey, productVariantImportRequest);
   }
   
   public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder resourceKeyWithResourceKeyValue(String resourceKey) {
      return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyRequestBuilder(apiHttpClient, projectKey, importSinkKey, resourceKey);
   }
   public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder importOperations() {
      return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyImportOperationsRequestBuilder(apiHttpClient, projectKey, importSinkKey);
   }
}
