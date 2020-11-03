package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeRemoveEnumValuesActionBuilder {

    
    private String attributeName;
    
    
    private java.util.List<String> keys;

    public ProductTypeRemoveEnumValuesActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    public ProductTypeRemoveEnumValuesActionBuilder keys( final String ...keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }
    
    public ProductTypeRemoveEnumValuesActionBuilder keys( final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public java.util.List<String> getKeys(){
        return this.keys;
    }

    public ProductTypeRemoveEnumValuesAction build() {
        return new ProductTypeRemoveEnumValuesActionImpl(attributeName, keys);
    }

    public static ProductTypeRemoveEnumValuesActionBuilder of() {
        return new ProductTypeRemoveEnumValuesActionBuilder();
    }

    public static ProductTypeRemoveEnumValuesActionBuilder of(final ProductTypeRemoveEnumValuesAction template) {
        ProductTypeRemoveEnumValuesActionBuilder builder = new ProductTypeRemoveEnumValuesActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.keys = template.getKeys();
        return builder;
    }

}
