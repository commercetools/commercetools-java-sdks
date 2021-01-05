package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantImport;
import com.commercetools.importapi.models.importrequests.ProductVariantImportRequestImpl;

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

/**
*  <p>An import request for multiple product variant import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantImportRequestImpl.class)
public interface ProductVariantImportRequest extends ImportRequest {

    /**
    *  <p>The product variant import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductVariantImport> getResources();

    @JsonIgnore
    public void setResources(final ProductVariantImport ...resources);
    public void setResources(final List<ProductVariantImport> resources);

    public static ProductVariantImportRequest of(){
        return new ProductVariantImportRequestImpl();
    }
    

    public static ProductVariantImportRequest of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestImpl instance = new ProductVariantImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static ProductVariantImportRequestBuilder builder(){
        return ProductVariantImportRequestBuilder.of();
    }
    
    public static ProductVariantImportRequestBuilder builder(final ProductVariantImportRequest template){
        return ProductVariantImportRequestBuilder.of(template);
    }
    

    default <T> T withProductVariantImportRequest(Function<ProductVariantImportRequest, T> helper) {
        return helper.apply(this);
    }
}
