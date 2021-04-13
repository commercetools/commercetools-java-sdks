package com.commercetools.api.models.message;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CategoryCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = CategoryCreatedMessagePayloadImpl.class)
public interface CategoryCreatedMessagePayload extends MessagePayload {

    String CATEGORY_CREATED = "CategoryCreated";

    
    @NotNull
    @Valid
    @JsonProperty("category")
    public Category getCategory();

    
    public void setCategory(final Category category);
    

    public static CategoryCreatedMessagePayload of(){
        return new CategoryCreatedMessagePayloadImpl();
    }
    

    public static CategoryCreatedMessagePayload of(final CategoryCreatedMessagePayload template) {
        CategoryCreatedMessagePayloadImpl instance = new CategoryCreatedMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        return instance;
    }

    public static CategoryCreatedMessagePayloadBuilder builder(){
        return CategoryCreatedMessagePayloadBuilder.of();
    }
    
    public static CategoryCreatedMessagePayloadBuilder builder(final CategoryCreatedMessagePayload template){
        return CategoryCreatedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCategoryCreatedMessagePayload(Function<CategoryCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
