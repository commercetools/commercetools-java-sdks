
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Delete Store by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStoresByIDDelete
        extends ApiMethod<ByProjectKeyStoresByIDDelete, com.commercetools.api.models.store.Store>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyStoresByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyStoresByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStoresByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStoresByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStoresByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyStoresByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStoresByIDDelete(ByProjectKeyStoresByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/stores/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.store.Store> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.store.Store.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.store.Store>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.store.Store.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyStoresByIDDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyStoresByIDDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyStoresByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyStoresByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyStoresByIDDelete copy() {
        return new ByProjectKeyStoresByIDDelete(this);
    }
}
