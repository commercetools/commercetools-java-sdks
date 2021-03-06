
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemTotalPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetLineItemTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemTotalPriceChange build() {
        return new SetLineItemTotalPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    public static SetLineItemTotalPriceChangeBuilder of() {
        return new SetLineItemTotalPriceChangeBuilder();
    }

    public static SetLineItemTotalPriceChangeBuilder of(final SetLineItemTotalPriceChange template) {
        SetLineItemTotalPriceChangeBuilder builder = new SetLineItemTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
