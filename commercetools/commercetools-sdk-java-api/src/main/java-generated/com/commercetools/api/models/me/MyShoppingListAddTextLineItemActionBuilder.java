
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListAddTextLineItemActionBuilder {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public MyShoppingListAddTextLineItemActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public MyShoppingListAddTextLineItemActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public MyShoppingListAddTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public MyShoppingListAddTextLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public MyShoppingListAddTextLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public MyShoppingListAddTextLineItemAction build() {
        return new MyShoppingListAddTextLineItemActionImpl(name, description, quantity, addedAt, custom);
    }

    public static MyShoppingListAddTextLineItemActionBuilder of() {
        return new MyShoppingListAddTextLineItemActionBuilder();
    }

    public static MyShoppingListAddTextLineItemActionBuilder of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionBuilder builder = new MyShoppingListAddTextLineItemActionBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
