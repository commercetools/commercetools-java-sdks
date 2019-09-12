package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartAddItemShippingAddressActionImpl;

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
@JsonDeserialize(as = MyCartAddItemShippingAddressActionImpl.class)
public interface MyCartAddItemShippingAddressAction extends MyCartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static MyCartAddItemShippingAddressActionImpl of(){
      return new MyCartAddItemShippingAddressActionImpl();
   }
   

   public static MyCartAddItemShippingAddressActionImpl of(final MyCartAddItemShippingAddressAction template) {
      MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}