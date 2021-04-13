package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Money;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExternalTaxAmountDraftImpl implements ExternalTaxAmountDraft {

    
    private com.commercetools.api.models.common.Money totalGross;
    
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    @JsonCreator
    ExternalTaxAmountDraftImpl(@JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross, @JsonProperty("taxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.totalGross = totalGross;
        this.taxRate = taxRate;
    }
    public ExternalTaxAmountDraftImpl() {
    }

    /**
    *  <p>The total gross amount of the item (totalNet + taxes).</p>
    */
    public com.commercetools.api.models.common.Money getTotalGross(){
        return this.totalGross;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate(){
        return this.taxRate;
    }

    
    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross){
        this.totalGross = totalGross;
    }
    
    
    public void setTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate){
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ExternalTaxAmountDraftImpl that = (ExternalTaxAmountDraftImpl) o;
    
        return new EqualsBuilder()
                .append(totalGross, that.totalGross)
                .append(taxRate, that.taxRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(totalGross)
            .append(taxRate)
            .toHashCode();
    }

}
