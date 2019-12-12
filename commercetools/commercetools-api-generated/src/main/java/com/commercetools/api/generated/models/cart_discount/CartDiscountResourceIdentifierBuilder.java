package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.cart_discount.CartDiscountResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public CartDiscountResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public CartDiscountResourceIdentifier build() {
       return new CartDiscountResourceIdentifierImpl(id, key);
   }
   
   public static CartDiscountResourceIdentifierBuilder of() {
      return new CartDiscountResourceIdentifierBuilder();
   }
   
   public static CartDiscountResourceIdentifierBuilder of(final CartDiscountResourceIdentifier template) {
      CartDiscountResourceIdentifierBuilder builder = new CartDiscountResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}