package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategory obj;
   
   public TaxCategoryReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategory obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategory getObj(){
      return this.obj;
   }

   public TaxCategoryReference build() {
       return new TaxCategoryReferenceImpl(id, obj);
   }
   
   public static TaxCategoryReferenceBuilder of() {
      return new TaxCategoryReferenceBuilder();
   }
   
   public static TaxCategoryReferenceBuilder of(final TaxCategoryReference template) {
      TaxCategoryReferenceBuilder builder = new TaxCategoryReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}