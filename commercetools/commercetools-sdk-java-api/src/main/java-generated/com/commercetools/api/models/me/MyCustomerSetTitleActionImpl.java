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
public final class MyCustomerSetTitleActionImpl implements MyCustomerSetTitleAction {

    
    private String action;
    
    
    private String title;

    @JsonCreator
    MyCustomerSetTitleActionImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.action =  SET_TITLE;
    }
    public MyCustomerSetTitleActionImpl() {
        this.action =  SET_TITLE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTitle(){
        return this.title;
    }

    
    public void setTitle(final String title){
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCustomerSetTitleActionImpl that = (MyCustomerSetTitleActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(title, that.title)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(title)
            .toHashCode();
    }

}
