
package com.commercetools.importapi.models.customfields;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.EnumSetFieldImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a enum set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumSetFieldImpl.class)
public interface EnumSetField extends CustomField {

    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    @JsonIgnore
    public void setValue(final String... value);

    public void setValue(final List<String> value);

    public static EnumSetField of() {
        return new EnumSetFieldImpl();
    }

    public static EnumSetField of(final EnumSetField template) {
        EnumSetFieldImpl instance = new EnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static EnumSetFieldBuilder builder() {
        return EnumSetFieldBuilder.of();
    }

    public static EnumSetFieldBuilder builder(final EnumSetField template) {
        return EnumSetFieldBuilder.of(template);
    }

    default <T> T withEnumSetField(Function<EnumSetField, T> helper) {
        return helper.apply(this);
    }
}
