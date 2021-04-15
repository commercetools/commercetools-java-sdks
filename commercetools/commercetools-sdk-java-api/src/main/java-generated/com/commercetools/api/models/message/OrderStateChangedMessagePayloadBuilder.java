package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.message.OrderStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderStateChangedMessagePayloadBuilder {

    
    
    private com.commercetools.api.models.order.OrderState orderState;
    
    
    
    private com.commercetools.api.models.order.OrderState oldOrderState;

    
    public OrderStateChangedMessagePayloadBuilder orderState( final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }
    
    
    public OrderStateChangedMessagePayloadBuilder oldOrderState( final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.oldOrderState = oldOrderState;
        return this;
    }

    
    
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }
    
    
    
    public com.commercetools.api.models.order.OrderState getOldOrderState(){
        return this.oldOrderState;
    }

    public OrderStateChangedMessagePayload build() {
        return new OrderStateChangedMessagePayloadImpl(orderState, oldOrderState);
    }

    public static OrderStateChangedMessagePayloadBuilder of() {
        return new OrderStateChangedMessagePayloadBuilder();
    }

    public static OrderStateChangedMessagePayloadBuilder of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadBuilder builder = new OrderStateChangedMessagePayloadBuilder();
        builder.orderState = template.getOrderState();
        builder.oldOrderState = template.getOldOrderState();
        return builder;
    }

}
