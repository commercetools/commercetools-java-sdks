package com.commercetools.ml.models.missing_data;


import com.commercetools.ml.models.missing_data.AttributeCount;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeCountBuilder {

    
    private Integer productTypeAttributes;
    
    
    private Integer variantAttributes;
    
    
    private Integer missingAttributeValues;

    public AttributeCountBuilder productTypeAttributes( final Integer productTypeAttributes) {
        this.productTypeAttributes = productTypeAttributes;
        return this;
    }
    
    public AttributeCountBuilder variantAttributes( final Integer variantAttributes) {
        this.variantAttributes = variantAttributes;
        return this;
    }
    
    public AttributeCountBuilder missingAttributeValues( final Integer missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
        return this;
    }

    
    public Integer getProductTypeAttributes(){
        return this.productTypeAttributes;
    }
    
    
    public Integer getVariantAttributes(){
        return this.variantAttributes;
    }
    
    
    public Integer getMissingAttributeValues(){
        return this.missingAttributeValues;
    }

    public AttributeCount build() {
        return new AttributeCountImpl(productTypeAttributes, variantAttributes, missingAttributeValues);
    }

    public static AttributeCountBuilder of() {
        return new AttributeCountBuilder();
    }

    public static AttributeCountBuilder of(final AttributeCount template) {
        AttributeCountBuilder builder = new AttributeCountBuilder();
        builder.productTypeAttributes = template.getProductTypeAttributes();
        builder.variantAttributes = template.getVariantAttributes();
        builder.missingAttributeValues = template.getMissingAttributeValues();
        return builder;
    }

}
