package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.payment.TransactionState;
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
public final class PaymentTransactionStateChangedMessagePayloadImpl implements PaymentTransactionStateChangedMessagePayload {

   private String type;
   
   private com.commercetools.models.payment.TransactionState state;
   
   private String transactionId;

   @JsonCreator
   PaymentTransactionStateChangedMessagePayloadImpl(@JsonProperty("state") final com.commercetools.models.payment.TransactionState state, @JsonProperty("transactionId") final String transactionId) {
      this.state = state;
      this.transactionId = transactionId;
      this.type = "PaymentTransactionStateChanged";
   }
   public PaymentTransactionStateChangedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.payment.TransactionState getState(){
      return this.state;
   }
   
   
   public String getTransactionId(){
      return this.transactionId;
   }

   public void setState(final com.commercetools.models.payment.TransactionState state){
      this.state = state;
   }
   
   public void setTransactionId(final String transactionId){
      this.transactionId = transactionId;
   }

}