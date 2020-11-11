package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraft;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftImpl.class, name = "external"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftImpl.class, name = "relative"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftImpl.class, name = "absolute")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ProductDiscountValueDraftImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductDiscountValueDraft  {

    
    @NotNull
    @JsonProperty("type")
    public String getType();




    default <T> T withProductDiscountValueDraft(Function<ProductDiscountValueDraft, T> helper) {
        return helper.apply(this);
    }
}
