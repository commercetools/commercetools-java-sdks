package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxMode;
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
public final class StagedOrderChangeTaxModeActionImpl implements StagedOrderChangeTaxModeAction {

   private String action;
   
   private com.commercetools.models.cart.TaxMode taxMode;

   @JsonCreator
   StagedOrderChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      this.action = "changeTaxMode";
   }
   public StagedOrderChangeTaxModeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public void setTaxMode(final com.commercetools.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }

}