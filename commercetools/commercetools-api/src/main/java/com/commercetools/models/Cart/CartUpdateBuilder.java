package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.Long;
import com.commercetools.models.cart.CartUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.cart.CartUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public CartUpdateBuilder actions( final java.util.List<com.commercetools.models.cart.CartUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CartUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CartUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public CartUpdate build() {
       return new CartUpdateImpl(actions, version);
   }
   
   public static CartUpdateBuilder of() {
      return new CartUpdateBuilder();
   }
   
   public static CartUpdateBuilder of(final CartUpdate template) {
      CartUpdateBuilder builder = new CartUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}