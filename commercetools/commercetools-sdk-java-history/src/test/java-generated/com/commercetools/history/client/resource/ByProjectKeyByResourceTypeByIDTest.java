package com.commercetools.history.client.resource;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.VrapHttpClient;
import com.commercetools.api.client.ApiRoot;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import org.assertj.core.api.Assertions;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyByResourceTypeByIDTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
               () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiServerException.class); 
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
           () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withDateFrom("date.from")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?date.from=date.from",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withDateTo("date.to")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?date.to=date.to",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withLimit("limit")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?limit=limit",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withOffset("offset")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?offset=offset",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withUserId("userId")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?userId=userId",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withType("type")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?type=type",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withClientId("clientId")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?clientId=clientId",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withSource("source")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?source=source",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withChanges("changes")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?changes=changes",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withCustomerId("customerId")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?customerId=customerId",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withExpand(true)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID?expand=true",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/test_resourceType/test_ID",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withDateFrom("date.from"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withDateTo("date.to"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withLimit("limit"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withOffset("offset"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withUserId("userId"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withType("type"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withClientId("clientId"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withSource("source"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withChanges("changes"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withCustomerId("customerId"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get()
                   .withExpand(true),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKeyValue("test_projectKey")
                   .withResourceTypeValue("test_resourceType")
                   .withIDValue("test_ID")
                   .get(),
               }
       };
    }
}
