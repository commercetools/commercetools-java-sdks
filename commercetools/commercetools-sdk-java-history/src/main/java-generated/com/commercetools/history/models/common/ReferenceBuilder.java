
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceBuilder {

    private String id;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    public ReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ReferenceBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public Reference build() {
        return new ReferenceImpl(id, typeId);
    }

    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

    public static ReferenceBuilder of(final Reference template) {
        ReferenceBuilder builder = new ReferenceBuilder();
        builder.id = template.getId();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
