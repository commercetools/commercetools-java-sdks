
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadImpl;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordUpdatedMessagePayloadImpl.class)
public interface CustomerPasswordUpdatedMessagePayload extends MessagePayload {

    /**
    *  <p>true, if password has been updated during Customer's Password Reset workflow.</p>
    */
    @NotNull
    @JsonProperty("reset")
    public Boolean getReset();

    public void setReset(final Boolean reset);

    public static CustomerPasswordUpdatedMessagePayload of() {
        return new CustomerPasswordUpdatedMessagePayloadImpl();
    }

    public static CustomerPasswordUpdatedMessagePayload of(final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadImpl instance = new CustomerPasswordUpdatedMessagePayloadImpl();
        instance.setReset(template.getReset());
        return instance;
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder builder() {
        return CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder builder(
            final CustomerPasswordUpdatedMessagePayload template) {
        return CustomerPasswordUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerPasswordUpdatedMessagePayload(Function<CustomerPasswordUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
