
package com.commercetools.api.models.state;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.state.StateSetNameActionImpl;
import com.commercetools.api.models.state.StateUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateSetNameActionImpl.class)
public interface StateSetNameAction extends StateUpdateAction {

    String SET_NAME = "setName";

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static StateSetNameAction of() {
        return new StateSetNameActionImpl();
    }

    public static StateSetNameAction of(final StateSetNameAction template) {
        StateSetNameActionImpl instance = new StateSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static StateSetNameActionBuilder builder() {
        return StateSetNameActionBuilder.of();
    }

    public static StateSetNameActionBuilder builder(final StateSetNameAction template) {
        return StateSetNameActionBuilder.of(template);
    }

    default <T> T withStateSetNameAction(Function<StateSetNameAction, T> helper) {
        return helper.apply(this);
    }
}
