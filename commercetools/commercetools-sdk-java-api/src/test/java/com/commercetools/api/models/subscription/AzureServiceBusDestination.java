package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.AzureServiceBusDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AzureServiceBusDestinationImpl.class)
public interface AzureServiceBusDestination extends Destination {

    String AZURE_SERVICE_BUS = "AzureServiceBus";

    
    @NotNull
    @JsonProperty("connectionString")
    public String getConnectionString();

    
    public void setConnectionString(final String connectionString);
    

    public static AzureServiceBusDestination of(){
        return new AzureServiceBusDestinationImpl();
    }
    

    public static AzureServiceBusDestination of(final AzureServiceBusDestination template) {
        AzureServiceBusDestinationImpl instance = new AzureServiceBusDestinationImpl();
        instance.setConnectionString(template.getConnectionString());
        return instance;
    }

    public static AzureServiceBusDestinationBuilder builder(){
        return AzureServiceBusDestinationBuilder.of();
    }
    
    public static AzureServiceBusDestinationBuilder builder(final AzureServiceBusDestination template){
        return AzureServiceBusDestinationBuilder.of(template);
    }
    

    default <T> T withAzureServiceBusDestination(Function<AzureServiceBusDestination, T> helper) {
        return helper.apply(this);
    }
}
