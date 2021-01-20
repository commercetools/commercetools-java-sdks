
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariantChannelAvailability;
import com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityMapImpl.class)
public interface ProductVariantChannelAvailabilityMap {

    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, ProductVariantChannelAvailability> values();

    @JsonAnySetter
    public void setValue(String key, ProductVariantChannelAvailability value);

    public static ProductVariantChannelAvailabilityMap of() {
        return new ProductVariantChannelAvailabilityMapImpl();
    }

    public static ProductVariantChannelAvailabilityMap of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
        return instance;
    }

    public static ProductVariantChannelAvailabilityMapBuilder builder() {
        return ProductVariantChannelAvailabilityMapBuilder.of();
    }

    public static ProductVariantChannelAvailabilityMapBuilder builder(
            final ProductVariantChannelAvailabilityMap template) {
        return ProductVariantChannelAvailabilityMapBuilder.of(template);
    }

    default <T> T withProductVariantChannelAvailabilityMap(Function<ProductVariantChannelAvailabilityMap, T> helper) {
        return helper.apply(this);
    }
}
