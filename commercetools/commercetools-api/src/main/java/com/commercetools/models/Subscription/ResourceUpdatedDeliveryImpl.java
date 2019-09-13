package com.commercetools.models.subscription;

import com.commercetools.models.subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceUpdatedDeliveryImpl implements ResourceUpdatedDelivery {

   private java.lang.String projectKey;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.String notificationType;
   
   private java.time.ZonedDateTime modifiedAt;
   
   private java.lang.Long oldVersion;
   
   private java.lang.Long version;

   @JsonCreator
   ResourceUpdatedDeliveryImpl(@JsonProperty("projectKey") final java.lang.String projectKey, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt, @JsonProperty("oldVersion") final java.lang.Long oldVersion, @JsonProperty("version") final java.lang.Long version) {
      this.projectKey = projectKey;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.modifiedAt = modifiedAt;
      this.oldVersion = oldVersion;
      this.version = version;
      this.notificationType = "ResourceUpdated";
   }
   public ResourceUpdatedDeliveryImpl() {
      
   }
   
   
   public java.lang.String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.String getNotificationType(){
      return this.notificationType;
   }
   
   
   public java.time.ZonedDateTime getModifiedAt(){
      return this.modifiedAt;
   }
   
   
   public java.lang.Long getOldVersion(){
      return this.oldVersion;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setProjectKey(final java.lang.String projectKey){
      this.projectKey = projectKey;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setModifiedAt(final java.time.ZonedDateTime modifiedAt){
      this.modifiedAt = modifiedAt;
   }
   
   public void setOldVersion(final java.lang.Long oldVersion){
      this.oldVersion = oldVersion;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}