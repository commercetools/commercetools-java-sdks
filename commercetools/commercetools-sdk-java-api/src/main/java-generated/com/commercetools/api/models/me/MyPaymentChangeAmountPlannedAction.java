
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionImpl;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentChangeAmountPlannedActionImpl.class)
public interface MyPaymentChangeAmountPlannedAction extends MyPaymentUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static MyPaymentChangeAmountPlannedAction of() {
        return new MyPaymentChangeAmountPlannedActionImpl();
    }

    public static MyPaymentChangeAmountPlannedAction of(final MyPaymentChangeAmountPlannedAction template) {
        MyPaymentChangeAmountPlannedActionImpl instance = new MyPaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static MyPaymentChangeAmountPlannedActionBuilder builder() {
        return MyPaymentChangeAmountPlannedActionBuilder.of();
    }

    public static MyPaymentChangeAmountPlannedActionBuilder builder(final MyPaymentChangeAmountPlannedAction template) {
        return MyPaymentChangeAmountPlannedActionBuilder.of(template);
    }

    default <T> T withMyPaymentChangeAmountPlannedAction(Function<MyPaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }
}
