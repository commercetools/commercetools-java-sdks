package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ShippingRateInputType;
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
public final class ProjectSetShippingRateInputTypeActionImpl implements ProjectSetShippingRateInputTypeAction {

   private String action;
   
   private com.commercetools.models.project.ShippingRateInputType shippingRateInputType;

   @JsonCreator
   ProjectSetShippingRateInputTypeActionImpl(@JsonProperty("shippingRateInputType") final com.commercetools.models.project.ShippingRateInputType shippingRateInputType) {
      this.shippingRateInputType = shippingRateInputType;
      this.action = "setShippingRateInputType";
   }
   public ProjectSetShippingRateInputTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }

   public void setShippingRateInputType(final com.commercetools.models.project.ShippingRateInputType shippingRateInputType){
      this.shippingRateInputType = shippingRateInputType;
   }

}