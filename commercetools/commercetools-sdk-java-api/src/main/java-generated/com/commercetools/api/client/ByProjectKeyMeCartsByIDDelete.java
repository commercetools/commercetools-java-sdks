
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
*  <p>Delete Cart by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeCartsByIDDelete
        extends ApiMethod<ByProjectKeyMeCartsByIDDelete, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeCartsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeCartsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeCartsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyMeCartsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeCartsByIDDelete(ByProjectKeyMeCartsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.cart.Cart.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
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

    public ByProjectKeyMeCartsByIDDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyMeCartsByIDDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyMeCartsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyMeCartsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyMeCartsByIDDelete copy() {
        return new ByProjectKeyMeCartsByIDDelete(this);
    }
}
