package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetValidUntilActionBuilder {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public ProductDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    public ProductDiscountSetValidUntilAction build() {
        return new ProductDiscountSetValidUntilActionImpl(validUntil);
    }

    public static ProductDiscountSetValidUntilActionBuilder of() {
        return new ProductDiscountSetValidUntilActionBuilder();
    }

    public static ProductDiscountSetValidUntilActionBuilder of(final ProductDiscountSetValidUntilAction template) {
        ProductDiscountSetValidUntilActionBuilder builder = new ProductDiscountSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
