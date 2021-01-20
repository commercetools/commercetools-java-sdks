
package com.commercetools.api.models.product_type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionImpl;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeRemoveEnumValuesActionImpl.class)
public interface ProductTypeRemoveEnumValuesAction extends ProductTypeUpdateAction {

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    public void setAttributeName(final String attributeName);

    @JsonIgnore
    public void setKeys(final String... keys);

    public void setKeys(final List<String> keys);

    public static ProductTypeRemoveEnumValuesAction of() {
        return new ProductTypeRemoveEnumValuesActionImpl();
    }

    public static ProductTypeRemoveEnumValuesAction of(final ProductTypeRemoveEnumValuesAction template) {
        ProductTypeRemoveEnumValuesActionImpl instance = new ProductTypeRemoveEnumValuesActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    public static ProductTypeRemoveEnumValuesActionBuilder builder() {
        return ProductTypeRemoveEnumValuesActionBuilder.of();
    }

    public static ProductTypeRemoveEnumValuesActionBuilder builder(final ProductTypeRemoveEnumValuesAction template) {
        return ProductTypeRemoveEnumValuesActionBuilder.of(template);
    }

    default <T> T withProductTypeRemoveEnumValuesAction(Function<ProductTypeRemoveEnumValuesAction, T> helper) {
        return helper.apply(this);
    }
}
