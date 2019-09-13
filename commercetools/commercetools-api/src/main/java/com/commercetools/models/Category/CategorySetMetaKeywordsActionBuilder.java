package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.category.CategorySetMetaKeywordsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetMetaKeywordsActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   public CategorySetMetaKeywordsActionBuilder metaKeywords(@Nullable final com.commercetools.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }

   public CategorySetMetaKeywordsAction build() {
       return new CategorySetMetaKeywordsActionImpl(metaKeywords);
   }
   
   public static CategorySetMetaKeywordsActionBuilder of() {
      return new CategorySetMetaKeywordsActionBuilder();
   }
   
   public static CategorySetMetaKeywordsActionBuilder of(final CategorySetMetaKeywordsAction template) {
      CategorySetMetaKeywordsActionBuilder builder = new CategorySetMetaKeywordsActionBuilder();
      builder.metaKeywords = template.getMetaKeywords();
      return builder;
   }
   
}