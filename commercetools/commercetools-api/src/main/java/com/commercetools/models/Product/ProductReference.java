package com.commercetools.models.product;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.product.Product;
import com.commercetools.models.product.ProductReferenceImpl;

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
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Product getObj();

   public void setObj(final Product obj);
   
   public static ProductReferenceImpl of(){
      return new ProductReferenceImpl();
   }
   

   public static ProductReferenceImpl of(final ProductReference template) {
      ProductReferenceImpl instance = new ProductReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}