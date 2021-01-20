
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCartAddPaymentActionImpl;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartAddPaymentActionImpl.class)
public interface MyCartAddPaymentAction extends MyCartUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static MyCartAddPaymentAction of() {
        return new MyCartAddPaymentActionImpl();
    }

    public static MyCartAddPaymentAction of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionImpl instance = new MyCartAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static MyCartAddPaymentActionBuilder builder() {
        return MyCartAddPaymentActionBuilder.of();
    }

    public static MyCartAddPaymentActionBuilder builder(final MyCartAddPaymentAction template) {
        return MyCartAddPaymentActionBuilder.of(template);
    }

    default <T> T withMyCartAddPaymentAction(Function<MyCartAddPaymentAction, T> helper) {
        return helper.apply(this);
    }
}
