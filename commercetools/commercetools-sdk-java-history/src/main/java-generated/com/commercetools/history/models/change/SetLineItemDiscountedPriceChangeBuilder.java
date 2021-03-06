
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemDiscountedPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.DiscountedLineItemPrice nextValue;

    private com.commercetools.history.models.common.DiscountedLineItemPrice previousValue;

    public SetLineItemDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.DiscountedLineItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.DiscountedLineItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemDiscountedPriceChange build() {
        return new SetLineItemDiscountedPriceChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetLineItemDiscountedPriceChangeBuilder of() {
        return new SetLineItemDiscountedPriceChangeBuilder();
    }

    public static SetLineItemDiscountedPriceChangeBuilder of(final SetLineItemDiscountedPriceChange template) {
        SetLineItemDiscountedPriceChangeBuilder builder = new SetLineItemDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
