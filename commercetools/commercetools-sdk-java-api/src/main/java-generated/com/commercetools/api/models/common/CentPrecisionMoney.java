
package com.commercetools.api.models.common;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoneyImpl;
import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyImpl.class)
public interface CentPrecisionMoney extends TypedMoney {

    String CENT_PRECISION = "centPrecision";

    public static CentPrecisionMoney of() {
        return new CentPrecisionMoneyImpl();
    }

    public static CentPrecisionMoney of(final CentPrecisionMoney template) {
        CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

    public static CentPrecisionMoneyBuilder builder() {
        return CentPrecisionMoneyBuilder.of();
    }

    public static CentPrecisionMoneyBuilder builder(final CentPrecisionMoney template) {
        return CentPrecisionMoneyBuilder.of(template);
    }

    default <T> T withCentPrecisionMoney(Function<CentPrecisionMoney, T> helper) {
        return helper.apply(this);
    }
}
