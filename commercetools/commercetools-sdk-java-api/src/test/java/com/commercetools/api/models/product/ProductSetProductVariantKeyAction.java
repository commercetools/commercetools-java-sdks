package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetProductVariantKeyActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetProductVariantKeyActionImpl.class)
public interface ProductSetProductVariantKeyAction extends ProductUpdateAction {

    String SET_PRODUCT_VARIANT_KEY = "setProductVariantKey";

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    /**
    *  <p>If left blank or set to <code>null</code>, the key is unset/removed.</p>
    */
    
    @JsonProperty("key")
    public String getKey();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    
    public void setVariantId(final Long variantId);
    
    
    
    public void setSku(final String sku);
    
    
    
    public void setKey(final String key);
    
    
    
    public void setStaged(final Boolean staged);
    

    public static ProductSetProductVariantKeyAction of(){
        return new ProductSetProductVariantKeyActionImpl();
    }
    

    public static ProductSetProductVariantKeyAction of(final ProductSetProductVariantKeyAction template) {
        ProductSetProductVariantKeyActionImpl instance = new ProductSetProductVariantKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetProductVariantKeyActionBuilder builder(){
        return ProductSetProductVariantKeyActionBuilder.of();
    }
    
    public static ProductSetProductVariantKeyActionBuilder builder(final ProductSetProductVariantKeyAction template){
        return ProductSetProductVariantKeyActionBuilder.of(template);
    }
    

    default <T> T withProductSetProductVariantKeyAction(Function<ProductSetProductVariantKeyAction, T> helper) {
        return helper.apply(this);
    }
}
