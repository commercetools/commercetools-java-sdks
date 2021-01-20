
package com.commercetools.api.models.order_edit;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionImpl;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressAndShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndShippingMethodAction extends StagedOrderUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setAddress(final Address address);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingAddressAndShippingMethodAction of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
    }

    public static StagedOrderSetShippingAddressAndShippingMethodAction of(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressAndShippingMethodAction(
            Function<StagedOrderSetShippingAddressAndShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}
