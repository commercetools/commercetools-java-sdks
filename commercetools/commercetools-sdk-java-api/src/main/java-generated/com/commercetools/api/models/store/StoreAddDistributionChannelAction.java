
package com.commercetools.api.models.store;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreAddDistributionChannelActionImpl;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreAddDistributionChannelActionImpl.class)
public interface StoreAddDistributionChannelAction extends StoreUpdateAction {

    String ADD_DISTRIBUTION_CHANNEL = "addDistributionChannel";

    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoreAddDistributionChannelAction of() {
        return new StoreAddDistributionChannelActionImpl();
    }

    public static StoreAddDistributionChannelAction of(final StoreAddDistributionChannelAction template) {
        StoreAddDistributionChannelActionImpl instance = new StoreAddDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoreAddDistributionChannelActionBuilder builder() {
        return StoreAddDistributionChannelActionBuilder.of();
    }

    public static StoreAddDistributionChannelActionBuilder builder(final StoreAddDistributionChannelAction template) {
        return StoreAddDistributionChannelActionBuilder.of(template);
    }

    default <T> T withStoreAddDistributionChannelAction(Function<StoreAddDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }
}
