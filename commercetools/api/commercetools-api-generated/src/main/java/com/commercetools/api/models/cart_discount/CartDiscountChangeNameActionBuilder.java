package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart_discount.CartDiscountChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeNameActionBuilder {
   
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   public CartDiscountChangeNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   public CartDiscountChangeNameAction build() {
       return new CartDiscountChangeNameActionImpl(name);
   }
   
   public static CartDiscountChangeNameActionBuilder of() {
      return new CartDiscountChangeNameActionBuilder();
   }
   
   public static CartDiscountChangeNameActionBuilder of(final CartDiscountChangeNameAction template) {
      CartDiscountChangeNameActionBuilder builder = new CartDiscountChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}
