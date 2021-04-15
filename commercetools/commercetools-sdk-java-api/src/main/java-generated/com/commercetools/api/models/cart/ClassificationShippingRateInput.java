package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart.ClassificationShippingRateInputImpl;

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
@JsonDeserialize(as = ClassificationShippingRateInputImpl.class)
public interface ClassificationShippingRateInput extends ShippingRateInput {

    String CLASSIFICATION = "Classification";

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    
    public void setKey(final String key);
    
    
    
    public void setLabel(final LocalizedString label);
    

    public static ClassificationShippingRateInput of(){
        return new ClassificationShippingRateInputImpl();
    }
    

    public static ClassificationShippingRateInput of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputImpl instance = new ClassificationShippingRateInputImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static ClassificationShippingRateInputBuilder builder(){
        return ClassificationShippingRateInputBuilder.of();
    }
    
    public static ClassificationShippingRateInputBuilder builder(final ClassificationShippingRateInput template){
        return ClassificationShippingRateInputBuilder.of(template);
    }
    

    default <T> T withClassificationShippingRateInput(Function<ClassificationShippingRateInput, T> helper) {
        return helper.apply(this);
    }
}
