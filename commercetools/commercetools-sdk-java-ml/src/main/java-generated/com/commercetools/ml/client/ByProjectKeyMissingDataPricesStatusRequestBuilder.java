
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataPricesStatusRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataPricesStatusRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMissingDataPricesStatusByTaskIdRequestBuilder withTaskId(String taskId) {
        return new ByProjectKeyMissingDataPricesStatusByTaskIdRequestBuilder(apiHttpClient, projectKey, taskId);
    }
}
