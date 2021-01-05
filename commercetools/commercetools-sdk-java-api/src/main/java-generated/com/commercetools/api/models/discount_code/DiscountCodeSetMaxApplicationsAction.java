package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsActionImpl.class)
public interface DiscountCodeSetMaxApplicationsAction extends DiscountCodeUpdateAction {

    /**
    *  <p>If the <code>maxApplications</code> parameter is not included, the field will be emptied.</p>
    */
    
    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    public void setMaxApplications(final Long maxApplications);

    public static DiscountCodeSetMaxApplicationsAction of(){
        return new DiscountCodeSetMaxApplicationsActionImpl();
    }
    

    public static DiscountCodeSetMaxApplicationsAction of(final DiscountCodeSetMaxApplicationsAction template) {
        DiscountCodeSetMaxApplicationsActionImpl instance = new DiscountCodeSetMaxApplicationsActionImpl();
        instance.setMaxApplications(template.getMaxApplications());
        return instance;
    }

    public static DiscountCodeSetMaxApplicationsActionBuilder builder(){
        return DiscountCodeSetMaxApplicationsActionBuilder.of();
    }
    
    public static DiscountCodeSetMaxApplicationsActionBuilder builder(final DiscountCodeSetMaxApplicationsAction template){
        return DiscountCodeSetMaxApplicationsActionBuilder.of(template);
    }
    

    default <T> T withDiscountCodeSetMaxApplicationsAction(Function<DiscountCodeSetMaxApplicationsAction, T> helper) {
        return helper.apply(this);
    }
}
