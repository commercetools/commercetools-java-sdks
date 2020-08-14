package com.commercetools.api.models.common;

import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AssetDraftImpl implements AssetDraft {

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private java.util.List<String> tags;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private String key;

    @JsonCreator
    AssetDraftImpl(@JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("tags") final java.util.List<String> tags, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("key") final String key) {
        this.sources = sources;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.custom = custom;
        this.key = key;
    }
    public AssetDraftImpl() {
       
    }

    
    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources(){
        return this.sources;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    
    public java.util.List<String> getTags(){
        return this.tags;
    }
    
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources){
        this.sources = sources;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setTags(final java.util.List<String> tags){
        this.tags = tags;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
