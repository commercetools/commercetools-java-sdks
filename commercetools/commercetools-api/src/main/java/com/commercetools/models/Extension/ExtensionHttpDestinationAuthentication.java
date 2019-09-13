package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionAuthorizationHeaderAuthentication;
import com.commercetools.models.extension.ExtensionAzureFunctionsAuthentication;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionAuthorizationHeaderAuthenticationImpl.class, name = "AuthorizationHeader"),
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionAzureFunctionsAuthenticationImpl.class, name = "AzureFunctions")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionHttpDestinationAuthentication  {


   


}