package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageSearchConfigUpdateActionImpl implements ImageSearchConfigUpdateAction {

    private String action;

    @JsonCreator
    ImageSearchConfigUpdateActionImpl() {
        this.action = "null";
    }
    

    
    public String getAction(){
        return this.action;
    }


}
