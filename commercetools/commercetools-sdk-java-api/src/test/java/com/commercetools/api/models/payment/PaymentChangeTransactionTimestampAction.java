package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionImpl;

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
@JsonDeserialize(as = PaymentChangeTransactionTimestampActionImpl.class)
public interface PaymentChangeTransactionTimestampAction extends PaymentUpdateAction {

    String CHANGE_TRANSACTION_TIMESTAMP = "changeTransactionTimestamp";

    
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();
    
    @NotNull
    @JsonProperty("timestamp")
    public ZonedDateTime getTimestamp();

    
    public void setTransactionId(final String transactionId);
    
    
    
    public void setTimestamp(final ZonedDateTime timestamp);
    

    public static PaymentChangeTransactionTimestampAction of(){
        return new PaymentChangeTransactionTimestampActionImpl();
    }
    

    public static PaymentChangeTransactionTimestampAction of(final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionImpl instance = new PaymentChangeTransactionTimestampActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setTimestamp(template.getTimestamp());
        return instance;
    }

    public static PaymentChangeTransactionTimestampActionBuilder builder(){
        return PaymentChangeTransactionTimestampActionBuilder.of();
    }
    
    public static PaymentChangeTransactionTimestampActionBuilder builder(final PaymentChangeTransactionTimestampAction template){
        return PaymentChangeTransactionTimestampActionBuilder.of(template);
    }
    

    default <T> T withPaymentChangeTransactionTimestampAction(Function<PaymentChangeTransactionTimestampAction, T> helper) {
        return helper.apply(this);
    }
}
