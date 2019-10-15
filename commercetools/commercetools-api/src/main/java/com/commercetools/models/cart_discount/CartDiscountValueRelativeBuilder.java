package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountValue;
import com.commercetools.models.cart_discount.CartDiscountValueRelative;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueRelativeBuilder {
   
   
   private Long permyriad;
   
   public CartDiscountValueRelativeBuilder permyriad( final Long permyriad) {
      this.permyriad = permyriad;
      return this;
   }
   
   
   public Long getPermyriad(){
      return this.permyriad;
   }

   public CartDiscountValueRelative build() {
       return new CartDiscountValueRelativeImpl(permyriad);
   }
   
   public static CartDiscountValueRelativeBuilder of() {
      return new CartDiscountValueRelativeBuilder();
   }
   
   public static CartDiscountValueRelativeBuilder of(final CartDiscountValueRelative template) {
      CartDiscountValueRelativeBuilder builder = new CartDiscountValueRelativeBuilder();
      builder.permyriad = template.getPermyriad();
      return builder;
   }
   
}