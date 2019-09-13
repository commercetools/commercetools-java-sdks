package com.commercetools.models.order;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderUpdateSyncInfoActionImpl implements OrderUpdateSyncInfoAction {

   private java.lang.String action;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier channel;
   
   private java.lang.String externalId;
   
   private java.time.ZonedDateTime syncedAt;

   @JsonCreator
   OrderUpdateSyncInfoActionImpl(@JsonProperty("channel") final com.commercetools.models.channel.ChannelResourceIdentifier channel, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
      this.channel = channel;
      this.externalId = externalId;
      this.syncedAt = syncedAt;
      this.action = "updateSyncInfo";
   }
   public OrderUpdateSyncInfoActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.ZonedDateTime getSyncedAt(){
      return this.syncedAt;
   }

   public void setChannel(final com.commercetools.models.channel.ChannelResourceIdentifier channel){
      this.channel = channel;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
      this.syncedAt = syncedAt;
   }

}