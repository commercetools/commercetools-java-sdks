package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.payment.TransactionState;
import java.lang.String;
import com.commercetools.models.message.PaymentTransactionStateChangedMessageImpl;

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
@JsonDeserialize(as = PaymentTransactionStateChangedMessageImpl.class)
public interface PaymentTransactionStateChangedMessage extends Message {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("state")
   public TransactionState getState();

   public void setTransactionId(final String transactionId);
   
   public void setState(final TransactionState state);
   
   public static PaymentTransactionStateChangedMessageImpl of(){
      return new PaymentTransactionStateChangedMessageImpl();
   }
   

   public static PaymentTransactionStateChangedMessageImpl of(final PaymentTransactionStateChangedMessage template) {
      PaymentTransactionStateChangedMessageImpl instance = new PaymentTransactionStateChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setState(template.getState());
      instance.setTransactionId(template.getTransactionId());
      return instance;
   }

}