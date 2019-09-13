package com.commercetools.models.inventory;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.inventory.InventoryEntry;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.Long availableQuantity;
   
   @Nullable
   private java.time.ZonedDateTime expectedDelivery;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private java.lang.Long quantityOnStock;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private java.lang.Long restockableInDays;
   
   
   private java.lang.String sku;
   
   public InventoryEntryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public InventoryEntryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public InventoryEntryBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public InventoryEntryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public InventoryEntryBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public InventoryEntryBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public InventoryEntryBuilder availableQuantity( final java.lang.Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public InventoryEntryBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      return this;
   }
   
   public InventoryEntryBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public InventoryEntryBuilder quantityOnStock( final java.lang.Long quantityOnStock) {
      this.quantityOnStock = quantityOnStock;
      return this;
   }
   
   public InventoryEntryBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryBuilder restockableInDays(@Nullable final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public InventoryEntryBuilder sku( final java.lang.String sku) {
      this.sku = sku;
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
   
   
   public java.lang.Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public InventoryEntry build() {
       return new InventoryEntryImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, availableQuantity, expectedDelivery, custom, quantityOnStock, supplyChannel, restockableInDays, sku);
   }
   
   public static InventoryEntryBuilder of() {
      return new InventoryEntryBuilder();
   }
   
   public static InventoryEntryBuilder of(final InventoryEntry template) {
      InventoryEntryBuilder builder = new InventoryEntryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.availableQuantity = template.getAvailableQuantity();
      builder.expectedDelivery = template.getExpectedDelivery();
      builder.custom = template.getCustom();
      builder.quantityOnStock = template.getQuantityOnStock();
      builder.supplyChannel = template.getSupplyChannel();
      builder.restockableInDays = template.getRestockableInDays();
      builder.sku = template.getSku();
      return builder;
   }
   
}