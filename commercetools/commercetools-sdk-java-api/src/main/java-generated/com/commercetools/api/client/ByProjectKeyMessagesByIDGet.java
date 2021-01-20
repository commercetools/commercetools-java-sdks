
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

/**
*  <p>Get Message by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMessagesByIDGet
        extends ApiMethod<ByProjectKeyMessagesByIDGet, com.commercetools.api.models.message.Message>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMessagesByIDGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMessagesByIDGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMessagesByIDGet> {

    private String projectKey;
    private String ID;

    public ByProjectKeyMessagesByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMessagesByIDGet(ByProjectKeyMessagesByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/messages/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.message.Message> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.message.Message>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.message.Message.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
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

    public ByProjectKeyMessagesByIDGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyMessagesByIDGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyMessagesByIDGet copy() {
        return new ByProjectKeyMessagesByIDGet(this);
    }
}
