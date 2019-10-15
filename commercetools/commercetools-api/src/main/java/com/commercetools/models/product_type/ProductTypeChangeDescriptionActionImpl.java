package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeChangeDescriptionActionImpl implements ProductTypeChangeDescriptionAction {

   private String action;
   
   private String description;

   @JsonCreator
   ProductTypeChangeDescriptionActionImpl(@JsonProperty("description") final String description) {
      this.description = description;
      this.action = "changeDescription";
   }
   public ProductTypeChangeDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getDescription(){
      return this.description;
   }

   public void setDescription(final String description){
      this.description = description;
   }

}