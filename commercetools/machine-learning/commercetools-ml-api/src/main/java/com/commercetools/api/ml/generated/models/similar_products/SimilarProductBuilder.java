package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProduct;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductBuilder {
   
   @Nullable
   private com.commercetools.api.ml.generated.models.common.ProductReference product;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta meta;
   
   public SimilarProductBuilder product(@Nullable final com.commercetools.api.ml.generated.models.common.ProductReference product) {
      this.product = product;
      return this;
   }
   
   public SimilarProductBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public SimilarProductBuilder meta(@Nullable final com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta meta) {
      this.meta = meta;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.ml.generated.models.common.ProductReference getProduct(){
      return this.product;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta getMeta(){
      return this.meta;
   }

   public SimilarProduct build() {
       return new SimilarProductImpl(product, variantId, meta);
   }
   
   public static SimilarProductBuilder of() {
      return new SimilarProductBuilder();
   }
   
   public static SimilarProductBuilder of(final SimilarProduct template) {
      SimilarProductBuilder builder = new SimilarProductBuilder();
      builder.product = template.getProduct();
      builder.variantId = template.getVariantId();
      builder.meta = template.getMeta();
      return builder;
   }
   
}
