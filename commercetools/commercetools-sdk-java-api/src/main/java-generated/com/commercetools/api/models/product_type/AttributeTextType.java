package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeTextTypeImpl;

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
@JsonDeserialize(as = AttributeTextTypeImpl.class)
public interface AttributeTextType extends AttributeType {



    public static AttributeTextType of(){
        return new AttributeTextTypeImpl();
    }
    

    public static AttributeTextType of(final AttributeTextType template) {
        AttributeTextTypeImpl instance = new AttributeTextTypeImpl();
        return instance;
    }

    public static AttributeTextTypeBuilder builder(){
        return AttributeTextTypeBuilder.of();
    }
    
    public static AttributeTextTypeBuilder builder(final AttributeTextType template){
        return AttributeTextTypeBuilder.of(template);
    }
    

    default <T> T withAttributeTextType(Function<AttributeTextType, T> helper) {
        return helper.apply(this);
    }
}
