package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.OrderSetReturnShipmentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetReturnShipmentStateActionBuilder {

    
    private String returnItemId;
    
    
    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    public OrderSetReturnShipmentStateActionBuilder returnItemId( final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }
    
    public OrderSetReturnShipmentStateActionBuilder shipmentState( final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    
    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }

    public OrderSetReturnShipmentStateAction build() {
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    public static OrderSetReturnShipmentStateActionBuilder of() {
        return new OrderSetReturnShipmentStateActionBuilder();
    }

    public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
