package com.commercetools.models.common;

import com.commercetools.models.common.CentPrecisionMoneyDraft;
import com.commercetools.models.common.HighPrecisionMoneyDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.common.MoneyType;


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
   @JsonSubTypes.Type(value = com.commercetools.models.common.CentPrecisionMoneyDraftImpl.class, name = "centPrecision"),
   @JsonSubTypes.Type(value = com.commercetools.models.common.HighPrecisionMoneyDraftImpl.class, name = "highPrecision")
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
public interface TypedMoneyDraft extends Money {


   


}