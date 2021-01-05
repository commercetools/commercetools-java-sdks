package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionActionImpl;

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
@JsonDeserialize(as = ShippingMethodSetDescriptionActionImpl.class)
public interface ShippingMethodSetDescriptionAction extends ShippingMethodUpdateAction {

    
    
    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ShippingMethodSetDescriptionAction of(){
        return new ShippingMethodSetDescriptionActionImpl();
    }
    

    public static ShippingMethodSetDescriptionAction of(final ShippingMethodSetDescriptionAction template) {
        ShippingMethodSetDescriptionActionImpl instance = new ShippingMethodSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShippingMethodSetDescriptionActionBuilder builder(){
        return ShippingMethodSetDescriptionActionBuilder.of();
    }
    
    public static ShippingMethodSetDescriptionActionBuilder builder(final ShippingMethodSetDescriptionAction template){
        return ShippingMethodSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withShippingMethodSetDescriptionAction(Function<ShippingMethodSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
