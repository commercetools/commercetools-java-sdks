
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetCustomShippingMethodActionImpl implements MyCartSetCustomShippingMethodAction {

    private String action;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    MyCartSetCustomShippingMethodActionImpl(@JsonProperty("shippingMethodName") final String shippingMethodName,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingMethodName = shippingMethodName;
        this.shippingRate = shippingRate;
        this.taxCategory = taxCategory;
        this.externalTaxRate = externalTaxRate;
        this.action = MyCartSetCustomShippingMethodAction.SET_CUSTOM_SHIPPING_METHOD;
    }

    public MyCartSetCustomShippingMethodActionImpl() {
        this.action = MyCartSetCustomShippingMethodAction.SET_CUSTOM_SHIPPING_METHOD;
    }

    public String getAction() {
        return this.action;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public void setShippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartSetCustomShippingMethodActionImpl that = (MyCartSetCustomShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(shippingMethodName,
            that.shippingMethodName).append(shippingRate, that.shippingRate).append(taxCategory,
                that.taxCategory).append(externalTaxRate, that.externalTaxRate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingMethodName).append(shippingRate).append(
            taxCategory).append(externalTaxRate).toHashCode();
    }

}
