
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReturnInfoImpl.class)
public interface ReturnInfo {

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItem> getItems();

    /**
    *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
    */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    @JsonIgnore
    public void setItems(final ReturnItem... items);

    public void setItems(final List<ReturnItem> items);

    public void setReturnTrackingId(final String returnTrackingId);

    public void setReturnDate(final ZonedDateTime returnDate);

    public static ReturnInfo of() {
        return new ReturnInfoImpl();
    }

    public static ReturnInfo of(final ReturnInfo template) {
        ReturnInfoImpl instance = new ReturnInfoImpl();
        instance.setItems(template.getItems());
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public static ReturnInfoBuilder builder() {
        return ReturnInfoBuilder.of();
    }

    public static ReturnInfoBuilder builder(final ReturnInfo template) {
        return ReturnInfoBuilder.of(template);
    }

    default <T> T withReturnInfo(Function<ReturnInfo, T> helper) {
        return helper.apply(this);
    }
}
