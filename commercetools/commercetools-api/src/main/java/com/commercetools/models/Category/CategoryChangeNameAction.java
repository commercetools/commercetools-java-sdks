package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.category.CategoryChangeNameActionImpl;

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
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static CategoryChangeNameActionImpl of(){
      return new CategoryChangeNameActionImpl();
   }
   

   public static CategoryChangeNameActionImpl of(final CategoryChangeNameAction template) {
      CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}