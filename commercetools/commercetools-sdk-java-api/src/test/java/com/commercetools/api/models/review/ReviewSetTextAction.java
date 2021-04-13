package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTextActionImpl;

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
@JsonDeserialize(as = ReviewSetTextActionImpl.class)
public interface ReviewSetTextAction extends ReviewUpdateAction {

    String SET_TEXT = "setText";

    /**
    *  <p>If <code>text</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("text")
    public String getText();

    
    public void setText(final String text);
    

    public static ReviewSetTextAction of(){
        return new ReviewSetTextActionImpl();
    }
    

    public static ReviewSetTextAction of(final ReviewSetTextAction template) {
        ReviewSetTextActionImpl instance = new ReviewSetTextActionImpl();
        instance.setText(template.getText());
        return instance;
    }

    public static ReviewSetTextActionBuilder builder(){
        return ReviewSetTextActionBuilder.of();
    }
    
    public static ReviewSetTextActionBuilder builder(final ReviewSetTextAction template){
        return ReviewSetTextActionBuilder.of(template);
    }
    

    default <T> T withReviewSetTextAction(Function<ReviewSetTextAction, T> helper) {
        return helper.apply(this);
    }
}
