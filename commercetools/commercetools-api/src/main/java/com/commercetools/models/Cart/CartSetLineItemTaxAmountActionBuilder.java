package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.cart.CartSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLineItemTaxAmountActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public CartSetLineItemTaxAmountActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public CartSetLineItemTaxAmountAction build() {
       return new CartSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount);
   }
   
   public static CartSetLineItemTaxAmountActionBuilder of() {
      return new CartSetLineItemTaxAmountActionBuilder();
   }
   
   public static CartSetLineItemTaxAmountActionBuilder of(final CartSetLineItemTaxAmountAction template) {
      CartSetLineItemTaxAmountActionBuilder builder = new CartSetLineItemTaxAmountActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}