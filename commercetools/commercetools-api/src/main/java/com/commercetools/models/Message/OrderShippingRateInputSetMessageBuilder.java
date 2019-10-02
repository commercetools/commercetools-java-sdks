package com.commercetools.models.message;

import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.message.Message;
import com.commercetools.models.message.OrderShippingRateInputSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingRateInputSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput oldShippingRateInput;
   
   public OrderShippingRateInputSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder shippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder oldShippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput oldShippingRateInput) {
      this.oldShippingRateInput = oldShippingRateInput;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInput getOldShippingRateInput(){
      return this.oldShippingRateInput;
   }

   public OrderShippingRateInputSetMessage build() {
       return new OrderShippingRateInputSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, shippingRateInput, oldShippingRateInput);
   }
   
   public static OrderShippingRateInputSetMessageBuilder of() {
      return new OrderShippingRateInputSetMessageBuilder();
   }
   
   public static OrderShippingRateInputSetMessageBuilder of(final OrderShippingRateInputSetMessage template) {
      OrderShippingRateInputSetMessageBuilder builder = new OrderShippingRateInputSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.oldShippingRateInput = template.getOldShippingRateInput();
      return builder;
   }
   
}