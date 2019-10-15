package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetValidFromActionImpl implements DiscountCodeSetValidFromAction {

   private String action;
   
   private java.time.ZonedDateTime validFrom;

   @JsonCreator
   DiscountCodeSetValidFromActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      this.action = "setValidFrom";
   }
   public DiscountCodeSetValidFromActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }

}