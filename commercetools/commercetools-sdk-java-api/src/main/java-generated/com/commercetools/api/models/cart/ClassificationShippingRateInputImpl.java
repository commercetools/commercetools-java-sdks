
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ClassificationShippingRateInputImpl implements ClassificationShippingRateInput {

    private String type;

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    @JsonCreator
    ClassificationShippingRateInputImpl(@JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
        this.type = "Classification";
    }

    public ClassificationShippingRateInputImpl() {
        this.type = "Classification";
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ClassificationShippingRateInputImpl that = (ClassificationShippingRateInputImpl) o;

        return new EqualsBuilder().append(type, that.type).append(key, that.key).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(label).toHashCode();
    }

}
