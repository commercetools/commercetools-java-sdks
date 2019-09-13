package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
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
public final class ProductChangeNameActionImpl implements ProductChangeNameAction {

   private java.lang.String action;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.lang.Boolean staged;

   @JsonCreator
   ProductChangeNameActionImpl(@JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("staged") final java.lang.Boolean staged) {
      this.name = name;
      this.staged = staged;
      this.action = "changeName";
   }
   public ProductChangeNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }

   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }

}