
package com.commercetools.importapi.models.producttypes;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.producttypes.AttributeBooleanTypeImpl;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeBooleanTypeImpl.class)
public interface AttributeBooleanType extends AttributeType {

    String BOOLEAN = "boolean";

    public static AttributeBooleanType of() {
        return new AttributeBooleanTypeImpl();
    }

    public static AttributeBooleanType of(final AttributeBooleanType template) {
        AttributeBooleanTypeImpl instance = new AttributeBooleanTypeImpl();
        return instance;
    }

    public static AttributeBooleanTypeBuilder builder() {
        return AttributeBooleanTypeBuilder.of();
    }

    public static AttributeBooleanTypeBuilder builder(final AttributeBooleanType template) {
        return AttributeBooleanTypeBuilder.of(template);
    }

    default <T> T withAttributeBooleanType(Function<AttributeBooleanType, T> helper) {
        return helper.apply(this);
    }
}
