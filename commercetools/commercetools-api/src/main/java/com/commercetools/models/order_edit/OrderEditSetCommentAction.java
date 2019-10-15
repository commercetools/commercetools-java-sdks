package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import com.commercetools.models.order_edit.OrderEditSetCommentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetCommentActionImpl.class)
public interface OrderEditSetCommentAction extends OrderEditUpdateAction {

   
   
   @JsonProperty("comment")
   public String getComment();

   public void setComment(final String comment);
   
   public static OrderEditSetCommentActionImpl of(){
      return new OrderEditSetCommentActionImpl();
   }
   

   public static OrderEditSetCommentActionImpl of(final OrderEditSetCommentAction template) {
      OrderEditSetCommentActionImpl instance = new OrderEditSetCommentActionImpl();
      instance.setComment(template.getComment());
      return instance;
   }

}