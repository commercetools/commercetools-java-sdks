
package com.commercetools.importapi.models.customfields;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.NumberFieldImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a number value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NumberFieldImpl.class)
public interface NumberField extends CustomField {

    @NotNull
    @JsonProperty("value")
    public Double getValue();

    public void setValue(final Double value);

    public static NumberField of() {
        return new NumberFieldImpl();
    }

    public static NumberField of(final NumberField template) {
        NumberFieldImpl instance = new NumberFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static NumberFieldBuilder builder() {
        return NumberFieldBuilder.of();
    }

    public static NumberFieldBuilder builder(final NumberField template) {
        return NumberFieldBuilder.of(template);
    }

    default <T> T withNumberField(Function<NumberField, T> helper) {
        return helper.apply(this);
    }
}
