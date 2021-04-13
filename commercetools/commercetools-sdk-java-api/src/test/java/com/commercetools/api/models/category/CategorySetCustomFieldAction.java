package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.category.CategorySetCustomFieldActionImpl;

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
@JsonDeserialize(as = CategorySetCustomFieldActionImpl.class)
public interface CategorySetCustomFieldAction extends CategoryUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static CategorySetCustomFieldAction of(){
        return new CategorySetCustomFieldActionImpl();
    }
    

    public static CategorySetCustomFieldAction of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionImpl instance = new CategorySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CategorySetCustomFieldActionBuilder builder(){
        return CategorySetCustomFieldActionBuilder.of();
    }
    
    public static CategorySetCustomFieldActionBuilder builder(final CategorySetCustomFieldAction template){
        return CategorySetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withCategorySetCustomFieldAction(Function<CategorySetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
