package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.LineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemDraftBuilder {

    @Nullable
    private String productId;
    
    @Nullable
    private Long variantId;
    
    @Nullable
    private String sku;
    
    @Nullable
    private Long quantity;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
    
    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public LineItemDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }
    
    public LineItemDraftBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    public LineItemDraftBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    public LineItemDraftBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public LineItemDraftBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }
    
    public LineItemDraftBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }
    
    public LineItemDraftBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }
    
    public LineItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    public LineItemDraftBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }
    
    public LineItemDraftBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }
    
    public LineItemDraftBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    @Nullable
    public String getProductId(){
        return this.productId;
    }
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
    }
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    public LineItemDraft build() {
        return new LineItemDraftImpl(productId, variantId, sku, quantity, supplyChannel, distributionChannel, externalTaxRate, custom, externalPrice, externalTotalPrice, shippingDetails);
    }

    public static LineItemDraftBuilder of() {
        return new LineItemDraftBuilder();
    }

    public static LineItemDraftBuilder of(final LineItemDraft template) {
        LineItemDraftBuilder builder = new LineItemDraftBuilder();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.quantity = template.getQuantity();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.custom = template.getCustom();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
