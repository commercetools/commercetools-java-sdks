package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
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
public final class MyShoppingListChangeLineItemsOrderActionImpl implements MyShoppingListChangeLineItemsOrderAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> lineItemOrder;

   @JsonCreator
   MyShoppingListChangeLineItemsOrderActionImpl(@JsonProperty("lineItemOrder") final java.util.List<java.lang.String> lineItemOrder) {
      this.lineItemOrder = lineItemOrder;
      this.action = "changeLineItemsOrder";
   }
   public MyShoppingListChangeLineItemsOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getLineItemOrder(){
      return this.lineItemOrder;
   }

   public void setLineItemOrder(final java.util.List<java.lang.String> lineItemOrder){
      this.lineItemOrder = lineItemOrder;
   }

}