
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentSetAnonymousIdActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetAnonymousIdActionImpl.class)
public interface PaymentSetAnonymousIdAction extends PaymentUpdateAction {

    /**
    *  <p>Anonymous ID of the anonymous customer that this payment belongs to.
    *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    public void setAnonymousId(final String anonymousId);

    public static PaymentSetAnonymousIdAction of() {
        return new PaymentSetAnonymousIdActionImpl();
    }

    public static PaymentSetAnonymousIdAction of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionImpl instance = new PaymentSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static PaymentSetAnonymousIdActionBuilder builder() {
        return PaymentSetAnonymousIdActionBuilder.of();
    }

    public static PaymentSetAnonymousIdActionBuilder builder(final PaymentSetAnonymousIdAction template) {
        return PaymentSetAnonymousIdActionBuilder.of(template);
    }

    default <T> T withPaymentSetAnonymousIdAction(Function<PaymentSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }
}
