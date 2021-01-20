
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class HighPrecisionMoneyDraftBuilder {

    private Long centAmount;

    private String currencyCode;

    @Nullable
    private Integer fractionDigits;

    private Long preciseAmount;

    public HighPrecisionMoneyDraftBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public HighPrecisionMoneyDraft build() {
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    public static HighPrecisionMoneyDraftBuilder of() {
        return new HighPrecisionMoneyDraftBuilder();
    }

    public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
