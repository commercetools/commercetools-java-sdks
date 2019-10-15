package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountTarget;
import com.commercetools.models.cart_discount.SelectionMode;
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
public final class MultiBuyLineItemsTargetImpl implements MultiBuyLineItemsTarget {

   private String type;
   
   private String predicate;
   
   private Integer triggerQuantity;
   
   private Integer discountedQuantity;
   
   private Integer maxOccurrence;
   
   private com.commercetools.models.cart_discount.SelectionMode selectionMode;

   @JsonCreator
   MultiBuyLineItemsTargetImpl(@JsonProperty("predicate") final String predicate, @JsonProperty("triggerQuantity") final Integer triggerQuantity, @JsonProperty("discountedQuantity") final Integer discountedQuantity, @JsonProperty("maxOccurrence") final Integer maxOccurrence, @JsonProperty("selectionMode") final com.commercetools.models.cart_discount.SelectionMode selectionMode) {
      this.predicate = predicate;
      this.triggerQuantity = triggerQuantity;
      this.discountedQuantity = discountedQuantity;
      this.maxOccurrence = maxOccurrence;
      this.selectionMode = selectionMode;
      this.type = "multiBuyLineItems";
   }
   public MultiBuyLineItemsTargetImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   /**
   	<p>A valid line item target predicate. The discount will be applied to line items that are matched by the predicate.</p>
   */
   public String getPredicate(){
      return this.predicate;
   }
   
   /**
   	<p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
   */
   public Integer getTriggerQuantity(){
      return this.triggerQuantity;
   }
   
   /**
   	<p>Quantity of line items that are discounted per application of this discount.</p>
   */
   public Integer getDiscountedQuantity(){
      return this.discountedQuantity;
   }
   
   /**
   	<p>Maximum number of applications of this discount.</p>
   */
   public Integer getMaxOccurrence(){
      return this.maxOccurrence;
   }
   
   
   public com.commercetools.models.cart_discount.SelectionMode getSelectionMode(){
      return this.selectionMode;
   }

   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }
   
   public void setTriggerQuantity(final Integer triggerQuantity){
      this.triggerQuantity = triggerQuantity;
   }
   
   public void setDiscountedQuantity(final Integer discountedQuantity){
      this.discountedQuantity = discountedQuantity;
   }
   
   public void setMaxOccurrence(final Integer maxOccurrence){
      this.maxOccurrence = maxOccurrence;
   }
   
   public void setSelectionMode(final com.commercetools.models.cart_discount.SelectionMode selectionMode){
      this.selectionMode = selectionMode;
   }

}