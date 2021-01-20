
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductSetMetaDescriptionActionImpl;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaDescriptionActionImpl.class)
public interface ProductSetMetaDescriptionAction extends ProductUpdateAction {

    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setStaged(final Boolean staged);

    public static ProductSetMetaDescriptionAction of() {
        return new ProductSetMetaDescriptionActionImpl();
    }

    public static ProductSetMetaDescriptionAction of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionImpl instance = new ProductSetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaDescriptionActionBuilder builder() {
        return ProductSetMetaDescriptionActionBuilder.of();
    }

    public static ProductSetMetaDescriptionActionBuilder builder(final ProductSetMetaDescriptionAction template) {
        return ProductSetMetaDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetMetaDescriptionAction(Function<ProductSetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
