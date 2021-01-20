
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifierImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentResourceIdentifierImpl.class)
public interface PaymentResourceIdentifier extends ResourceIdentifier {

    String PAYMENT = "payment";

    public static PaymentResourceIdentifier of() {
        return new PaymentResourceIdentifierImpl();
    }

    public static PaymentResourceIdentifier of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierImpl instance = new PaymentResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentResourceIdentifierBuilder builder() {
        return PaymentResourceIdentifierBuilder.of();
    }

    public static PaymentResourceIdentifierBuilder builder(final PaymentResourceIdentifier template) {
        return PaymentResourceIdentifierBuilder.of(template);
    }

    default <T> T withPaymentResourceIdentifier(Function<PaymentResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
