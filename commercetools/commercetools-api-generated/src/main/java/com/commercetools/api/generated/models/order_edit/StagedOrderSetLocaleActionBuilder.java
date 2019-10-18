package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public StagedOrderSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public StagedOrderSetLocaleAction build() {
       return new StagedOrderSetLocaleActionImpl(locale);
   }
   
   public static StagedOrderSetLocaleActionBuilder of() {
      return new StagedOrderSetLocaleActionBuilder();
   }
   
   public static StagedOrderSetLocaleActionBuilder of(final StagedOrderSetLocaleAction template) {
      StagedOrderSetLocaleActionBuilder builder = new StagedOrderSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}