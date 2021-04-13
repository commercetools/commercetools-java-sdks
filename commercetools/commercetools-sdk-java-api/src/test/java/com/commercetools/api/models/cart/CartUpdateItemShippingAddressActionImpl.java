package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
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
public final class CartUpdateItemShippingAddressActionImpl implements CartUpdateItemShippingAddressAction {

    
    private String action;
    
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    CartUpdateItemShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.action =  UPDATE_ITEM_SHIPPING_ADDRESS;
    }
    public CartUpdateItemShippingAddressActionImpl() {
        this.action =  UPDATE_ITEM_SHIPPING_ADDRESS;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    
    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartUpdateItemShippingAddressActionImpl that = (CartUpdateItemShippingAddressActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(address, that.address)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(address)
            .toHashCode();
    }

}
