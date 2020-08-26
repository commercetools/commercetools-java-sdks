package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetShippingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public OrderSetShippingAddressActionBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public OrderSetShippingAddressAction build() {
        return new OrderSetShippingAddressActionImpl(address);
    }

    public static OrderSetShippingAddressActionBuilder of() {
        return new OrderSetShippingAddressActionBuilder();
    }

    public static OrderSetShippingAddressActionBuilder of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionBuilder builder = new OrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
