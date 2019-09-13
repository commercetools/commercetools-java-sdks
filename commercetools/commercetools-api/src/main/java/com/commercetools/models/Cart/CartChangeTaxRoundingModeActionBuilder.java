package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.RoundingMode;
import java.lang.String;
import com.commercetools.models.cart.CartChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeTaxRoundingModeActionBuilder {
   
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   public CartChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   public CartChangeTaxRoundingModeAction build() {
       return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
   }
   
   public static CartChangeTaxRoundingModeActionBuilder of() {
      return new CartChangeTaxRoundingModeActionBuilder();
   }
   
   public static CartChangeTaxRoundingModeActionBuilder of(final CartChangeTaxRoundingModeAction template) {
      CartChangeTaxRoundingModeActionBuilder builder = new CartChangeTaxRoundingModeActionBuilder();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      return builder;
   }
   
}