package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderSetShippingAddressCustomFieldActionImpl.class)
public interface OrderSetShippingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static OrderSetShippingAddressCustomFieldAction of(){
        return new OrderSetShippingAddressCustomFieldActionImpl();
    }
    

    public static OrderSetShippingAddressCustomFieldAction of(final OrderSetShippingAddressCustomFieldAction template) {
        OrderSetShippingAddressCustomFieldActionImpl instance = new OrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder builder(){
        return OrderSetShippingAddressCustomFieldActionBuilder.of();
    }
    
    public static OrderSetShippingAddressCustomFieldActionBuilder builder(final OrderSetShippingAddressCustomFieldAction template){
        return OrderSetShippingAddressCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withOrderSetShippingAddressCustomFieldAction(Function<OrderSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
