package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerRemoveBillingAddressIdActionBuilder {

    @Nullable
    private String addressId;
    
    @Nullable
    private String addressKey;

    public MyCustomerRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    public MyCustomerRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerRemoveBillingAddressIdAction build() {
        return new MyCustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder of() {
        return new MyCustomerRemoveBillingAddressIdActionBuilder();
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder of(final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionBuilder builder = new MyCustomerRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
