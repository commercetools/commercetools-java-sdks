
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.me.MyCartChangeTaxModeActionImpl;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartChangeTaxModeActionImpl.class)
public interface MyCartChangeTaxModeAction extends MyCartUpdateAction {

    String CHANGE_TAX_MODE = "changeTaxMode";

    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    public void setTaxMode(final TaxMode taxMode);

    public static MyCartChangeTaxModeAction of() {
        return new MyCartChangeTaxModeActionImpl();
    }

    public static MyCartChangeTaxModeAction of(final MyCartChangeTaxModeAction template) {
        MyCartChangeTaxModeActionImpl instance = new MyCartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public static MyCartChangeTaxModeActionBuilder builder() {
        return MyCartChangeTaxModeActionBuilder.of();
    }

    public static MyCartChangeTaxModeActionBuilder builder(final MyCartChangeTaxModeAction template) {
        return MyCartChangeTaxModeActionBuilder.of(template);
    }

    default <T> T withMyCartChangeTaxModeAction(Function<MyCartChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }
}
