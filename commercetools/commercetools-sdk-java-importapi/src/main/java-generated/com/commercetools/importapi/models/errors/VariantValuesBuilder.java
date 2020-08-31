package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.errors.VariantValues;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class VariantValuesBuilder {

    @Nullable
    private String sku;
    
    
    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices;
    
    
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    public VariantValuesBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    public VariantValuesBuilder prices( final java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices) {
        this.prices = prices;
        return this;
    }
    
    public VariantValuesBuilder attributes( final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getPrices(){
        return this.prices;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }

    public VariantValues build() {
        return new VariantValuesImpl(sku, prices, attributes);
    }

    public static VariantValuesBuilder of() {
        return new VariantValuesBuilder();
    }

    public static VariantValuesBuilder of(final VariantValues template) {
        VariantValuesBuilder builder = new VariantValuesBuilder();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
