package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.zone.ZoneResourceIdentifier;
import com.commercetools.models.shipping_method.ZoneRateDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ZoneRateDraftImpl.class)
public interface ZoneRateDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("zone")
   public ZoneResourceIdentifier getZone();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRates")
   public List<ShippingRateDraft> getShippingRates();

   public void setZone(final ZoneResourceIdentifier zone);
   
   public void setShippingRates(final List<ShippingRateDraft> shippingRates);
   
   public static ZoneRateDraftImpl of(){
      return new ZoneRateDraftImpl();
   }
   

   public static ZoneRateDraftImpl of(final ZoneRateDraft template) {
      ZoneRateDraftImpl instance = new ZoneRateDraftImpl();
      instance.setZone(template.getZone());
      instance.setShippingRates(template.getShippingRates());
      return instance;
   }

}