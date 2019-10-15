package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCountryActionBuilder {
   
   @Nullable
   private String country;
   
   public StagedOrderSetCountryActionBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }

   public StagedOrderSetCountryAction build() {
       return new StagedOrderSetCountryActionImpl(country);
   }
   
   public static StagedOrderSetCountryActionBuilder of() {
      return new StagedOrderSetCountryActionBuilder();
   }
   
   public static StagedOrderSetCountryActionBuilder of(final StagedOrderSetCountryAction template) {
      StagedOrderSetCountryActionBuilder builder = new StagedOrderSetCountryActionBuilder();
      builder.country = template.getCountry();
      return builder;
   }
   
}