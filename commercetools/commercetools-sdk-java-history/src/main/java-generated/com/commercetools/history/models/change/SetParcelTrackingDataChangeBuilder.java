
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetParcelTrackingDataChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private com.commercetools.history.models.common.TrackingData nextValue;

    private com.commercetools.history.models.common.TrackingData previousValue;

    public SetParcelTrackingDataChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetParcelTrackingDataChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    public SetParcelTrackingDataChangeBuilder nextValue(
            final com.commercetools.history.models.common.TrackingData nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetParcelTrackingDataChangeBuilder previousValue(
            final com.commercetools.history.models.common.TrackingData previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public com.commercetools.history.models.common.TrackingData getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TrackingData getPreviousValue() {
        return this.previousValue;
    }

    public SetParcelTrackingDataChange build() {
        return new SetParcelTrackingDataChangeImpl(change, parcel, nextValue, previousValue);
    }

    public static SetParcelTrackingDataChangeBuilder of() {
        return new SetParcelTrackingDataChangeBuilder();
    }

    public static SetParcelTrackingDataChangeBuilder of(final SetParcelTrackingDataChange template) {
        SetParcelTrackingDataChangeBuilder builder = new SetParcelTrackingDataChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
