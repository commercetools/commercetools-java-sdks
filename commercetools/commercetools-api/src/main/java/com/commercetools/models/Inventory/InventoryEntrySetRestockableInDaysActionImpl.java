package com.commercetools.models.inventory;

import com.commercetools.models.inventory.InventoryEntryUpdateAction;
import java.lang.Long;
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
public final class InventoryEntrySetRestockableInDaysActionImpl implements InventoryEntrySetRestockableInDaysAction {

   private java.lang.String action;
   
   private java.lang.Long restockableInDays;

   @JsonCreator
   InventoryEntrySetRestockableInDaysActionImpl(@JsonProperty("restockableInDays") final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      this.action = "setRestockableInDays";
   }
   public InventoryEntrySetRestockableInDaysActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }

   public void setRestockableInDays(final java.lang.Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }

}