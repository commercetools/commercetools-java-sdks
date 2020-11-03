package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemoveLineItemActionBuilder {

    
    private String lineItemId;
    
    @Nullable
    private Long quantity;
    
    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
    
    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    public CartRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public CartRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public CartRemoveLineItemActionBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }
    
    public CartRemoveLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }
    
    public CartRemoveLineItemActionBuilder shippingDetailsToRemove(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        return this;
    }

    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
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
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
        return this.shippingDetailsToRemove;
    }

    public CartRemoveLineItemAction build() {
        return new CartRemoveLineItemActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice, shippingDetailsToRemove);
    }

    public static CartRemoveLineItemActionBuilder of() {
        return new CartRemoveLineItemActionBuilder();
    }

    public static CartRemoveLineItemActionBuilder of(final CartRemoveLineItemAction template) {
        CartRemoveLineItemActionBuilder builder = new CartRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
        return builder;
    }

}
