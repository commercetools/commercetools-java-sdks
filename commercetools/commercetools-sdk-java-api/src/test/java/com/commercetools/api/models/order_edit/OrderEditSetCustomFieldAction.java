package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderEditSetCustomFieldActionImpl.class)
public interface OrderEditSetCustomFieldAction extends OrderEditUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static OrderEditSetCustomFieldAction of(){
        return new OrderEditSetCustomFieldActionImpl();
    }
    

    public static OrderEditSetCustomFieldAction of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionImpl instance = new OrderEditSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetCustomFieldActionBuilder builder(){
        return OrderEditSetCustomFieldActionBuilder.of();
    }
    
    public static OrderEditSetCustomFieldActionBuilder builder(final OrderEditSetCustomFieldAction template){
        return OrderEditSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetCustomFieldAction(Function<OrderEditSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
