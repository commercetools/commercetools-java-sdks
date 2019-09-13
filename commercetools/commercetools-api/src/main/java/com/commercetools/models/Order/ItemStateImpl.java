package com.commercetools.models.order;

import com.commercetools.models.state.StateReference;
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
public final class ItemStateImpl implements ItemState {

   private java.lang.Integer quantity;
   
   private com.commercetools.models.state.StateReference state;

   @JsonCreator
   ItemStateImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("state") final com.commercetools.models.state.StateReference state) {
      this.quantity = quantity;
      this.state = state;
   }
   public ItemStateImpl() {
      
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setState(final com.commercetools.models.state.StateReference state){
      this.state = state;
   }

}