package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesMetaImpl implements MissingAttributesMeta {

   private MissingAttributesDetails productLevel;
   
   private MissingAttributesDetails variantLevel;
   
   private List<String> productTypeIds;

   @JsonCreator
   MissingAttributesMetaImpl(@JsonProperty("productLevel") final MissingAttributesDetails productLevel, @JsonProperty("variantLevel") final MissingAttributesDetails variantLevel, @JsonProperty("productTypeIds") final List<String> productTypeIds) {
      this.productLevel = productLevel;
      this.variantLevel = variantLevel;
      this.productTypeIds = productTypeIds;
   }
   public MissingAttributesMetaImpl() {
      
   }
   
   
   public MissingAttributesDetails getProductLevel(){
      return this.productLevel;
   }
   
   
   public MissingAttributesDetails getVariantLevel(){
      return this.variantLevel;
   }
   
   /**
   *  <p>The IDs of the product types containing the requested <code>attributeName</code>.</p>
   */
   public List<String> getProductTypeIds(){
      return this.productTypeIds;
   }

   public void setProductLevel(final MissingAttributesDetails productLevel){
      this.productLevel = productLevel;
   }
   
   public void setVariantLevel(final MissingAttributesDetails variantLevel){
      this.variantLevel = variantLevel;
   }
   
   public void setProductTypeIds(final List<String> productTypeIds){
      this.productTypeIds = productTypeIds;
   }

}
