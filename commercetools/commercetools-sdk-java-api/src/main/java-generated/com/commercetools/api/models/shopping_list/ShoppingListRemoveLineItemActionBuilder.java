package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListRemoveLineItemActionBuilder {

    
    private String lineItemId;
    
    @Nullable
    private Long quantity;

    public ShoppingListRemoveLineItemActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public ShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
    }

    public ShoppingListRemoveLineItemAction build() {
        return new ShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    public static ShoppingListRemoveLineItemActionBuilder of() {
        return new ShoppingListRemoveLineItemActionBuilder();
    }

    public static ShoppingListRemoveLineItemActionBuilder of(final ShoppingListRemoveLineItemAction template) {
        ShoppingListRemoveLineItemActionBuilder builder = new ShoppingListRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
