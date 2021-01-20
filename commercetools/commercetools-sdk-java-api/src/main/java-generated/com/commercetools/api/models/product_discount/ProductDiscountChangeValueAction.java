
package com.commercetools.api.models.product_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionImpl;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeValueActionImpl.class)
public interface ProductDiscountChangeValueAction extends ProductDiscountUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValueDraft getValue();

    public void setValue(final ProductDiscountValueDraft value);

    public static ProductDiscountChangeValueAction of() {
        return new ProductDiscountChangeValueActionImpl();
    }

    public static ProductDiscountChangeValueAction of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionImpl instance = new ProductDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static ProductDiscountChangeValueActionBuilder builder() {
        return ProductDiscountChangeValueActionBuilder.of();
    }

    public static ProductDiscountChangeValueActionBuilder builder(final ProductDiscountChangeValueAction template) {
        return ProductDiscountChangeValueActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangeValueAction(Function<ProductDiscountChangeValueAction, T> helper) {
        return helper.apply(this);
    }
}
