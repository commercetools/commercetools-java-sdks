package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomFieldActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCustomFieldActionImpl.class)
public interface StagedOrderSetCustomFieldAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static StagedOrderSetCustomFieldAction of(){
        return new StagedOrderSetCustomFieldActionImpl();
    }
    

    public static StagedOrderSetCustomFieldAction of(final StagedOrderSetCustomFieldAction template) {
        StagedOrderSetCustomFieldActionImpl instance = new StagedOrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetCustomFieldActionBuilder builder(){
        return StagedOrderSetCustomFieldActionBuilder.of();
    }
    
    public static StagedOrderSetCustomFieldActionBuilder builder(final StagedOrderSetCustomFieldAction template){
        return StagedOrderSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetCustomFieldAction(Function<StagedOrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
