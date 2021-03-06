
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountUpdateImpl.class)
public interface ProductDiscountUpdate
        extends com.commercetools.api.models.ResourceUpdate<ProductDiscountUpdate, ProductDiscountUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductDiscountUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProductDiscountUpdateAction... actions);

    public void setActions(final List<ProductDiscountUpdateAction> actions);

    public static ProductDiscountUpdate of() {
        return new ProductDiscountUpdateImpl();
    }

    public static ProductDiscountUpdate of(final ProductDiscountUpdate template) {
        ProductDiscountUpdateImpl instance = new ProductDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProductDiscountUpdateBuilder builder() {
        return ProductDiscountUpdateBuilder.of();
    }

    public static ProductDiscountUpdateBuilder builder(final ProductDiscountUpdate template) {
        return ProductDiscountUpdateBuilder.of(template);
    }

    default <T> T withProductDiscountUpdate(Function<ProductDiscountUpdate, T> helper) {
        return helper.apply(this);
    }
}
