
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeOrderByNameActionImpl
        implements ProductTypeChangeAttributeOrderByNameAction {

    private String action;

    private java.util.List<String> attributeNames;

    @JsonCreator
    ProductTypeChangeAttributeOrderByNameActionImpl(
            @JsonProperty("attributeNames") final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        this.action = "changeAttributeOrderByName";
    }

    public ProductTypeChangeAttributeOrderByNameActionImpl() {
        this.action = "changeAttributeOrderByName";
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    public void setAttributeNames(final String... attributeNames) {
        this.attributeNames = new ArrayList<>(Arrays.asList(attributeNames));
    }

    public void setAttributeNames(final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeAttributeOrderByNameActionImpl that = (ProductTypeChangeAttributeOrderByNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeNames, that.attributeNames).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeNames).toHashCode();
    }

}
