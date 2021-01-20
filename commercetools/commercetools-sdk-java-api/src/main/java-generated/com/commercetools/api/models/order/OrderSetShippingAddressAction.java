
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderSetShippingAddressActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressActionImpl.class)
public interface OrderSetShippingAddressAction extends OrderUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static OrderSetShippingAddressAction of() {
        return new OrderSetShippingAddressActionImpl();
    }

    public static OrderSetShippingAddressAction of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderSetShippingAddressActionBuilder builder() {
        return OrderSetShippingAddressActionBuilder.of();
    }

    public static OrderSetShippingAddressActionBuilder builder(final OrderSetShippingAddressAction template) {
        return OrderSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withOrderSetShippingAddressAction(Function<OrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
