package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.PayloadNotIncluded;
import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.MessageDeliveryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MessageDeliveryImpl.class)
public interface MessageDelivery extends SubscriptionDelivery {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    
    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();
    
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();
    
    @NotNull
    @Valid
    @JsonProperty("payloadNotIncluded")
    public PayloadNotIncluded getPayloadNotIncluded();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setSequenceNumber(final Long sequenceNumber);
    
    public void setResourceVersion(final Long resourceVersion);
    
    public void setPayloadNotIncluded(final PayloadNotIncluded payloadNotIncluded);

    public static MessageDeliveryImpl of(){
        return new MessageDeliveryImpl();
    }
    

    public static MessageDeliveryImpl of(final MessageDelivery template) {
        MessageDeliveryImpl instance = new MessageDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setPayloadNotIncluded(template.getPayloadNotIncluded());
        return instance;
    }

}
