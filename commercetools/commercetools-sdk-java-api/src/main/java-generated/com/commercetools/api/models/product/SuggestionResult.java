package com.commercetools.api.models.product;

import com.commercetools.api.models.product.Suggestion;
import com.commercetools.api.models.product.SuggestionResultImpl;

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
@JsonDeserialize(as = SuggestionResultImpl.class)
public interface SuggestionResult  {


    
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<Suggestion>> values();

    
    @JsonAnySetter
    public void setValue(String key, List<Suggestion> value);

    public static SuggestionResult of(){
        return new SuggestionResultImpl();
    }
    

    public static SuggestionResult of(final SuggestionResult template) {
        SuggestionResultImpl instance = new SuggestionResultImpl();
        return instance;
    }

    public static SuggestionResultBuilder builder(){
        return SuggestionResultBuilder.of();
    }
    
    public static SuggestionResultBuilder builder(final SuggestionResult template){
        return SuggestionResultBuilder.of(template);
    }
    

    default <T> T withSuggestionResult(Function<SuggestionResult, T> helper) {
        return helper.apply(this);
    }
}
