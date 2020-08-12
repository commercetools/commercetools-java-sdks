package com.commercetools.api.models.product;


import com.commercetools.api.models.product.ProductVariantChannelAvailability;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantChannelAvailabilityBuilder {
   
   @Nullable
   private Boolean isOnStock;
   
   @Nullable
   private Long restockableInDays;
   
   @Nullable
   private Long availableQuantity;
   
   public ProductVariantChannelAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
      this.isOnStock = isOnStock;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public ProductVariantChannelAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   @Nullable
   public Boolean getIsOnStock(){
      return this.isOnStock;
   }
   
   @Nullable
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   @Nullable
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }

   public ProductVariantChannelAvailability build() {
       return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
   }
   
   public static ProductVariantChannelAvailabilityBuilder of() {
      return new ProductVariantChannelAvailabilityBuilder();
   }
   
   public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
      ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
      builder.isOnStock = template.getIsOnStock();
      builder.restockableInDays = template.getRestockableInDays();
      builder.availableQuantity = template.getAvailableQuantity();
      return builder;
   }
   
}
