package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCustomerAddBillingAddressIdActionImpl;

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
@JsonDeserialize(as = MyCustomerAddBillingAddressIdActionImpl.class)
public interface MyCustomerAddBillingAddressIdAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static MyCustomerAddBillingAddressIdActionImpl of(){
      return new MyCustomerAddBillingAddressIdActionImpl();
   }
   

   public static MyCustomerAddBillingAddressIdActionImpl of(final MyCustomerAddBillingAddressIdAction template) {
      MyCustomerAddBillingAddressIdActionImpl instance = new MyCustomerAddBillingAddressIdActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}