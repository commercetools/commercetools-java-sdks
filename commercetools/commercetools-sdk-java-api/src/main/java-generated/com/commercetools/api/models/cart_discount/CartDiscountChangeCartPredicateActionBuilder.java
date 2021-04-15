package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeCartPredicateActionBuilder {

    
    
    private String cartPredicate;

    
    public CartDiscountChangeCartPredicateActionBuilder cartPredicate( final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    
    
    public String getCartPredicate(){
        return this.cartPredicate;
    }

    public CartDiscountChangeCartPredicateAction build() {
        return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
    }

    public static CartDiscountChangeCartPredicateActionBuilder of() {
        return new CartDiscountChangeCartPredicateActionBuilder();
    }

    public static CartDiscountChangeCartPredicateActionBuilder of(final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionBuilder builder = new CartDiscountChangeCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
