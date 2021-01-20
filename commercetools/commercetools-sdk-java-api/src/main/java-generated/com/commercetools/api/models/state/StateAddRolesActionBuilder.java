
package com.commercetools.api.models.state;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateAddRolesAction;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateAddRolesActionBuilder {

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    public StateAddRolesActionBuilder roles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public StateAddRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    public StateAddRolesAction build() {
        return new StateAddRolesActionImpl(roles);
    }

    public static StateAddRolesActionBuilder of() {
        return new StateAddRolesActionBuilder();
    }

    public static StateAddRolesActionBuilder of(final StateAddRolesAction template) {
        StateAddRolesActionBuilder builder = new StateAddRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
