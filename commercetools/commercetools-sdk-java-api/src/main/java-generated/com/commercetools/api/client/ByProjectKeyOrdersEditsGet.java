
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
*  <p>Query edits</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersEditsGet extends
        ApiMethod<ByProjectKeyOrdersEditsGet, com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse>
        implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyOrdersEditsGet, com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersEditsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyOrdersEditsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyOrdersEditsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyOrdersEditsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyOrdersEditsGet> {

    private String projectKey;

    public ByProjectKeyOrdersEditsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersEditsGet(ByProjectKeyOrdersEditsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/edits", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse.class);
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

    public ByProjectKeyOrdersEditsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyOrdersEditsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyOrdersEditsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyOrdersEditsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyOrdersEditsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyOrdersEditsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyOrdersEditsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyOrdersEditsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyOrdersEditsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyOrdersEditsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyOrdersEditsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyOrdersEditsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyOrdersEditsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyOrdersEditsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyOrdersEditsGet copy() {
        return new ByProjectKeyOrdersEditsGet(this);
    }
}
