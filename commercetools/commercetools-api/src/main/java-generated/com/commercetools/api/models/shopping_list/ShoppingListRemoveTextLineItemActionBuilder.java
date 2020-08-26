package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListRemoveTextLineItemActionBuilder {

    
    private String textLineItemId;
    
    @Nullable
    private Long quantity;

    public ShoppingListRemoveTextLineItemActionBuilder textLineItemId( final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }
    
    public ShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
    }

    public ShoppingListRemoveTextLineItemAction build() {
        return new ShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }

    public static ShoppingListRemoveTextLineItemActionBuilder of() {
        return new ShoppingListRemoveTextLineItemActionBuilder();
    }

    public static ShoppingListRemoveTextLineItemActionBuilder of(final ShoppingListRemoveTextLineItemAction template) {
        ShoppingListRemoveTextLineItemActionBuilder builder = new ShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
