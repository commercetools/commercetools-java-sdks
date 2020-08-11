package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   public ShoppingListChangeNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   public ShoppingListChangeNameAction build() {
       return new ShoppingListChangeNameActionImpl(name);
   }
   
   public static ShoppingListChangeNameActionBuilder of() {
      return new ShoppingListChangeNameActionBuilder();
   }
   
   public static ShoppingListChangeNameActionBuilder of(final ShoppingListChangeNameAction template) {
      ShoppingListChangeNameActionBuilder builder = new ShoppingListChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}
