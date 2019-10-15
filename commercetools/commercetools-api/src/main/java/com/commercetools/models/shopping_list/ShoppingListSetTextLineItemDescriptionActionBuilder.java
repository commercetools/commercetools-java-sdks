package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListSetTextLineItemDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetTextLineItemDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   
   private String textLineItemId;
   
   public ShoppingListSetTextLineItemDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId( final String textLineItemId) {
      this.textLineItemId = textLineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public ShoppingListSetTextLineItemDescriptionAction build() {
       return new ShoppingListSetTextLineItemDescriptionActionImpl(description, textLineItemId);
   }
   
   public static ShoppingListSetTextLineItemDescriptionActionBuilder of() {
      return new ShoppingListSetTextLineItemDescriptionActionBuilder();
   }
   
   public static ShoppingListSetTextLineItemDescriptionActionBuilder of(final ShoppingListSetTextLineItemDescriptionAction template) {
      ShoppingListSetTextLineItemDescriptionActionBuilder builder = new ShoppingListSetTextLineItemDescriptionActionBuilder();
      builder.description = template.getDescription();
      builder.textLineItemId = template.getTextLineItemId();
      return builder;
   }
   
}