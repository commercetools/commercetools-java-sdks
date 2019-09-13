package com.commercetools.models.project;

import com.commercetools.models.project.CartClassificationType;
import com.commercetools.models.project.CartScoreType;
import com.commercetools.models.project.CartValueType;
import com.commercetools.models.shipping_method.ShippingRateTierType;


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
   @JsonSubTypes.Type(value = com.commercetools.models.project.CartClassificationTypeImpl.class, name = "CartClassification"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.CartScoreTypeImpl.class, name = "CartScore"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.CartValueTypeImpl.class, name = "CartValue")
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
public interface ShippingRateInputType  {


   


}