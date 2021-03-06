
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePredicateChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangePredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangePredicateChangeBuilder nextValue(final String nextValue) {
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

    public ChangePredicateChange build() {
        return new ChangePredicateChangeImpl(change, previousValue, nextValue);
    }

    public static ChangePredicateChangeBuilder of() {
        return new ChangePredicateChangeBuilder();
    }

    public static ChangePredicateChangeBuilder of(final ChangePredicateChange template) {
        ChangePredicateChangeBuilder builder = new ChangePredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
