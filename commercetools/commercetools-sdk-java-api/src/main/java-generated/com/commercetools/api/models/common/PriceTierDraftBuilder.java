package com.commercetools.api.models.common;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceTierDraftBuilder {

    
    private Long minimumQuantity;
    
    
    private com.commercetools.api.models.common.Money value;

    public PriceTierDraftBuilder minimumQuantity( final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }
    
    public PriceTierDraftBuilder value( final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    
    public Long getMinimumQuantity(){
        return this.minimumQuantity;
    }
    
    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }

    public PriceTierDraft build() {
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    public static PriceTierDraftBuilder of() {
        return new PriceTierDraftBuilder();
    }

    public static PriceTierDraftBuilder of(final PriceTierDraft template) {
        PriceTierDraftBuilder builder = new PriceTierDraftBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
