
package com.commercetools.api.models.state;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateAddRolesActionImpl;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateAddRolesActionImpl.class)
public interface StateAddRolesAction extends StateUpdateAction {

    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateAddRolesAction of() {
        return new StateAddRolesActionImpl();
    }

    public static StateAddRolesAction of(final StateAddRolesAction template) {
        StateAddRolesActionImpl instance = new StateAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static StateAddRolesActionBuilder builder() {
        return StateAddRolesActionBuilder.of();
    }

    public static StateAddRolesActionBuilder builder(final StateAddRolesAction template) {
        return StateAddRolesActionBuilder.of(template);
    }

    default <T> T withStateAddRolesAction(Function<StateAddRolesAction, T> helper) {
        return helper.apply(this);
    }
}
