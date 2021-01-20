
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction;
import com.commercetools.api.models.me.MyCustomerUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerAddBillingAddressIdActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public MyCustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    public MyCustomerAddBillingAddressIdAction build() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of() {
        return new MyCustomerAddBillingAddressIdActionBuilder();
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
