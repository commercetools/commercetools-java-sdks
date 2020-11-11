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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateUpdateActionImpl implements StateUpdateAction {

    private String action;

    @JsonCreator
    StateUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public StateUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}
