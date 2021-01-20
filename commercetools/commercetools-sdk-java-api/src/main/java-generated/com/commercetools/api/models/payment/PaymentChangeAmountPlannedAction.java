
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentChangeAmountPlannedActionImpl.class)
public interface PaymentChangeAmountPlannedAction extends PaymentUpdateAction {

    String CHANGE_AMOUNT_PLANNED = "changeAmountPlanned";

    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static PaymentChangeAmountPlannedAction of() {
        return new PaymentChangeAmountPlannedActionImpl();
    }

    public static PaymentChangeAmountPlannedAction of(final PaymentChangeAmountPlannedAction template) {
        PaymentChangeAmountPlannedActionImpl instance = new PaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static PaymentChangeAmountPlannedActionBuilder builder() {
        return PaymentChangeAmountPlannedActionBuilder.of();
    }

    public static PaymentChangeAmountPlannedActionBuilder builder(final PaymentChangeAmountPlannedAction template) {
        return PaymentChangeAmountPlannedActionBuilder.of(template);
    }

    default <T> T withPaymentChangeAmountPlannedAction(Function<PaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }
}
