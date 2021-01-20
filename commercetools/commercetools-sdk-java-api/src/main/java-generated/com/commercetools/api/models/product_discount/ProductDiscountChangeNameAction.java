
package com.commercetools.api.models.product_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionImpl;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeNameActionImpl.class)
public interface ProductDiscountChangeNameAction extends ProductDiscountUpdateAction {

    String CHANGE_NAME = "changeName";

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ProductDiscountChangeNameAction of() {
        return new ProductDiscountChangeNameActionImpl();
    }

    public static ProductDiscountChangeNameAction of(final ProductDiscountChangeNameAction template) {
        ProductDiscountChangeNameActionImpl instance = new ProductDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductDiscountChangeNameActionBuilder builder() {
        return ProductDiscountChangeNameActionBuilder.of();
    }

    public static ProductDiscountChangeNameActionBuilder builder(final ProductDiscountChangeNameAction template) {
        return ProductDiscountChangeNameActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangeNameAction(Function<ProductDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
