package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetSalutationActionImpl implements MyCustomerSetSalutationAction {

    
    private String action;
    
    
    private String salutation;

    @JsonCreator
    MyCustomerSetSalutationActionImpl(@JsonProperty("salutation") final String salutation) {
        this.salutation = salutation;
        this.action =  SET_SALUTATION;
    }
    public MyCustomerSetSalutationActionImpl() {
        this.action =  SET_SALUTATION;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getSalutation(){
        return this.salutation;
    }

    
    public void setSalutation(final String salutation){
        this.salutation = salutation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCustomerSetSalutationActionImpl that = (MyCustomerSetSalutationActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(salutation, that.salutation)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(salutation)
            .toHashCode();
    }

}
