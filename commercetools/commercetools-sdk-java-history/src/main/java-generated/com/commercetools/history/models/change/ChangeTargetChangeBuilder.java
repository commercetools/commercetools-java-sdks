
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTargetChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue;

    public ChangeTargetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTargetChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTargetChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public ChangeTargetChange build() {
        return new ChangeTargetChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeTargetChangeBuilder of() {
        return new ChangeTargetChangeBuilder();
    }

    public static ChangeTargetChangeBuilder of(final ChangeTargetChange template) {
        ChangeTargetChangeBuilder builder = new ChangeTargetChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
