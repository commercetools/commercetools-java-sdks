package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.product.ProductProjection;
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
public final class ProductCreatedMessagePayloadImpl implements ProductCreatedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.product.ProductProjection productProjection;

   @JsonCreator
   ProductCreatedMessagePayloadImpl(@JsonProperty("productProjection") final com.commercetools.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      this.type = "ProductCreated";
   }
   public ProductCreatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }

   public void setProductProjection(final com.commercetools.models.product.ProductProjection productProjection){
      this.productProjection = productProjection;
   }

}