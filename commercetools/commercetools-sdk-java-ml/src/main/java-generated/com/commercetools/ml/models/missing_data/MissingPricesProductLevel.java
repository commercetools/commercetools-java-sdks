package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductCount;
import com.commercetools.ml.models.missing_data.MissingPricesProductLevelImpl;

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
@JsonDeserialize(as = MissingPricesProductLevelImpl.class)
public interface MissingPricesProductLevel extends MissingPricesProductCount {

    /**
    *  <p>Number of products scanned.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();
    /**
    *  <p>Number of products missing prices.</p>
    */
    @NotNull
    @JsonProperty("missingPrices")
    public Long getMissingPrices();

    public void setTotal(final Long total);
    
    public void setMissingPrices(final Long missingPrices);

    public static MissingPricesProductLevelImpl of(){
        return new MissingPricesProductLevelImpl();
    }
    

    public static MissingPricesProductLevelImpl of(final MissingPricesProductLevel template) {
        MissingPricesProductLevelImpl instance = new MissingPricesProductLevelImpl();
        instance.setTotal(template.getTotal());
        instance.setMissingPrices(template.getMissingPrices());
        return instance;
    }

    default <T> T withMissingPricesProductLevel(Function<MissingPricesProductLevel, T> helper) {
        return helper.apply(this);
    }
}
