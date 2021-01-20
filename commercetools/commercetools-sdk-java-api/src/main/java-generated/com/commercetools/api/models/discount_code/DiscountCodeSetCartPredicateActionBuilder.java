
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetCartPredicateActionBuilder {

    @Nullable
    private String cartPredicate;

    public DiscountCodeSetCartPredicateActionBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    public DiscountCodeSetCartPredicateAction build() {
        return new DiscountCodeSetCartPredicateActionImpl(cartPredicate);
    }

    public static DiscountCodeSetCartPredicateActionBuilder of() {
        return new DiscountCodeSetCartPredicateActionBuilder();
    }

    public static DiscountCodeSetCartPredicateActionBuilder of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionBuilder builder = new DiscountCodeSetCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
