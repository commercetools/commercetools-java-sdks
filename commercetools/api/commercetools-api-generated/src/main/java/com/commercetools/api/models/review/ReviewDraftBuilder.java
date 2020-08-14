package com.commercetools.api.models.review;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.review.ReviewDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewDraftBuilder {

    @Nullable
    private String key;
    
    @Nullable
    private String uniquenessValue;
    
    @Nullable
    private String locale;
    
    @Nullable
    private String authorName;
    
    @Nullable
    private String title;
    
    @Nullable
    private String text;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode target;
    
    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    @Nullable
    private Integer rating;
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public ReviewDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    public ReviewDraftBuilder uniquenessValue(@Nullable final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
        return this;
    }
    
    public ReviewDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }
    
    public ReviewDraftBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }
    
    public ReviewDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }
    
    public ReviewDraftBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }
    
    public ReviewDraftBuilder target(@Nullable final com.fasterxml.jackson.databind.JsonNode target) {
        this.target = target;
        return this;
    }
    
    public ReviewDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }
    
    public ReviewDraftBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }
    
    public ReviewDraftBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }
    
    public ReviewDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getKey(){
        return this.key;
    }
    
    @Nullable
    public String getUniquenessValue(){
        return this.uniquenessValue;
    }
    
    @Nullable
    public String getLocale(){
        return this.locale;
    }
    
    @Nullable
    public String getAuthorName(){
        return this.authorName;
    }
    
    @Nullable
    public String getTitle(){
        return this.title;
    }
    
    @Nullable
    public String getText(){
        return this.text;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getTarget(){
        return this.target;
    }
    
    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    @Nullable
    public Integer getRating(){
        return this.rating;
    }
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    public ReviewDraft build() {
        return new ReviewDraftImpl(key, uniquenessValue, locale, authorName, title, text, target, state, rating, customer, custom);
    }

    public static ReviewDraftBuilder of() {
        return new ReviewDraftBuilder();
    }

    public static ReviewDraftBuilder of(final ReviewDraft template) {
        ReviewDraftBuilder builder = new ReviewDraftBuilder();
        builder.key = template.getKey();
        builder.uniquenessValue = template.getUniquenessValue();
        builder.locale = template.getLocale();
        builder.authorName = template.getAuthorName();
        builder.title = template.getTitle();
        builder.text = template.getText();
        builder.target = template.getTarget();
        builder.state = template.getState();
        builder.rating = template.getRating();
        builder.customer = template.getCustomer();
        builder.custom = template.getCustom();
        return builder;
    }

}
