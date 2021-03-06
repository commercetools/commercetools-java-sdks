
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The <code>CombinationUnique</code> <a href="/../api/projects/productTypes#attributeconstraint-enum">Attribute Constraint</a> was violated.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValuesErrorImpl.class)
public interface DuplicateAttributeValuesError extends ErrorObject {

    String DUPLICATE_ATTRIBUTE_VALUES = "DuplicateAttributeValues";

    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    public static DuplicateAttributeValuesError of() {
        return new DuplicateAttributeValuesErrorImpl();
    }

    public static DuplicateAttributeValuesError of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorImpl instance = new DuplicateAttributeValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static DuplicateAttributeValuesErrorBuilder builder() {
        return DuplicateAttributeValuesErrorBuilder.of();
    }

    public static DuplicateAttributeValuesErrorBuilder builder(final DuplicateAttributeValuesError template) {
        return DuplicateAttributeValuesErrorBuilder.of(template);
    }

    default <T> T withDuplicateAttributeValuesError(Function<DuplicateAttributeValuesError, T> helper) {
        return helper.apply(this);
    }
}
