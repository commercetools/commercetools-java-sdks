
package com.commercetools.api.models.discount_code;

import java.io.IOException;
import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromAndUntilActionImpl.class)
public interface DiscountCodeSetValidFromAndUntilAction extends DiscountCodeUpdateAction {

    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static DiscountCodeSetValidFromAndUntilAction of() {
        return new DiscountCodeSetValidFromAndUntilActionImpl();
    }

    public static DiscountCodeSetValidFromAndUntilAction of(final DiscountCodeSetValidFromAndUntilAction template) {
        DiscountCodeSetValidFromAndUntilActionImpl instance = new DiscountCodeSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder builder() {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of();
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder builder(
            final DiscountCodeSetValidFromAndUntilAction template) {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetValidFromAndUntilAction(
            Function<DiscountCodeSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }
}
