
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraftImpl;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelDraftImpl.class)
public interface ParcelDraft {

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
    *  <p>The delivery items contained in this parcel.</p>
    */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static ParcelDraft of() {
        return new ParcelDraftImpl();
    }

    public static ParcelDraft of(final ParcelDraft template) {
        ParcelDraftImpl instance = new ParcelDraftImpl();
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static ParcelDraftBuilder builder() {
        return ParcelDraftBuilder.of();
    }

    public static ParcelDraftBuilder builder(final ParcelDraft template) {
        return ParcelDraftBuilder.of(template);
    }

    default <T> T withParcelDraft(Function<ParcelDraft, T> helper) {
        return helper.apply(this);
    }
}
