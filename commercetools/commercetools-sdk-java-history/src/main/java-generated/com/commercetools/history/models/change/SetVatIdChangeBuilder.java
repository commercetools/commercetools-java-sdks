
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetVatIdChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetVatIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetVatIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetVatIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetVatIdChange build() {
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetVatIdChangeBuilder of() {
        return new SetVatIdChangeBuilder();
    }

    public static SetVatIdChangeBuilder of(final SetVatIdChange template) {
        SetVatIdChangeBuilder builder = new SetVatIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
