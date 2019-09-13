package com.commercetools.models.payment;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.payment.PaymentUpdateAction;
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
public final class PaymentSetMethodInfoNameActionImpl implements PaymentSetMethodInfoNameAction {

   private java.lang.String action;
   
   private com.commercetools.models.common.LocalizedString name;

   @JsonCreator
   PaymentSetMethodInfoNameActionImpl(@JsonProperty("name") final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      this.action = "setMethodInfoName";
   }
   public PaymentSetMethodInfoNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }

}