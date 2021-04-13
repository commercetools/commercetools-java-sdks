package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionImpl;

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
@JsonDeserialize(as = MyCustomerRemoveShippingAddressIdActionImpl.class)
public interface MyCustomerRemoveShippingAddressIdAction extends MyCustomerUpdateAction {

    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    
    public void setAddressId(final String addressId);
    
    
    
    public void setAddressKey(final String addressKey);
    

    public static MyCustomerRemoveShippingAddressIdAction of(){
        return new MyCustomerRemoveShippingAddressIdActionImpl();
    }
    

    public static MyCustomerRemoveShippingAddressIdAction of(final MyCustomerRemoveShippingAddressIdAction template) {
        MyCustomerRemoveShippingAddressIdActionImpl instance = new MyCustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerRemoveShippingAddressIdActionBuilder builder(){
        return MyCustomerRemoveShippingAddressIdActionBuilder.of();
    }
    
    public static MyCustomerRemoveShippingAddressIdActionBuilder builder(final MyCustomerRemoveShippingAddressIdAction template){
        return MyCustomerRemoveShippingAddressIdActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerRemoveShippingAddressIdAction(Function<MyCustomerRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
