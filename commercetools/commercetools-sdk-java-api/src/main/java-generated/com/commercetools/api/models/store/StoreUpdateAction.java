
package com.commercetools.api.models.store;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreAddDistributionChannelAction;
import com.commercetools.api.models.store.StoreAddSupplyChannelAction;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import com.commercetools.api.models.store.StoreSetCustomFieldAction;
import com.commercetools.api.models.store.StoreSetCustomTypeAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoreSetSupplyChannelsAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddDistributionChannelActionImpl.class, name = StoreAddDistributionChannelAction.ADD_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddSupplyChannelActionImpl.class, name = StoreAddSupplyChannelAction.ADD_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveDistributionChannelActionImpl.class, name = StoreRemoveDistributionChannelAction.REMOVE_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveSupplyChannelActionImpl.class, name = StoreRemoveSupplyChannelAction.REMOVE_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomFieldActionImpl.class, name = StoreSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomTypeActionImpl.class, name = StoreSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetDistributionChannelsActionImpl.class, name = StoreSetDistributionChannelsAction.SET_DISTRIBUTION_CHANNELS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetLanguagesActionImpl.class, name = StoreSetLanguagesAction.SET_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetNameActionImpl.class, name = StoreSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetSupplyChannelsActionImpl.class, name = StoreSetSupplyChannelsAction.SET_SUPPLY_CHANNELS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StoreUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StoreUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StoreUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withStoreUpdateAction(Function<StoreUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
