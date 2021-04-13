package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueGiftLineItemDraftImpl.class)
public interface CartDiscountValueGiftLineItemDraft extends CartDiscountValueDraft {

    String GIFT_LINE_ITEM = "giftLineItem";

    
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();
    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
    *  <p>The channel must have the role <code>InventorySupply</code></p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();
    /**
    *  <p>The channel must have the role <code>ProductDistribution</code></p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    
    public void setProduct(final ProductResourceIdentifier product);
    
    
    
    public void setVariantId(final Long variantId);
    
    
    
    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
    
    
    
    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
    

    public static CartDiscountValueGiftLineItemDraft of(){
        return new CartDiscountValueGiftLineItemDraftImpl();
    }
    

    public static CartDiscountValueGiftLineItemDraft of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftImpl instance = new CartDiscountValueGiftLineItemDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartDiscountValueGiftLineItemDraftBuilder builder(){
        return CartDiscountValueGiftLineItemDraftBuilder.of();
    }
    
    public static CartDiscountValueGiftLineItemDraftBuilder builder(final CartDiscountValueGiftLineItemDraft template){
        return CartDiscountValueGiftLineItemDraftBuilder.of(template);
    }
    

    default <T> T withCartDiscountValueGiftLineItemDraft(Function<CartDiscountValueGiftLineItemDraft, T> helper) {
        return helper.apply(this);
    }
}
