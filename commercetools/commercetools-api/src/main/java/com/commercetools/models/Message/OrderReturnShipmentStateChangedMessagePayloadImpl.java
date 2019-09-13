package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.ReturnShipmentState;
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
public final class OrderReturnShipmentStateChangedMessagePayloadImpl implements OrderReturnShipmentStateChangedMessagePayload {

   private java.lang.String type;
   
   private java.lang.String returnItemId;
   
   private com.commercetools.models.order.ReturnShipmentState returnShipmentState;

   @JsonCreator
   OrderReturnShipmentStateChangedMessagePayloadImpl(@JsonProperty("returnItemId") final java.lang.String returnItemId, @JsonProperty("returnShipmentState") final com.commercetools.models.order.ReturnShipmentState returnShipmentState) {
      this.returnItemId = returnItemId;
      this.returnShipmentState = returnShipmentState;
      this.type = "OrderReturnShipmentStateChanged";
   }
   public OrderReturnShipmentStateChangedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getReturnShipmentState(){
      return this.returnShipmentState;
   }

   public void setReturnItemId(final java.lang.String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setReturnShipmentState(final com.commercetools.models.order.ReturnShipmentState returnShipmentState){
      this.returnShipmentState = returnShipmentState;
   }

}