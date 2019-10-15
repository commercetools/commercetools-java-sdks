package com.commercetools.models.order_edit;

import com.commercetools.models.order.ReturnShipmentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetReturnShipmentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderSetReturnShipmentStateActionImpl.class)
public interface StagedOrderSetReturnShipmentStateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("returnItemId")
   public String getReturnItemId();
   
   @NotNull
   @JsonProperty("shipmentState")
   public ReturnShipmentState getShipmentState();

   public void setReturnItemId(final String returnItemId);
   
   public void setShipmentState(final ReturnShipmentState shipmentState);
   
   public static StagedOrderSetReturnShipmentStateActionImpl of(){
      return new StagedOrderSetReturnShipmentStateActionImpl();
   }
   

   public static StagedOrderSetReturnShipmentStateActionImpl of(final StagedOrderSetReturnShipmentStateAction template) {
      StagedOrderSetReturnShipmentStateActionImpl instance = new StagedOrderSetReturnShipmentStateActionImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setReturnItemId(template.getReturnItemId());
      return instance;
   }

}