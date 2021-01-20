
package com.commercetools.api.models.shipping_method;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodReferenceImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodReferenceImpl.class)
public interface ShippingMethodReference extends Reference {

    String SHIPPING_METHOD = "shipping-method";

    @Valid
    @JsonProperty("obj")
    public ShippingMethod getObj();

    public void setObj(final ShippingMethod obj);

    public static ShippingMethodReference of() {
        return new ShippingMethodReferenceImpl();
    }

    public static ShippingMethodReference of(final ShippingMethodReference template) {
        ShippingMethodReferenceImpl instance = new ShippingMethodReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ShippingMethodReferenceBuilder builder() {
        return ShippingMethodReferenceBuilder.of();
    }

    public static ShippingMethodReferenceBuilder builder(final ShippingMethodReference template) {
        return ShippingMethodReferenceBuilder.of(template);
    }

    default <T> T withShippingMethodReference(Function<ShippingMethodReference, T> helper) {
        return helper.apply(this);
    }
}
