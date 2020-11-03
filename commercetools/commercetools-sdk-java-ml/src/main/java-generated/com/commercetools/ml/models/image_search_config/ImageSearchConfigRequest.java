package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigRequestImpl;

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
@JsonDeserialize(as = ImageSearchConfigRequestImpl.class)
public interface ImageSearchConfigRequest  {

    /**
    *  <p>The list of update actions to be performed on the project.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ImageSearchConfigUpdateAction> getActions();

    @JsonIgnore
    public void setActions(final ImageSearchConfigUpdateAction ...actions);
    public void setActions(final List<ImageSearchConfigUpdateAction> actions);

    public static ImageSearchConfigRequestImpl of(){
        return new ImageSearchConfigRequestImpl();
    }
    

    public static ImageSearchConfigRequestImpl of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestImpl instance = new ImageSearchConfigRequestImpl();
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withImageSearchConfigRequest(Function<ImageSearchConfigRequest, T> helper) {
        return helper.apply(this);
    }
}
