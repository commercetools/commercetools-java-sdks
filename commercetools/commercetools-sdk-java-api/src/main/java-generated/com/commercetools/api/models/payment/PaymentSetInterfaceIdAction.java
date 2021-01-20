
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentSetInterfaceIdActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetInterfaceIdActionImpl.class)
public interface PaymentSetInterfaceIdAction extends PaymentUpdateAction {

    @NotNull
    @JsonProperty("interfaceId")
    public String getInterfaceId();

    public void setInterfaceId(final String interfaceId);

    public static PaymentSetInterfaceIdAction of() {
        return new PaymentSetInterfaceIdActionImpl();
    }

    public static PaymentSetInterfaceIdAction of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionImpl instance = new PaymentSetInterfaceIdActionImpl();
        instance.setInterfaceId(template.getInterfaceId());
        return instance;
    }

    public static PaymentSetInterfaceIdActionBuilder builder() {
        return PaymentSetInterfaceIdActionBuilder.of();
    }

    public static PaymentSetInterfaceIdActionBuilder builder(final PaymentSetInterfaceIdAction template) {
        return PaymentSetInterfaceIdActionBuilder.of(template);
    }

    default <T> T withPaymentSetInterfaceIdAction(Function<PaymentSetInterfaceIdAction, T> helper) {
        return helper.apply(this);
    }
}
