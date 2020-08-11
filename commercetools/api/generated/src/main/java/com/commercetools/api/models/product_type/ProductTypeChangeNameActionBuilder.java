package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeNameActionBuilder {


   private String name;

   public ProductTypeChangeNameActionBuilder name( final String name) {
      this.name = name;
      return this;
   }


   public String getName(){
      return this.name;
   }

   public ProductTypeChangeNameAction build() {
       return new ProductTypeChangeNameActionImpl(name);
   }

   public static ProductTypeChangeNameActionBuilder of() {
      return new ProductTypeChangeNameActionBuilder();
   }

   public static ProductTypeChangeNameActionBuilder of(final ProductTypeChangeNameAction template) {
      ProductTypeChangeNameActionBuilder builder = new ProductTypeChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }

}
