package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductLevel;
import com.commercetools.ml.models.missing_data.MissingPricesVariantLevel;
import com.commercetools.ml.models.missing_data.MissingPricesProductCountImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingPricesProductCountImpl.class)
public interface MissingPricesProductCount  {

    
    @NotNull
    @JsonProperty("total")
    public Long getTotal();
    
    @NotNull
    @JsonProperty("missingPrices")
    public Long getMissingPrices();

    public void setTotal(final Long total);
    
    public void setMissingPrices(final Long missingPrices);

    public static MissingPricesProductCount of(){
        return new MissingPricesProductCountImpl();
    }
    

    public static MissingPricesProductCount of(final MissingPricesProductCount template) {
        MissingPricesProductCountImpl instance = new MissingPricesProductCountImpl();
        instance.setTotal(template.getTotal());
        instance.setMissingPrices(template.getMissingPrices());
        return instance;
    }

    public static MissingPricesProductCountBuilder builder(){
        return MissingPricesProductCountBuilder.of();
    }
    
    public static MissingPricesProductCountBuilder builder(final MissingPricesProductCount template){
        return MissingPricesProductCountBuilder.of(template);
    }
    

    default <T> T withMissingPricesProductCount(Function<MissingPricesProductCount, T> helper) {
        return helper.apply(this);
    }
}
