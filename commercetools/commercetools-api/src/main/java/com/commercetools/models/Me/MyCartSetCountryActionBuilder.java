package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetCountryActionBuilder {
   
   @Nullable
   private String country;
   
   public MyCartSetCountryActionBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }

   public MyCartSetCountryAction build() {
       return new MyCartSetCountryActionImpl(country);
   }
   
   public static MyCartSetCountryActionBuilder of() {
      return new MyCartSetCountryActionBuilder();
   }
   
   public static MyCartSetCountryActionBuilder of(final MyCartSetCountryAction template) {
      MyCartSetCountryActionBuilder builder = new MyCartSetCountryActionBuilder();
      builder.country = template.getCountry();
      return builder;
   }
   
}