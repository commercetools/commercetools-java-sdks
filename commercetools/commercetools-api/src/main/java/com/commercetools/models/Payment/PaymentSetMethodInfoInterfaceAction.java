package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetMethodInfoInterfaceActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("interface")
   public String getInterface();

   public void setInterface(final String _interface);
   
   public static PaymentSetMethodInfoInterfaceActionImpl of(){
      return new PaymentSetMethodInfoInterfaceActionImpl();
   }
   

   public static PaymentSetMethodInfoInterfaceActionImpl of(final PaymentSetMethodInfoInterfaceAction template) {
      PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
      instance.setInterface(template.getInterface());
      return instance;
   }

}