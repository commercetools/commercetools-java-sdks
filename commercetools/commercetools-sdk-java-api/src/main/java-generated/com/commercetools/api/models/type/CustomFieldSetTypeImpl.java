
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldSetTypeImpl implements CustomFieldSetType {

    private String name;

    private com.commercetools.api.models.type.FieldType elementType;

    @JsonCreator
    CustomFieldSetTypeImpl(@JsonProperty("elementType") final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        this.name = CustomFieldSetType.SET;
    }

    public CustomFieldSetTypeImpl() {
        this.name = CustomFieldSetType.SET;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.api.models.type.FieldType getElementType() {
        return this.elementType;
    }

    public void setElementType(final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldSetTypeImpl that = (CustomFieldSetTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(elementType, that.elementType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(elementType).toHashCode();
    }

}
