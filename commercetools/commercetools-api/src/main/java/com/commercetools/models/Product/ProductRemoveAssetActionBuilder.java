package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductRemoveAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveAssetActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String assetKey;
   
   public ProductRemoveAssetActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductRemoveAssetActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveAssetActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductRemoveAssetActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductRemoveAssetActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public ProductRemoveAssetAction build() {
       return new ProductRemoveAssetActionImpl(assetId, staged, variantId, sku, assetKey);
   }
   
   public static ProductRemoveAssetActionBuilder of() {
      return new ProductRemoveAssetActionBuilder();
   }
   
   public static ProductRemoveAssetActionBuilder of(final ProductRemoveAssetAction template) {
      ProductRemoveAssetActionBuilder builder = new ProductRemoveAssetActionBuilder();
      builder.assetId = template.getAssetId();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}