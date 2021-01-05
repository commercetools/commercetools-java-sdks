package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidOperationImpl;

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

/**
*  <p>The resources involved in the request are not in a valid state for the operation.
*  The client application should validate the constraints described in the error message before sending the request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidOperationImpl.class)
public interface InvalidOperation extends ErrorObject {



    public static InvalidOperation of(){
        return new InvalidOperationImpl();
    }
    

    public static InvalidOperation of(final InvalidOperation template) {
        InvalidOperationImpl instance = new InvalidOperationImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidOperationBuilder builder(){
        return InvalidOperationBuilder.of();
    }
    
    public static InvalidOperationBuilder builder(final InvalidOperation template){
        return InvalidOperationBuilder.of(template);
    }
    

    default <T> T withInvalidOperation(Function<InvalidOperation, T> helper) {
        return helper.apply(this);
    }
}
