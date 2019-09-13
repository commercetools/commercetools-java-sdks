package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
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
public final class IronMqDestinationImpl implements IronMqDestination {

   private java.lang.String type;
   
   private java.lang.String uri;

   @JsonCreator
   IronMqDestinationImpl(@JsonProperty("uri") final java.lang.String uri) {
      this.uri = uri;
      this.type = "IronMQ";
   }
   public IronMqDestinationImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getUri(){
      return this.uri;
   }

   public void setUri(final java.lang.String uri){
      this.uri = uri;
   }

}