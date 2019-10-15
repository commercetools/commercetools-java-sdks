package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ShoppingListSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ShoppingListSetKeyAction build() {
       return new ShoppingListSetKeyActionImpl(key);
   }
   
   public static ShoppingListSetKeyActionBuilder of() {
      return new ShoppingListSetKeyActionBuilder();
   }
   
   public static ShoppingListSetKeyActionBuilder of(final ShoppingListSetKeyAction template) {
      ShoppingListSetKeyActionBuilder builder = new ShoppingListSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}