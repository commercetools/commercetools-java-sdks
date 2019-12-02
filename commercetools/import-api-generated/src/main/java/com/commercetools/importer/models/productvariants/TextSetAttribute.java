package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.TextSetAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a set of strings.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TextSetAttributeImpl.class)
public interface TextSetAttribute extends Attribute {

   
   @NotNull
   @JsonProperty("value")
   public List<String> getValue();

   public void setValue(final List<String> value);
   
   public static TextSetAttributeImpl of(){
      return new TextSetAttributeImpl();
   }
   

   public static TextSetAttributeImpl of(final TextSetAttribute template) {
      TextSetAttributeImpl instance = new TextSetAttributeImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}