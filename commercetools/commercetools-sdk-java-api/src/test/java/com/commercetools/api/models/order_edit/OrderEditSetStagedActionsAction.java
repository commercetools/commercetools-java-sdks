package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditSetStagedActionsActionImpl.class)
public interface OrderEditSetStagedActionsAction extends OrderEditUpdateAction {

    String SET_STAGED_ACTIONS = "setStagedActions";

    /**
    *  <p>The actions to edit the <code>resource</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    
    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction ...stagedActions);
    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    public static OrderEditSetStagedActionsAction of(){
        return new OrderEditSetStagedActionsActionImpl();
    }
    

    public static OrderEditSetStagedActionsAction of(final OrderEditSetStagedActionsAction template) {
        OrderEditSetStagedActionsActionImpl instance = new OrderEditSetStagedActionsActionImpl();
        instance.setStagedActions(template.getStagedActions());
        return instance;
    }

    public static OrderEditSetStagedActionsActionBuilder builder(){
        return OrderEditSetStagedActionsActionBuilder.of();
    }
    
    public static OrderEditSetStagedActionsActionBuilder builder(final OrderEditSetStagedActionsAction template){
        return OrderEditSetStagedActionsActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetStagedActionsAction(Function<OrderEditSetStagedActionsAction, T> helper) {
        return helper.apply(this);
    }
}
