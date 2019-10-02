package com.commercetools.models.common;


import com.commercetools.models.common.AssetDimensionsImpl;

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
@JsonDeserialize(as = AssetDimensionsImpl.class)
public interface AssetDimensions  {

   
   @NotNull
   @JsonProperty("w")
   public Integer getW();
   
   @NotNull
   @JsonProperty("h")
   public Integer getH();

   public void setW(final Integer w);
   
   public void setH(final Integer h);
   
   public static AssetDimensionsImpl of(){
      return new AssetDimensionsImpl();
   }
   

   public static AssetDimensionsImpl of(final AssetDimensions template) {
      AssetDimensionsImpl instance = new AssetDimensionsImpl();
      instance.setW(template.getW());
      instance.setH(template.getH());
      return instance;
   }

}