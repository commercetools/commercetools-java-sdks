
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerEmailChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetCustomerEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerEmailChangeBuilder nextValue(final String nextValue) {
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

    public SetCustomerEmailChange build() {
        return new SetCustomerEmailChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerEmailChangeBuilder of() {
        return new SetCustomerEmailChangeBuilder();
    }

    public static SetCustomerEmailChangeBuilder of(final SetCustomerEmailChange template) {
        SetCustomerEmailChangeBuilder builder = new SetCustomerEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
