
package com.commercetools.api.models.subscription;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.subscription.AzureEventGridDestinationImpl;
import com.commercetools.api.models.subscription.Destination;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AzureEventGridDestinationImpl.class)
public interface AzureEventGridDestination extends Destination {

    @NotNull
    @JsonProperty("uri")
    public String getUri();

    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    public void setUri(final String uri);

    public void setAccessKey(final String accessKey);

    public static AzureEventGridDestination of() {
        return new AzureEventGridDestinationImpl();
    }

    public static AzureEventGridDestination of(final AzureEventGridDestination template) {
        AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
        instance.setUri(template.getUri());
        instance.setAccessKey(template.getAccessKey());
        return instance;
    }

    public static AzureEventGridDestinationBuilder builder() {
        return AzureEventGridDestinationBuilder.of();
    }

    public static AzureEventGridDestinationBuilder builder(final AzureEventGridDestination template) {
        return AzureEventGridDestinationBuilder.of(template);
    }

    default <T> T withAzureEventGridDestination(Function<AzureEventGridDestination, T> helper) {
        return helper.apply(this);
    }
}
