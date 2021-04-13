package com.commercetools.api.models.customer;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerSignInResultImpl;

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
@JsonDeserialize(as = CustomerSignInResultImpl.class)
public interface CustomerSignInResult  {


    
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();
    /**
    *  <p>A cart that is associated to the customer.
    *  Empty if the customer does not have a cart yet.</p>
    */
    @Valid
    @JsonProperty("cart")
    public Cart getCart();

    
    public void setCustomer(final Customer customer);
    
    
    
    public void setCart(final Cart cart);
    

    public static CustomerSignInResult of(){
        return new CustomerSignInResultImpl();
    }
    

    public static CustomerSignInResult of(final CustomerSignInResult template) {
        CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
        instance.setCustomer(template.getCustomer());
        instance.setCart(template.getCart());
        return instance;
    }

    public static CustomerSignInResultBuilder builder(){
        return CustomerSignInResultBuilder.of();
    }
    
    public static CustomerSignInResultBuilder builder(final CustomerSignInResult template){
        return CustomerSignInResultBuilder.of(template);
    }
    

    default <T> T withCustomerSignInResult(Function<CustomerSignInResult, T> helper) {
        return helper.apply(this);
    }
}
