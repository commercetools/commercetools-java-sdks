
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDescriptionActionImpl.class)
public interface ShoppingListSetDescriptionAction extends ShoppingListUpdateAction {

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static ShoppingListSetDescriptionAction of() {
        return new ShoppingListSetDescriptionActionImpl();
    }

    public static ShoppingListSetDescriptionAction of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionImpl instance = new ShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShoppingListSetDescriptionActionBuilder builder() {
        return ShoppingListSetDescriptionActionBuilder.of();
    }

    public static ShoppingListSetDescriptionActionBuilder builder(final ShoppingListSetDescriptionAction template) {
        return ShoppingListSetDescriptionActionBuilder.of(template);
    }

    default <T> T withShoppingListSetDescriptionAction(Function<ShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
