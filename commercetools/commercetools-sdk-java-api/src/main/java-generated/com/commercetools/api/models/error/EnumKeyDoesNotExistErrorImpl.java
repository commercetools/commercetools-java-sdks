package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class EnumKeyDoesNotExistErrorImpl implements EnumKeyDoesNotExistError {

    private String code;
    
    private String message;
    
    private String conflictingEnumKey;
    
    private String conflictingAttributeName;

    @JsonCreator
    EnumKeyDoesNotExistErrorImpl(@JsonProperty("message") final String message, @JsonProperty("conflictingEnumKey") final String conflictingEnumKey, @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.message = message;
        this.conflictingEnumKey = conflictingEnumKey;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = "EnumKeyDoesNotExist";
    }
    public EnumKeyDoesNotExistErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public String getConflictingEnumKey(){
        return this.conflictingEnumKey;
    }
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setConflictingEnumKey(final String conflictingEnumKey){
        this.conflictingEnumKey = conflictingEnumKey;
    }
    
    public void setConflictingAttributeName(final String conflictingAttributeName){
        this.conflictingAttributeName = conflictingAttributeName;
    }

}
