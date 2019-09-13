package com.commercetools.models.subscription;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.subscription.ChangeSubscription;
import com.commercetools.models.subscription.DeliveryFormat;
import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.MessageSubscription;
import com.commercetools.models.subscription.SubscriptionHealthStatus;
import java.lang.String;
import com.commercetools.models.subscription.Subscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.subscription.DeliveryFormat format;
   
   
   private com.commercetools.models.subscription.Destination destination;
   
   
   private java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes;
   
   
   private java.util.List<com.commercetools.models.subscription.MessageSubscription> messages;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.subscription.SubscriptionHealthStatus status;
   
   public SubscriptionBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public SubscriptionBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public SubscriptionBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public SubscriptionBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public SubscriptionBuilder format( final com.commercetools.models.subscription.DeliveryFormat format) {
      this.format = format;
      return this;
   }
   
   public SubscriptionBuilder destination( final com.commercetools.models.subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   public SubscriptionBuilder changes( final java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   public SubscriptionBuilder messages( final java.util.List<com.commercetools.models.subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   public SubscriptionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public SubscriptionBuilder status( final com.commercetools.models.subscription.SubscriptionHealthStatus status) {
      this.status = status;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
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
   
   
   public com.commercetools.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public java.util.List<com.commercetools.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.subscription.SubscriptionHealthStatus getStatus(){
      return this.status;
   }

   public Subscription build() {
       return new SubscriptionImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, format, destination, changes, messages, key, status);
   }
   
   public static SubscriptionBuilder of() {
      return new SubscriptionBuilder();
   }
   
   public static SubscriptionBuilder of(final Subscription template) {
      SubscriptionBuilder builder = new SubscriptionBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.format = template.getFormat();
      builder.destination = template.getDestination();
      builder.changes = template.getChanges();
      builder.messages = template.getMessages();
      builder.key = template.getKey();
      builder.status = template.getStatus();
      return builder;
   }
   
}