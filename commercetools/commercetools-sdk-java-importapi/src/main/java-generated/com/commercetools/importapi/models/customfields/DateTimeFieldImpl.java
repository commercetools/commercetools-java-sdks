
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.CustomField;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>A field with a date time value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateTimeFieldImpl implements DateTimeField {

    private String type;

    private java.time.ZonedDateTime value;

    @JsonCreator
    DateTimeFieldImpl(@JsonProperty("value") final java.time.ZonedDateTime value) {
        this.value = value;
        this.type = DateTimeField.DATE_TIME;
    }

    public DateTimeFieldImpl() {
        this.type = DateTimeField.DATE_TIME;
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType() {
        return this.type;
    }

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    public void setValue(final java.time.ZonedDateTime value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DateTimeFieldImpl that = (DateTimeFieldImpl) o;

        return new EqualsBuilder().append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

}
