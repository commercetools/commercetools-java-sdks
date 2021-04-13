package com.commercetools.api.client.unit;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpMethod;
import com.commercetools.api.client.*;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@RunWith(JUnitParamsRunner.class)
public class ResourceByProjectKeyInStoreKeyByStoreKeyShoppingListsTest {
    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    private ApiRoot createClient() {  
        return ApiFactory.create(
           ClientCredentials.of().withClientId("your-client-id").withClientSecret("your-client-secret").withScopes("your-scopes").build(),
               ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().toString());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "resourcesParameters")
    public void resources(ApiHttpRequest request, String uri) {
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception{
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);   
    }

    private Object[] requestWithMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withExpand("expand"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withSort("sort"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?sort=sort",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withLimit(3),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?limit=3",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withOffset(9),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?offset=9",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withWithTotal(true),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?withTotal=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withWhere("where"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?where=where",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get()
                   .withPredicateVar("varName", "var.varName"),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?var.varName=var.varName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .get(),
                   "get",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .post(null)
                   .withExpand("expand"),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists?expand=expand",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .post(null),
                   "post",
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists",
               }
       };
    }

    private Object[] resourcesParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .withKey("test_key"),
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists/key=test_key",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .inStoreKeyWithStoreKeyValue("test_storeKey")
                   .shoppingLists()
                   .withId("test_ID"),
                   "test_projectKey/in-store/key=test_storeKey/shopping-lists/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.GET,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClientMock, projectKey, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   },
               new Object[] {
                      new ApiHttpRequest(ApiHttpMethod.POST,
                      new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClientMock, projectKey, null, null).createHttpRequest().getUri(), null, null)
                   }
       };
    }  
}
