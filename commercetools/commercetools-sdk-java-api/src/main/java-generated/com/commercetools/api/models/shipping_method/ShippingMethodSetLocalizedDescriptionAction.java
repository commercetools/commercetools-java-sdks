
package com.commercetools.api.models.shipping_method;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionActionImpl.class)
public interface ShippingMethodSetLocalizedDescriptionAction extends ShippingMethodUpdateAction {

    String SET_LOCALIZED_DESCRIPTION = "setLocalizedDescription";

    @JsonProperty("localizedDescription")
    public String getLocalizedDescription();

    public void setLocalizedDescription(final String localizedDescription);

    public static ShippingMethodSetLocalizedDescriptionAction of() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl();
    }

    public static ShippingMethodSetLocalizedDescriptionAction of(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionImpl instance = new ShippingMethodSetLocalizedDescriptionActionImpl();
        instance.setLocalizedDescription(template.getLocalizedDescription());
        return instance;
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder() {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of();
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetLocalizedDescriptionAction(
            Function<ShippingMethodSetLocalizedDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
