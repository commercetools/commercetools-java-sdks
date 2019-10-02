package com.commercetools.models.zone;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.zone.Location;
import com.commercetools.models.zone.Zone;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private String name;
   
   @Nullable
   private String description;
   
   
   private java.util.List<com.commercetools.models.zone.Location> locations;
   
   @Nullable
   private String key;
   
   public ZoneBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ZoneBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ZoneBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ZoneBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ZoneBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ZoneBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ZoneBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ZoneBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public ZoneBuilder locations( final java.util.List<com.commercetools.models.zone.Location> locations) {
      this.locations = locations;
      return this;
   }
   
   public ZoneBuilder key(@Nullable final String key) {
      this.key = key;
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
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.zone.Location> getLocations(){
      return this.locations;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public Zone build() {
       return new ZoneImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, name, description, locations, key);
   }
   
   public static ZoneBuilder of() {
      return new ZoneBuilder();
   }
   
   public static ZoneBuilder of(final Zone template) {
      ZoneBuilder builder = new ZoneBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.locations = template.getLocations();
      builder.key = template.getKey();
      return builder;
   }
   
}