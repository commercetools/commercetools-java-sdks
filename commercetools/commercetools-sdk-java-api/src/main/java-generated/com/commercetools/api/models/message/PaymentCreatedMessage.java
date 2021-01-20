
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.PaymentCreatedMessageImpl;
import com.commercetools.api.models.payment.Payment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentCreatedMessageImpl.class)
public interface PaymentCreatedMessage extends Message {

    @NotNull
    @Valid
    @JsonProperty("payment")
    public Payment getPayment();

    public void setPayment(final Payment payment);

    public static PaymentCreatedMessage of() {
        return new PaymentCreatedMessageImpl();
    }

    public static PaymentCreatedMessage of(final PaymentCreatedMessage template) {
        PaymentCreatedMessageImpl instance = new PaymentCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static PaymentCreatedMessageBuilder builder() {
        return PaymentCreatedMessageBuilder.of();
    }

    public static PaymentCreatedMessageBuilder builder(final PaymentCreatedMessage template) {
        return PaymentCreatedMessageBuilder.of(template);
    }

    default <T> T withPaymentCreatedMessage(Function<PaymentCreatedMessage, T> helper) {
        return helper.apply(this);
    }
}
