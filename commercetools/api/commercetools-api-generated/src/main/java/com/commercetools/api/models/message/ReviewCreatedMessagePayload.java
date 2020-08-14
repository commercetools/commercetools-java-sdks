package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewCreatedMessagePayloadImpl.class)
public interface ReviewCreatedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("review")
    public Review getReview();

    public void setReview(final Review review);

    public static ReviewCreatedMessagePayloadImpl of(){
        return new ReviewCreatedMessagePayloadImpl();
    }
    

    public static ReviewCreatedMessagePayloadImpl of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadImpl instance = new ReviewCreatedMessagePayloadImpl();
        instance.setReview(template.getReview());
        return instance;
    }

}
