package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentUpdateAction;
import com.commercetools.models.Payment.TransactionDraft;
import java.lang.String;
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
public final class MyPaymentAddTransactionActionImpl implements MyPaymentAddTransactionAction {

   private java.lang.String action;
   
   private com.commercetools.models.Payment.TransactionDraft transaction;

   @JsonCreator
   MyPaymentAddTransactionActionImpl(@JsonProperty("transaction") final com.commercetools.models.Payment.TransactionDraft transaction) {
      this.transaction = transaction;
      this.action = "addTransaction";
   }
   public MyPaymentAddTransactionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Payment.TransactionDraft getTransaction(){
      return this.transaction;
   }

   public void setTransaction(final com.commercetools.models.Payment.TransactionDraft transaction){
      this.transaction = transaction;
   }

}