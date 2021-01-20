
package com.commercetools.importapi.models.producttypes;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeImpl;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeDateTimeTypeImpl.class)
public interface AttributeDateTimeType extends AttributeType {

    public static AttributeDateTimeType of() {
        return new AttributeDateTimeTypeImpl();
    }

    public static AttributeDateTimeType of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeImpl instance = new AttributeDateTimeTypeImpl();
        return instance;
    }

    public static AttributeDateTimeTypeBuilder builder() {
        return AttributeDateTimeTypeBuilder.of();
    }

    public static AttributeDateTimeTypeBuilder builder(final AttributeDateTimeType template) {
        return AttributeDateTimeTypeBuilder.of(template);
    }

    default <T> T withAttributeDateTimeType(Function<AttributeDateTimeType, T> helper) {
        return helper.apply(this);
    }
}
