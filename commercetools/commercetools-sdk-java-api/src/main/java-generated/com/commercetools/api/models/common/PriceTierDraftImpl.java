package com.commercetools.api.models.common;

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
public final class PriceTierDraftImpl implements PriceTierDraft {

    
    private Long minimumQuantity;
    
    
    private com.commercetools.api.models.common.Money value;

    @JsonCreator
    PriceTierDraftImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity, @JsonProperty("value") final com.commercetools.api.models.common.Money value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }
    public PriceTierDraftImpl() {
    }

    
    public Long getMinimumQuantity(){
        return this.minimumQuantity;
    }
    
    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }

    
    public void setMinimumQuantity(final Long minimumQuantity){
        this.minimumQuantity = minimumQuantity;
    }
    
    
    public void setValue(final com.commercetools.api.models.common.Money value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PriceTierDraftImpl that = (PriceTierDraftImpl) o;
    
        return new EqualsBuilder()
                .append(minimumQuantity, that.minimumQuantity)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(minimumQuantity)
            .append(value)
            .toHashCode();
    }

}
