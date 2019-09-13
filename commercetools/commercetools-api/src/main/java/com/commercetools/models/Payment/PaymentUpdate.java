package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.Long;
import com.commercetools.models.payment.PaymentUpdateImpl;

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
@JsonDeserialize(as = PaymentUpdateImpl.class)
public interface PaymentUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<PaymentUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<PaymentUpdateAction> actions);
   
   public static PaymentUpdateImpl of(){
      return new PaymentUpdateImpl();
   }
   

   public static PaymentUpdateImpl of(final PaymentUpdate template) {
      PaymentUpdateImpl instance = new PaymentUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}