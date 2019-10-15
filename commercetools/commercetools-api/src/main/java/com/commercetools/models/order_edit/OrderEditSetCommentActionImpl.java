package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
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
public final class OrderEditSetCommentActionImpl implements OrderEditSetCommentAction {

   private String action;
   
   private String comment;

   @JsonCreator
   OrderEditSetCommentActionImpl(@JsonProperty("comment") final String comment) {
      this.comment = comment;
      this.action = "setComment";
   }
   public OrderEditSetCommentActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getComment(){
      return this.comment;
   }

   public void setComment(final String comment){
      this.comment = comment;
   }

}