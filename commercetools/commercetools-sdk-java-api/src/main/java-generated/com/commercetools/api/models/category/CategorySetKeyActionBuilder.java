
package com.commercetools.api.models.category;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategorySetKeyAction;
import com.commercetools.api.models.category.CategoryUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetKeyActionBuilder {

    @Nullable
    private String key;

    public CategorySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CategorySetKeyAction build() {
        return new CategorySetKeyActionImpl(key);
    }

    public static CategorySetKeyActionBuilder of() {
        return new CategorySetKeyActionBuilder();
    }

    public static CategorySetKeyActionBuilder of(final CategorySetKeyAction template) {
        CategorySetKeyActionBuilder builder = new CategorySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
