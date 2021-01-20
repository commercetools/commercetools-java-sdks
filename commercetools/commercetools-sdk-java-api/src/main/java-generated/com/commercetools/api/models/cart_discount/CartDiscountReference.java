
package com.commercetools.api.models.cart_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountReferenceImpl.class)
public interface CartDiscountReference extends Reference {

    String CART_DISCOUNT = "cart-discount";

    @Valid
    @JsonProperty("obj")
    public CartDiscount getObj();

    public void setObj(final CartDiscount obj);

    public static CartDiscountReference of() {
        return new CartDiscountReferenceImpl();
    }

    public static CartDiscountReference of(final CartDiscountReference template) {
        CartDiscountReferenceImpl instance = new CartDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CartDiscountReferenceBuilder builder() {
        return CartDiscountReferenceBuilder.of();
    }

    public static CartDiscountReferenceBuilder builder(final CartDiscountReference template) {
        return CartDiscountReferenceBuilder.of(template);
    }

    default <T> T withCartDiscountReference(Function<CartDiscountReference, T> helper) {
        return helper.apply(this);
    }
}
