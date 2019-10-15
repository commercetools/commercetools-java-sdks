package com.commercetools.models.customer_group;

import com.commercetools.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.models.customer_group.CustomerGroupSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CustomerGroupSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CustomerGroupSetCustomFieldActionBuilder value(@Nullable final Object value) {
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

   public CustomerGroupSetCustomFieldAction build() {
       return new CustomerGroupSetCustomFieldActionImpl(name, value);
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of() {
      return new CustomerGroupSetCustomFieldActionBuilder();
   }
   
   public static CustomerGroupSetCustomFieldActionBuilder of(final CustomerGroupSetCustomFieldAction template) {
      CustomerGroupSetCustomFieldActionBuilder builder = new CustomerGroupSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}