package com.commercetools.models.product;

import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductSetDiscountedPriceActionImpl;

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
@JsonDeserialize(as = ProductSetDiscountedPriceActionImpl.class)
public interface ProductSetDiscountedPriceAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @Valid
   @JsonProperty("discounted")
   public DiscountedPrice getDiscounted();

   public void setPriceId(final String priceId);
   
   public void setStaged(final Boolean staged);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public static ProductSetDiscountedPriceActionImpl of(){
      return new ProductSetDiscountedPriceActionImpl();
   }
   

   public static ProductSetDiscountedPriceActionImpl of(final ProductSetDiscountedPriceAction template) {
      ProductSetDiscountedPriceActionImpl instance = new ProductSetDiscountedPriceActionImpl();
      instance.setDiscounted(template.getDiscounted());
      instance.setStaged(template.getStaged());
      instance.setPriceId(template.getPriceId());
      return instance;
   }

}