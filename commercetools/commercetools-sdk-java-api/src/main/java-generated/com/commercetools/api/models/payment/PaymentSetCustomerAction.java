
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentSetCustomerActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetCustomerActionImpl.class)
public interface PaymentSetCustomerAction extends PaymentUpdateAction {

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static PaymentSetCustomerAction of() {
        return new PaymentSetCustomerActionImpl();
    }

    public static PaymentSetCustomerAction of(final PaymentSetCustomerAction template) {
        PaymentSetCustomerActionImpl instance = new PaymentSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static PaymentSetCustomerActionBuilder builder() {
        return PaymentSetCustomerActionBuilder.of();
    }

    public static PaymentSetCustomerActionBuilder builder(final PaymentSetCustomerAction template) {
        return PaymentSetCustomerActionBuilder.of(template);
    }

    default <T> T withPaymentSetCustomerAction(Function<PaymentSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
