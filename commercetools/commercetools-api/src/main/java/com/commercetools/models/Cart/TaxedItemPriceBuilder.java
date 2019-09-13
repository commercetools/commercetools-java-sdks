package com.commercetools.models.cart;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.TaxedItemPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxedItemPriceBuilder {
   
   
   private com.commercetools.models.common.TypedMoney totalGross;
   
   
   private com.commercetools.models.common.TypedMoney totalNet;
   
   public TaxedItemPriceBuilder totalGross( final com.commercetools.models.common.TypedMoney totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedItemPriceBuilder totalNet( final com.commercetools.models.common.TypedMoney totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalNet(){
      return this.totalNet;
   }

   public TaxedItemPrice build() {
       return new TaxedItemPriceImpl(totalGross, totalNet);
   }
   
   public static TaxedItemPriceBuilder of() {
      return new TaxedItemPriceBuilder();
   }
   
   public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
      TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
      builder.totalGross = template.getTotalGross();
      builder.totalNet = template.getTotalNet();
      return builder;
   }
   
}