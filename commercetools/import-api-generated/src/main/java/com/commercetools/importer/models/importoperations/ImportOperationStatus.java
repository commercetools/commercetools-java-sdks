package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.importoperations.ImportOperationState;
import com.commercetools.importer.models.importoperations.ImportOperationStatusImpl;

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
*  <p>The validation status of a created operation.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportOperationStatusImpl.class)
public interface ImportOperationStatus  {

   /**
   *  <p>Id of the import operation.</p>
   */
   
   @JsonProperty("operationId")
   public String getOperationId();
   /**
   *  <p>Validation state of the import operation.</p>
   */
   @NotNull
   @JsonProperty("state")
   public ImportOperationState getState();
   /**
   *  <p>Validation errors for the import operation.</p>
   */
   @Valid
   @JsonProperty("errors")
   public List<ErrorObject> getErrors();

   public void setOperationId(final String operationId);
   
   public void setState(final ImportOperationState state);
   
   public void setErrors(final List<ErrorObject> errors);
   
   public static ImportOperationStatusImpl of(){
      return new ImportOperationStatusImpl();
   }
   

   public static ImportOperationStatusImpl of(final ImportOperationStatus template) {
      ImportOperationStatusImpl instance = new ImportOperationStatusImpl();
      instance.setOperationId(template.getOperationId());
      instance.setState(template.getState());
      instance.setErrors(template.getErrors());
      return instance;
   }

}