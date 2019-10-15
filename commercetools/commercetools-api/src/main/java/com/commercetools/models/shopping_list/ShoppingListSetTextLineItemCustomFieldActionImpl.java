package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
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
public final class ShoppingListSetTextLineItemCustomFieldActionImpl implements ShoppingListSetTextLineItemCustomFieldAction {

   private String action;
   
   private String name;
   
   private Object value;
   
   private String textLineItemId;

   @JsonCreator
   ShoppingListSetTextLineItemCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final Object value, @JsonProperty("textLineItemId") final String textLineItemId) {
      this.name = name;
      this.value = value;
      this.textLineItemId = textLineItemId;
      this.action = "setTextLineItemCustomField";
   }
   public ShoppingListSetTextLineItemCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Object getValue(){
      return this.value;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }
   
   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}