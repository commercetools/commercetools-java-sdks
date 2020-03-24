package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.me.MyCartSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLineItemCustomFieldActionBuilder {
   
   
   private String lineItemId;
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public MyCartSetLineItemCustomFieldActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public MyCartSetLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyCartSetLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public MyCartSetLineItemCustomFieldAction build() {
       return new MyCartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static MyCartSetLineItemCustomFieldActionBuilder of() {
      return new MyCartSetLineItemCustomFieldActionBuilder();
   }
   
   public static MyCartSetLineItemCustomFieldActionBuilder of(final MyCartSetLineItemCustomFieldAction template) {
      MyCartSetLineItemCustomFieldActionBuilder builder = new MyCartSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}