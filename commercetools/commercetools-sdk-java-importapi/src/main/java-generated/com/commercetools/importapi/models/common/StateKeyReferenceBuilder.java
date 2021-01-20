
package com.commercetools.importapi.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StateKeyReference;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateKeyReferenceBuilder {

    private String key;

    public StateKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StateKeyReference build() {
        return new StateKeyReferenceImpl(key);
    }

    public static StateKeyReferenceBuilder of() {
        return new StateKeyReferenceBuilder();
    }

    public static StateKeyReferenceBuilder of(final StateKeyReference template) {
        StateKeyReferenceBuilder builder = new StateKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
