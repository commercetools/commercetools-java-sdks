package com.commercetools.models.Me;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.TransactionType;
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
public final class MyTransactionDraftImpl implements MyTransactionDraft {

   private java.lang.String interactionId;
   
   private com.commercetools.models.Common.Money amount;
   
   private com.commercetools.models.Payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   MyTransactionDraftImpl(@JsonProperty("interactionId") final java.lang.String interactionId, @JsonProperty("amount") final com.commercetools.models.Common.Money amount, @JsonProperty("type") final com.commercetools.models.Payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.type = type;
      this.timestamp = timestamp;
   }
   public MyTransactionDraftImpl() {
      
   }
   
   
   public java.lang.String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.models.Payment.TransactionType getType(){
      return this.type;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final java.lang.String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.models.Common.Money amount){
      this.amount = amount;
   }
   
   public void setType(final com.commercetools.models.Payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}