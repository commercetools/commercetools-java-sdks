
package com.commercetools.api.client.resource;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.api.client.*;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.utils.Generated;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberTest {
    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    private ApiRoot createClient() {
        return ApiFactory.create(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception {
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] { new Object[] {
                apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .orders()
                        .withOrderNumber("test_orderNumber")
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(),
                "get",
                "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .get()
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .post(null)
                                .withExpand("expand")
                                .createHttpRequest(),
                        "post",
                        "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .post(null)
                                .createHttpRequest(),
                        "post", "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .delete()
                                .withDataErasure(true)
                                .createHttpRequest(),
                        "delete",
                        "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber?dataErasure=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .delete()
                                .withVersion(2)
                                .createHttpRequest(),
                        "delete",
                        "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber?version=2", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .delete()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "delete",
                        "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .orders()
                                .withOrderNumber("test_orderNumber")
                                .delete()
                                .createHttpRequest(),
                        "delete",
                        "/test_projectKey/in-store/key=test_storeKey/orders/order-number=test_orderNumber", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClientMock, projectKey,
                        null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClientMock,
                        projectKey, null, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.DELETE,
                    new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClientMock,
                        projectKey, null, null).createHttpRequest().getUri(),
                    null, null) } };
    }
}
