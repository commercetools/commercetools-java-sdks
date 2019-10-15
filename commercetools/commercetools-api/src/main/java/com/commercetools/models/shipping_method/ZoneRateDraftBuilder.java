package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.zone.ZoneResourceIdentifier;
import com.commercetools.models.shipping_method.ZoneRateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneRateDraftBuilder {
   
   
   private com.commercetools.models.zone.ZoneResourceIdentifier zone;
   
   
   private java.util.List<com.commercetools.models.shipping_method.ShippingRateDraft> shippingRates;
   
   public ZoneRateDraftBuilder zone( final com.commercetools.models.zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      return this;
   }
   
   public ZoneRateDraftBuilder shippingRates( final java.util.List<com.commercetools.models.shipping_method.ShippingRateDraft> shippingRates) {
      this.shippingRates = shippingRates;
      return this;
   }
   
   
   public com.commercetools.models.zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }
   
   
   public java.util.List<com.commercetools.models.shipping_method.ShippingRateDraft> getShippingRates(){
      return this.shippingRates;
   }

   public ZoneRateDraft build() {
       return new ZoneRateDraftImpl(zone, shippingRates);
   }
   
   public static ZoneRateDraftBuilder of() {
      return new ZoneRateDraftBuilder();
   }
   
   public static ZoneRateDraftBuilder of(final ZoneRateDraft template) {
      ZoneRateDraftBuilder builder = new ZoneRateDraftBuilder();
      builder.zone = template.getZone();
      builder.shippingRates = template.getShippingRates();
      return builder;
   }
   
}