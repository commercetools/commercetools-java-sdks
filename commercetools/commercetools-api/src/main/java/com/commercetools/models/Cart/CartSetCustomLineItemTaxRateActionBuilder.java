package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemTaxRateActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public CartSetCustomLineItemTaxRateActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public CartSetCustomLineItemTaxRateAction build() {
       return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
   }
   
   public static CartSetCustomLineItemTaxRateActionBuilder of() {
      return new CartSetCustomLineItemTaxRateActionBuilder();
   }
   
   public static CartSetCustomLineItemTaxRateActionBuilder of(final CartSetCustomLineItemTaxRateAction template) {
      CartSetCustomLineItemTaxRateActionBuilder builder = new CartSetCustomLineItemTaxRateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}