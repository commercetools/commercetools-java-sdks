
package com.commercetools.api.models.review;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.review.ReviewSetAuthorNameAction;
import com.commercetools.api.models.review.ReviewSetCustomFieldAction;
import com.commercetools.api.models.review.ReviewSetCustomTypeAction;
import com.commercetools.api.models.review.ReviewSetCustomerAction;
import com.commercetools.api.models.review.ReviewSetKeyAction;
import com.commercetools.api.models.review.ReviewSetLocaleAction;
import com.commercetools.api.models.review.ReviewSetRatingAction;
import com.commercetools.api.models.review.ReviewSetTargetAction;
import com.commercetools.api.models.review.ReviewSetTextAction;
import com.commercetools.api.models.review.ReviewSetTitleAction;
import com.commercetools.api.models.review.ReviewTransitionStateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetAuthorNameActionImpl.class, name = ReviewSetAuthorNameAction.SET_AUTHOR_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomFieldActionImpl.class, name = ReviewSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomTypeActionImpl.class, name = ReviewSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetCustomerActionImpl.class, name = ReviewSetCustomerAction.SET_CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetKeyActionImpl.class, name = ReviewSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetLocaleActionImpl.class, name = ReviewSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetRatingActionImpl.class, name = ReviewSetRatingAction.SET_RATING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTargetActionImpl.class, name = ReviewSetTargetAction.SET_TARGET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTextActionImpl.class, name = ReviewSetTextAction.SET_TEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewSetTitleActionImpl.class, name = ReviewSetTitleAction.SET_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.review.ReviewTransitionStateActionImpl.class, name = ReviewTransitionStateAction.TRANSITION_STATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ReviewUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ReviewUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ReviewUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withReviewUpdateAction(Function<ReviewUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
