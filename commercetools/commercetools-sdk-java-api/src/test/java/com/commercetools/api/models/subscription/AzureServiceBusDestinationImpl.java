package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AzureServiceBusDestinationImpl implements AzureServiceBusDestination {

    
    private String type;
    
    
    private String connectionString;

    @JsonCreator
    AzureServiceBusDestinationImpl(@JsonProperty("connectionString") final String connectionString) {
        this.connectionString = connectionString;
        this.type =  AZURE_SERVICE_BUS;
    }
    public AzureServiceBusDestinationImpl() {
        this.type =  AZURE_SERVICE_BUS;
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getConnectionString(){
        return this.connectionString;
    }

    
    public void setConnectionString(final String connectionString){
        this.connectionString = connectionString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AzureServiceBusDestinationImpl that = (AzureServiceBusDestinationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(connectionString, that.connectionString)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(connectionString)
            .toHashCode();
    }

}
