
package com.commercetools.api.models.product_type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeResourceIdentifierImpl.class)
public interface ProductTypeResourceIdentifier extends ResourceIdentifier {

    String PRODUCT_TYPE = "product-type";

    public static ProductTypeResourceIdentifier of() {
        return new ProductTypeResourceIdentifierImpl();
    }

    public static ProductTypeResourceIdentifier of(final ProductTypeResourceIdentifier template) {
        ProductTypeResourceIdentifierImpl instance = new ProductTypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductTypeResourceIdentifierBuilder builder() {
        return ProductTypeResourceIdentifierBuilder.of();
    }

    public static ProductTypeResourceIdentifierBuilder builder(final ProductTypeResourceIdentifier template) {
        return ProductTypeResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductTypeResourceIdentifier(Function<ProductTypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
