
package com.commercetools.api.models.payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetAuthorizationActionImpl.class)
public interface PaymentSetAuthorizationAction extends PaymentUpdateAction {

    String SET_AUTHORIZATION = "setAuthorization";

    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    @JsonProperty("until")
    public ZonedDateTime getUntil();

    public void setAmount(final Money amount);

    public void setUntil(final ZonedDateTime until);

    public static PaymentSetAuthorizationAction of() {
        return new PaymentSetAuthorizationActionImpl();
    }

    public static PaymentSetAuthorizationAction of(final PaymentSetAuthorizationAction template) {
        PaymentSetAuthorizationActionImpl instance = new PaymentSetAuthorizationActionImpl();
        instance.setAmount(template.getAmount());
        instance.setUntil(template.getUntil());
        return instance;
    }

    public static PaymentSetAuthorizationActionBuilder builder() {
        return PaymentSetAuthorizationActionBuilder.of();
    }

    public static PaymentSetAuthorizationActionBuilder builder(final PaymentSetAuthorizationAction template) {
        return PaymentSetAuthorizationActionBuilder.of(template);
    }

    default <T> T withPaymentSetAuthorizationAction(Function<PaymentSetAuthorizationAction, T> helper) {
        return helper.apply(this);
    }
}
