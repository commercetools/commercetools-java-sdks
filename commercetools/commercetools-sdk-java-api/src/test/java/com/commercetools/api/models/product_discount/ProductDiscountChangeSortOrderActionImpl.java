package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
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
public final class ProductDiscountChangeSortOrderActionImpl implements ProductDiscountChangeSortOrderAction {

    
    private String action;
    
    
    private String sortOrder;

    @JsonCreator
    ProductDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
        this.sortOrder = sortOrder;
        this.action =  CHANGE_SORT_ORDER;
    }
    public ProductDiscountChangeSortOrderActionImpl() {
        this.action =  CHANGE_SORT_ORDER;
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>The string must contain a number between 0 and 1.
    *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.</p>
    */
    public String getSortOrder(){
        return this.sortOrder;
    }

    
    public void setSortOrder(final String sortOrder){
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductDiscountChangeSortOrderActionImpl that = (ProductDiscountChangeSortOrderActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(sortOrder, that.sortOrder)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(sortOrder)
            .toHashCode();
    }

}
