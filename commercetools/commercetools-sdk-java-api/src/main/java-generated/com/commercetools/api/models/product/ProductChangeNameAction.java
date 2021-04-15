package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangeNameActionImpl;

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
@JsonDeserialize(as = ProductChangeNameActionImpl.class)
public interface ProductChangeNameAction extends ProductUpdateAction {

    String CHANGE_NAME = "changeName";

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    
    public void setName(final LocalizedString name);
    
    
    
    public void setStaged(final Boolean staged);
    

    public static ProductChangeNameAction of(){
        return new ProductChangeNameActionImpl();
    }
    

    public static ProductChangeNameAction of(final ProductChangeNameAction template) {
        ProductChangeNameActionImpl instance = new ProductChangeNameActionImpl();
        instance.setName(template.getName());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangeNameActionBuilder builder(){
        return ProductChangeNameActionBuilder.of();
    }
    
    public static ProductChangeNameActionBuilder builder(final ProductChangeNameAction template){
        return ProductChangeNameActionBuilder.of(template);
    }
    

    default <T> T withProductChangeNameAction(Function<ProductChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
