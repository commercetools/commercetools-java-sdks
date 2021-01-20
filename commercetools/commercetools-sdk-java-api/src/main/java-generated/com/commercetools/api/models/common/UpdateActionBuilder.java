
package com.commercetools.api.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.UpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class UpdateActionBuilder {

    private String action;

    public UpdateActionBuilder action(final String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public UpdateAction build() {
        return new UpdateActionImpl(action);
    }

    public static UpdateActionBuilder of() {
        return new UpdateActionBuilder();
    }

    public static UpdateActionBuilder of(final UpdateAction template) {
        UpdateActionBuilder builder = new UpdateActionBuilder();
        builder.action = template.getAction();
        return builder;
    }

}
