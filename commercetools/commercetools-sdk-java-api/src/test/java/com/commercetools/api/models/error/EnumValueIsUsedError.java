package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.EnumValueIsUsedErrorImpl;

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
@JsonDeserialize(as = EnumValueIsUsedErrorImpl.class)
public interface EnumValueIsUsedError extends ErrorObject {

    String ENUM_VALUE_IS_USED = "EnumValueIsUsed";



    public static EnumValueIsUsedError of(){
        return new EnumValueIsUsedErrorImpl();
    }
    

    public static EnumValueIsUsedError of(final EnumValueIsUsedError template) {
        EnumValueIsUsedErrorImpl instance = new EnumValueIsUsedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static EnumValueIsUsedErrorBuilder builder(){
        return EnumValueIsUsedErrorBuilder.of();
    }
    
    public static EnumValueIsUsedErrorBuilder builder(final EnumValueIsUsedError template){
        return EnumValueIsUsedErrorBuilder.of(template);
    }
    

    default <T> T withEnumValueIsUsedError(Function<EnumValueIsUsedError, T> helper) {
        return helper.apply(this);
    }
}
