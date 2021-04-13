package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SearchExecutionFailureErrorImpl;

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
@JsonDeserialize(as = SearchExecutionFailureErrorImpl.class)
public interface SearchExecutionFailureError extends ErrorObject {

    String SEARCH_EXECUTION_FAILURE = "SearchExecutionFailure";



    public static SearchExecutionFailureError of(){
        return new SearchExecutionFailureErrorImpl();
    }
    

    public static SearchExecutionFailureError of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorImpl instance = new SearchExecutionFailureErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SearchExecutionFailureErrorBuilder builder(){
        return SearchExecutionFailureErrorBuilder.of();
    }
    
    public static SearchExecutionFailureErrorBuilder builder(final SearchExecutionFailureError template){
        return SearchExecutionFailureErrorBuilder.of(template);
    }
    

    default <T> T withSearchExecutionFailureError(Function<SearchExecutionFailureError, T> helper) {
        return helper.apply(this);
    }
}
