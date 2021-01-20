
package com.commercetools.api.models.subscription;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.subscription.DeliveryCloudEventsFormat;
import com.commercetools.api.models.subscription.DeliveryPlatformFormat;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.DeliveryCloudEventsFormatImpl.class, name = DeliveryCloudEventsFormat.CLOUD_EVENTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.DeliveryPlatformFormatImpl.class, name = DeliveryPlatformFormat.PLATFORM) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = DeliveryFormatImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DeliveryFormat {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withDeliveryFormat(Function<DeliveryFormat, T> helper) {
        return helper.apply(this);
    }
}
