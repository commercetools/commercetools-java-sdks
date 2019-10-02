package com.commercetools.models.common;

import com.commercetools.models.common.ImageDimensions;
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
public final class ImageImpl implements Image {

   private String label;
   
   private String url;
   
   private com.commercetools.models.common.ImageDimensions dimensions;

   @JsonCreator
   ImageImpl(@JsonProperty("label") final String label, @JsonProperty("url") final String url, @JsonProperty("dimensions") final com.commercetools.models.common.ImageDimensions dimensions) {
      this.label = label;
      this.url = url;
      this.dimensions = dimensions;
   }
   public ImageImpl() {
      
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public String getUrl(){
      return this.url;
   }
   
   
   public com.commercetools.models.common.ImageDimensions getDimensions(){
      return this.dimensions;
   }

   public void setLabel(final String label){
      this.label = label;
   }
   
   public void setUrl(final String url){
      this.url = url;
   }
   
   public void setDimensions(final com.commercetools.models.common.ImageDimensions dimensions){
      this.dimensions = dimensions;
   }

}