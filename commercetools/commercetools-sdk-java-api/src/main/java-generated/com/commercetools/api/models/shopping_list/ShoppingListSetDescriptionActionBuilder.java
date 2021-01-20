
package com.commercetools.api.models.shopping_list;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListSetDescriptionAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetDescriptionActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public ShoppingListSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ShoppingListSetDescriptionAction build() {
        return new ShoppingListSetDescriptionActionImpl(description);
    }

    public static ShoppingListSetDescriptionActionBuilder of() {
        return new ShoppingListSetDescriptionActionBuilder();
    }

    public static ShoppingListSetDescriptionActionBuilder of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionBuilder builder = new ShoppingListSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
