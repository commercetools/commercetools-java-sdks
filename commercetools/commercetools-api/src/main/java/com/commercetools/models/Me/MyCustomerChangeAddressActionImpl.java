package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Me.MyCustomerUpdateAction;
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
public final class MyCustomerChangeAddressActionImpl implements MyCustomerChangeAddressAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.Address address;
   
   private java.lang.String addressId;

   @JsonCreator
   MyCustomerChangeAddressActionImpl(@JsonProperty("address") final com.commercetools.models.Common.Address address, @JsonProperty("addressId") final java.lang.String addressId) {
      this.address = address;
      this.addressId = addressId;
      this.action = "changeAddress";
   }
   public MyCustomerChangeAddressActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getAddressId(){
      return this.addressId;
   }

   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }
   
   public void setAddressId(final java.lang.String addressId){
      this.addressId = addressId;
   }

}