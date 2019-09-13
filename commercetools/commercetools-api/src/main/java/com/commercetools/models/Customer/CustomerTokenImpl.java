package com.commercetools.models.customer;

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
public final class CustomerTokenImpl implements CustomerToken {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String customerId;
   
   private java.lang.String id;
   
   private java.lang.String value;
   
   private java.time.ZonedDateTime expiresAt;

   @JsonCreator
   CustomerTokenImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("id") final java.lang.String id, @JsonProperty("value") final java.lang.String value, @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.customerId = customerId;
      this.id = id;
      this.value = value;
      this.expiresAt = expiresAt;
   }
   public CustomerTokenImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getValue(){
      return this.value;
   }
   
   
   public java.time.ZonedDateTime getExpiresAt(){
      return this.expiresAt;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setValue(final java.lang.String value){
      this.value = value;
   }
   
   public void setExpiresAt(final java.time.ZonedDateTime expiresAt){
      this.expiresAt = expiresAt;
   }

}