package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetValidUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   public DiscountCodeSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public DiscountCodeSetValidUntilAction build() {
       return new DiscountCodeSetValidUntilActionImpl(validUntil);
   }
   
   public static DiscountCodeSetValidUntilActionBuilder of() {
      return new DiscountCodeSetValidUntilActionBuilder();
   }
   
   public static DiscountCodeSetValidUntilActionBuilder of(final DiscountCodeSetValidUntilAction template) {
      DiscountCodeSetValidUntilActionBuilder builder = new DiscountCodeSetValidUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      return builder;
   }
   
}
