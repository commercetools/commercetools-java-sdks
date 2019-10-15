package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomerEmailActionBuilder {
   
   @Nullable
   private String email;
   
   public StagedOrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public String getEmail(){
      return this.email;
   }

   public StagedOrderSetCustomerEmailAction build() {
       return new StagedOrderSetCustomerEmailActionImpl(email);
   }
   
   public static StagedOrderSetCustomerEmailActionBuilder of() {
      return new StagedOrderSetCustomerEmailActionBuilder();
   }
   
   public static StagedOrderSetCustomerEmailActionBuilder of(final StagedOrderSetCustomerEmailAction template) {
      StagedOrderSetCustomerEmailActionBuilder builder = new StagedOrderSetCustomerEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}