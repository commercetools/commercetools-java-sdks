package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeRemoveAttributeDefinitionActionBuilder {


   private String name;

   public ProductTypeRemoveAttributeDefinitionActionBuilder name( final String name) {
      this.name = name;
      return this;
   }


   public String getName(){
      return this.name;
   }

   public ProductTypeRemoveAttributeDefinitionAction build() {
       return new ProductTypeRemoveAttributeDefinitionActionImpl(name);
   }

   public static ProductTypeRemoveAttributeDefinitionActionBuilder of() {
      return new ProductTypeRemoveAttributeDefinitionActionBuilder();
   }

   public static ProductTypeRemoveAttributeDefinitionActionBuilder of(final ProductTypeRemoveAttributeDefinitionAction template) {
      ProductTypeRemoveAttributeDefinitionActionBuilder builder = new ProductTypeRemoveAttributeDefinitionActionBuilder();
      builder.name = template.getName();
      return builder;
   }

}
