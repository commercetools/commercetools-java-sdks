package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetCustomerNumberActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetCustomerNumberActionImpl.class)
public interface CustomerSetCustomerNumberAction extends CustomerUpdateAction {

    /**
    *  <p>It should be <strong>unique</strong> across a project.
    *  Once it's set, it cannot be changed.</p>
    */
    
    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    public void setCustomerNumber(final String customerNumber);

    public static CustomerSetCustomerNumberActionImpl of(){
        return new CustomerSetCustomerNumberActionImpl();
    }
    

    public static CustomerSetCustomerNumberActionImpl of(final CustomerSetCustomerNumberAction template) {
        CustomerSetCustomerNumberActionImpl instance = new CustomerSetCustomerNumberActionImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    default <T> T withCustomerSetCustomerNumberAction(Function<CustomerSetCustomerNumberAction, T> helper) {
        return helper.apply(this);
    }
}
