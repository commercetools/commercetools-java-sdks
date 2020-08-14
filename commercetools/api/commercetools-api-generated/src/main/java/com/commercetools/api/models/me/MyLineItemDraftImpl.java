package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyLineItemDraftImpl implements MyLineItemDraft {

    private String productId;
    
    private Long variantId;
    
    private Double quantity;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;
    
    private String sku;

    @JsonCreator
    MyLineItemDraftImpl(@JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId, @JsonProperty("quantity") final Double quantity, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("sku") final String sku) {
        this.productId = productId;
        this.variantId = variantId;
        this.quantity = quantity;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
        this.sku = sku;
    }
    public MyLineItemDraftImpl() {
       
    }

    
    public String getProductId(){
        return this.productId;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }
    
    /**
    *  <p>By providing supply channel information, you can unique identify
    *  inventory entries that should be reserved.
    *  The provided channel should have the InventorySupply role.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
    *  <p>The channel is used to select a ProductPrice.
    *  The provided channel should have the ProductDistribution role.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }
    
    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>Container for line item specific address(es).</p>
    */
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }
    
    
    public String getSku(){
        return this.sku;
    }

    public void setProductId(final String productId){
        this.productId = productId;
    }
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }

}
