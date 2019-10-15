package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public ShoppingListSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public ShoppingListSetCustomFieldAction build() {
       return new ShoppingListSetCustomFieldActionImpl(name, value);
   }
   
   public static ShoppingListSetCustomFieldActionBuilder of() {
      return new ShoppingListSetCustomFieldActionBuilder();
   }
   
   public static ShoppingListSetCustomFieldActionBuilder of(final ShoppingListSetCustomFieldAction template) {
      ShoppingListSetCustomFieldActionBuilder builder = new ShoppingListSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}