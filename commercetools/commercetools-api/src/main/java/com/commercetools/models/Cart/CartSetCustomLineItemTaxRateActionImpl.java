package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxRateDraft;
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
public final class CartSetCustomLineItemTaxRateActionImpl implements CartSetCustomLineItemTaxRateAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;

   @JsonCreator
   CartSetCustomLineItemTaxRateActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("externalTaxRate") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.customLineItemId = customLineItemId;
      this.externalTaxRate = externalTaxRate;
      this.action = "setCustomLineItemTaxRate";
   }
   public CartSetCustomLineItemTaxRateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setExternalTaxRate(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }

}