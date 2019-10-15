package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomerIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomerIdActionBuilder {
   
   @Nullable
   private String customerId;
   
   public StagedOrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }

   public StagedOrderSetCustomerIdAction build() {
       return new StagedOrderSetCustomerIdActionImpl(customerId);
   }
   
   public static StagedOrderSetCustomerIdActionBuilder of() {
      return new StagedOrderSetCustomerIdActionBuilder();
   }
   
   public static StagedOrderSetCustomerIdActionBuilder of(final StagedOrderSetCustomerIdAction template) {
      StagedOrderSetCustomerIdActionBuilder builder = new StagedOrderSetCustomerIdActionBuilder();
      builder.customerId = template.getCustomerId();
      return builder;
   }
   
}