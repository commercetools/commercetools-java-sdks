package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetChangesActionImpl;

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
@JsonDeserialize(as = SubscriptionSetChangesActionImpl.class)
public interface SubscriptionSetChangesAction extends SubscriptionUpdateAction {

    String SET_CHANGES = "setChanges";

    
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    
    @JsonIgnore
    public void setChanges(final ChangeSubscription ...changes);
    public void setChanges(final List<ChangeSubscription> changes);

    public static SubscriptionSetChangesAction of(){
        return new SubscriptionSetChangesActionImpl();
    }
    

    public static SubscriptionSetChangesAction of(final SubscriptionSetChangesAction template) {
        SubscriptionSetChangesActionImpl instance = new SubscriptionSetChangesActionImpl();
        instance.setChanges(template.getChanges());
        return instance;
    }

    public static SubscriptionSetChangesActionBuilder builder(){
        return SubscriptionSetChangesActionBuilder.of();
    }
    
    public static SubscriptionSetChangesActionBuilder builder(final SubscriptionSetChangesAction template){
        return SubscriptionSetChangesActionBuilder.of(template);
    }
    

    default <T> T withSubscriptionSetChangesAction(Function<SubscriptionSetChangesAction, T> helper) {
        return helper.apply(this);
    }
}
