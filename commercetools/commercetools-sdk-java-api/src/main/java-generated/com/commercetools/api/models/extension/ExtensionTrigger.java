package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionResourceTypeId;
import com.commercetools.api.models.extension.ExtensionTriggerImpl;

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
@JsonDeserialize(as = ExtensionTriggerImpl.class)
public interface ExtensionTrigger  {

    
    @NotNull
    @JsonProperty("resourceTypeId")
    public ExtensionResourceTypeId getResourceTypeId();
    
    @NotNull
    @JsonProperty("actions")
    public List<ExtensionAction> getActions();

    public void setResourceTypeId(final ExtensionResourceTypeId resourceTypeId);
    
    @JsonIgnore
    public void setActions(final ExtensionAction ...actions);
    public void setActions(final List<ExtensionAction> actions);

    public static ExtensionTrigger of(){
        return new ExtensionTriggerImpl();
    }
    

    public static ExtensionTrigger of(final ExtensionTrigger template) {
        ExtensionTriggerImpl instance = new ExtensionTriggerImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ExtensionTriggerBuilder builder(){
        return ExtensionTriggerBuilder.of();
    }
    
    public static ExtensionTriggerBuilder builder(final ExtensionTrigger template){
        return ExtensionTriggerBuilder.of(template);
    }
    

    default <T> T withExtensionTrigger(Function<ExtensionTrigger, T> helper) {
        return helper.apply(this);
    }
}
