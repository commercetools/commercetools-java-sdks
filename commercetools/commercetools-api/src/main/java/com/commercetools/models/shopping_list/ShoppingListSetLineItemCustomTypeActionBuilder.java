package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetLineItemCustomTypeActionBuilder {
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public ShoppingListSetLineItemCustomTypeActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public ShoppingListSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public ShoppingListSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public ShoppingListSetLineItemCustomTypeAction build() {
       return new ShoppingListSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }
   
   public static ShoppingListSetLineItemCustomTypeActionBuilder of() {
      return new ShoppingListSetLineItemCustomTypeActionBuilder();
   }
   
   public static ShoppingListSetLineItemCustomTypeActionBuilder of(final ShoppingListSetLineItemCustomTypeAction template) {
      ShoppingListSetLineItemCustomTypeActionBuilder builder = new ShoppingListSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}