package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.order.OrderAddPaymentActionImpl;

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
@JsonDeserialize(as = OrderAddPaymentActionImpl.class)
public interface OrderAddPaymentAction extends OrderUpdateAction {

    String ADD_PAYMENT = "addPayment";

    
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    
    public void setPayment(final PaymentResourceIdentifier payment);
    

    public static OrderAddPaymentAction of(){
        return new OrderAddPaymentActionImpl();
    }
    

    public static OrderAddPaymentAction of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionImpl instance = new OrderAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderAddPaymentActionBuilder builder(){
        return OrderAddPaymentActionBuilder.of();
    }
    
    public static OrderAddPaymentActionBuilder builder(final OrderAddPaymentAction template){
        return OrderAddPaymentActionBuilder.of(template);
    }
    

    default <T> T withOrderAddPaymentAction(Function<OrderAddPaymentAction, T> helper) {
        return helper.apply(this);
    }
}
