
package com.commercetools.api.models.type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelActionImpl;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeFieldDefinitionLabelActionImpl.class)
public interface TypeChangeFieldDefinitionLabelAction extends TypeUpdateAction {

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setFieldName(final String fieldName);

    public void setLabel(final LocalizedString label);

    public static TypeChangeFieldDefinitionLabelAction of() {
        return new TypeChangeFieldDefinitionLabelActionImpl();
    }

    public static TypeChangeFieldDefinitionLabelAction of(final TypeChangeFieldDefinitionLabelAction template) {
        TypeChangeFieldDefinitionLabelActionImpl instance = new TypeChangeFieldDefinitionLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder builder() {
        return TypeChangeFieldDefinitionLabelActionBuilder.of();
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder builder(
            final TypeChangeFieldDefinitionLabelAction template) {
        return TypeChangeFieldDefinitionLabelActionBuilder.of(template);
    }

    default <T> T withTypeChangeFieldDefinitionLabelAction(Function<TypeChangeFieldDefinitionLabelAction, T> helper) {
        return helper.apply(this);
    }
}
