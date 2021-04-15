package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionImpl;

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
@JsonDeserialize(as = DiscountCodeChangeGroupsActionImpl.class)
public interface DiscountCodeChangeGroupsAction extends DiscountCodeUpdateAction {

    String CHANGE_GROUPS = "changeGroups";

    /**
    *  <p>The groups to which this discount code shall belong to.
    *  Use empty array to remove the code from all groups.</p>
    */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    
    @JsonIgnore
    public void setGroups(final String ...groups);
    public void setGroups(final List<String> groups);

    public static DiscountCodeChangeGroupsAction of(){
        return new DiscountCodeChangeGroupsActionImpl();
    }
    

    public static DiscountCodeChangeGroupsAction of(final DiscountCodeChangeGroupsAction template) {
        DiscountCodeChangeGroupsActionImpl instance = new DiscountCodeChangeGroupsActionImpl();
        instance.setGroups(template.getGroups());
        return instance;
    }

    public static DiscountCodeChangeGroupsActionBuilder builder(){
        return DiscountCodeChangeGroupsActionBuilder.of();
    }
    
    public static DiscountCodeChangeGroupsActionBuilder builder(final DiscountCodeChangeGroupsAction template){
        return DiscountCodeChangeGroupsActionBuilder.of(template);
    }
    

    default <T> T withDiscountCodeChangeGroupsAction(Function<DiscountCodeChangeGroupsAction, T> helper) {
        return helper.apply(this);
    }
}
