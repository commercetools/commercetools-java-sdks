package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInputDraft;
import com.commercetools.api.models.cart.ScoreShippingRateInputDraft;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputDraftImpl.class, name = "Classification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputDraftImpl.class, name = "Score")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ShippingRateInputDraftImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRateInputDraft  {





    default <T> T withShippingRateInputDraft(Function<ShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }
}
