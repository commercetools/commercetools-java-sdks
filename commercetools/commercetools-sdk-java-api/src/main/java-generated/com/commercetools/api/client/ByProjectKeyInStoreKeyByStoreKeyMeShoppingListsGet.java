
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
*  <p>Query shopping-lists</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet, com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>
        implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet, com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet> {

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/shopping-lists", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
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

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet withPredicateVar(final String varName,
            final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet addPredicateVar(final String varName,
            final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(this);
    }
}
