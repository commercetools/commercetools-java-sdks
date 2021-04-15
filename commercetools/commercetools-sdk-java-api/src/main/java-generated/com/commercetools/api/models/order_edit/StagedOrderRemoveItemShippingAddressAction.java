package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveItemShippingAddressActionImpl.class)
public interface StagedOrderRemoveItemShippingAddressAction extends StagedOrderUpdateAction {

    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    
    public void setAddressKey(final String addressKey);
    

    public static StagedOrderRemoveItemShippingAddressAction of(){
        return new StagedOrderRemoveItemShippingAddressActionImpl();
    }
    

    public static StagedOrderRemoveItemShippingAddressAction of(final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionImpl instance = new StagedOrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder builder(){
        return StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }
    
    public static StagedOrderRemoveItemShippingAddressActionBuilder builder(final StagedOrderRemoveItemShippingAddressAction template){
        return StagedOrderRemoveItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderRemoveItemShippingAddressAction(Function<StagedOrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
