
package com.commercetools.importapi.models.products;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.products.CustomTokenizer;
import com.commercetools.importapi.models.products.WhitespaceTokenizer;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.products.CustomTokenizerImpl.class, name = "custom"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.products.WhitespaceTokenizerImpl.class, name = "whitespace") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SuggestTokenizerImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SuggestTokenizer {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }
}
