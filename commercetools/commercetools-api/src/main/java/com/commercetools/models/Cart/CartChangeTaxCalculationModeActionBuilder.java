package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.TaxCalculationMode;
import java.lang.String;
import com.commercetools.models.cart.CartChangeTaxCalculationModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeTaxCalculationModeActionBuilder {
   
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   public CartChangeTaxCalculationModeActionBuilder taxCalculationMode( final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public CartChangeTaxCalculationModeAction build() {
       return new CartChangeTaxCalculationModeActionImpl(taxCalculationMode);
   }
   
   public static CartChangeTaxCalculationModeActionBuilder of() {
      return new CartChangeTaxCalculationModeActionBuilder();
   }
   
   public static CartChangeTaxCalculationModeActionBuilder of(final CartChangeTaxCalculationModeAction template) {
      CartChangeTaxCalculationModeActionBuilder builder = new CartChangeTaxCalculationModeActionBuilder();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      return builder;
   }
   
}