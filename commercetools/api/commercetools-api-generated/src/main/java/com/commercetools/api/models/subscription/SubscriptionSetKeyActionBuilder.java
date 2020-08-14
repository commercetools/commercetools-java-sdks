package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionSetKeyActionBuilder {

    @Nullable
    private String key;

    public SubscriptionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey(){
        return this.key;
    }

    public SubscriptionSetKeyAction build() {
        return new SubscriptionSetKeyActionImpl(key);
    }

    public static SubscriptionSetKeyActionBuilder of() {
        return new SubscriptionSetKeyActionBuilder();
    }

    public static SubscriptionSetKeyActionBuilder of(final SubscriptionSetKeyAction template) {
        SubscriptionSetKeyActionBuilder builder = new SubscriptionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
