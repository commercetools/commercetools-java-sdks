
package com.commercetools.api.models.product_type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipActionImpl;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetInputTipActionImpl.class)
public interface ProductTypeSetInputTipAction extends ProductTypeUpdateAction {

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    public void setAttributeName(final String attributeName);

    public void setInputTip(final LocalizedString inputTip);

    public static ProductTypeSetInputTipAction of() {
        return new ProductTypeSetInputTipActionImpl();
    }

    public static ProductTypeSetInputTipAction of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionImpl instance = new ProductTypeSetInputTipActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setInputTip(template.getInputTip());
        return instance;
    }

    public static ProductTypeSetInputTipActionBuilder builder() {
        return ProductTypeSetInputTipActionBuilder.of();
    }

    public static ProductTypeSetInputTipActionBuilder builder(final ProductTypeSetInputTipAction template) {
        return ProductTypeSetInputTipActionBuilder.of(template);
    }

    default <T> T withProductTypeSetInputTipAction(Function<ProductTypeSetInputTipAction, T> helper) {
        return helper.apply(this);
    }
}
