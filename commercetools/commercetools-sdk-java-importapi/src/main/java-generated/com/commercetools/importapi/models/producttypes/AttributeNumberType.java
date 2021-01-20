
package com.commercetools.importapi.models.producttypes;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.producttypes.AttributeNumberTypeImpl;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeNumberTypeImpl.class)
public interface AttributeNumberType extends AttributeType {

    String NUMBER = "number";

    public static AttributeNumberType of() {
        return new AttributeNumberTypeImpl();
    }

    public static AttributeNumberType of(final AttributeNumberType template) {
        AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
        return instance;
    }

    public static AttributeNumberTypeBuilder builder() {
        return AttributeNumberTypeBuilder.of();
    }

    public static AttributeNumberTypeBuilder builder(final AttributeNumberType template) {
        return AttributeNumberTypeBuilder.of(template);
    }

    default <T> T withAttributeNumberType(Function<AttributeNumberType, T> helper) {
        return helper.apply(this);
    }
}
