
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
*  <p>Query subscriptions</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeySubscriptionsGet extends
        ApiMethod<ByProjectKeySubscriptionsGet, com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse>
        implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeySubscriptionsGet, com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeySubscriptionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeySubscriptionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeySubscriptionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeySubscriptionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeySubscriptionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeySubscriptionsGet> {

    private String projectKey;

    public ByProjectKeySubscriptionsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeySubscriptionsGet(ByProjectKeySubscriptionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/subscriptions", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeySubscriptionsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeySubscriptionsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeySubscriptionsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeySubscriptionsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeySubscriptionsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeySubscriptionsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeySubscriptionsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeySubscriptionsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeySubscriptionsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeySubscriptionsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeySubscriptionsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeySubscriptionsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeySubscriptionsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeySubscriptionsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeySubscriptionsGet copy() {
        return new ByProjectKeySubscriptionsGet(this);
    }
}
