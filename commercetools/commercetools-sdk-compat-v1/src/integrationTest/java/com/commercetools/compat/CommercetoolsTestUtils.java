
package com.commercetools.compat;

import java.util.UUID;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringImpl;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class CommercetoolsTestUtils {

    private static final ApiHttpClient client;
    private static final ByProjectKeyRequestBuilder projectRoot;

    static {
        String logLevel = System.getenv("CTP_JVM_SDK_LOG_LEVEL");
        if ("OFF".equals(logLevel)) {
            client = ApiFactory.defaultClient(
                ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
            projectRoot = ApiFactory.createForProject(getProjectKey(), () -> client);
        }
        else {
            client = ApiFactory.defaultClient(
                ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
            projectRoot = ApiFactory.createForProject(getProjectKey(), () -> client);
        }
    }

    public static String randomString() {
        return "random-string-" + UUID.randomUUID().toString();
    }

    public static String randomId() {
        return "random-id-" + UUID.randomUUID().toString();
    }

    public static String randomKey() {
        return "random-key-" + UUID.randomUUID().toString();
    }

    public static LocalizedString randomLocalizedString() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue(randomString(), randomString());
        return localizedString;
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

    public static ByProjectKeyRequestBuilder getProjectRoot() {
        return projectRoot;
    }

    public static ApiHttpClient getClient() {
        return client;
    }
}
