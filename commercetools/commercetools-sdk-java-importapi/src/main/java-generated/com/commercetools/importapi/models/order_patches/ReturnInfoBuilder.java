
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReturnInfoBuilder {

    private java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items;

    @Nullable
    private String returnTrackingId;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    public ReturnInfoBuilder items(final com.commercetools.importapi.models.order_patches.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ReturnInfoBuilder items(
            final java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    public ReturnInfoBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    public ReturnInfoBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> getItems() {
        return this.items;
    }

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    public ReturnInfo build() {
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    public static ReturnInfoBuilder of() {
        return new ReturnInfoBuilder();
    }

    public static ReturnInfoBuilder of(final ReturnInfo template) {
        ReturnInfoBuilder builder = new ReturnInfoBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
