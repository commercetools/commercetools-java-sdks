package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.ConcurrentModificationErrorImpl;

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
*  <p>The request conflicts with the current state of the involved resource(s). Typically, the request attempts to modify a resource
*  that is out of date, i.e. that has been modified by another client since the last time it was retrieved.
*  The client application should resolve the conflict (with or without involving the end-user) before retrying the request</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

   /**
   *  <p>The version specified in the failed request.</p>
   */
   @NotNull
   @JsonProperty("specifiedVersion")
   public Long getSpecifiedVersion();
   /**
   *  <p>The current version of the resource.</p>
   */
   @NotNull
   @JsonProperty("currentVersion")
   public Long getCurrentVersion();
   /**
   *  <p>The conflicted resource.</p>
   */
   @NotNull
   @JsonProperty("conflictedResource")
   public Object getConflictedResource();

   public void setSpecifiedVersion(final Long specifiedVersion);
   
   public void setCurrentVersion(final Long currentVersion);
   
   public void setConflictedResource(final Object conflictedResource);
   
   public static ConcurrentModificationErrorImpl of(){
      return new ConcurrentModificationErrorImpl();
   }
   

   public static ConcurrentModificationErrorImpl of(final ConcurrentModificationError template) {
      ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setConflictedResource(template.getConflictedResource());
      instance.setSpecifiedVersion(template.getSpecifiedVersion());
      instance.setCurrentVersion(template.getCurrentVersion());
      return instance;
   }

}