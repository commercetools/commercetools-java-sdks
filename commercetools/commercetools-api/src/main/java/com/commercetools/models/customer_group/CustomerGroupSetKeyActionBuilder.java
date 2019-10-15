package com.commercetools.models.customer_group;

import com.commercetools.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.models.customer_group.CustomerGroupSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public CustomerGroupSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public CustomerGroupSetKeyAction build() {
       return new CustomerGroupSetKeyActionImpl(key);
   }
   
   public static CustomerGroupSetKeyActionBuilder of() {
      return new CustomerGroupSetKeyActionBuilder();
   }
   
   public static CustomerGroupSetKeyActionBuilder of(final CustomerGroupSetKeyAction template) {
      CustomerGroupSetKeyActionBuilder builder = new CustomerGroupSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}