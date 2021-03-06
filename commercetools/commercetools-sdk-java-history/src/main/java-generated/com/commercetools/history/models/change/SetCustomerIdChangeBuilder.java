
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerIdChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetCustomerIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerIdChangeBuilder nextValue(final String nextValue) {
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

    public SetCustomerIdChange build() {
        return new SetCustomerIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerIdChangeBuilder of() {
        return new SetCustomerIdChangeBuilder();
    }

    public static SetCustomerIdChangeBuilder of(final SetCustomerIdChange template) {
        SetCustomerIdChangeBuilder builder = new SetCustomerIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
