
package com.commercetools.importapi.models.importrequests;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An import request for multiple product variant patch resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchRequestImpl.class)
public interface ProductVariantPatchRequest extends ImportRequest {

    String PRODUCT_VARIANT_PATCH = "product-variant-patch";

    /**
    *  <p>The product variant patches of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<ProductVariantPatch> getPatches();

    @JsonIgnore
    public void setPatches(final ProductVariantPatch... patches);

    public void setPatches(final List<ProductVariantPatch> patches);

    public static ProductVariantPatchRequest of() {
        return new ProductVariantPatchRequestImpl();
    }

    public static ProductVariantPatchRequest of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestImpl instance = new ProductVariantPatchRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    public static ProductVariantPatchRequestBuilder builder() {
        return ProductVariantPatchRequestBuilder.of();
    }

    public static ProductVariantPatchRequestBuilder builder(final ProductVariantPatchRequest template) {
        return ProductVariantPatchRequestBuilder.of(template);
    }

    default <T> T withProductVariantPatchRequest(Function<ProductVariantPatchRequest, T> helper) {
        return helper.apply(this);
    }
}
