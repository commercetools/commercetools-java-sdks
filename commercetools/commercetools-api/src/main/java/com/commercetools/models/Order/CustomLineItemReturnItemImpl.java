package com.commercetools.models.order;

import com.commercetools.models.order.ReturnItem;
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
public final class CustomLineItemReturnItemImpl implements CustomLineItemReturnItem {

   private com.commercetools.models.order.ReturnShipmentState shipmentState;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private Long quantity;
   
   private String comment;
   
   private String id;
   
   private com.commercetools.models.order.ReturnPaymentState paymentState;
   
   private String type;
   
   private String customLineItemId;

   @JsonCreator
   CustomLineItemReturnItemImpl(@JsonProperty("shipmentState") final com.commercetools.models.order.ReturnShipmentState shipmentState, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("quantity") final Long quantity, @JsonProperty("comment") final String comment, @JsonProperty("id") final String id, @JsonProperty("paymentState") final com.commercetools.models.order.ReturnPaymentState paymentState, @JsonProperty("customLineItemId") final String customLineItemId) {
      this.shipmentState = shipmentState;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.quantity = quantity;
      this.comment = comment;
      this.id = id;
      this.paymentState = paymentState;
      this.customLineItemId = customLineItemId;
      this.type = "CustomLineItemReturnItem";
   }
   public CustomLineItemReturnItemImpl() {
      
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getComment(){
      return this.comment;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public void setShipmentState(final com.commercetools.models.order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setComment(final String comment){
      this.comment = comment;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setPaymentState(final com.commercetools.models.order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }

}