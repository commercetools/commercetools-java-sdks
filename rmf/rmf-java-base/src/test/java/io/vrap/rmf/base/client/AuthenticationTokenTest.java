package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class AuthenticationTokenTest {
    @Test
    public void testExpiredNotSet() throws IOException {
        final AuthenticationToken token = VrapJsonUtils.fromJsonString("{ \"access_token\": \"12345\"}", AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(true);
    }

    @Test
    public void testAlreadyExpired() throws IOException {
        final AuthenticationToken token = VrapJsonUtils.fromJsonString("{ \"access_token\": \"12345\", \"expires_in\": 299}", AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(true);
    }

    @Test
    public void testNotExpired() throws IOException {
        final AuthenticationToken token = VrapJsonUtils.fromJsonString("{ \"access_token\": \"12345\", \"expires_in\": 360}", AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(false);
    }
}
