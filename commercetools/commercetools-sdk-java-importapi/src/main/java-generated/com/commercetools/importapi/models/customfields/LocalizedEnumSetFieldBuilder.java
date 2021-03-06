
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedEnumSetFieldBuilder {

    private java.util.List<String> value;

    public LocalizedEnumSetFieldBuilder value(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public LocalizedEnumSetFieldBuilder value(final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    public java.util.List<String> getValue() {
        return this.value;
    }

    public LocalizedEnumSetField build() {
        return new LocalizedEnumSetFieldImpl(value);
    }

    public static LocalizedEnumSetFieldBuilder of() {
        return new LocalizedEnumSetFieldBuilder();
    }

    public static LocalizedEnumSetFieldBuilder of(final LocalizedEnumSetField template) {
        LocalizedEnumSetFieldBuilder builder = new LocalizedEnumSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
