package com.commercetools.models.state;

import com.commercetools.models.state.State;
import java.lang.Long;
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
public final class StatePagedQueryResponseImpl implements StatePagedQueryResponse {

   private java.lang.Long total;
   
   private java.lang.Long offset;
   
   private java.lang.Long count;
   
   private java.util.List<com.commercetools.models.state.State> results;

   @JsonCreator
   StatePagedQueryResponseImpl(@JsonProperty("total") final java.lang.Long total, @JsonProperty("offset") final java.lang.Long offset, @JsonProperty("count") final java.lang.Long count, @JsonProperty("results") final java.util.List<com.commercetools.models.state.State> results) {
      this.total = total;
      this.offset = offset;
      this.count = count;
      this.results = results;
   }
   public StatePagedQueryResponseImpl() {
      
   }
   
   
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Long getOffset(){
      return this.offset;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.util.List<com.commercetools.models.state.State> getResults(){
      return this.results;
   }

   public void setTotal(final java.lang.Long total){
      this.total = total;
   }
   
   public void setOffset(final java.lang.Long offset){
      this.offset = offset;
   }
   
   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setResults(final java.util.List<com.commercetools.models.state.State> results){
      this.results = results;
   }

}