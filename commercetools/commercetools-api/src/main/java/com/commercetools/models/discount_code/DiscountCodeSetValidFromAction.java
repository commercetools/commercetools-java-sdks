package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.models.discount_code.DiscountCodeSetValidFromActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetValidFromActionImpl.class)
public interface DiscountCodeSetValidFromAction extends DiscountCodeUpdateAction {

   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();

   public void setValidFrom(final ZonedDateTime validFrom);
   
   public static DiscountCodeSetValidFromActionImpl of(){
      return new DiscountCodeSetValidFromActionImpl();
   }
   

   public static DiscountCodeSetValidFromActionImpl of(final DiscountCodeSetValidFromAction template) {
      DiscountCodeSetValidFromActionImpl instance = new DiscountCodeSetValidFromActionImpl();
      instance.setValidFrom(template.getValidFrom());
      return instance;
   }

}