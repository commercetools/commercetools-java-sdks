package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateAddRolesAction;
import com.commercetools.api.models.state.StateChangeInitialAction;
import com.commercetools.api.models.state.StateChangeKeyAction;
import com.commercetools.api.models.state.StateChangeTypeAction;
import com.commercetools.api.models.state.StateRemoveRolesAction;
import com.commercetools.api.models.state.StateSetDescriptionAction;
import com.commercetools.api.models.state.StateSetNameAction;
import com.commercetools.api.models.state.StateSetRolesAction;
import com.commercetools.api.models.state.StateSetTransitionsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateAddRolesActionImpl.class, name = StateAddRolesAction.ADD_ROLES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeInitialActionImpl.class, name = StateChangeInitialAction.CHANGE_INITIAL),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeKeyActionImpl.class, name = StateChangeKeyAction.CHANGE_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeTypeActionImpl.class, name = StateChangeTypeAction.CHANGE_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateRemoveRolesActionImpl.class, name = StateRemoveRolesAction.REMOVE_ROLES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetDescriptionActionImpl.class, name = StateSetDescriptionAction.SET_DESCRIPTION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetNameActionImpl.class, name = StateSetNameAction.SET_NAME),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetRolesActionImpl.class, name = StateSetRolesAction.SET_ROLES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetTransitionsActionImpl.class, name = StateSetTransitionsAction.SET_TRANSITIONS)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = StateUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface StateUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StateUpdateAction> {


    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withStateUpdateAction(Function<StateUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
