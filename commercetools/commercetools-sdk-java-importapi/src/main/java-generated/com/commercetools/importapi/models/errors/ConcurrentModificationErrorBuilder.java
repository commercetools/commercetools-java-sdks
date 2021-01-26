
package com.commercetools.importapi.models.errors;

import java.lang.Object;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.errors.ConcurrentModificationError;
import com.commercetools.importapi.models.errors.ErrorObject;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ConcurrentModificationErrorBuilder {

    private String message;

    @Nullable
    private Long specifiedVersion;

    private Long currentVersion;

    @Nullable
    private java.lang.Object conflictedResource;

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ConcurrentModificationErrorBuilder specifiedVersion(@Nullable final Long specifiedVersion) {
        this.specifiedVersion = specifiedVersion;
        return this;
    }

    public ConcurrentModificationErrorBuilder currentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public ConcurrentModificationErrorBuilder conflictedResource(@Nullable final java.lang.Object conflictedResource) {
        this.conflictedResource = conflictedResource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public Long getSpecifiedVersion() {
        return this.specifiedVersion;
    }

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    @Nullable
    public java.lang.Object getConflictedResource() {
        return this.conflictedResource;
    }

    public ConcurrentModificationError build() {
        return new ConcurrentModificationErrorImpl(message, specifiedVersion, currentVersion, conflictedResource);
    }

    public static ConcurrentModificationErrorBuilder of() {
        return new ConcurrentModificationErrorBuilder();
    }

    public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
        builder.message = template.getMessage();
        builder.specifiedVersion = template.getSpecifiedVersion();
        builder.currentVersion = template.getCurrentVersion();
        builder.conflictedResource = template.getConflictedResource();
        return builder;
    }

}
