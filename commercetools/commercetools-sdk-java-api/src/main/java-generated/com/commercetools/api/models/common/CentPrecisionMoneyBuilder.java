
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoney;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CentPrecisionMoneyBuilder {

    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    public CentPrecisionMoneyBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public CentPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public CentPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public CentPrecisionMoney build() {
        return new CentPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode);
    }

    public static CentPrecisionMoneyBuilder of() {
        return new CentPrecisionMoneyBuilder();
    }

    public static CentPrecisionMoneyBuilder of(final CentPrecisionMoney template) {
        CentPrecisionMoneyBuilder builder = new CentPrecisionMoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
