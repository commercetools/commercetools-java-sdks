package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
import com.commercetools.models.message.ProductSlugChangedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductSlugChangedMessagePayloadImpl.class)
public interface ProductSlugChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static ProductSlugChangedMessagePayloadImpl of(){
      return new ProductSlugChangedMessagePayloadImpl();
   }
   

   public static ProductSlugChangedMessagePayloadImpl of(final ProductSlugChangedMessagePayload template) {
      ProductSlugChangedMessagePayloadImpl instance = new ProductSlugChangedMessagePayloadImpl();
      instance.setSlug(template.getSlug());
      return instance;
   }

}