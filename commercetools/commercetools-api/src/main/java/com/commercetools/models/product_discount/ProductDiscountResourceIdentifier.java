package com.commercetools.models.product_discount;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.product_discount.ProductDiscountResourceIdentifierImpl;

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
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier extends ResourceIdentifier {


   
   public static ProductDiscountResourceIdentifierImpl of(){
      return new ProductDiscountResourceIdentifierImpl();
   }
   

   public static ProductDiscountResourceIdentifierImpl of(final ProductDiscountResourceIdentifier template) {
      ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}