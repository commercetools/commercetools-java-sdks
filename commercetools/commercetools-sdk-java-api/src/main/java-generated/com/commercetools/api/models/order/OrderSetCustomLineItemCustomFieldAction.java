package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderSetCustomLineItemCustomFieldActionImpl.class)
public interface OrderSetCustomLineItemCustomFieldAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static OrderSetCustomLineItemCustomFieldAction of(){
        return new OrderSetCustomLineItemCustomFieldActionImpl();
    }
    

    public static OrderSetCustomLineItemCustomFieldAction of(final OrderSetCustomLineItemCustomFieldAction template) {
        OrderSetCustomLineItemCustomFieldActionImpl instance = new OrderSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder builder(){
        return OrderSetCustomLineItemCustomFieldActionBuilder.of();
    }
    
    public static OrderSetCustomLineItemCustomFieldActionBuilder builder(final OrderSetCustomLineItemCustomFieldAction template){
        return OrderSetCustomLineItemCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withOrderSetCustomLineItemCustomFieldAction(Function<OrderSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
