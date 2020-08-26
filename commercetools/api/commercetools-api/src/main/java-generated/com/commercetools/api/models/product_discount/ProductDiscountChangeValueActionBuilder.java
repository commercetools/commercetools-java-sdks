package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountChangeValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountChangeValueActionBuilder {

    
    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    public ProductDiscountChangeValueActionBuilder value( final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    
    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue(){
        return this.value;
    }

    public ProductDiscountChangeValueAction build() {
        return new ProductDiscountChangeValueActionImpl(value);
    }

    public static ProductDiscountChangeValueActionBuilder of() {
        return new ProductDiscountChangeValueActionBuilder();
    }

    public static ProductDiscountChangeValueActionBuilder of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionBuilder builder = new ProductDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
