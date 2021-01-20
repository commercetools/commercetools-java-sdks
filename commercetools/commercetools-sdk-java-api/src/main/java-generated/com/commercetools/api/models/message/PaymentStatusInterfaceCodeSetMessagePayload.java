
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentStatusInterfaceCodeSetMessagePayloadImpl.class)
public interface PaymentStatusInterfaceCodeSetMessagePayload extends MessagePayload {

    @NotNull
    @JsonProperty("paymentId")
    public String getPaymentId();

    @NotNull
    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setPaymentId(final String paymentId);

    public void setInterfaceCode(final String interfaceCode);

    public static PaymentStatusInterfaceCodeSetMessagePayload of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl();
    }

    public static PaymentStatusInterfaceCodeSetMessagePayload of(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadImpl instance = new PaymentStatusInterfaceCodeSetMessagePayloadImpl();
        instance.setPaymentId(template.getPaymentId());
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder() {
        return PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        return PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of(template);
    }

    default <T> T withPaymentStatusInterfaceCodeSetMessagePayload(
            Function<PaymentStatusInterfaceCodeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
