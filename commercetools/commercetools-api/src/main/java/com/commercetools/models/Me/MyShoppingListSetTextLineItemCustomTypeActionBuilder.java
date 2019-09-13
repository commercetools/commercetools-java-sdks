package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.me.MyShoppingListSetTextLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListSetTextLineItemCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   
   private java.lang.String textLineItemId;
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public MyShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId( final java.lang.String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public MyShoppingListSetTextLineItemCustomTypeAction build() {
       return new MyShoppingListSetTextLineItemCustomTypeActionImpl(fields, type, textLineItemId);
   }
   
   public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of() {
      return new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
   }
   
   public static MyShoppingListSetTextLineItemCustomTypeActionBuilder of(final MyShoppingListSetTextLineItemCustomTypeAction template) {
      MyShoppingListSetTextLineItemCustomTypeActionBuilder builder = new MyShoppingListSetTextLineItemCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}