package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductRevertStagedVariantChangesActionImpl;

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
@JsonDeserialize(as = ProductRevertStagedVariantChangesActionImpl.class)
public interface ProductRevertStagedVariantChangesAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("variantId")
   public Long getVariantId();

   public void setVariantId(final Long variantId);
   
   public static ProductRevertStagedVariantChangesActionImpl of(){
      return new ProductRevertStagedVariantChangesActionImpl();
   }
   

   public static ProductRevertStagedVariantChangesActionImpl of(final ProductRevertStagedVariantChangesAction template) {
      ProductRevertStagedVariantChangesActionImpl instance = new ProductRevertStagedVariantChangesActionImpl();
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}