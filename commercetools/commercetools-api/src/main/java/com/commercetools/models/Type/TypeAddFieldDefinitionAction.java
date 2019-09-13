package com.commercetools.models.type;

import com.commercetools.models.type.FieldDefinition;
import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeAddFieldDefinitionActionImpl;

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
@JsonDeserialize(as = TypeAddFieldDefinitionActionImpl.class)
public interface TypeAddFieldDefinitionAction extends TypeUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("fieldDefinition")
   public FieldDefinition getFieldDefinition();

   public void setFieldDefinition(final FieldDefinition fieldDefinition);
   
   public static TypeAddFieldDefinitionActionImpl of(){
      return new TypeAddFieldDefinitionActionImpl();
   }
   

   public static TypeAddFieldDefinitionActionImpl of(final TypeAddFieldDefinitionAction template) {
      TypeAddFieldDefinitionActionImpl instance = new TypeAddFieldDefinitionActionImpl();
      instance.setFieldDefinition(template.getFieldDefinition());
      return instance;
   }

}