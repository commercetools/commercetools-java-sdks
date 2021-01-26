
package com.commercetools.api.models.customer;

import java.lang.Object;
import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSignInResultImpl implements CustomerSignInResult {

    private com.commercetools.api.models.customer.Customer customer;

    private java.lang.Object cart;

    @JsonCreator
    CustomerSignInResultImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer,
            @JsonProperty("cart") final java.lang.Object cart) {
        this.customer = customer;
        this.cart = cart;
    }

    public CustomerSignInResultImpl() {
    }

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    /**
    *  <p>A cart that is associated to the customer.
    *  Empty if the customer does not have a cart yet.</p>
    */
    public java.lang.Object getCart() {
        return this.cart;
    }

    public void setCustomer(final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
    }

    public void setCart(final java.lang.Object cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSignInResultImpl that = (CustomerSignInResultImpl) o;

        return new EqualsBuilder().append(customer, that.customer).append(cart, that.cart).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customer).append(cart).toHashCode();
    }

}
