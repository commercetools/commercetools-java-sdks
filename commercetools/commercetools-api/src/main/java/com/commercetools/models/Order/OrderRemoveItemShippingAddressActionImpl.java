package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
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
public final class OrderRemoveItemShippingAddressActionImpl implements OrderRemoveItemShippingAddressAction {

   private java.lang.String action;
   
   private java.lang.String addressKey;

   @JsonCreator
   OrderRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final java.lang.String addressKey) {
      this.addressKey = addressKey;
      this.action = "removeItemShippingAddress";
   }
   public OrderRemoveItemShippingAddressActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public void setAddressKey(final java.lang.String addressKey){
      this.addressKey = addressKey;
   }

}