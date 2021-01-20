
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemsOrderActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeTextLineItemsOrderActionImpl.class)
public interface ShoppingListChangeTextLineItemsOrderAction extends ShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEMS_ORDER = "changeTextLineItemsOrder";

    @NotNull
    @JsonProperty("textLineItemOrder")
    public List<String> getTextLineItemOrder();

    @JsonIgnore
    public void setTextLineItemOrder(final String... textLineItemOrder);

    public void setTextLineItemOrder(final List<String> textLineItemOrder);

    public static ShoppingListChangeTextLineItemsOrderAction of() {
        return new ShoppingListChangeTextLineItemsOrderActionImpl();
    }

    public static ShoppingListChangeTextLineItemsOrderAction of(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionImpl instance = new ShoppingListChangeTextLineItemsOrderActionImpl();
        instance.setTextLineItemOrder(template.getTextLineItemOrder());
        return instance;
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder() {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of();
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder builder(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        return ShoppingListChangeTextLineItemsOrderActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeTextLineItemsOrderAction(
            Function<ShoppingListChangeTextLineItemsOrderAction, T> helper) {
        return helper.apply(this);
    }
}
