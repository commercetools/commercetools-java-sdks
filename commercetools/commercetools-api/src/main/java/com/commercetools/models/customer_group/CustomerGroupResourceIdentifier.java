package com.commercetools.models.customer_group;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifierImpl;

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
@JsonDeserialize(as = CustomerGroupResourceIdentifierImpl.class)
public interface CustomerGroupResourceIdentifier extends ResourceIdentifier {


   
   public static CustomerGroupResourceIdentifierImpl of(){
      return new CustomerGroupResourceIdentifierImpl();
   }
   

   public static CustomerGroupResourceIdentifierImpl of(final CustomerGroupResourceIdentifier template) {
      CustomerGroupResourceIdentifierImpl instance = new CustomerGroupResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}