package com.commercetools.models.product;

import com.commercetools.models.product.FacetResult;
import com.commercetools.models.product.FacetResultRange;
import com.commercetools.models.product.FacetTypes;
import com.commercetools.models.product.RangeFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class RangeFacetResultBuilder {
   
   
   private java.util.List<com.commercetools.models.product.FacetResultRange> ranges;
   
   public RangeFacetResultBuilder ranges( final java.util.List<com.commercetools.models.product.FacetResultRange> ranges) {
      this.ranges = ranges;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.product.FacetResultRange> getRanges(){
      return this.ranges;
   }

   public RangeFacetResult build() {
       return new RangeFacetResultImpl(ranges);
   }
   
   public static RangeFacetResultBuilder of() {
      return new RangeFacetResultBuilder();
   }
   
   public static RangeFacetResultBuilder of(final RangeFacetResult template) {
      RangeFacetResultBuilder builder = new RangeFacetResultBuilder();
      builder.ranges = template.getRanges();
      return builder;
   }
   
}