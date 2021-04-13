package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessagePayloadImpl.class)
public interface OrderReturnShipmentStateChangedMessagePayload extends MessagePayload {

    String ORDER_RETURN_SHIPMENT_STATE_CHANGED = "OrderReturnShipmentStateChanged";

    
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    
    public void setReturnItemId(final String returnItemId);
    
    
    
    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);
    

    public static OrderReturnShipmentStateChangedMessagePayload of(){
        return new OrderReturnShipmentStateChangedMessagePayloadImpl();
    }
    

    public static OrderReturnShipmentStateChangedMessagePayload of(final OrderReturnShipmentStateChangedMessagePayload template) {
        OrderReturnShipmentStateChangedMessagePayloadImpl instance = new OrderReturnShipmentStateChangedMessagePayloadImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    public static OrderReturnShipmentStateChangedMessagePayloadBuilder builder(){
        return OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }
    
    public static OrderReturnShipmentStateChangedMessagePayloadBuilder builder(final OrderReturnShipmentStateChangedMessagePayload template){
        return OrderReturnShipmentStateChangedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withOrderReturnShipmentStateChangedMessagePayload(Function<OrderReturnShipmentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
