
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeNameActionBuilder {

    private String attributeName;

    private String newAttributeName;

    public ProductTypeChangeAttributeNameActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeAttributeNameActionBuilder newAttributeName(final String newAttributeName) {
        this.newAttributeName = newAttributeName;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getNewAttributeName() {
        return this.newAttributeName;
    }

    public ProductTypeChangeAttributeNameAction build() {
        return new ProductTypeChangeAttributeNameActionImpl(attributeName, newAttributeName);
    }

    public static ProductTypeChangeAttributeNameActionBuilder of() {
        return new ProductTypeChangeAttributeNameActionBuilder();
    }

    public static ProductTypeChangeAttributeNameActionBuilder of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionBuilder builder = new ProductTypeChangeAttributeNameActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newAttributeName = template.getNewAttributeName();
        return builder;
    }

}
