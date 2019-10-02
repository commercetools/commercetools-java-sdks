package com.commercetools.models.product;


import com.commercetools.models.product.ProductVariantChannelAvailability;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantChannelAvailabilityBuilder {
   
   @Nullable
   private Long availableQuantity;
   
   @Nullable
   private Long restockableInDays;
   
   @Nullable
   private Boolean isOnStock;
   
   public ProductVariantChannelAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
      this.isOnStock = isOnStock;
      return this;
   }
   
   @Nullable
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   @Nullable
   public Boolean getIsOnStock(){
      return this.isOnStock;
   }

   public ProductVariantChannelAvailability build() {
       return new ProductVariantChannelAvailabilityImpl(availableQuantity, restockableInDays, isOnStock);
   }
   
   public static ProductVariantChannelAvailabilityBuilder of() {
      return new ProductVariantChannelAvailabilityBuilder();
   }
   
   public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
      ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
      builder.availableQuantity = template.getAvailableQuantity();
      builder.restockableInDays = template.getRestockableInDays();
      builder.isOnStock = template.getIsOnStock();
      return builder;
   }
   
}