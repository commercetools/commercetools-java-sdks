
package com.commercetools.api.models.extension;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.extension.ExtensionSetKeyAction;
import com.commercetools.api.models.extension.ExtensionUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionSetKeyActionBuilder {

    @Nullable
    private String key;

    public ExtensionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ExtensionSetKeyAction build() {
        return new ExtensionSetKeyActionImpl(key);
    }

    public static ExtensionSetKeyActionBuilder of() {
        return new ExtensionSetKeyActionBuilder();
    }

    public static ExtensionSetKeyActionBuilder of(final ExtensionSetKeyAction template) {
        ExtensionSetKeyActionBuilder builder = new ExtensionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
