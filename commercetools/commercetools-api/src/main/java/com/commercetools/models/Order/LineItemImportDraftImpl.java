package com.commercetools.models.order;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.ProductVariantImportDraft;
import com.commercetools.models.tax_category.TaxRate;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
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
public final class LineItemImportDraftImpl implements LineItemImportDraft {

   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String productId;
   
   private com.commercetools.models.common.PriceDraft price;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.order.ProductVariantImportDraft variant;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   LineItemImportDraftImpl(@JsonProperty("taxRate") final com.commercetools.models.tax_category.TaxRate taxRate, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("price") final com.commercetools.models.common.PriceDraft price, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("variant") final com.commercetools.models.order.ProductVariantImportDraft variant, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("state") final java.util.List<com.commercetools.models.order.ItemState> state, @JsonProperty("distributionChannel") final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.taxRate = taxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.price = price;
      this.custom = custom;
      this.variant = variant;
      this.name = name;
      this.supplyChannel = supplyChannel;
      this.state = state;
      this.distributionChannel = distributionChannel;
   }
   public LineItemImportDraftImpl() {
      
   }
   
   
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setTaxRate(final com.commercetools.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setPrice(final com.commercetools.models.common.PriceDraft price){
      this.price = price;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setVariant(final com.commercetools.models.order.ProductVariantImportDraft variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSupplyChannel(final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setState(final java.util.List<com.commercetools.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setDistributionChannel(final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}