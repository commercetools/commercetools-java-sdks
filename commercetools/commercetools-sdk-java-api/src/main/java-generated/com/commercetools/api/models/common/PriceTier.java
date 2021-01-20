
package com.commercetools.api.models.common;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceTierImpl;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceTierImpl.class)
public interface PriceTier {

    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setMinimumQuantity(final Long minimumQuantity);

    public void setValue(final TypedMoney value);

    public static PriceTier of() {
        return new PriceTierImpl();
    }

    public static PriceTier of(final PriceTier template) {
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PriceTierBuilder builder() {
        return PriceTierBuilder.of();
    }

    public static PriceTierBuilder builder(final PriceTier template) {
        return PriceTierBuilder.of(template);
    }

    default <T> T withPriceTier(Function<PriceTier, T> helper) {
        return helper.apply(this);
    }
}
