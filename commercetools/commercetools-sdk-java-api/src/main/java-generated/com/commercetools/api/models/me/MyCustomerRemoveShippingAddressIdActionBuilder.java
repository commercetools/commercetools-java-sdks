package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerRemoveShippingAddressIdActionBuilder {

    @Nullable
    private String addressId;
    
    @Nullable
    private String addressKey;

    public MyCustomerRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    public MyCustomerRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerRemoveShippingAddressIdAction build() {
        return new MyCustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerRemoveShippingAddressIdActionBuilder of() {
        return new MyCustomerRemoveShippingAddressIdActionBuilder();
    }

    public static MyCustomerRemoveShippingAddressIdActionBuilder of(final MyCustomerRemoveShippingAddressIdAction template) {
        MyCustomerRemoveShippingAddressIdActionBuilder builder = new MyCustomerRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
