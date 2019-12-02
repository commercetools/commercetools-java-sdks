package com.commercetools.importer.models.prices;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.prices.PriceImport;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceImportBuilder {
   
   
   private String key;
   
   @Nullable
   private String country;
   
   
   private com.commercetools.importer.models.common.ProductKeyReference product;
   
   
   private com.commercetools.importer.models.common.ProductVariantKeyReference productVariant;
   
   @Nullable
   private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
   
   @Nullable
   private com.commercetools.importer.models.common.ChannelKeyReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private com.commercetools.importer.models.common.Money value;
   
   public PriceImportBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public PriceImportBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public PriceImportBuilder product( final com.commercetools.importer.models.common.ProductKeyReference product) {
      this.product = product;
      return this;
   }
   
   public PriceImportBuilder productVariant( final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant) {
      this.productVariant = productVariant;
      return this;
   }
   
   public PriceImportBuilder customerGroup(@Nullable final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceImportBuilder channel(@Nullable final com.commercetools.importer.models.common.ChannelKeyReference channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public PriceImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceImportBuilder value( final com.commercetools.importer.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
      return this.product;
   }
   
   
   public com.commercetools.importer.models.common.ProductVariantKeyReference getProductVariant(){
      return this.productVariant;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.CustomerGroupKeyReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.ChannelKeyReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public com.commercetools.importer.models.common.Money getValue(){
      return this.value;
   }

   public PriceImport build() {
       return new PriceImportImpl(key, country, product, productVariant, customerGroup, channel, validUntil, validFrom, value);
   }
   
   public static PriceImportBuilder of() {
      return new PriceImportBuilder();
   }
   
   public static PriceImportBuilder of(final PriceImport template) {
      PriceImportBuilder builder = new PriceImportBuilder();
      builder.key = template.getKey();
      builder.country = template.getCountry();
      builder.product = template.getProduct();
      builder.productVariant = template.getProductVariant();
      builder.customerGroup = template.getCustomerGroup();
      builder.channel = template.getChannel();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.value = template.getValue();
      return builder;
   }
   
}