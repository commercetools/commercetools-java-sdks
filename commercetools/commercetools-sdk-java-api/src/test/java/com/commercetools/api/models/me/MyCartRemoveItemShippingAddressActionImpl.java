package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveItemShippingAddressActionImpl implements MyCartRemoveItemShippingAddressAction {

    
    private String action;
    
    
    private String addressKey;

    @JsonCreator
    MyCartRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
        this.addressKey = addressKey;
        this.action =  REMOVE_ITEM_SHIPPING_ADDRESS;
    }
    public MyCartRemoveItemShippingAddressActionImpl() {
        this.action =  REMOVE_ITEM_SHIPPING_ADDRESS;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAddressKey(){
        return this.addressKey;
    }

    
    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartRemoveItemShippingAddressActionImpl that = (MyCartRemoveItemShippingAddressActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(addressKey)
            .toHashCode();
    }

}
