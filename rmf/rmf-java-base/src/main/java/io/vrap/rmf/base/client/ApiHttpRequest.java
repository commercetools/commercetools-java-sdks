package io.vrap.rmf.base.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class ApiHttpRequest {

    private ApiHttpMethod method;
    private URI uri;
    @Deprecated
    private String relativeUrl;
    @Deprecated
    private String baseUrl;
    private ApiHttpHeaders headers;
    private byte[] body;


    public ApiHttpRequest() {

    }

//    @Deprecated
    public ApiHttpRequest(ApiHttpMethod method, String relativeUrl, String baseUrl, ApiHttpHeaders headers, byte[] body) {
        this.method = method;
        this.relativeUrl = relativeUrl;
        this.baseUrl = baseUrl;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpRequest(ApiHttpMethod method, URI uri, ApiHttpHeaders headers, byte[] body) {
        this.method = method;
        this.uri = uri;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpRequest(ApiHttpRequest r) {
        this.method = r.method;
        this.uri = r.uri;
        this.headers = r.headers;
        this.body = r.body;
        this.relativeUrl = r.relativeUrl;
        this.baseUrl = r.baseUrl;
    }

    public ApiHttpMethod getMethod() {
        return method;
    }

    public void setMethod(ApiHttpMethod method) {
        this.method = method;
    }

    public ApiHttpHeaders getHeaders() {
        if (headers == null) {
            this.headers = new ApiHttpHeaders();
        }
        return headers;
    }


    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }

    public ApiHttpRequest addHeader(String key, String value) {
        this.headers = getHeaders().addHeader(key, value);

        return this;
    }

    public ApiHttpRequest withHeader(String key, String value) {
        this.headers = getHeaders().withHeader(key, value);

        return this;
    }

    public ApiHttpRequest withoutHeader(String key) {
        this.headers = getHeaders().withoutHeader(key);

        return this;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public void setBody(String body) {
        if (body == null) {
            this.body = null;
            return;
        }
        setBody(body.getBytes());
    }

    @Deprecated
    public String getRelativeUrl() {
        return relativeUrl;
    }

    @Deprecated
    public void setRelativeUrl(String relativeUrl) {
        this.relativeUrl = relativeUrl;
        setUri(relativeUrl);
    }

    public URI getUri() {
        return uri;
    }

    public URL getUrl() {
        try {
            return uri.toURL();
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Malformed URI", e);
        }
    }

    public void setUri(String uri) {
        this.uri = URI.create(uri);
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    @Deprecated
    public String getBaseUrl() {
        return baseUrl;
    }

    @Deprecated
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Deprecated
    public String fullUrl() {
        if (uri != null) {
            try {
                return uri.toURL().toString();
            } catch (MalformedURLException e) {
                throw new IllegalStateException("Malformed URI", e);
            }
        }
        if (getBaseUrl() == null) {
            throw new IllegalStateException("base url should be set");
        }
        if (getRelativeUrl() == null) {
            return getBaseUrl();
        }
        return getBaseUrl() + getRelativeUrl();
    }

    public ApiHttpRequest resolve(URI baseUri)
    {
        ApiHttpRequest request = new ApiHttpRequest(this);
        request.setUri(baseUri.resolve(this.uri));
        return request;
    }
}
