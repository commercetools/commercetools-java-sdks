package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodUpdateBuilder {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions;

    
    public ShippingMethodUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    public ShippingMethodUpdateBuilder actions( final com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    
    public ShippingMethodUpdateBuilder actions( final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> getActions(){
        return this.actions;
    }

    public ShippingMethodUpdate build() {
        return new ShippingMethodUpdateImpl(version, actions);
    }

    public static ShippingMethodUpdateBuilder of() {
        return new ShippingMethodUpdateBuilder();
    }

    public static ShippingMethodUpdateBuilder of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateBuilder builder = new ShippingMethodUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
