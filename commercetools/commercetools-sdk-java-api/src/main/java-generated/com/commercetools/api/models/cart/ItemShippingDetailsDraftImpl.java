package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ItemShippingTarget;
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
public final class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft {

    
    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    @JsonCreator
    ItemShippingDetailsDraftImpl(@JsonProperty("targets") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
    }
    public ItemShippingDetailsDraftImpl() {
    }

    /**
    *  <p>Used to capture one or more (custom) line item specific shipping addresses.
    *  By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item.
    *  A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item.
    *  For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
    */
    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets(){
        return this.targets;
    }

    
    public void setTargets(final com.commercetools.api.models.cart.ItemShippingTarget ...targets){
       this.targets = new ArrayList<>(Arrays.asList(targets));
    }
    
    
    public void setTargets(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets){
       this.targets = targets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ItemShippingDetailsDraftImpl that = (ItemShippingDetailsDraftImpl) o;
    
        return new EqualsBuilder()
                .append(targets, that.targets)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(targets)
            .toHashCode();
    }

}
