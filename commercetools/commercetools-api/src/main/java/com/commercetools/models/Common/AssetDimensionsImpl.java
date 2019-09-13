package com.commercetools.models.common;

import java.lang.Integer;
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
public final class AssetDimensionsImpl implements AssetDimensions {

   private java.lang.Integer w;
   
   private java.lang.Integer h;

   @JsonCreator
   AssetDimensionsImpl(@JsonProperty("w") final java.lang.Integer w, @JsonProperty("h") final java.lang.Integer h) {
      this.w = w;
      this.h = h;
   }
   public AssetDimensionsImpl() {
      
   }
   
   
   public java.lang.Integer getW(){
      return this.w;
   }
   
   
   public java.lang.Integer getH(){
      return this.h;
   }

   public void setW(final java.lang.Integer w){
      this.w = w;
   }
   
   public void setH(final java.lang.Integer h){
      this.h = h;
   }

}