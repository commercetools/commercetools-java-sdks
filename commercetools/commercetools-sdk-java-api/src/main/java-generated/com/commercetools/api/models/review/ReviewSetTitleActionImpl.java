
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetTitleActionImpl implements ReviewSetTitleAction {

    private String action;

    private String title;

    @JsonCreator
    ReviewSetTitleActionImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.action = ReviewSetTitleAction.SET_TITLE;
    }

    public ReviewSetTitleActionImpl() {
        this.action = ReviewSetTitleAction.SET_TITLE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If <code>title</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetTitleActionImpl that = (ReviewSetTitleActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(title, that.title).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(title).toHashCode();
    }

}
