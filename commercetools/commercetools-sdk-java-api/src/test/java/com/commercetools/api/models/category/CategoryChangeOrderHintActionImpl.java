package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
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
public final class CategoryChangeOrderHintActionImpl implements CategoryChangeOrderHintAction {

    
    private String action;
    
    
    private String orderHint;

    @JsonCreator
    CategoryChangeOrderHintActionImpl(@JsonProperty("orderHint") final String orderHint) {
        this.orderHint = orderHint;
        this.action =  CHANGE_ORDER_HINT;
    }
    public CategoryChangeOrderHintActionImpl() {
        this.action =  CHANGE_ORDER_HINT;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getOrderHint(){
        return this.orderHint;
    }

    
    public void setOrderHint(final String orderHint){
        this.orderHint = orderHint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategoryChangeOrderHintActionImpl that = (CategoryChangeOrderHintActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(orderHint, that.orderHint)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(orderHint)
            .toHashCode();
    }

}
