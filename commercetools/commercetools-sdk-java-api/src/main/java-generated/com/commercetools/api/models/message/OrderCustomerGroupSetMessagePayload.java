package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCustomerGroupSetMessagePayloadImpl.class)
public interface OrderCustomerGroupSetMessagePayload extends MessagePayload {

    
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();
    
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    
    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerGroupSetMessagePayload of(){
        return new OrderCustomerGroupSetMessagePayloadImpl();
    }
    

    public static OrderCustomerGroupSetMessagePayload of(final OrderCustomerGroupSetMessagePayload template) {
        OrderCustomerGroupSetMessagePayloadImpl instance = new OrderCustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerGroupSetMessagePayloadBuilder builder(){
        return OrderCustomerGroupSetMessagePayloadBuilder.of();
    }
    
    public static OrderCustomerGroupSetMessagePayloadBuilder builder(final OrderCustomerGroupSetMessagePayload template){
        return OrderCustomerGroupSetMessagePayloadBuilder.of(template);
    }
    

    default <T> T withOrderCustomerGroupSetMessagePayload(Function<OrderCustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
