
package com.commercetools.api.models.customer;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionImpl;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetDefaultShippingAddressActionImpl.class)
public interface CustomerSetDefaultShippingAddressAction extends CustomerUpdateAction {

    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

    /**
    *  <p>If not defined, the customer's <code>defaultShippingAddress</code> is unset.</p>
    */

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerSetDefaultShippingAddressAction of() {
        return new CustomerSetDefaultShippingAddressActionImpl();
    }

    public static CustomerSetDefaultShippingAddressAction of(final CustomerSetDefaultShippingAddressAction template) {
        CustomerSetDefaultShippingAddressActionImpl instance = new CustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerSetDefaultShippingAddressActionBuilder builder() {
        return CustomerSetDefaultShippingAddressActionBuilder.of();
    }

    public static CustomerSetDefaultShippingAddressActionBuilder builder(
            final CustomerSetDefaultShippingAddressAction template) {
        return CustomerSetDefaultShippingAddressActionBuilder.of(template);
    }

    default <T> T withCustomerSetDefaultShippingAddressAction(
            Function<CustomerSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
