package com.commercetools.models.category;

import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.common.Asset;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import com.commercetools.models.category.Category;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.category.CategoryReference parent;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Asset> assets;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   
   private java.lang.String orderHint;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   
   private java.util.List<com.commercetools.models.category.CategoryReference> ancestors;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public CategoryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CategoryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CategoryBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CategoryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CategoryBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CategoryBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CategoryBuilder parent(@Nullable final com.commercetools.models.category.CategoryReference parent) {
      this.parent = parent;
      return this;
   }
   
   public CategoryBuilder assets(@Nullable final java.util.List<com.commercetools.models.common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   public CategoryBuilder metaKeywords(@Nullable final com.commercetools.models.common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   public CategoryBuilder orderHint( final java.lang.String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public CategoryBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CategoryBuilder metaTitle(@Nullable final com.commercetools.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   public CategoryBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CategoryBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public CategoryBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CategoryBuilder ancestors( final java.util.List<com.commercetools.models.category.CategoryReference> ancestors) {
      this.ancestors = ancestors;
      return this;
   }
   
   public CategoryBuilder metaDescription(@Nullable final com.commercetools.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   public CategoryBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public CategoryBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
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
   
   @Nullable
   public com.commercetools.models.category.CategoryReference getParent(){
      return this.parent;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.category.CategoryReference> getAncestors(){
      return this.ancestors;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public Category build() {
       return new CategoryImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, parent, assets, metaKeywords, orderHint, custom, metaTitle, name, externalId, description, ancestors, metaDescription, key, slug);
   }
   
   public static CategoryBuilder of() {
      return new CategoryBuilder();
   }
   
   public static CategoryBuilder of(final Category template) {
      CategoryBuilder builder = new CategoryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.parent = template.getParent();
      builder.assets = template.getAssets();
      builder.metaKeywords = template.getMetaKeywords();
      builder.orderHint = template.getOrderHint();
      builder.custom = template.getCustom();
      builder.metaTitle = template.getMetaTitle();
      builder.name = template.getName();
      builder.externalId = template.getExternalId();
      builder.description = template.getDescription();
      builder.ancestors = template.getAncestors();
      builder.metaDescription = template.getMetaDescription();
      builder.key = template.getKey();
      builder.slug = template.getSlug();
      return builder;
   }
   
}