
package com.commercetools.api.models.order_edit;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeTaxRoundingModeActionImpl.class)
public interface StagedOrderChangeTaxRoundingModeAction extends StagedOrderUpdateAction {

    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public static StagedOrderChangeTaxRoundingModeAction of() {
        return new StagedOrderChangeTaxRoundingModeActionImpl();
    }

    public static StagedOrderChangeTaxRoundingModeAction of(final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionImpl instance = new StagedOrderChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder builder() {
        return StagedOrderChangeTaxRoundingModeActionBuilder.of();
    }

    public static StagedOrderChangeTaxRoundingModeActionBuilder builder(
            final StagedOrderChangeTaxRoundingModeAction template) {
        return StagedOrderChangeTaxRoundingModeActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangeTaxRoundingModeAction(
            Function<StagedOrderChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }
}
