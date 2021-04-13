package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
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
public final class CustomerSetCustomerGroupActionImpl implements CustomerSetCustomerGroupAction {

    
    private String action;
    
    
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @JsonCreator
    CustomerSetCustomerGroupActionImpl(@JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action =  SET_CUSTOMER_GROUP;
    }
    public CustomerSetCustomerGroupActionImpl() {
        this.action =  SET_CUSTOMER_GROUP;
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not defined, the customer group is unset.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
        return this.customerGroup;
    }

    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetCustomerGroupActionImpl that = (CustomerSetCustomerGroupActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customerGroup)
            .toHashCode();
    }

}
