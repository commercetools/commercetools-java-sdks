package com.commercetools.models.common;

import com.commercetools.models.common.GeoJson;
import java.lang.Integer;
import java.lang.String;
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
public final class GeoJsonPointImpl implements GeoJsonPoint {

   private java.lang.String type;
   
   private java.util.List<java.lang.Integer> coordinates;

   @JsonCreator
   GeoJsonPointImpl(@JsonProperty("coordinates") final java.util.List<java.lang.Integer> coordinates) {
      this.coordinates = coordinates;
      this.type = "Point";
   }
   public GeoJsonPointImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<java.lang.Integer> getCoordinates(){
      return this.coordinates;
   }

   public void setCoordinates(final java.util.List<java.lang.Integer> coordinates){
      this.coordinates = coordinates;
   }

}