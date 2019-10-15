package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeDefinitionDraft;
import com.commercetools.models.product_type.ProductTypeDraftImpl;

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
@JsonDeserialize(as = ProductTypeDraftImpl.class)
public interface ProductTypeDraft  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("description")
   public String getDescription();
   
   @Valid
   @JsonProperty("attributes")
   public List<AttributeDefinitionDraft> getAttributes();

   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setAttributes(final List<AttributeDefinitionDraft> attributes);
   
   public static ProductTypeDraftImpl of(){
      return new ProductTypeDraftImpl();
   }
   

   public static ProductTypeDraftImpl of(final ProductTypeDraft template) {
      ProductTypeDraftImpl instance = new ProductTypeDraftImpl();
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setAttributes(template.getAttributes());
      instance.setKey(template.getKey());
      return instance;
   }

}