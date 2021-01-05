package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.review.ReviewSetCustomTypeActionImpl;

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
@JsonDeserialize(as = ReviewSetCustomTypeActionImpl.class)
public interface ReviewSetCustomTypeAction extends ReviewUpdateAction {

    /**
    *  <p>If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
    *  Sets the CustomFields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static ReviewSetCustomTypeAction of(){
        return new ReviewSetCustomTypeActionImpl();
    }
    

    public static ReviewSetCustomTypeAction of(final ReviewSetCustomTypeAction template) {
        ReviewSetCustomTypeActionImpl instance = new ReviewSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ReviewSetCustomTypeActionBuilder builder(){
        return ReviewSetCustomTypeActionBuilder.of();
    }
    
    public static ReviewSetCustomTypeActionBuilder builder(final ReviewSetCustomTypeAction template){
        return ReviewSetCustomTypeActionBuilder.of(template);
    }
    

    default <T> T withReviewSetCustomTypeAction(Function<ReviewSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
