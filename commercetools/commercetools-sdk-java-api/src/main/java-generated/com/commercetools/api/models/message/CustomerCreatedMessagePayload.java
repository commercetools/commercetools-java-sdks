
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.message.CustomerCreatedMessagePayloadImpl;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerCreatedMessagePayloadImpl.class)
public interface CustomerCreatedMessagePayload extends MessagePayload {

    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    public void setCustomer(final Customer customer);

    public static CustomerCreatedMessagePayload of() {
        return new CustomerCreatedMessagePayloadImpl();
    }

    public static CustomerCreatedMessagePayload of(final CustomerCreatedMessagePayload template) {
        CustomerCreatedMessagePayloadImpl instance = new CustomerCreatedMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static CustomerCreatedMessagePayloadBuilder builder() {
        return CustomerCreatedMessagePayloadBuilder.of();
    }

    public static CustomerCreatedMessagePayloadBuilder builder(final CustomerCreatedMessagePayload template) {
        return CustomerCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerCreatedMessagePayload(Function<CustomerCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
