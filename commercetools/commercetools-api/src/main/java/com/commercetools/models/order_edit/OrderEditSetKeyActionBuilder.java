package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import com.commercetools.models.order_edit.OrderEditSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public OrderEditSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public OrderEditSetKeyAction build() {
       return new OrderEditSetKeyActionImpl(key);
   }
   
   public static OrderEditSetKeyActionBuilder of() {
      return new OrderEditSetKeyActionBuilder();
   }
   
   public static OrderEditSetKeyActionBuilder of(final OrderEditSetKeyAction template) {
      OrderEditSetKeyActionBuilder builder = new OrderEditSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}