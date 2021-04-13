package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetCustomerGroupActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomerGroupActionImpl.class)
public interface CustomerSetCustomerGroupAction extends CustomerUpdateAction {

    String SET_CUSTOMER_GROUP = "setCustomerGroup";

    /**
    *  <p>If not defined, the customer group is unset.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    
    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
    

    public static CustomerSetCustomerGroupAction of(){
        return new CustomerSetCustomerGroupActionImpl();
    }
    

    public static CustomerSetCustomerGroupAction of(final CustomerSetCustomerGroupAction template) {
        CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static CustomerSetCustomerGroupActionBuilder builder(){
        return CustomerSetCustomerGroupActionBuilder.of();
    }
    
    public static CustomerSetCustomerGroupActionBuilder builder(final CustomerSetCustomerGroupAction template){
        return CustomerSetCustomerGroupActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetCustomerGroupAction(Function<CustomerSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }
}
