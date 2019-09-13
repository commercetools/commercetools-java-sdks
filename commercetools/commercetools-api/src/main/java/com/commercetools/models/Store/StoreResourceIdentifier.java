package com.commercetools.models.store;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.store.StoreResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoreResourceIdentifierImpl.class)
public interface StoreResourceIdentifier extends ResourceIdentifier {


   
   public static StoreResourceIdentifierImpl of(){
      return new StoreResourceIdentifierImpl();
   }
   

   public static StoreResourceIdentifierImpl of(final StoreResourceIdentifier template) {
      StoreResourceIdentifierImpl instance = new StoreResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}