package com.commercetools.models.cart;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.Money;
import com.commercetools.models.type.CustomFieldsDraft;
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
public final class LineItemDraftImpl implements LineItemDraft {

   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private Long quantity;
   
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private String productId;
   
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long variantId;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   private String sku;
   
   private com.commercetools.models.common.Money externalPrice;

   @JsonCreator
   LineItemDraftImpl(@JsonProperty("externalTaxRate") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final Long quantity, @JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final String productId, @JsonProperty("externalTotalPrice") final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final Long variantId, @JsonProperty("distributionChannel") final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("sku") final String sku, @JsonProperty("externalPrice") final com.commercetools.models.common.Money externalPrice) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.externalTotalPrice = externalTotalPrice;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.distributionChannel = distributionChannel;
      this.sku = sku;
      this.externalPrice = externalPrice;
   }
   public LineItemDraftImpl() {
      
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setExternalTaxRate(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setExternalTotalPrice(final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setSupplyChannel(final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setDistributionChannel(final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setExternalPrice(final com.commercetools.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}