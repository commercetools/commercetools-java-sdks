
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddBillingAddressIdChangeBuilder {

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.common.Address address;

    public AddBillingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddBillingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddBillingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddBillingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddBillingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddBillingAddressIdChangeBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public AddBillingAddressIdChange build() {
        return new AddBillingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    public static AddBillingAddressIdChangeBuilder of() {
        return new AddBillingAddressIdChangeBuilder();
    }

    public static AddBillingAddressIdChangeBuilder of(final AddBillingAddressIdChange template) {
        AddBillingAddressIdChangeBuilder builder = new AddBillingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
