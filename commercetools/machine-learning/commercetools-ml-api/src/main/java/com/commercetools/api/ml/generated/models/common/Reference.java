package com.commercetools.api.ml.generated.models.common;

import com.commercetools.api.ml.generated.models.common.CategoryReference;
import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.common.ProductTypeReference;
import com.commercetools.api.ml.generated.models.common.ReferenceTypeId;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.ml.generated.models.common.CategoryReferenceImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.api.ml.generated.models.common.ProductReferenceImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.api.ml.generated.models.common.ProductTypeReferenceImpl.class, name = "product-type")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "typeId",
   defaultImpl = ReferenceImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Reference  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();

   public void setId(final String id);
   


}
