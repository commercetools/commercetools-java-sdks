
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetBillingAddressCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetBillingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetBillingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetBillingAddressCustomTypeAction build() {
        return new StagedOrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetBillingAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder of(
            final StagedOrderSetBillingAddressCustomTypeAction template) {
        StagedOrderSetBillingAddressCustomTypeActionBuilder builder = new StagedOrderSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
