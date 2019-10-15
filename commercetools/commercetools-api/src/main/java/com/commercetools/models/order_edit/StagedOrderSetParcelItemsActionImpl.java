package com.commercetools.models.order_edit;

import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetParcelItemsActionImpl implements StagedOrderSetParcelItemsAction {

   private String action;
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;
   
   private String parcelId;

   @JsonCreator
   StagedOrderSetParcelItemsActionImpl(@JsonProperty("items") final java.util.List<com.commercetools.models.order.DeliveryItem> items, @JsonProperty("parcelId") final String parcelId) {
      this.items = items;
      this.parcelId = parcelId;
      this.action = "setParcelItems";
   }
   public StagedOrderSetParcelItemsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setItems(final java.util.List<com.commercetools.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}