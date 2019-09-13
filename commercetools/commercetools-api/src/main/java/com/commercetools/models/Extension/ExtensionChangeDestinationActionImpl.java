package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionDestination;
import com.commercetools.models.extension.ExtensionUpdateAction;
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
public final class ExtensionChangeDestinationActionImpl implements ExtensionChangeDestinationAction {

   private java.lang.String action;
   
   private com.commercetools.models.extension.ExtensionDestination destination;

   @JsonCreator
   ExtensionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.models.extension.ExtensionDestination destination) {
      this.destination = destination;
      this.action = "changeDestination";
   }
   public ExtensionChangeDestinationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }

   public void setDestination(final com.commercetools.models.extension.ExtensionDestination destination){
      this.destination = destination;
   }

}