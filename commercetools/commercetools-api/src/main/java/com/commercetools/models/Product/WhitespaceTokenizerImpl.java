package com.commercetools.models.product;

import com.commercetools.models.product.SuggestTokenizer;
import java.lang.String;
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
public final class WhitespaceTokenizerImpl implements WhitespaceTokenizer {

   private java.lang.String type;

   @JsonCreator
   WhitespaceTokenizerImpl() {
      this.type = "whitespace";
   }
   
   
   
   public java.lang.String getType(){
      return this.type;
   }


}