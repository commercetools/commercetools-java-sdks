package com.commercetools.models.subscription;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.subscription.ChangeSubscription;
import com.commercetools.models.subscription.DeliveryFormat;
import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.MessageSubscription;
import com.commercetools.models.subscription.SubscriptionHealthStatus;
import com.commercetools.models.subscription.SubscriptionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = SubscriptionImpl.class)
public interface Subscription extends LoggedResource {

   
   @NotNull
   @Valid
   @JsonProperty("changes")
   public List<ChangeSubscription> getChanges();
   
   @NotNull
   @Valid
   @JsonProperty("destination")
   public Destination getDestination();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("messages")
   public List<MessageSubscription> getMessages();
   
   @NotNull
   @Valid
   @JsonProperty("format")
   public DeliveryFormat getFormat();
   
   @NotNull
   @JsonProperty("status")
   public SubscriptionHealthStatus getStatus();

   public void setChanges(final List<ChangeSubscription> changes);
   
   public void setDestination(final Destination destination);
   
   public void setKey(final String key);
   
   public void setMessages(final List<MessageSubscription> messages);
   
   public void setFormat(final DeliveryFormat format);
   
   public void setStatus(final SubscriptionHealthStatus status);
   
   public static SubscriptionImpl of(){
      return new SubscriptionImpl();
   }
   

   public static SubscriptionImpl of(final Subscription template) {
      SubscriptionImpl instance = new SubscriptionImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setFormat(template.getFormat());
      instance.setDestination(template.getDestination());
      instance.setChanges(template.getChanges());
      instance.setMessages(template.getMessages());
      instance.setKey(template.getKey());
      instance.setStatus(template.getStatus());
      return instance;
   }

}