package com.commercetools.ml.models.category_recommendations;


import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectCategoryRecommendationMetaBuilder {
   
   @Nullable
   private String productName;
   
   @Nullable
   private String productImageUrl;
   
   
   private java.util.List<String> generalCategoryNames;
   
   public ProjectCategoryRecommendationMetaBuilder productName(@Nullable final String productName) {
      this.productName = productName;
      return this;
   }
   
   public ProjectCategoryRecommendationMetaBuilder productImageUrl(@Nullable final String productImageUrl) {
      this.productImageUrl = productImageUrl;
      return this;
   }
   
   public ProjectCategoryRecommendationMetaBuilder generalCategoryNames( final java.util.List<String> generalCategoryNames) {
      this.generalCategoryNames = generalCategoryNames;
      return this;
   }
   
   @Nullable
   public String getProductName(){
      return this.productName;
   }
   
   @Nullable
   public String getProductImageUrl(){
      return this.productImageUrl;
   }
   
   
   public java.util.List<String> getGeneralCategoryNames(){
      return this.generalCategoryNames;
   }

   public ProjectCategoryRecommendationMeta build() {
       return new ProjectCategoryRecommendationMetaImpl(productName, productImageUrl, generalCategoryNames);
   }
   
   public static ProjectCategoryRecommendationMetaBuilder of() {
      return new ProjectCategoryRecommendationMetaBuilder();
   }
   
   public static ProjectCategoryRecommendationMetaBuilder of(final ProjectCategoryRecommendationMeta template) {
      ProjectCategoryRecommendationMetaBuilder builder = new ProjectCategoryRecommendationMetaBuilder();
      builder.productName = template.getProductName();
      builder.productImageUrl = template.getProductImageUrl();
      builder.generalCategoryNames = template.getGeneralCategoryNames();
      return builder;
   }
   
}
