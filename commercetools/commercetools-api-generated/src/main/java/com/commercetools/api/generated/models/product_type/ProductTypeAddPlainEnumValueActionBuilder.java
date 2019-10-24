package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeAddPlainEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeAddPlainEnumValueActionBuilder {
   
   
   private String attributeName;
   
   
   private com.commercetools.api.generated.models.product_type.AttributePlainEnumValue value;
   
   public ProductTypeAddPlainEnumValueActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeAddPlainEnumValueActionBuilder value( final com.commercetools.api.generated.models.product_type.AttributePlainEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributePlainEnumValue getValue(){
      return this.value;
   }

   public ProductTypeAddPlainEnumValueAction build() {
       return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
   }
   
   public static ProductTypeAddPlainEnumValueActionBuilder of() {
      return new ProductTypeAddPlainEnumValueActionBuilder();
   }
   
   public static ProductTypeAddPlainEnumValueActionBuilder of(final ProductTypeAddPlainEnumValueAction template) {
      ProductTypeAddPlainEnumValueActionBuilder builder = new ProductTypeAddPlainEnumValueActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.value = template.getValue();
      return builder;
   }
   
}