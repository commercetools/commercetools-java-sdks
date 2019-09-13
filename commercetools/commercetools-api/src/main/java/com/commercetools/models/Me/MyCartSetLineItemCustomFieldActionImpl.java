package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.Object;
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
public final class MyCartSetLineItemCustomFieldActionImpl implements MyCartSetLineItemCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String lineItemId;
   
   private java.lang.String name;
   
   private java.lang.Object value;

   @JsonCreator
   MyCartSetLineItemCustomFieldActionImpl(@JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("name") final java.lang.String name, @JsonProperty("value") final java.lang.Object value) {
      this.lineItemId = lineItemId;
      this.name = name;
      this.value = value;
      this.action = "setLineItemCustomField";
   }
   public MyCartSetLineItemCustomFieldActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }

   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }

}