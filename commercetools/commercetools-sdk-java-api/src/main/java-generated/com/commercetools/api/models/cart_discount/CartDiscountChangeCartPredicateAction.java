
package com.commercetools.api.models.cart_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionImpl;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeCartPredicateActionImpl.class)
public interface CartDiscountChangeCartPredicateAction extends CartDiscountUpdateAction {

    String CHANGE_CART_PREDICATE = "changeCartPredicate";

    /**
    *  <p>A valid Cart predicate.</p>
    */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static CartDiscountChangeCartPredicateAction of() {
        return new CartDiscountChangeCartPredicateActionImpl();
    }

    public static CartDiscountChangeCartPredicateAction of(final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    public static CartDiscountChangeCartPredicateActionBuilder builder() {
        return CartDiscountChangeCartPredicateActionBuilder.of();
    }

    public static CartDiscountChangeCartPredicateActionBuilder builder(
            final CartDiscountChangeCartPredicateAction template) {
        return CartDiscountChangeCartPredicateActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeCartPredicateAction(Function<CartDiscountChangeCartPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
