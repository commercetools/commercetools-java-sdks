package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.EnumValuesMustMatchErrorImpl;

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
@JsonDeserialize(as = EnumValuesMustMatchErrorImpl.class)
public interface EnumValuesMustMatchError extends ErrorObject {



    public static EnumValuesMustMatchErrorImpl of(){
        return new EnumValuesMustMatchErrorImpl();
    }
    

    public static EnumValuesMustMatchErrorImpl of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorImpl instance = new EnumValuesMustMatchErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withEnumValuesMustMatchError(Function<EnumValuesMustMatchError, T> helper) {
        return helper.apply(this);
    }
}
