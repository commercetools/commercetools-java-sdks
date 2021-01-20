
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface ShoppingListSetDeleteDaysAfterLastModificationAction extends ShoppingListUpdateAction {

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public static ShoppingListSetDeleteDaysAfterLastModificationAction of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationAction of(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        ShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionBuilder builder(
            final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
        return ShoppingListSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withShoppingListSetDeleteDaysAfterLastModificationAction(
            Function<ShoppingListSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }
}
