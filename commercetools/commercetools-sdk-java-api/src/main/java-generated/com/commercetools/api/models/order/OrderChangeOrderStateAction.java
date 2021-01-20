
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderChangeOrderStateActionImpl;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderChangeOrderStateActionImpl.class)
public interface OrderChangeOrderStateAction extends OrderUpdateAction {

    String CHANGE_ORDER_STATE = "changeOrderState";

    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    public void setOrderState(final OrderState orderState);

    public static OrderChangeOrderStateAction of() {
        return new OrderChangeOrderStateActionImpl();
    }

    public static OrderChangeOrderStateAction of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionImpl instance = new OrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    public static OrderChangeOrderStateActionBuilder builder() {
        return OrderChangeOrderStateActionBuilder.of();
    }

    public static OrderChangeOrderStateActionBuilder builder(final OrderChangeOrderStateAction template) {
        return OrderChangeOrderStateActionBuilder.of(template);
    }

    default <T> T withOrderChangeOrderStateAction(Function<OrderChangeOrderStateAction, T> helper) {
        return helper.apply(this);
    }
}
