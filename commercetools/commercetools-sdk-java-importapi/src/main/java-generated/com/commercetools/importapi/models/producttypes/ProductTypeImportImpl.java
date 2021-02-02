
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.producttypes.AttributeDefinition;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Import representation for a product type.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeImportImpl implements ProductTypeImport {

    private String key;

    private String name;

    private String description;

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes;

    @JsonCreator
    ProductTypeImportImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    public ProductTypeImportImpl() {
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Maps to <code>ProductType.name</code>.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>Maps to <code>ProductType.description</code>.</p>
    */
    public String getDescription() {
        return this.description;
    }

    /**
    *  <p>The product type's attributes.</p>
    */
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> getAttributes() {
        return this.attributes;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAttributes(final com.commercetools.importapi.models.producttypes.AttributeDefinition... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeImportImpl that = (ProductTypeImportImpl) o;

        return new EqualsBuilder().append(key, that.key).append(name, that.name).append(description,
            that.description).append(attributes, that.attributes).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).append(description).append(attributes).toHashCode();
    }

}
