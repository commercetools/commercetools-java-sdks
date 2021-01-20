
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentChangeTransactionInteractionIdActionImpl.class)
public interface PaymentChangeTransactionInteractionIdAction extends PaymentUpdateAction {

    String CHANGE_TRANSACTION_INTERACTION_ID = "changeTransactionInteractionId";

    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    @NotNull
    @JsonProperty("interactionId")
    public String getInteractionId();

    public void setTransactionId(final String transactionId);

    public void setInteractionId(final String interactionId);

    public static PaymentChangeTransactionInteractionIdAction of() {
        return new PaymentChangeTransactionInteractionIdActionImpl();
    }

    public static PaymentChangeTransactionInteractionIdAction of(
            final PaymentChangeTransactionInteractionIdAction template) {
        PaymentChangeTransactionInteractionIdActionImpl instance = new PaymentChangeTransactionInteractionIdActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setInteractionId(template.getInteractionId());
        return instance;
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder builder() {
        return PaymentChangeTransactionInteractionIdActionBuilder.of();
    }

    public static PaymentChangeTransactionInteractionIdActionBuilder builder(
            final PaymentChangeTransactionInteractionIdAction template) {
        return PaymentChangeTransactionInteractionIdActionBuilder.of(template);
    }

    default <T> T withPaymentChangeTransactionInteractionIdAction(
            Function<PaymentChangeTransactionInteractionIdAction, T> helper) {
        return helper.apply(this);
    }
}
