
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeNameAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodUpdateActionImpl implements ShippingMethodUpdateAction {

    private String action;

    @JsonCreator
    ShippingMethodUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public ShippingMethodUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodUpdateActionImpl that = (ShippingMethodUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
