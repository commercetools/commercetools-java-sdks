package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.MoneyType;
import com.commercetools.importer.models.common.TypedMoney;
import com.commercetools.importer.models.common.HighPrecisionMoney;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class HighPrecisionMoneyBuilder {

    @Nullable
    private Integer fractionDigits;
    
    
    private Long centAmount;
    
    
    private String currencyCode;
    
    
    private Long preciseAmount;

    public HighPrecisionMoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }
    
    public HighPrecisionMoneyBuilder centAmount( final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    public HighPrecisionMoneyBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    public HighPrecisionMoneyBuilder preciseAmount( final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    @Nullable
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    
    public Long getPreciseAmount(){
        return this.preciseAmount;
    }

    public HighPrecisionMoney build() {
        return new HighPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode, preciseAmount);
    }

    public static HighPrecisionMoneyBuilder of() {
        return new HighPrecisionMoneyBuilder();
    }

    public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
        HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
