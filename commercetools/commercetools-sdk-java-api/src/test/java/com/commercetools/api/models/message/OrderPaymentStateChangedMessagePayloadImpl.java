package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.PaymentState;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderPaymentStateChangedMessagePayloadImpl implements OrderPaymentStateChangedMessagePayload {

    
    private String type;
    
    
    private com.commercetools.api.models.order.PaymentState paymentState;
    
    
    private com.commercetools.api.models.order.PaymentState oldPaymentState;

    @JsonCreator
    OrderPaymentStateChangedMessagePayloadImpl(@JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState, @JsonProperty("oldPaymentState") final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.paymentState = paymentState;
        this.oldPaymentState = oldPaymentState;
        this.type =  ORDER_PAYMENT_STATE_CHANGED;
    }
    public OrderPaymentStateChangedMessagePayloadImpl() {
        this.type =  ORDER_PAYMENT_STATE_CHANGED;
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.order.PaymentState getPaymentState(){
        return this.paymentState;
    }
    
    
    public com.commercetools.api.models.order.PaymentState getOldPaymentState(){
        return this.oldPaymentState;
    }

    
    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState){
        this.paymentState = paymentState;
    }
    
    
    public void setOldPaymentState(final com.commercetools.api.models.order.PaymentState oldPaymentState){
        this.oldPaymentState = oldPaymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderPaymentStateChangedMessagePayloadImpl that = (OrderPaymentStateChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(paymentState, that.paymentState)
                .append(oldPaymentState, that.oldPaymentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(paymentState)
            .append(oldPaymentState)
            .toHashCode();
    }

}
