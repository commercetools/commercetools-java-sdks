
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetParcelItemsChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue;

    public SetParcelItemsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetParcelItemsChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    public SetParcelItemsChangeBuilder nextValue(
            final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetParcelItemsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetParcelItemsChangeBuilder previousValue(
            final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetParcelItemsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getPreviousValue() {
        return this.previousValue;
    }

    public SetParcelItemsChange build() {
        return new SetParcelItemsChangeImpl(change, parcel, nextValue, previousValue);
    }

    public static SetParcelItemsChangeBuilder of() {
        return new SetParcelItemsChangeBuilder();
    }

    public static SetParcelItemsChangeBuilder of(final SetParcelItemsChange template) {
        SetParcelItemsChangeBuilder builder = new SetParcelItemsChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
