package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductUpdateBuilder {

    
    private Long version;
    
    
    private java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions;

    public ProductUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public ProductUpdateBuilder actions( final com.commercetools.api.models.product.ProductUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    public ProductUpdateBuilder actions( final java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.ProductUpdateAction> getActions(){
        return this.actions;
    }

    public ProductUpdate build() {
        return new ProductUpdateImpl(version, actions);
    }

    public static ProductUpdateBuilder of() {
        return new ProductUpdateBuilder();
    }

    public static ProductUpdateBuilder of(final ProductUpdate template) {
        ProductUpdateBuilder builder = new ProductUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
