package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public MyCartSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public MyCartSetLocaleAction build() {
       return new MyCartSetLocaleActionImpl(locale);
   }
   
   public static MyCartSetLocaleActionBuilder of() {
      return new MyCartSetLocaleActionBuilder();
   }
   
   public static MyCartSetLocaleActionBuilder of(final MyCartSetLocaleAction template) {
      MyCartSetLocaleActionBuilder builder = new MyCartSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}