package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddBillingAddressIdActionBuilder {

    @Nullable
    private String addressId;
    
    @Nullable
    private String addressKey;

    public CustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    public CustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    public CustomerAddBillingAddressIdAction build() {
        return new CustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerAddBillingAddressIdActionBuilder of() {
        return new CustomerAddBillingAddressIdActionBuilder();
    }

    public static CustomerAddBillingAddressIdActionBuilder of(final CustomerAddBillingAddressIdAction template) {
        CustomerAddBillingAddressIdActionBuilder builder = new CustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
