package com.commercetools.models.inventory;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.inventory.InventoryEntryResourceIdentifierImpl;

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
@JsonDeserialize(as = InventoryEntryResourceIdentifierImpl.class)
public interface InventoryEntryResourceIdentifier extends ResourceIdentifier {


   
   public static InventoryEntryResourceIdentifierImpl of(){
      return new InventoryEntryResourceIdentifierImpl();
   }
   

   public static InventoryEntryResourceIdentifierImpl of(final InventoryEntryResourceIdentifier template) {
      InventoryEntryResourceIdentifierImpl instance = new InventoryEntryResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}